
package RM3.Client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "QUEHealthCareImplService", targetNamespace = "http://Quebec.Server/", wsdlLocation = "file:/home/mansi/Desktop/assignment3/src/Server/Quebec/QUEServer.wsdl")
public class QUEHealthCareImplService
    extends Service
{

    private final static URL QUEHEALTHCAREIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException QUEHEALTHCAREIMPLSERVICE_EXCEPTION;
    private final static QName QUEHEALTHCAREIMPLSERVICE_QNAME = new QName("http://Quebec.Server/", "QUEHealthCareImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/home/mansi/Desktop/assignment3/src/Server/Quebec/QUEServer.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        QUEHEALTHCAREIMPLSERVICE_WSDL_LOCATION = url;
        QUEHEALTHCAREIMPLSERVICE_EXCEPTION = e;
    }

    public QUEHealthCareImplService() {
        super(__getWsdlLocation(), QUEHEALTHCAREIMPLSERVICE_QNAME);
    }

    public QUEHealthCareImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), QUEHEALTHCAREIMPLSERVICE_QNAME, features);
    }

    public QUEHealthCareImplService(URL wsdlLocation) {
        super(wsdlLocation, QUEHEALTHCAREIMPLSERVICE_QNAME);
    }

    public QUEHealthCareImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, QUEHEALTHCAREIMPLSERVICE_QNAME, features);
    }

    public QUEHealthCareImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public QUEHealthCareImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns QUEHealthCareImpl
     */
    @WebEndpoint(name = "QUEHealthCareImplPort")
    public QUEHealthCareImpl getQUEHealthCareImplPort() {
        return super.getPort(new QName("http://Quebec.Server/", "QUEHealthCareImplPort"), QUEHealthCareImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns QUEHealthCareImpl
     */
    @WebEndpoint(name = "QUEHealthCareImplPort")
    public QUEHealthCareImpl getQUEHealthCareImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Quebec.Server/", "QUEHealthCareImplPort"), QUEHealthCareImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (QUEHEALTHCAREIMPLSERVICE_EXCEPTION!= null) {
            throw QUEHEALTHCAREIMPLSERVICE_EXCEPTION;
        }
        return QUEHEALTHCAREIMPLSERVICE_WSDL_LOCATION;
    }

}
