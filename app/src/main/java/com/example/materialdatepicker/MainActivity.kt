package com.example.materialdatepicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import com.example.materialdatepicker.databinding.ActivityMainBinding
import com.google.android.material.datepicker.MaterialDatePicker

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btPickDate.setOnClickListener {
            showDatePickerDialog()
        }

    }

    private fun showDatePickerDialog() {
        var materialDatePicker: MaterialDatePicker<Long> = MaterialDatePicker.Builder.datePicker()
            .setTitleText("Selected Date").build()

        materialDatePicker.addOnPositiveButtonClickListener {
            binding.tvDate.setText(""+materialDatePicker.headerText)
        }

        materialDatePicker.show(supportFragmentManager,"TAG")

    }
}