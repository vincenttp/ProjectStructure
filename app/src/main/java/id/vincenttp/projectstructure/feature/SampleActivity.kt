package id.vincenttp.projectstructure.feature

import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import dagger.hilt.android.AndroidEntryPoint
import id.vincenttp.projectstructure.base.BaseActivity
import id.vincenttp.projectstructure.databinding.ActivitySampleBinding

@AndroidEntryPoint
class SampleActivity : BaseActivity<ActivitySampleBinding>() {
    private val viewModel by viewModels<SampleViewModel> { defaultViewModelProviderFactory }

    init {
        lifecycleScope.launchWhenStarted {
            viewModel.getDetail()
        }
    }

    override fun initViewBinding() = ActivitySampleBinding.inflate(layoutInflater)

    override fun onInitView() {
    }

    override fun onInitObserve() {
        viewModel.details.observe(this){
            binding.tvName.text = it.username
        }
    }

}
