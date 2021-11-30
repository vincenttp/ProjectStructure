package id.vincenttp.projectstructure.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import id.vincenttp.data.ApiProvider
import id.vincenttp.data.api.UserApi
import javax.inject.Inject

@InstallIn(SingletonComponent::class)
@Module
class ApiModule @Inject constructor(){

    @Provides
    fun provSampleApi(): UserApi = ApiProvider()
            .getRetrofit()
            .create(UserApi::class.java)
}