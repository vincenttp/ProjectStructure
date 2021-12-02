package id.vincenttp.projectstructure.feature

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import dagger.hilt.android.lifecycle.HiltViewModel
import id.vincenttp.domain.base.Result
import id.vincenttp.domain.entities.UserModel
import id.vincenttp.domain.interactor.GetDetail
import id.vincenttp.projectstructure.base.BaseViewModel
import javax.inject.Inject

@HiltViewModel
class SampleViewModel @Inject constructor(
    private val getDetail: GetDetail
) : BaseViewModel() {
    private val _details = MutableLiveData<UserModel>()
    val details: LiveData<UserModel> = _details

    suspend fun getDetail() {
        when (val result = getDetail.invoke(GetDetail.Params("vincenttp"))) {
            is Result.Success -> {
                _details.postValue(result.data)
            }
            is Result.Error -> {

            }
        }
    }
}