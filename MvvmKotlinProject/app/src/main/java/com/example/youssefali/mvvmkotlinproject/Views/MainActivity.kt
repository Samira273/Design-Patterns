package com.example.youssefali.mvvmkotlinproject.Views

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.youssefali.mvvmkotlinproject.BR
import com.example.youssefali.mvvmkotlinproject.R
import com.example.youssefali.mvvmkotlinproject.model.Counter
import com.example.youssefali.mvvmkotlinproject.viewModel.CounterViewModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val counter = Counter()
        counter.count=0;
        /// Create the view model
        val userViewModel = CounterViewModel(counter)

        /// Data-Binding
        val binding = DataBindingUtil.setContentView<ViewDataBinding>(this, R.layout.activity_main)

        binding.setVariable(BR.counter, userViewModel)
    }
}
