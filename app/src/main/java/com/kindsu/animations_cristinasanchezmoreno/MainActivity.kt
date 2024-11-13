package com.kindsu.animations_cristinasanchezmoreno

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.kindsu.animations_cristinasanchezmoreno.databinding.ActivityMainBinding
import org.w3c.dom.Text

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
        addAnimationToCard()
        startAnimations()
        setListeners()
    }
    private fun setDialog(pokemon : String){
        val animationDrawable : AnimationDrawable
        val dialog: AlertDialog

        val alertaDialog = layoutInflater.inflate(R.layout.dialog_pokemon, null)
        val builder = AlertDialog.Builder(this)
        val nombrePokemon = alertaDialog.findViewById<TextView>(R.id.tvPokemonName)
        val textoDescriptivo = alertaDialog.findViewById<TextView>(R.id.tvPokemonDescripcion)
        val animation = alertaDialog.findViewById<ImageView>(R.id.ivPokemonAnimation)

        when(pokemon){
            "eevee" -> {
                nombrePokemon.setText(R.string.strEevee)
                textoDescriptivo.setText(R.string.descripcionEevee)
                animation.setBackgroundResource(R.drawable.animation_eevee)
                animationDrawable = animation.background as AnimationDrawable
                animationDrawable.start()
            }
            "espeon" -> {
                nombrePokemon.setText(R.string.strEspeon)
                textoDescriptivo.setText(R.string.descripcionEspeon)
                animation.setBackgroundResource(R.drawable.animation_espeon)
                animationDrawable = animation.background as AnimationDrawable
                animationDrawable.start()
            }
            "flareon" -> {
                nombrePokemon.setText(R.string.strFlareon)
                textoDescriptivo.setText(R.string.descripcionFlareon)
                animation.setBackgroundResource(R.drawable.animation_flareon)
                animationDrawable = animation.background as AnimationDrawable
                animationDrawable.start()
            }
            "glaceon" -> {
                nombrePokemon.setText(R.string.strGlaceon)
                textoDescriptivo.setText(R.string.descripcionGlaceon)
                animation.setBackgroundResource(R.drawable.animation_glaceon)
                animationDrawable = animation.background as AnimationDrawable
                animationDrawable.start()
            }
            "jolteon" -> {
                nombrePokemon.setText(R.string.strJolteon)
                textoDescriptivo.setText(R.string.descripcionJolteon)
                animation.setBackgroundResource(R.drawable.animation_jolteon)
                animationDrawable = animation.background as AnimationDrawable
                animationDrawable.start()
            }
            "leafeon" -> {
                nombrePokemon.setText(R.string.strLeafeon)
                textoDescriptivo.setText(R.string.descripcionLeafeon)
                animation.setBackgroundResource(R.drawable.animation_leafeon)
                animationDrawable = animation.background as AnimationDrawable
                animationDrawable.start()
            }
            "sylveon" -> {
                nombrePokemon.setText(R.string.strSylveon)
                textoDescriptivo.setText(R.string.descripcionSylveon)
                animation.setBackgroundResource(R.drawable.animation_sylveon)
                animationDrawable = animation.background as AnimationDrawable
                animationDrawable.start()
            }
            "umbreon" -> {
                nombrePokemon.setText(R.string.strUmbreon)
                textoDescriptivo.setText(R.string.descripcionUmbreon)
                animation.setBackgroundResource(R.drawable.animation_umbreon)
                animationDrawable = animation.background as AnimationDrawable
                animationDrawable.start()
            }
            "vaporeon" -> {
                nombrePokemon.setText(R.string.strVaporeon)
                textoDescriptivo.setText(R.string.descripcionVaporeon)
                animation.setBackgroundResource(R.drawable.animation_vaporeon)
                animationDrawable = animation.background as AnimationDrawable
                animationDrawable.start()
            }
        }
        builder.setView(alertaDialog)
        dialog = builder.create()
        dialog.show()
    }
    private fun setListeners() {
        binding.crdEevee.setOnClickListener {
            setDialog("eevee")
        }
        binding.crdEspeon.setOnClickListener{
            setDialog("espeon")
        }
        binding.crdFlareon.setOnClickListener{
            setDialog("flareon")
        }
        binding.crdGlaceon.setOnClickListener {
            setDialog("glaceon")
        }
        binding.crdJolteon.setOnClickListener{
            setDialog("jolteon")
        }
        binding.crdLeafeon.setOnClickListener{
            setDialog("leafeon")
        }
        binding.crdSylveon.setOnClickListener {
            setDialog("sylveon")
        }
        binding.crdUmbreon.setOnClickListener{
            setDialog("umbreon")
        }
        binding.crdVaporeon.setOnClickListener{
            setDialog("vaporeon")
        }
    }
    private fun addAnimationToCard(){
        binding.ivEevee.setBackgroundResource(R.drawable.animation_eevee)
        binding.ivEspeon.setBackgroundResource(R.drawable.animation_espeon)
        binding.ivFlareon.setBackgroundResource(R.drawable.animation_flareon)
        binding.ivGlaceon.setBackgroundResource(R.drawable.animation_glaceon)
        binding.ivJolteon.setBackgroundResource(R.drawable.animation_jolteon)
        binding.ivLeafeon.setBackgroundResource(R.drawable.animation_leafeon)
        binding.ivSylveon.setBackgroundResource(R.drawable.animation_sylveon)
        binding.ivUmbreon.setBackgroundResource(R.drawable.animation_umbreon)
        binding.ivVaporeon.setBackgroundResource(R.drawable.animation_vaporeon)

    }
    private fun startAnimations(){
        val animaciones = listOf(
            binding.ivEevee.background as AnimationDrawable,
            binding.ivEspeon.background as AnimationDrawable,
            binding.ivFlareon.background as AnimationDrawable,
            binding.ivGlaceon.background as AnimationDrawable,
            binding.ivJolteon.background as AnimationDrawable,
            binding.ivLeafeon.background as AnimationDrawable,
            binding.ivSylveon.background as AnimationDrawable,
            binding.ivUmbreon.background as AnimationDrawable,
            binding.ivVaporeon.background as AnimationDrawable
        )
        for (anim in animaciones) {
            anim.start()
        }
    }
}