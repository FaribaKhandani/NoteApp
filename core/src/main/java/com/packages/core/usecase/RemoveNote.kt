package com.packages.core.usecase

import com.packages.core.data.Note
import com.packages.core.repository.NoteRepository

class RemoveNote(private val noteRepository: NoteRepository) {
    suspend operator fun invoke(note: Note) = noteRepository.removeNote(note)
}