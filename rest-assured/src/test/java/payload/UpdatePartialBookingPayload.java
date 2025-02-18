package payload;
import org.json.JSONObject;

public class UpdatePartialBookingPayload {
    public static String updatePartialBooking(String firstname, String lastname, Integer totalprice, Boolean depositpaid, String checkin, String checkout, String additionalneeds) {
        JSONObject jsonBody = new JSONObject();

        // Menambahkan nilai ke jsonBody hanya jika tidak null
        if (firstname != null) jsonBody.put("firstname", firstname);
        if (lastname != null) jsonBody.put("lastname", lastname);
        if (totalprice != null) jsonBody.put("totalprice", totalprice);
        if (depositpaid != null) jsonBody.put("depositpaid", depositpaid);

        // Menambahkan objek bookingdates jika checkin atau checkout tidak null
        if (checkin != null || checkout != null) {
            JSONObject bookingdates = new JSONObject();
            if (checkin != null) bookingdates.put("checkin", checkin);
            if (checkout != null) bookingdates.put("checkout", checkout);
            jsonBody.put("bookingdates", bookingdates);
        }

        if (additionalneeds != null) jsonBody.put("additionalneeds", additionalneeds);

        // Mengembalikan JSON dalam bentuk String
        return jsonBody.toString();
    }
}
