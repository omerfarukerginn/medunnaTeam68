package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CTestItem {

    /*
    createdBy	string
createdDate	string($date-time)
defaultValMax	string
defaultValMin	string
description	string
id	integer($int64)
name	string
price*	number
     */

    private String createdBy;
    private String createdDate;
    private String defaultValMax;
    private String defaultValMin;
    private String description;
    private Integer id;
    private String name;
    private Double price;

}
