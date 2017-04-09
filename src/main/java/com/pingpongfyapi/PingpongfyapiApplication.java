package com.pingpongfyapi;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class PingpongfyapiApplication extends Application<PingpongfyapiConfiguration> {

    public static void main(final String[] args) throws Exception {
        new PingpongfyapiApplication().run(args);
    }

    @Override
    public String getName() {
        return "Pingpongfyapi";
    }

    @Override
    public void initialize(final Bootstrap<PingpongfyapiConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final PingpongfyapiConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
