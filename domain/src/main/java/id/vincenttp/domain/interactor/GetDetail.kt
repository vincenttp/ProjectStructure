package id.vincenttp.domain.interactor

import id.vincenttp.domain.base.UseCase
import id.vincenttp.domain.entities.UserModel
import id.vincenttp.domain.repository.UserRepository
import javax.inject.Inject

class GetDetail @Inject constructor(
    private val repository: UserRepository
) : UseCase<UserModel, GetDetail.Params>() {

    data class Params(val username: String)

    override suspend fun build(params: Params): UserModel = repository.getDetail(params.username)
}

