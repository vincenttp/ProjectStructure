package id.vincenttp.projectstructure.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.viewbinding.ViewBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

abstract class BaseActivity<T : ViewBinding> : AppCompatActivity() {
    lateinit var binding: T

    protected abstract fun initViewBinding(): T

    abstract fun onInitView()
    abstract fun onInitObserve()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = initViewBinding()
        setContentView(binding.root)

        onInitView()
        onInitObserve()
    }
}