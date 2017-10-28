package com.pingpongfyapi.api;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class TableListResponse implements IResponseDto {
    @JsonProperty
    private int id;
    @JsonProperty
    private String description;
    @JsonProperty
    private boolean isFree;
    @JsonProperty
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
    private Date updatedAt;

    public TableListResponse(int id, String description, boolean isFree, Date updatedAt) {
        this.id = id;
        this.description = description;
        this.isFree = isFree;
        this.updatedAt = updatedAt;
    }
    public int getId() {
        return id;
    }
    public String getDescription() {
        return description;
    }
    public boolean isFree() {
        return isFree;
    }
    public Date getUpdatedAt() {
        return updatedAt;
    }
}
