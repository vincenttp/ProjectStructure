package id.vincenttp.projectstructure.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import id.vincenttp.data.UserRepositoryImpl
import id.vincenttp.domain.repository.UserRepository
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class DataModule {
    @Provides
    @Singleton
    fun provUserData(impl: UserRepositoryImpl): UserRepository = impl
}