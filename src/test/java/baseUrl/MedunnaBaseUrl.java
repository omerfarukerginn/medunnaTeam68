package baseUrl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class MedunnaBaseUrl {

    protected  RequestSpecification spec;
    public void medunnaSetup(){

        spec = new RequestSpecBuilder().setBaseUri("https://medunna.com").build();

    }


}
