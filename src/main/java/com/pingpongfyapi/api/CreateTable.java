package com.pingpongfyapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Length;


public class CreateTable {
    @Length(min = 3, max = 5)
    @Pattern(regexp = "^[\\p{Alnum}]{3,5}$")
    @JsonProperty
    private String id;
    @JsonProperty
    private String description = "";

    public CreateTable(String id) {
        this.id = id;
    }

    public CreateTable(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public CreateTable() {
        // Jackson deserialization
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}
