package com.example.Repository

import com.example.Model.Priority
import com.example.Model.Task

/**
 * list of sample tasks
 */


object TaskRepository {
    private val tasks = mutableListOf<Task>(
        Task("Cleaning", "Clean The House", Priority.Low),
        Task("Laundry", "Washing clothes", Priority.Medium),
        Task("Washing", "Wash the car", Priority.High),
        Task("Cooking", "Cook for the dogs", Priority.High)
    )

    fun getAllTasks(): List<Task> = tasks

    fun getTasksByPriority(priority: Priority) = tasks.filter {
        it.priority == priority
    }

    fun getTaskByName(name: String) = tasks.find {
        it.name.equals(name, ignoreCase = true)
    }

    fun addTask(task: Task): Task {
        tasks.add(task)
        return task
    }
}