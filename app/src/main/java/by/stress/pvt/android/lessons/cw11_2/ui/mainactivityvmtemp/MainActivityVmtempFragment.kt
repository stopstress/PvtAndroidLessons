package by.stress.pvt.android.lessons.cw11_2.ui.mainactivityvmtemp

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import by.stress.pvt.android.lessons.R


class MainActivityVmtempFragment : Fragment() {

    companion object {
        fun newInstance() = MainActivityVmtempFragment()
    }

    private lateinit var viewModel: MainActivityVmtempViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_activity_vmtemp_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainActivityVmtempViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
