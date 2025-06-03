package com.example.Model

import io.netty.handler.codec.http.multipart.DiskAttribute.prefix
import kotlinx.serialization.Serializable

/**
 *  Task model to represent a task
 */

enum class Priority{
    Low, Medium, High, Vital
}
@Serializable
data class Task(
    val name: String,
    val description: String,
    val priority: Priority
)