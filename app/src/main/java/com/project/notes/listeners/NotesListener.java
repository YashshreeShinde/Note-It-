package com.project.notes.listeners;

import com.project.notes.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
