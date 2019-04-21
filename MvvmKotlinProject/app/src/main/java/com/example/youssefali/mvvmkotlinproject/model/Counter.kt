package com.example.youssefali.mvvmkotlinproject.model

import android.databinding.Bindable
import java.util.*

class Counter: Observable() {
    /// The first name of the user
    //@get:Bindable
    var count: Int = 0
        set(value) {
            field = value
            setChangedAndNotify("count")
        }



    private fun setChangedAndNotify(field: Any)
    {
        setChanged()
        notifyObservers(field)
    }
}