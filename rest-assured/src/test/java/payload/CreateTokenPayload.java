package payload;

import org.json.JSONObject;

public class CreateTokenPayload {
    public static String createToken (String username, String password){
        JSONObject jsonBody = new JSONObject();
        jsonBody.put("username", username);
        jsonBody.put("password", password);

        return jsonBody.toString();
    }
}
