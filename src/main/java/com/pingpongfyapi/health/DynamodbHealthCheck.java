package com.pingpongfyapi.health;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.model.ListTablesResult;
import com.codahale.metrics.health.HealthCheck;

public class DynamodbHealthCheck extends HealthCheck {
    private AmazonDynamoDB dynamoDbClient;

    public DynamodbHealthCheck(AmazonDynamoDB dynamoDbClient) {
        this.dynamoDbClient = dynamoDbClient;
    }

    @Override
    protected Result check() throws Exception {
        ListTablesResult listTablesResult = this.dynamoDbClient.listTables();
        if (listTablesResult != null) {
            return Result.healthy();
        } else {
            throw new Exception("unable to list tables");
        }
    }
}
