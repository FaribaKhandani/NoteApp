package com.packages.core.usecase

import com.packages.core.data.Note
import com.packages.core.repository.NoteRepository

class AddNote(private val noteRepository: NoteRepository) {
    suspend operator fun invoke(note: Note) = noteRepository.addNote(note)
}