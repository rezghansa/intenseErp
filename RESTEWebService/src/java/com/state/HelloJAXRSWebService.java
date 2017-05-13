/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.state;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author hansa
 */
@Local
@Stateless
@Path("/hellows")
public class HelloJAXRSWebService {

    public HelloJAXRSWebService() {
    }
    
    @GET
    @Produces("text/plain")
    public String sayHello() {
        return "Hello";
    }
}
