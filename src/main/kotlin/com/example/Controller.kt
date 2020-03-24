package com.example

import io.quarkus.vertx.web.Route
import io.vertx.core.http.HttpMethod
import io.vertx.ext.web.RoutingContext
import java.util.*
import javax.enterprise.context.ApplicationScoped
import javax.ws.rs.*
import javax.ws.rs.core.MediaType

@Path("/")
@ApplicationScoped
open class Controller {

    @GET
    @Path("/working")
    open fun working(): String = "It's working"

    @Route(path = "/broken", methods = [HttpMethod.GET])
    open fun broken(routingContext: RoutingContext) = routingContext.response().end("It's broken!")
}

