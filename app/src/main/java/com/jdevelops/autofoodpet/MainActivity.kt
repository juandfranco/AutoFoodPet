package com.jdevelops.autofoodpet

import android.Manifest
import android.app.ActivityManager
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.SmsManager
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.annotation.RequiresApi
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.fragment.app.Fragment
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.jdevelops.autofoodpet.databinding.ActivityMainBinding
import com.jdevelops.autofoodpet.databinding.ActivitySignInBinding
import java.lang.NullPointerException


class MainActivity : AppCompatActivity(){
    private lateinit var auth: FirebaseAuth
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = Firebase.auth
        val user = auth.currentUser


        /*tv_fijarDestino.setOnClickListener {
            val intent = Intent(this,TravelSelectionActivity::class.java)
            startActivity(intent)
        }


        profile.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }


        tv_grabarRuta.setOnClickListener {

            if(isMyServiceRunning(RecordRoute::class.java)==true){
                val intentRecord = Intent(this,RecordRouteActivity::class.java)
                intentRecord.putExtra("runing",true)
                startActivity(intentRecord)
            }
            else{
                val intent = Intent(this,RecordRouteActivity::class.java)
                startActivity(intent)
            }
        }

        tv_zona_segura.setOnClickListener {
            val intentZone = Intent(this,SecurityZoneActivity::class.java)

            startActivity(intentZone)

        }*/
    }
}