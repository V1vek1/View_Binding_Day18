package com.helllo.viewbindingday18

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.helllo.viewbindingday18.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //maine Main class ke under me ek "lateinit" variable bnaya or usme "ActivityMainBinding" Class ko assign kardiya
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Jab aap View Binding Bna rhe h to aapko Yeh code likhna h
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)  //Binding me Root lgane se hame iss Binding xml ka Address mil jayega


        //Binding ki help lene se mujhe "findViewByID" use nahi jarni padi
        binding.button.setOnClickListener {

            if (binding.checkBox.isChecked)
            {
                //Open New Screen

            }
            else
            {
                //Agar kisine "CheckBox" per Click nahi kiya h to, Usko CheckBox "red" color me show hoga or yeh
                //"TOAST" bhi show hoga
                binding.checkBox.buttonTintList = ColorStateList.valueOf(Color.RED)
                Toast.makeText(this, "Please accpect the T&C",Toast.LENGTH_SHORT).show()
            }
        }

    }
}