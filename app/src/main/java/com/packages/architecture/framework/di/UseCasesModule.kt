package com.packages.architecture.framework.di

import com.packages.core.repository.NoteRepository
import com.packages.core.usecase.*
import com.packages.architecture.framework.UseCases
import dagger.Module
import dagger.Provides

@Module
class UseCasesModule {
    @Provides
    fun getUseCases(repository: NoteRepository) = UseCases(
        AddNote(repository),
        GetAllNotes(repository),
        GetNote(repository),
        RemoveNote(repository),
        GetWordCount()
    )
}