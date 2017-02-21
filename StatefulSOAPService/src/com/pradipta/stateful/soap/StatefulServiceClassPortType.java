package com.pradipta.stateful.soap;

import java.rmi.Remote;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = "http://soap.stateful.pradipta.com/")
public interface StatefulServiceClassPortType extends Remote {
    @WebMethod
    public String HelloWorld(@WebParam(name = "arg0") String name);
}
