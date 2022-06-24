package com.example.screw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.screw.databinding.ActivityMainBinding
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnFetch.setOnClickListener {

            GlobalScope.launch {
                fetchInfo()
            }

        }
    }

    private fun fetchInfo():Int {
        val arr = arrayOf(1,4,3,7,89,34)

        var max =arr[0]

        for ( items in 1 until arr.size){
            if (max<arr[items]){
                max=arr[items]
                binding.txtCounnt.text=max.toString()
            }
        }
        return max
    }
}