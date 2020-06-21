package com.acuscorp.kotlin.ui.fragments.schedule


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.acuscorp.kotlin.R

/**
 * A simple [Fragment] subclass.
 */
class ScheduleDitailDialogFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_schedule_ditail_dialog, container, false)
    }


}
