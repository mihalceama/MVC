package ro.teamnet.zth.appl.controller;

import ro.teamnet.zth.api.annotations.MyController;
import ro.teamnet.zth.api.annotations.MyRequestMethod;

import static jdk.nashorn.internal.runtime.PropertyDescriptor.GET;

/**
 * Created by Alexandra.Mihalcea on 7/20/2017.
 */
@MyController(urlPath = "/departments")
public class DepartmentController {
    @MyRequestMethod(methodType = "GET", urlPath = "/all")
    public String getAllDepartments() {
        return "allDepartments";
    }
}
