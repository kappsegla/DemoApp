package se.iths.martin.notes.presenters;

import se.iths.martin.notes.Note;

public class NotePresenter implements Presenter{

    public String present(Note note){
        return "Title: " + note.getTitle() + "\n";
    }
}
