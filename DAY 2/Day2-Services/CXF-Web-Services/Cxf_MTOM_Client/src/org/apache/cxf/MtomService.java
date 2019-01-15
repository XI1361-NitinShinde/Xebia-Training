package org.apache.cxf;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.6.8
 * 2013-06-22T02:21:28.430+05:30
 * Generated source version: 2.6.8
 * 
 */
@WebServiceClient(name = "MtomService", 
                  wsdlLocation = "http://localhost:9090/Cxf_MTOM_Attachments/services/MtomPort?wsdl",
                  targetNamespace = "http://cxf.apache.org/") 
public class MtomService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://cxf.apache.org/", "MtomService");
    public final static QName MtomPort = new QName("http://cxf.apache.org/", "MtomPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:9090/Cxf_MTOM_Attachments/services/MtomPort?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(MtomService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/Cxf_MTOM_Attachments/services/MtomPort?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public MtomService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public MtomService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MtomService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns MTomPort
     */
    @WebEndpoint(name = "MtomPort")
    public MTomPort getMtomPort() {
        return super.getPort(MtomPort, MTomPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MTomPort
     */
    @WebEndpoint(name = "MtomPort")
    public MTomPort getMtomPort(WebServiceFeature... features) {
        return super.getPort(MtomPort, MTomPort.class, features);
    }

}