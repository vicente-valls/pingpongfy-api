package com.pingpongfyapi.db;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

public class DynamodbClientFactory {
    private String accessKeyId = "";
    private String secretAccessKey = "";
    @NotEmpty
    private String region;

    private String endpoint = "";

    public DynamodbClientFactory() {
    }

    @JsonProperty
    private String getEndpoint() {
        return endpoint;
    }

    @JsonProperty
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    @JsonProperty
    private String getAccessKeyId() {
        return accessKeyId;
    }

    @JsonProperty
    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    @JsonProperty
    private String getSecretAccessKey() {
        return secretAccessKey;
    }

    @JsonProperty
    public void setSecretAccessKey(String secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
    }

    @JsonProperty
    private String getRegion() {
        return region;
    }

    @JsonProperty
    public void setRegion(String region) {
        this.region = region;
    }

    public AmazonDynamoDB build() {
        AWSCredentialsProvider credentialsProvider = new DefaultAWSCredentialsProviderChain();
        if (!this.getAccessKeyId().isEmpty() && !this.getSecretAccessKey().isEmpty()) {
            credentialsProvider = new AWSStaticCredentialsProvider(
                new BasicAWSCredentials(this.getAccessKeyId(), this.getSecretAccessKey())
            );
        }
        AmazonDynamoDBClientBuilder clientBuilder = AmazonDynamoDBClientBuilder
            .standard()
            .withCredentials(credentialsProvider)
            ;
        if (!this.getEndpoint().isEmpty()) {
            clientBuilder.withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration(
                this.getEndpoint(), this.getRegion())
            );
        } else {
            clientBuilder.withRegion(this.getRegion());
        }

        return clientBuilder.build();
    }
}
