package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class TestResult {

    /*
    createdBy	string
createdDate	string($date-time)
ctest	{...}
ctestItem	CTestItem{...}
date*	string($date-time)
description	string
id	integer($int64)
result	string

     */

    private String createdBy;
    private String createDate;
    //private Object ctest;
    private CTestItem[] cTestItem; //array degil neden array aldik?
    private String date;
    private String description;
    private Integer id;
    private String result;
}
