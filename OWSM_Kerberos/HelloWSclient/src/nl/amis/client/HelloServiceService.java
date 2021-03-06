package nl.amis.client;

import java.io.File;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 101221.1153.15811)

@WebServiceClient(wsdlLocation="http://virtual:6001/Kerberos-KerberosHelloWS-context-root/HelloServicePort?WSDL",
  targetNamespace="http://ws.kerberos.owsm.amis.nl/", name="HelloServiceService")
public class HelloServiceService
  extends Service
{
  private static URL wsdlLocationURL;

  private static Logger logger;
  static
  {
    try
    {
      logger = Logger.getLogger("nl.amis.client.HelloServiceService");
      URL baseUrl = HelloServiceService.class.getResource(".");
      if (baseUrl == null)
      {
        wsdlLocationURL =
            HelloServiceService.class.getResource("http://virtual:6001/Kerberos-KerberosHelloWS-context-root/HelloServicePort?WSDL");
        if (wsdlLocationURL == null)
        {
          baseUrl = new File(".").toURL();
          wsdlLocationURL =
              new URL(baseUrl, "http://virtual:6001/Kerberos-KerberosHelloWS-context-root/HelloServicePort?WSDL");
        }
      }
      else
      {
                if (!baseUrl.getPath().endsWith("/")) {
         baseUrl = new URL(baseUrl, baseUrl.getPath() + "/");
}
                wsdlLocationURL =
            new URL(baseUrl, "http://virtual:6001/Kerberos-KerberosHelloWS-context-root/HelloServicePort?WSDL");
      }
    }
    catch (MalformedURLException e)
    {
      logger.log(Level.ALL,
          "Failed to create wsdlLocationURL using http://virtual:6001/Kerberos-KerberosHelloWS-context-root/HelloServicePort?WSDL",
          e);
    }
  }

  public HelloServiceService()
  {
    super(wsdlLocationURL,
          new QName("http://ws.kerberos.owsm.amis.nl/", "HelloServiceService"));
  }

  public HelloServiceService(URL wsdlLocation, QName serviceName)
  {
    super(wsdlLocation, serviceName);
  }

  @WebEndpoint(name="HelloServicePort")
  public HelloService getHelloServicePort()
  {
    return (HelloService) super.getPort(new QName("http://ws.kerberos.owsm.amis.nl/",
                                                  "HelloServicePort"),
                                        HelloService.class);
  }

  @WebEndpoint(name="HelloServicePort")
  public HelloService getHelloServicePort(WebServiceFeature... features)
  {
    return (HelloService) super.getPort(new QName("http://ws.kerberos.owsm.amis.nl/",
                                                  "HelloServicePort"),
                                        HelloService.class, features);
  }
}
