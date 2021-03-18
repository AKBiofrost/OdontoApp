package com.example.proto_hd_odontologia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_inicio_usuario.*
import kotlinx.android.synthetic.main.loggin.view.*

class InicioUsuario : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio_usuario)


         this.btn_login.setOnClickListener {

                 startActivity(Intent(this, Menu_slider::class.java))
                 overridePendingTransition(R.transition.zoom_back_in, R.transition.zoom_back_out)
                 Toast.makeText(this, "Menu principal", Toast.LENGTH_SHORT).show()
                 finish()


         }

         btn_registro.setOnClickListener {

         val mDialogView = LayoutInflater.from(this).inflate(R.layout.loggin, null)
         val mBuilder= AlertDialog.Builder(this)
             .setView(mDialogView)

         val mAlertDialog = mBuilder.show()

         mDialogView.dialogLoginBtn.setOnClickListener {


             mAlertDialog.dismiss()

             }
         //cancel button click of custom layout
         mDialogView.dialogCancelBtn.setOnClickListener {
             //dismiss dialog
             mAlertDialog.dismiss()
          }

      }


     ayuda.setOnClickListener {

     val mAlertDialog = AlertDialog.Builder(this)
         mAlertDialog.setIcon(R.drawable.icono_logo)
         mAlertDialog.setTitle("Ayuda")
         mAlertDialog.setMessage("puede contactar al dev por los siguiente botones")
         mAlertDialog.setPositiveButton("YES") { dialog, id ->
             //perform some tasks here
             Toast.makeText(this, "seguimos en prueba", Toast.LENGTH_SHORT).show()
         }
         mAlertDialog.setNegativeButton("NO") { dialog, id ->
             //perform som tasks here
             Toast.makeText(this, "seguimos en prueba", Toast.LENGTH_SHORT).show()
         }
         mAlertDialog.show()




     }







    }
}
