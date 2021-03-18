package com.example.proto_hd_odontologia

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_dashboard.*
import kotlinx.android.synthetic.main.loggin.view.*


@Suppress("UNREACHABLE_CODE")
class dashboard : Fragment() {


/*
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)







        }



    }
*/

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dashboard, container, false)


    btn_paciente.setOnClickListener {

    val mDialogView = LayoutInflater.from(getActivity()?.getApplicationContext()).inflate(R.layout.submenu_dashboard, null)
    //val mDialogView = LayoutInflater.from(dashboard.this).inflate(R.layout.submenu_dashboard, null)
    val mBuilder= getActivity()?.getApplicationContext()?.let { it1 ->
        AlertDialog.Builder(it1)
            .setView(mDialogView)
    }

    val mAlertDialog = mBuilder?.show()

    mDialogView.dialogLoginBtn.setOnClickListener {


        mAlertDialog?.dismiss()

    }
    //cancel button click of custom layout
    mDialogView.dialogCancelBtn.setOnClickListener {
        //dismiss dialog
        mAlertDialog?.dismiss()
    }








}






        }









}// fin del objeto









