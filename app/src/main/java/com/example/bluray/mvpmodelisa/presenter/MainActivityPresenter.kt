package com.example.bluray.mvpmodelisa.presenter
import com.example.bluray.mvpmodelisa.contract.ContractInterface.*
import com.example.bluray.mvpmodelisa.model.MainActivityModel

class MainActivityPresenter(_view: View): Presenter {

    private var view: View = _view
    private var model: Model = MainActivityModel()

    init {
        view.initView()
    }

    override fun incrementValue() {
        model.incrementCounter()
        view.updateViewData()
    }

    override fun getCounter() = model.getCounter().toString()

}