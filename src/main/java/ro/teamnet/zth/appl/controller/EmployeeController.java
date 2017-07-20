package ro.teamnet.zth.appl.controller;

import ro.teamnet.zth.api.annotations.MyController;
import ro.teamnet.zth.api.annotations.MyRequestMethod;

import java.util.List;

/**
 * Created by Alexandra.Mihalcea on 7/20/2017.
 */
@MyController(urlPath = "/employees")
public class EmployeeController {
    @MyRequestMethod(methodType = "GET", urlPath = "/all")
    public String getAllEmployees(){
        return "allEmoloyees";
    }
    @MyRequestMethod(methodType = "GET", urlPath = "/one")
    public String getOneEmployee(){
        return "oneRandomEmployee";
    }
}
