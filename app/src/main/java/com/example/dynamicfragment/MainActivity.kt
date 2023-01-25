package com.example.dynamicfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.dynamicfragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.data.setOnClickListener(){

            var dataFragment:DataFragment = DataFragment()
            var manager: FragmentManager = supportFragmentManager
            var transaction:FragmentTransaction = manager.beginTransaction()
            transaction.replace(R.id.frame,dataFragment)
            transaction.commit()
        }
        binding . profile . setOnClickListener (){
//
//            var profileFragment: ProfileFragment = ProfileFragment()
//            var manager: FragmentManager = supportFragmentManager
//            var transaction: FragmentTransaction = manager.beginTransaction()
//            transaction.replace(R.id.frame,profileFragment)
//            transaction.commit()

            loadFragment(ProfileFragment())
        }
    }
//For Loading Fragment Function
    fun loadFragment(fragment: Fragment){

        var transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frame,fragment)
        transaction.commit()
    }
}

