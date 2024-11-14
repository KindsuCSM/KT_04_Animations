package com.kindsu.animations_cristinasanchezmoreno

import android.graphics.drawable.Animatable
import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat
import com.kindsu.animations_cristinasanchezmoreno.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
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

    // funcion para añadirle los fondos a la ImageView
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
    // Funcion que hace una lista de las animaciones y las inicializa todas mediante un bucle
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
    // Función que crea los listeners de cada card
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
    // Funcion que crea las ventanas Dialog con la información de cada pokemon
    private fun setDialog(pokemon : String){
        // Para no repetir lineas de codigo declaramos las variables que vamos a usar en cada dialog
        val animationDrawable : AnimationDrawable
        val dialog: AlertDialog

        // Declaramos e inicializamos los componentes que vamos a usar para poner la informacion del Pokemon
            // Creamos la vista que se basa en el archivo dialog_pokemon.xml
        val alertaDialog = layoutInflater.inflate(R.layout.dialog_pokemon, null)
            // Creamos el objeto AlertDialog.Builder para construir el dialogo de forma personalizada
        val builder = AlertDialog.Builder(this)
            // Creamos las variable para asociar el componente de la pantalla a la variable
        val animacionVectorIzq = alertaDialog.findViewById<ImageView>(R.id.ivPokeball_izq)
        val animacionVectorDer = alertaDialog.findViewById<ImageView>(R.id.ivPokeball_der)
            // Le damos valores a unas variables de los componentes que vamos a cambiar dependiendo del Pokemon
        val nombrePokemon = alertaDialog.findViewById<TextView>(R.id.tvPokemonName)
        val textoDescriptivo = alertaDialog.findViewById<TextView>(R.id.tvPokemonDescripcion)
        val animation = alertaDialog.findViewById<ImageView>(R.id.ivPokemonAnimation)

        // Inicializar las animaciones vectoriales con AnimatedVectorDrawableCompat que iran al inicio
            // y fin del titulo (nombre de pokemon) que se encuentra en el dialog personalizado
        val drawable = AnimatedVectorDrawableCompat.create(this, R.drawable.animated_pokeball)
        animacionVectorIzq.setImageDrawable(drawable)
        animacionVectorDer.setImageDrawable(drawable)
        if(drawable is Animatable){
           drawable.start()
        }

        // Dependiendo de la string que nos pasen por parametro establecemos los valores de los elementos de dialog_pokemon
        when(pokemon){
            "eevee" -> {
                nombrePokemon.setText(R.string.strEevee)
                textoDescriptivo.setText(R.string.descripcionEevee)
                animation.setBackgroundResource(R.drawable.animation_eevee)

            }
            "espeon" -> {
                nombrePokemon.setText(R.string.strEspeon)
                textoDescriptivo.setText(R.string.descripcionEspeon)
                animation.setBackgroundResource(R.drawable.animation_espeon)
            }
            "flareon" -> {
                nombrePokemon.setText(R.string.strFlareon)
                textoDescriptivo.setText(R.string.descripcionFlareon)
                animation.setBackgroundResource(R.drawable.animation_flareon)
            }
            "glaceon" -> {
                nombrePokemon.setText(R.string.strGlaceon)
                textoDescriptivo.setText(R.string.descripcionGlaceon)
                animation.setBackgroundResource(R.drawable.animation_glaceon)
            }
            "jolteon" -> {
                nombrePokemon.setText(R.string.strJolteon)
                textoDescriptivo.setText(R.string.descripcionJolteon)
                animation.setBackgroundResource(R.drawable.animation_jolteon)
            }
            "leafeon" -> {
                nombrePokemon.setText(R.string.strLeafeon)
                textoDescriptivo.setText(R.string.descripcionLeafeon)
                animation.setBackgroundResource(R.drawable.animation_leafeon)
            }
            "sylveon" -> {
                nombrePokemon.setText(R.string.strSylveon)
                textoDescriptivo.setText(R.string.descripcionSylveon)
                animation.setBackgroundResource(R.drawable.animation_sylveon)
            }
            "umbreon" -> {
                nombrePokemon.setText(R.string.strUmbreon)
                textoDescriptivo.setText(R.string.descripcionUmbreon)
                animation.setBackgroundResource(R.drawable.animation_umbreon)
            }
            "vaporeon" -> {
                nombrePokemon.setText(R.string.strVaporeon)
                textoDescriptivo.setText(R.string.descripcionVaporeon)
                animation.setBackgroundResource(R.drawable.animation_vaporeon)
            }


        }
        // Establecemos que los fondos son animaciones y las iniciamoss
        animationDrawable = animation.background as AnimationDrawable
        animationDrawable.start()
        // Establece el dialog con los cambios que hemos hecho dentro del when
        builder.setView(alertaDialog)
        // Crea la instancia del AlertDialog
        dialog = builder.create()
        // Mostramos el dialog
        dialog.show()
    }
}