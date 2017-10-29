package com.pingpongfyapi;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pingpongfyapi.db.DynamodbClientFactory;
import io.dropwizard.Configuration;

public class PingpongfyapiConfiguration extends Configuration {
    private DynamodbClientFactory dynamodbClientFactory;

    @JsonProperty("dynamodbConfiguration")
    DynamodbClientFactory getDynamodbClientFactory() {
        return dynamodbClientFactory;
    }

    @JsonProperty("dynamodbConfiguration")
    public void setDynamodbClientFactory(DynamodbClientFactory dynamodbClientFactory) {
        this.dynamodbClientFactory = dynamodbClientFactory;
    }
}
