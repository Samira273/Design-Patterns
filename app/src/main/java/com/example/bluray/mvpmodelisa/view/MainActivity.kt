package com.example.bluray.mvpmodelisa.view
import com.example.bluray.mvpmodelisa.contract.ContractInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.bluray.mvpmodelisa.R
import com.example.bluray.mvpmodelisa.presenter.MainActivityPresenter
import com.example.bluray.mvpmodelisa.model.MainActivityModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),ContractInterface.View {

    private var presenter: MainActivityPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainActivityPresenter(this)
    }

    override fun initView() {
        counterTextView.text = presenter?.getCounter()
        clickButton.setOnClickListener { presenter?.incrementValue() }
    }

    override fun updateViewData() {
        counterTextView.text = presenter?.getCounter()
    }
}
