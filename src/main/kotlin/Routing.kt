package com.example

import com.example.Model.Priority
import com.example.Model.Task
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kotlin.collections.listOf


fun Application.configureRouting() {
    routing {
        staticResources("/static","static")

        get("/tasks"){
            call.respond(
                listOf(
                    Task("swimming", "go to the beach", Priority.Medium),
                    Task("driving", "register for driving school", Priority.Vital),
                    Task("gardening", "mow the lawn", Priority.Vital),
                    Task("painting", "paint the fence", Priority.Medium),
                    Task("shopping", "buy groceries", Priority.High)
                )
            )
        }
    }
}

