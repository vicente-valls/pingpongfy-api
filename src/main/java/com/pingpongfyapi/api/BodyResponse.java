package com.pingpongfyapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class BodyResponse {
    @JsonProperty
    private IResponseDto data;
    @JsonProperty
    private ArrayList<Error> errors;

    public BodyResponse(IResponseDto data, ArrayList<Error> errors) {
        this.data = data;
        this.errors = errors;
    }

    public IResponseDto getData() {
        return data;
    }

    public ArrayList<Error> getErrors() {
        return errors;
    }
}
