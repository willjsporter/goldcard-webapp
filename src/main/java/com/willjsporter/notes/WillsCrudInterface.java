package com.willjsporter.notes;

import java.util.List;

public interface WillsCrudInterface {

    Note getNote(int i);

    List<Note> getAll();

    Note save(Note note);

    Note delete(int noteId) throws NullPointerException;

}
