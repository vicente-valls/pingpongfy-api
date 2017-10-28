package com.pingpongfyapi;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.pingpongfyapi.health.DynamodbHealthCheck;
import com.pingpongfyapi.resources.TableResource;
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
    public void run(
        final PingpongfyapiConfiguration configuration,
        final Environment environment
    ) {
        AmazonDynamoDB dynamoDbClient = configuration.getDynamodbClientFactory().build();
        environment.healthChecks().register("dynamodb", new DynamodbHealthCheck(dynamoDbClient));
        final TableResource tableResource = new TableResource();
        environment.jersey().register(tableResource);
    }

}
