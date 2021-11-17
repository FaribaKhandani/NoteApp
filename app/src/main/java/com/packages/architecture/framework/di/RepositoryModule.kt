package com.packages.architecture.framework.di

import android.app.Application
import com.packages.core.repository.NoteRepository
import com.packages.architecture.framework.RoomNoteDataSource
import dagger.Module
import dagger.Provides

@Module
class RepositoryModule {

    @Provides
    fun provideRepository(app: Application) = NoteRepository(RoomNoteDataSource(app))
}