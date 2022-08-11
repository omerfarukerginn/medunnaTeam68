package baseUrl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import utilities.ConfigReader;

public class MedunnaBaseUrl {

    public static RequestSpecification spec;
<<<<<<< HEAD

    public static void medunnaSetup(){
        //spec = new RequestSpecBuilder().setBaseUri("https://medunna.com").build();
        spec = new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("base_url")).build();

=======
    public static void medunnaSetup(){

        spec = new RequestSpecBuilder().setBaseUri("https://medunna.com").build();
>>>>>>> main

    }


}
