
package com.server.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.6.8
 * Fri Jun 21 01:01:01 IST 2013
 * Generated source version: 2.6.8
 */

@XmlRootElement(name = "getEmployeesResponse", namespace = "http://server.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEmployeesResponse", namespace = "http://server.com/")

public class GetEmployeesResponse {

    @XmlElement(name = "return")
    private com.server.Employee[] _return;

    public com.server.Employee[] getReturn() {
        return this._return;
    }

    public void setReturn(com.server.Employee[] new_return)  {
        this._return = new_return;
    }

}

