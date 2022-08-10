package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class InPatients {


    private Appointment appointment;
    private String createdBy;
    private String createdDate;
    private String description;
    private String endDate;
    private int id;
    private Patient patient;
    private Room room;
    private String startDate;
    private String status;
}
