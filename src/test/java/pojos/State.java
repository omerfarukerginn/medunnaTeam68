package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class State {

    /*
     "cstate": {
      "country": {
        "id": 0,
        "name": "string"
      },
     */

    private int id;
    private String name;
    private Country country;
}
