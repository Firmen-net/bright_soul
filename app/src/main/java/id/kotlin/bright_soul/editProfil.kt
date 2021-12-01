package id.kotlin.bright_soul

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.FragmentTransaction

class editProfil : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val v = inflater.inflate(R.layout.fragment_edit_profil, container, false)

        val konsul = v.findViewById<ImageButton>(R.id.buttonsimpan)
        konsul.setOnClickListener {
            val profilFragment = profil()
            val transaction: FragmentTransaction = fragmentManager!!.beginTransaction()
            transaction.replace(R.id.framelayout, profilFragment)
            transaction.commit()

        }

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_edit_profil, container, false)
    }


}