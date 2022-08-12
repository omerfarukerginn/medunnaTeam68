package pojos;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

    /*
    "user": {
      "activated": true,
      "createdBy": "string",
      "createdDate": "2022-08-10T10:15:51.405Z",
      "email": "string",
      "firstName": "string",
      "id": 0,
      "imageUrl": "string",
      "langKey": "string",
      "lastName": "string",
      "login": "string",
      "resetDate": "2022-08-10T10:15:51.405Z",
      "ssn": "147-36-4763"
    }
     */

    private int id;
    private String login;//username
    private String ssn;
    private String firstName;
    private String lastName;
    private String email;
    private String imageUrl;
    private boolean activated;
    private String langKey;
    private String createdBy;
    private String createdDate;
    private String resetDate;
}
