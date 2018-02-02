package com.sebastian_daschner.hello_prometheus;

import org.eclipse.microprofile.metrics.Counter;
import org.eclipse.microprofile.metrics.annotation.Counted;
import org.eclipse.microprofile.metrics.annotation.Metric;

import javax.inject.Inject;

public class Coffees {

    @Inject
    @Metric(name = "total_coffees_consumed", absolute = true)
    Counter coffeesConsumed;

    @Counted(name = "total_coffees_retrieved", absolute = true, monotonic = true)
    public String retrieveCoffee() {
        coffeesConsumed.inc();
        return "Coffee!";
    }

}
