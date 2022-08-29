package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)

public class Staff {

    private String firstName;
    private String lastName;
    private String gender;
    private String birthDate;
    private String phone;
    private String bloodGroup;
    private String adress;
    private String email;
    private String description;
    private Integer id;


    public Staff(String firstName, String lastName, String gender, String birthDate, String phone, String bloodGroup, String adress, String email, String description) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.phone = phone;
        this.bloodGroup = bloodGroup;
        this.adress = adress;
        this.email = email;
        this.description = description;
    }
}

