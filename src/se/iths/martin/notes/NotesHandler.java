package se.iths.martin.notes;

import se.iths.martin.notes.validators.NoteValidator;
import se.iths.martin.notes.validators.Validator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class NotesHandler {

    List<Note> notes = new ArrayList<>();

    public NotesHandler(){
        //Configure NoteValidator
        NoteValidator.addValidator(new Validator<Note>() {
            @Override
            public boolean validate(Note obj) {
                return obj.getTitle().length() > 2;
            }
        });
        NoteValidator.addValidator(obj -> !(obj.getBody().length() < 2) );
        NoteValidator.addValidator(obj -> !obj.getTitle().equals("Hej"));
    }

    //CRUD operations, Create, Read, Update, Delete
    /**
     * Creates a new Note instance and stores it internally for later use
     *
     * @param title Title to set for new Note
     * @param body  Body of new Note
     * @return Returns the newly created Note instance
     */
    public Note createNote(String title, String body) {
        Note note = new Note(title, body);

        if( NoteValidator.validate(note))
            notes.add(note);
        else
            System.out.println("Error in note");
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

    //    editNote? Just do a getNote and then change info with setTitle, setBody.

    public void deleteNote(Note note){
        notes.remove(note);
    }
}
