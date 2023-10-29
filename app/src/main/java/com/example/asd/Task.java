package com.example.asd;

import java.util.Date;
import java.util.UUID;

public class Task {
    private UUID id;
    private String name;
    private Date date;
    private boolean done;

    public Task()
    {
        id = UUID.randomUUID();
        date = new Date();
    }

    UUID getId() { return id; }
    String getName() { return name; }
    void setName (String s) { name = s; }
    Date getDate() { return date; }
    void setDate(Date d) { date = d; }
    boolean isDone() { return done; }
    void setDone(boolean d) { done = d; }

}
