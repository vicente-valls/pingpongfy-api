package com.pingpongfyapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

public class UpdateTable {
    @JsonProperty
    @NotNull
    private boolean isFree;

    public UpdateTable() {
        // jackson deserialize
    }

    public UpdateTable(boolean isFree) {
        this.isFree = isFree;
    }

    public boolean isFree() {
        return isFree;
    }
}
