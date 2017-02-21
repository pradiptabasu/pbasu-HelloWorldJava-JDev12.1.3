package com.pradipta.stateful.soap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import javax.xml.ws.handler.MessageContext;

public class StatefulServicesV2 {
    public StatefulServicesV2() {
        super();
    }
    
    public String HelloWorld(String name) {
        return "Hello " + name;
    }
}
