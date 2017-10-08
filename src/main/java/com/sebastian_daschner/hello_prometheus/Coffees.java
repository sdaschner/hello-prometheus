package com.sebastian_daschner.hello_prometheus;

import io.prometheus.client.Counter;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Coffees {

    private Counter consumedCoffees;

    @PostConstruct
    private void initCounter() {
        consumedCoffees = Counter.build("total_coffees_consumed", "Total number of consumed coffees").register();
    }

    public String retrieveCoffee() {
        consumedCoffees.inc();
        return "Coffee!";
    }

}
