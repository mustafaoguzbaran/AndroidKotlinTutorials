package com.mustafaoguzbaran.changeimages

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    //Aşağıdaki bir methodtur. onCreate methodu, uygulama ilk çalıştığında kullanıcı ekranı ilk defa görüyorken onCreate methodu çalıştırılır.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun changeImage(view: View) {
        //Değişkenlerime activity_main layout'unda tanımladığım componentleri bağladım. Buradaki R, resources anlamına gelir. R.id diyerek activity_main layout'unda tanımladığım componentlere ulaştım.
        val imageView: ImageView = findViewById(R.id.image)
        imageView.setImageResource(R.drawable.kopek)
    }

}