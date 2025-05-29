package com.example.Model

import io.netty.handler.codec.http.multipart.DiskAttribute.prefix
import kotlinx.serialization.Serializable

/**
 * Task model represnts a task
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

fun Task.taskAsRow() = """
    <tr>
        <td>$name</td><td>$description</td><td>$priority</td>
    </tr>
    """.trimIndent()

fun List<Task>.tasksAsTable() = this.joinToString(
    prefix = "<table rules=\"all\">",
    postfix = "</table>",
    separator = "\n",
    transform = Task::taskAsRow
)