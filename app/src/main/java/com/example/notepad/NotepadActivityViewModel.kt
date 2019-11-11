package com.example.notepad

import android.app.Application
import androidx.lifecycle.AndroidViewModel

class NotepadActivityViewModel(application: Application) : AndroidViewModel(application) {

    private val noteRepository = NoteRepository(application.applicationContext)

    val note = noteRepository.getNotepad()

}
