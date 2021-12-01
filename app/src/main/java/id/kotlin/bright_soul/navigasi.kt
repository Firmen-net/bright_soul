package id.kotlin.bright_soul

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils.replace
import android.widget.ImageButton

class navigasi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigasi)
        val fragHome = home()
        val fragProfil = profil()
        val fragNotes = list_mynotes()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.framelayout, fragHome)
            commit()
        }

        findViewById<ImageButton>(R.id.homeBtn).setOnClickListener {

            supportFragmentManager.beginTransaction().apply {
                replace(R.id.framelayout, fragHome)
                commit()
            }
        }

        findViewById<ImageButton>(R.id.profilBtn).setOnClickListener {

            supportFragmentManager.beginTransaction().apply {
                replace(R.id.framelayout, fragProfil)
                commit()
            }
        }

        findViewById<ImageButton>(R.id.notesBtn).setOnClickListener {

            supportFragmentManager.beginTransaction().apply {
                replace(R.id.framelayout, fragNotes)
                commit()
            }
        }

    }
}