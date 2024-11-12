package com.kindsu.animations_cristinasanchezmoreno

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.view.animation.Animation
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.kindsu.animations_cristinasanchezmoreno.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var Animation : AnimationDrawable
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.ivCat.apply{
            setBackgroundResource(R.drawable.animation_file)
            Animation = background as AnimationDrawable
        }
        binding.ivCat.setOnClickListener({Animation.start()})
    }
}