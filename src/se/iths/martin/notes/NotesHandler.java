package se.iths.martin.notes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NotesHandler {

    List<Note> notes = new ArrayList<>();

    //CRUD operations, Create, Read, Update, Delete

    /**
     * Creates a new Note instance and stores it internally for later use
     * @param title Title to set for new Note
     * @param body Body of new Note
     * @return Returns the newly created Note instance
     */
    public Note createNote(String title, String body){
        //TODO:Validation goes here
        Note note = new Note(title,body);
        notes.add(note);
        return note;
    }
//
//    deleteNote
//
//    editNote
//
//    getNote
//
//    combineNotes?
//
//    viewNote?
}
