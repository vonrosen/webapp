package org.cap1.resource;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class CapitalOneResource extends ServerResource {

    @Get
    public String getResource()  {
      return "Hello World!";
    }    
    
}
