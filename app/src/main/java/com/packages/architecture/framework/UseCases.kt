package com.packages.architecture.framework

import com.packages.core.usecase.*

data class UseCases(
    val addNote: AddNote,
    val getAllNotes: GetAllNotes,
    val getNote: GetNote,
    val removeNote: RemoveNote,
    val getWordCount: GetWordCount
)