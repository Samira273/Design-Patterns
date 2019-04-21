package com.example.youssefali.mvvmkotlinproject.viewModel

import android.arch.lifecycle.ViewModel
import android.databinding.BaseObservable
import android.databinding.Bindable
import android.view.View
import com.example.youssefali.mvvmkotlinproject.BR
import com.example.youssefali.mvvmkotlinproject.model.Counter
import java.util.*


class CounterViewModel(private val counter: Counter) : Observer, BaseObservable() {

    /// Register itself as the observer of Model
    init {
        counter.addObserver(this)
    }

    /// Notify the UI when change event emitting from Model is received.
    override fun update(p0: Observable?, obj: Any?) {
        if (obj is String) {
            if (obj == "count") {
                notifyPropertyChanged(BR.count)
            }
        }
    }
    //@get:Bindable
    val count: String
        @Bindable get() {
            return ""+counter.count
        }


    fun onButtonClick(view: View) {
        this.counter.count++
    }

}