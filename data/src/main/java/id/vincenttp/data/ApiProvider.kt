package id.vincenttp.data

import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory

class ApiProvider {

    fun getRetrofit(): Retrofit = Retrofit
        .Builder()
        .baseUrl(BuildConfig.BASE_URL)
        .addConverterFactory(JacksonConverterFactory.create())
        .build()
}