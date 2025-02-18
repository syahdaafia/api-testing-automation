package payload;

import org.json.JSONObject;

public class CreateBookingPayload {
    public static String createBooking(String firstname, String lastname, int totalprice, boolean depositpaid, String checkin, String checkout, String additionalneeds) {
        JSONObject jsonBody = new JSONObject();

        jsonBody.put("firstname", firstname);
        jsonBody.put("lastname", lastname);
        jsonBody.put("totalprice", totalprice);
        jsonBody.put("depositpaid", depositpaid);
        JSONObject bookingdates = new JSONObject();
        bookingdates.put("checkin", checkin);
        bookingdates.put("checkout", checkout);
        jsonBody.put("bookingdates", bookingdates);
        jsonBody.put("additionalneeds", additionalneeds);

        return jsonBody.toString();
    }
}
