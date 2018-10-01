package se.iths.martin.notes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class NotesHandler {

    List<Note> notes = new ArrayList<>();

    //CRUD operations, Create, Read, Update, Delete
    /**
     * Creates a new Note instance and stores it internally for later use
     *
     * @param title Title to set for new Note
     * @param body  Body of new Note
     * @return Returns the newly created Note instance
     */
    public Note createNote(String title, String body) {
        //TODO:Validation goes here
        Note note = new Note(title, body);
        notes.add(note);
        return note;
    }

    /**
     * Search for the first note with matching title
     *
     * @param title title to search for with exact match
     * @return Note with matching title, if none found returns a new Note object
     */
    public Note getNote(String title) {
        //Search for note with title
        for (Note note : notes) {
            if (note.getTitle().equals(title))
                return note;
        }
        return new Note("", "");
    }

    //    editNote?

    public void deleteNote(Note note){
        notes.remove(note);
    }
}
