package id.vincenttp.data

import id.vincenttp.data.api.UserApi
import id.vincenttp.domain.entities.UserModel
import id.vincenttp.domain.repository.UserRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserRepositoryImpl @Inject constructor(val api: UserApi) : UserRepository {
    override suspend fun getDetail(username: String): UserModel =
        api.getDetail(username).run {
            UserModel(this.name)
        }

}