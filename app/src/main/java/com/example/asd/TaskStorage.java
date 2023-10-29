package com.example.asd;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TaskStorage {
    private static final TaskStorage taskStorage = new TaskStorage();

    private final List<Task> tasks;

    public static TaskStorage getInstance()
    {
        if (taskStorage == null)
            return new TaskStorage();
        return taskStorage;
    }

    private TaskStorage()
    {
        tasks = new ArrayList<>();
        for (int i = 0; i <= 150; i++)
        {
            Task task = new Task();
            task.setName("Pilne zadanie nr " + i);
            task.setDone(i % 3 == 0);
            tasks.add(task);
        }
    }

    public List<Task> getTasks() { return tasks; }

    Task getTask(UUID id)
    {
        for (Task t : tasks)
            if (t.getId() == id)
                return t;
        return null;
    }

}
