package com.server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.6.8
 * 2013-06-21T01:04:43.503+05:30
 * Generated source version: 2.6.8
 * 
 */
@WebService(targetNamespace = "http://server.com/", name = "EmployeeInfo")
@XmlSeeAlso({ObjectFactory.class})
public interface EmployeeInfo {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getEmployees", targetNamespace = "http://server.com/", className = "com.server.GetEmployees")
    @WebMethod
    @ResponseWrapper(localName = "getEmployeesResponse", targetNamespace = "http://server.com/", className = "com.server.GetEmployeesResponse")
    public java.util.List<com.server.Employee> getEmployees();

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getEmployee", targetNamespace = "http://server.com/", className = "com.server.GetEmployee")
    @WebMethod
    @ResponseWrapper(localName = "getEmployeeResponse", targetNamespace = "http://server.com/", className = "com.server.GetEmployeeResponse")
    public com.server.Employee getEmployee(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @RequestWrapper(localName = "addEmployee", targetNamespace = "http://server.com/", className = "com.server.AddEmployee")
    @WebMethod
    @ResponseWrapper(localName = "addEmployeeResponse", targetNamespace = "http://server.com/", className = "com.server.AddEmployeeResponse")
    public void addEmployee(
        @WebParam(name = "arg0", targetNamespace = "")
        com.server.Employee arg0
    );
}