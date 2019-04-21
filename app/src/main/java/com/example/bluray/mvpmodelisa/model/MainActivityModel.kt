package com.example.bluray.mvpmodelisa.model
import com.example.bluray.mvpmodelisa.contract.ContractInterface.*

class MainActivityModel: Model {

    private var mCounter = 0

    override fun getCounter()= mCounter

    override fun incrementCounter() {
        mCounter++
    }
}