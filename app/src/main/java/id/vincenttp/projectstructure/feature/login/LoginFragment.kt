package id.vincenttp.projectstructure.feature.login

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import dagger.hilt.android.AndroidEntryPoint
import id.vincenttp.projectstructure.base.BaseFragment
import id.vincenttp.projectstructure.databinding.FragmentLoginBinding
import id.vincenttp.projectstructure.feature.SampleViewModel

@AndroidEntryPoint
class LoginFragment : BaseFragment<FragmentLoginBinding>() {
    private val viewModel by viewModels<SampleViewModel> { defaultViewModelProviderFactory }

    init {
        lifecycleScope.launchWhenStarted {
            viewModel.getDetail()
        }
    }

    override fun initViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentLoginBinding = FragmentLoginBinding.inflate(inflater, container, false)

    override fun onInitView() {}

    override fun onInitObserve() {
        viewModel.details.observe(this) {
            binding.test.text = it.username
        }
    }

}