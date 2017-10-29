package com.pingpongfyapi.resources;

import com.pingpongfyapi.api.BodyResponse;
import com.pingpongfyapi.api.CreateTable;
import com.pingpongfyapi.api.Error;
import com.pingpongfyapi.api.TableListResponse;
import com.pingpongfyapi.api.UpdateTable;

import java.util.ArrayList;
import java.util.Date;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

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
