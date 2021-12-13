package id.vincenttp.projectstructure.feature.main

import dagger.hilt.android.AndroidEntryPoint
import id.vincenttp.projectstructure.base.BaseActivity
import id.vincenttp.projectstructure.databinding.ActivityMainBinding

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun initViewBinding() = ActivityMainBinding.inflate(layoutInflater)

    override fun onInitView() {}

    override fun onInitObserve() {}
}