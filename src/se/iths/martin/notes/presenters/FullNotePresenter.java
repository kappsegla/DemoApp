package se.iths.martin.notes.presenters;

import se.iths.martin.notes.Note;

public class FullNotePresenter implements Presenter {

    @Override
    public String present(Note note) {
        return "Title: " + note.getTitle()
                + "\n================\n" + note.getBody();
    }
}
