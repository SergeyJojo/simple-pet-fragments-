package com.sergeyvoloshin1992.test_project_with_fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.sergeyvoloshin1992.test_project_with_fragments.ui.Fragment_1
import com.sergeyvoloshin1992.test_project_with_fragments.ui.Fragment_2
import com.sergeyvoloshin1992.test_project_with_fragments.ui.Fragment_3
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment_1 = Fragment_1()
        val fragment_2 = Fragment_2()
        val fragment_3 = Fragment_3()



        frag_1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.Frame, fragment_1)
                addToBackStack(null)
                Toast.makeText(this@MainActivity, "Тоаст работает", Toast.LENGTH_LONG)
                    .show()
                commit()
            }

        }

        frag_2.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.Frame, fragment_2)
                addToBackStack(null)
                commit()
            }

        }
        frag_3.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.Frame, fragment_3)
                addToBackStack(null)
                commit()
            }

        }

    }
}