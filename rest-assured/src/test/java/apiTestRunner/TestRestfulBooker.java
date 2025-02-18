package apiTestRunner;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import data.BookingData;
import payload.CreateBookingPayload;
import payload.CreateTokenPayload;
import payload.UpdateBookingPayload;
import payload.UpdatePartialBookingPayload;

public class TestRestfulBooker {

    @BeforeClass
    public void setUp() {
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
    }

    static int bookingId;
    static String token;

    @Test(priority = 1, dataProvider = "createTokenData", dataProviderClass = BookingData.class)
    public void testCreateToken(String username, String password) {
        String jsonBody = CreateTokenPayload.createToken(username, password);

        Response createTokenResponse = given()
                .header("Content-Type", "application/json")
                .body(jsonBody)
                .log().all()
                .when()
                .post("/auth")
                .then()
                .log().body()  // Log response
                .statusCode(200)
                .extract().response();

        token = createTokenResponse.jsonPath().getString("token");
        System.out.println("Token: " + token);
    }

    @Test(priority = 2, dataProvider = "createBookingData", dataProviderClass = BookingData.class)
    public void testCreateBooking(String firstname, String lastname, int totalprice, boolean depositpaid, String checkin, String checkout, String additionalneeds) {
        String jsonBody = CreateBookingPayload.createBooking(firstname, lastname, totalprice, depositpaid, checkin, checkout, additionalneeds);

        Response createBookingResponse = given()
                .header("Content-Type", "application/json")
                .body(jsonBody)
                .log().all()
                .when()
                .post("/booking")
                .then()
                .log().body()
                .statusCode(200)
                .body("booking.firstname", equalTo(firstname))
                .body("booking.lastname", equalTo(lastname))
                .body("booking.totalprice", equalTo(totalprice))
                .body("booking.depositpaid", equalTo(depositpaid))
                .body("booking.bookingdates.checkin", equalTo(checkin))
                .body("booking.bookingdates.checkout", equalTo(checkout))
                .body("booking.additionalneeds", equalTo(additionalneeds))
                .extract().response();

        bookingId = createBookingResponse.jsonPath().getInt("bookingid");
        System.out.println("Booking ID: " + bookingId);
    }

    @Test(priority = 3, dataProvider = "updateBookingData", dataProviderClass = BookingData.class)
    public void testUpdateBooking(String firstname, String lastname, int totalprice, boolean depositpaid, String checkin, String checkout, String additionalneeds) {
        String jsonBody = UpdateBookingPayload.updateBooking(firstname, lastname, totalprice, depositpaid, checkin, checkout, additionalneeds);

        given()
                .header("Cookie", "token=" + token)
                .header("Content-Type", "application/json")
                .body(jsonBody)
                .log().all()
                .when()
                .put("/booking/" + bookingId)
                .then()
                .log().body()
                .statusCode(200)
                .body("firstname", equalTo(firstname))
                .body("lastname", equalTo(lastname))
                .body("totalprice", equalTo(totalprice))
                .body("depositpaid", equalTo(depositpaid))
                .body("bookingdates.checkin", equalTo(checkin))
                .body("bookingdates.checkout", equalTo(checkout))
                .body("additionalneeds", equalTo(additionalneeds));
    }

    @Test(priority = 4, dataProvider = "updatePartialBookingData", dataProviderClass = BookingData.class)
    public void testUpdatePartialBooking(String firstname, String lastname, Integer totalprice, Boolean depositpaid, String checkin, String checkout, String additionalneeds) {
        String jsonBody = UpdatePartialBookingPayload.updatePartialBooking(firstname, lastname, totalprice, depositpaid, checkin, checkout, additionalneeds);

        given()
                .header("Cookie", "token=" + token)
                .header("Content-Type", "application/json")
                .body(jsonBody)
                .log().all()
                .when()
                .patch("/booking/" + bookingId)
                .then()
                .log().all()
                .statusCode(200)
                .body("firstname", equalTo(firstname));
    }

    @Test(priority = 5, dataProvider = "getBookingByParams", dataProviderClass = BookingData.class)
    public void testGetBookingByParams(String firstname, String lastname) {
        given()
                .header("Cookie", "token=" + token)
                .param("firstname", firstname)   // Menambahkan parameter firstname
                .param("lastname", lastname)     // Menambahkan parameter lastname
                .log().all()  // Log request body dan headers
                .when()
                .get("/booking")
                .then()
                .log().body()  // Log response body
                .statusCode(200)
                .body("bookingid", notNullValue());
    }

    @Test(priority = 6, dependsOnMethods = "testCreateToken")
    public void testDeleteBooking() {
        given()
                .header("Cookie", "token=" + token)
                .log().all()
                .when()
                .delete("/booking/" + bookingId)
                .then()
                .log().body()
                .statusCode(201);
    }
}
