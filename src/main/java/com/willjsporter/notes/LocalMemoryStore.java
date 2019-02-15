package com.willjsporter.notes;

import java.util.HashMap;
import java.util.Map;

public class LocalMemoryStore {

    private Map<Integer, Note> noteStore;

    public LocalMemoryStore() {
        this.noteStore = new HashMap<>();
    }

    public Note save(Note note) {
        return noteStore.put(note.getId(), note);
    }

    public Note getNote(int i) {
        return noteStore.get(i);
    }
}
