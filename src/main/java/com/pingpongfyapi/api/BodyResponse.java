package com.pingpongfyapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class BodyResponse {
    private IResponseDto data;
    private ArrayList<Error> errors;

    public BodyResponse(IResponseDto data, ArrayList<Error> errors) {
        this.data = data;
        this.errors = errors;
    }

    @JsonProperty
    public IResponseDto getData() {
        return data;
    }

    @JsonProperty
    public ArrayList<Error> getErrors() {
        return errors;
    }
}
