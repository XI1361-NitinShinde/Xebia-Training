package com.org.sum;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.6.8
 * 2013-06-22T03:35:46.918+05:30
 * Generated source version: 2.6.8
 * 
 */
@WebServiceClient(name = "AddNumbersClassService", 
                  wsdlLocation = "http://localhost:8090/Cxf_Handlers/services/AddNumbersClassPort?wsdl",
                  targetNamespace = "http://sum.org.com/") 
public class AddNumbersClassService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://sum.org.com/", "AddNumbersClassService");
    public final static QName AddNumbersClassPort = new QName("http://sum.org.com/", "AddNumbersClassPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8090/Cxf_Handlers/services/AddNumbersClassPort?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(AddNumbersClassService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8090/Cxf_Handlers/services/AddNumbersClassPort?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public AddNumbersClassService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AddNumbersClassService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AddNumbersClassService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns AddNumbers
     */
    @WebEndpoint(name = "AddNumbersClassPort")
    public AddNumbers getAddNumbersClassPort() {
        return super.getPort(AddNumbersClassPort, AddNumbers.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AddNumbers
     */
    @WebEndpoint(name = "AddNumbersClassPort")
    public AddNumbers getAddNumbersClassPort(WebServiceFeature... features) {
        return super.getPort(AddNumbersClassPort, AddNumbers.class, features);
    }

}
