package com.willjsporter.notes;

import java.time.Instant;
import java.util.Date;

public class Note {
    private final int id;

    private String text;
    private final Date dateCreated;
    private final Date dateModified;

    public Note(int id, String text) {
        this.id = id;
        this.text = text;
        this.dateCreated = Date.from(Instant.EPOCH);
        this.dateModified = Date.from(Instant.EPOCH);
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public Date getDateModified() {
        return dateModified;
    }
}
