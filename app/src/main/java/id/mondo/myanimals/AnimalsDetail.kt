package id.mondo.myanimals

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AnimalsDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animals_detail)
        setTitle("DETAIL ANIMALS")

        val animal = intent.getParcelableExtra<Animals>("key_animal")
        if (animal != null){
            val textName = findViewById<TextView>(R.id.tv_name_detail)
            val textDescription = findViewById<TextView>(R.id.tv_desc_detail)
            val imageAnimal = findViewById<ImageView>(R.id.image_detail)

            textName.text = animal.name
            textDescription.text = animal.description
            imageAnimal.setImageResource(animal.photo)

        }

    }
}