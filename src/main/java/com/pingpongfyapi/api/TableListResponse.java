package com.pingpongfyapi.api;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class TableListResponse implements IResponseDto {
    private int id;
    private String description;
    private boolean isFree;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
    private Date updatedAt;

    public TableListResponse(int id, String description, boolean isFree, Date updatedAt) {
        this.id = id;
        this.description = description;
        this.isFree = isFree;
        this.updatedAt = updatedAt;
    }
    @JsonProperty
    public int getId() {
        return id;
    }
    @JsonProperty
    public String getDescription() {
        return description;
    }
    @JsonProperty
    public boolean isFree() {
        return isFree;
    }
    @JsonProperty
    public Date getUpdatedAt() {
        return updatedAt;
    }
}
