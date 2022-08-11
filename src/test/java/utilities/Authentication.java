package utilities;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.given;

public class Authentication {
    public static void main(String[] args) {
        String guncelToken = generateToken("team68","HealthTeam68!");
        System.out.println(guncelToken);
    }


    public static String generateToken(){
        String username = "team68";
        String password = "HealthTeam68!";

        Map<String,Object>map = new HashMap<String,Object>();
        map.put("username", username);
        map.put("password", password);
        map.put("rememberme", true);

        String endPoint = "https://www.medunna.com/api/authenticate";

        Response response = given().contentType(ContentType.JSON).body(map).when().post(endPoint);

        JsonPath token = response.jsonPath();

        return token.getString("id_token");
    }

    public static String generateToken(String username,String password){

        Map<String,Object>map = new HashMap<String,Object>();
        map.put("username", username);
        map.put("password", password);
        map.put("rememberme", true);

        String endPoint = "https://www.medunna.com/api/authenticate";

        Response response = given().contentType(ContentType.JSON).body(map).when().post(endPoint);

        JsonPath token = response.jsonPath();

        return token.getString("id_token");
    }
}


