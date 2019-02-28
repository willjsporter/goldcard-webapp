package com.willjsporter.notes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LocalMemoryStore {

    private Map<Integer, Note> noteStore;

    public LocalMemoryStore() {
        this.noteStore = new HashMap<>();
    }

    public Note getNote(int i) {
        return noteStore.get(i);
    }

    public List<Note> getAll() {
        return new ArrayList<>(noteStore.values());
    }

    public Note save(Note note) {
        return noteStore.put(note.getId(), note);
    }

    public Note delete(int noteId) throws NullPointerException {
        if(getNote(noteId) == null) {
            throw new NullPointerException("Invalid key");
        } else {return noteStore.remove(noteId); }
    }

    public Note edit(int note_0_id) {
        return null;
    }
}
