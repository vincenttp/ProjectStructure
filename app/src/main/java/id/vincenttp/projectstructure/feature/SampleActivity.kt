package id.vincenttp.projectstructure.feature

import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import id.vincenttp.projectstructure.R
import id.vincenttp.projectstructure.base.BaseActivity

@AndroidEntryPoint
class SampleActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample)

    }
}
