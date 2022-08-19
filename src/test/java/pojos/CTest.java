package pojos;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CTest {

    /*  [appointment	{...}
createdBy	string
createdDate	string($date-time)
ctestResults	[CTestResult{...}]
date*	string($date-time)
description	string
id	integer($int64)
name]
  */
    private String createdBy;
    private String createdDate;
    private  TestResult[] testResult;
    private String date;
    private String description;
    private Integer id;
    private String name;

}
