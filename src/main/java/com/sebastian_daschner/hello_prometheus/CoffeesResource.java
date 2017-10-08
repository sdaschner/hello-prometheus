package com.sebastian_daschner.hello_prometheus;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("coffee")
public class CoffeesResource {

    @Inject
    Coffees coffees;

    @GET
    public String getCoffee() {
        return coffees.retrieveCoffee();
    }

}
