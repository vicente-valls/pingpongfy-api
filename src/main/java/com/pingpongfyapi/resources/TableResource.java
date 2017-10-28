package com.pingpongfyapi.resources;

import com.pingpongfyapi.api.*;
import com.pingpongfyapi.api.Error;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.Date;

@Path("/tables")
@Produces(MediaType.APPLICATION_JSON)
public class TableResource {

    @GET
    public BodyResponse getTables() {
        // @todo fetch real data
        return new BodyResponse(
            new TableListResponse(3, "foo", false, new Date()),
            new ArrayList<Error>()
        );
    }

    @POST
    public Response createTable(CreateTable createTable) {
        // @todo apply real logic
        BodyResponse bodyResponse = new BodyResponse(
            new TableListResponse(3, "foo", false, new Date()),
            new ArrayList<Error>()
        );
        return Response.status(Response.Status.CREATED).entity(bodyResponse).build();
    }

    @DELETE
    @Path("/{id}")
    public BodyResponse deleteTable(@PathParam("id") String id) {
        // @todo apply real logic
        return new BodyResponse(
            null,
            new ArrayList<Error>()
        );
    }

    @PUT
    @Path("/{id}")
    public BodyResponse updateTable(@PathParam("id") String id, UpdateTable updateTable) {
        // @todo apply real logic
        return new BodyResponse(
            null,
            new ArrayList<Error>()
        );
    }
}
