package id.kotlin.bright_soul

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.FragmentTransaction
import androidx.fragment.app.FragmentManager

class dokter : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val v = inflater.inflate(R.layout.fragment_dokter, container, false)

        val konsul = v.findViewById<ImageButton>(R.id.btnback)
        konsul.setOnClickListener{
            val homeFragment = home()
            val transaction: FragmentTransaction = fragmentManager!!.beginTransaction()
            transaction.replace(R.id.framelayout, homeFragment)
            transaction.commit()
        }
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dokter, container, false)
    }


}