package com.pradipta.stateful.soap;

import javax.annotation.Resource;

import javax.jws.WebMethod;

import javax.jws.WebService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

@WebService(endpointInterface = "com.pradipta.stateful.soap.StatefulServiceClassPortType")
public class StatefulServiceClass {
    @Resource
    WebServiceContext wsCtxt;

    public StatefulServiceClass() {
        super();
    }

    public String HelloWorld(String name) {
        MessageContext msgCtxt = wsCtxt.getMessageContext();
        HttpServletRequest req = (HttpServletRequest) msgCtxt.get(MessageContext.SERVLET_REQUEST);
        HttpServletResponse resp = (HttpServletResponse) msgCtxt.get(MessageContext.SERVLET_RESPONSE);
        HttpSession session = req.getSession(true);
        return "Hello " + name;
    }
}
