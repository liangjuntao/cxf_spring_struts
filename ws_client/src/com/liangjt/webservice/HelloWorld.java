package com.liangjt.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2017-06-07T00:03:26.767+08:00
 * Generated source version: 2.7.18
 * 
 */
@WebService(targetNamespace = "http://webService.liangjt.com/", name = "HelloWorld")
@XmlSeeAlso({ObjectFactory.class})
public interface HelloWorld {

    @WebMethod
    @RequestWrapper(localName = "getAllCat", targetNamespace = "http://webService.liangjt.com/", className = "com.liangjt.webservice.GetAllCat")
    @ResponseWrapper(localName = "getAllCatResponse", targetNamespace = "http://webService.liangjt.com/", className = "com.liangjt.webservice.GetAllCatResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.liangjt.webservice.StringCat getAllCat();

    @WebMethod
    @RequestWrapper(localName = "getCatByUser", targetNamespace = "http://webService.liangjt.com/", className = "com.liangjt.webservice.GetCatByUser")
    @ResponseWrapper(localName = "getCatByUserResponse", targetNamespace = "http://webService.liangjt.com/", className = "com.liangjt.webservice.GetCatByUserResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<com.liangjt.webservice.Cat> getCatByUser(
        @WebParam(name = "arg0", targetNamespace = "")
        com.liangjt.webservice.User arg0
    );

    @WebMethod
    @RequestWrapper(localName = "sayHi", targetNamespace = "http://webService.liangjt.com/", className = "com.liangjt.webservice.SayHi")
    @ResponseWrapper(localName = "sayHiResponse", targetNamespace = "http://webService.liangjt.com/", className = "com.liangjt.webservice.SayHiResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String sayHi(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );
}
