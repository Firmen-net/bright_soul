package id.kotlin.bright_soul

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class splashpage3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashpage3)

        val nextButton = findViewById<ImageButton>(R.id.btn1)
        nextButton.setOnClickListener{
            val Intent = Intent(this,login::class.java)
            startActivity(Intent)
        }
    }
}