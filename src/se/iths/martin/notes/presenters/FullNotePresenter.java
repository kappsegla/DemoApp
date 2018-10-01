package se.iths.martin.notes.presenters;

import se.iths.martin.notes.Note;

public class FullNotePresenter implements Presenter<Note> {

    @Override
    public String present(Note note) {
        return "Title: " + note.getTitle()
                + "\nBody: " + note.getBody();
    }
}
