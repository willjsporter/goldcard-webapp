package com.willjsporter.notes;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class NoteTest {

    @Test
    public void shouldStoreNoteInLocalMemoryStore()  {
        int id = 0;
        String text = "note 0 message is this";
        Note testNote = new Note(id, text);
        int other_id = 1;
        String other_text = "note 1 message is this";
        Note otherTestNote = new Note(other_id, other_text);

        LocalMemoryStore localMemoryStore = new LocalMemoryStore();
        localMemoryStore.save(testNote);
        localMemoryStore.save(otherTestNote);
        assertThat(localMemoryStore.getNote(0), is(testNote));
        assertThat(localMemoryStore.getNote(1), is(otherTestNote));
    }

}