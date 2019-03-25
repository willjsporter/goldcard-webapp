package com.willjsporter.notes;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.willjsporter.test_utils.TestUtils.assertErrorMessage;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.core.Is.is;

class LocalMemoryStoreTest {

    private final int NOTE_0_ID = 0;
    private final String NOTE_0_MESSAGE = "note 0 message is this";
    private final int NOTE_1_ID = 1;
    private final String NOTE_1_MESSAGE = "note 1 message is this";

    private final Note testNote0 = new Note(NOTE_0_ID, NOTE_0_MESSAGE);
    private final Note testNote1 = new Note(NOTE_1_ID, NOTE_1_MESSAGE);

    private WillsCrudInterface localMemoryStore;

    @BeforeEach
    void setup() {
        localMemoryStore = new LocalMemoryStore();
        localMemoryStore.save(testNote0);
        localMemoryStore.save(testNote1);
    }

    @Test
    void shouldBeAbleToRetrieveAllNotesAtOnce() {
        assertThat(localMemoryStore.getAll(), is(List.of(testNote0, testNote1)));
    }

    @Test
    void shouldStoreNoteInLocalMemoryStore()  {
        assertThat(localMemoryStore.getNote(NOTE_0_ID), is(testNote0));
        assertThat(localMemoryStore.getNote(NOTE_1_ID), is(testNote1));
    }

    @Test
    void shouldRemoveAGivenNoteFromMemoryWhenDeleted () {
        localMemoryStore.delete(NOTE_0_ID);
        assertThat(localMemoryStore.getAll(), contains(testNote1));
    }

    @Test
    void shouldThrowAnExceptionWhenToldToRemoveANonExistentNote () {
        System.out.println(localMemoryStore.getNote(1234));
        assertErrorMessage(() -> localMemoryStore.delete(1234), "Invalid key");
    }

    @Test
    void shouldAcceptEditsToExistingNotesThroughSaveMethod() {
        Note updatedNote = new Note(NOTE_0_ID,"new Note 0 text");
        localMemoryStore.save(updatedNote);
        assertThat(localMemoryStore.getAll(), is(List.of(updatedNote, testNote1)));
    }

}