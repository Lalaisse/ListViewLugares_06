package mx.edu.tecmm.moviles.listviewlugares_06

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    var lugares = arrayOf("Tequila", "Amatitán", "Magdalena", "Guadalajara",
                          "Arenal", "Potrero de los Rivera", "El Salvador", "Zapopan",
                          "Chome", "El Cóbano", "El Chiltillo", "Tapexco")
    //lateinit var txtLugar: TextView;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val txtLugar: TextView= findViewById(R.id.txtLugar)
        val listView: ListView = findViewById(R.id.list_view_lugares); //El list view neesita un adaptador
        val adaptador= ArrayAdapter(this, R.layout.list_item, lugares);

        listView.adapter= adaptador;


        //Cuando el item es presionado
        listView.onItemClickListener= object: AdapterView.OnItemClickListener{
            override fun onItemClick(p0: AdapterView<*>?, p1: View?, position: Int, id: Long) {//Primero es el adaptador, segundo la vista, 3rp posición y cuarto el id
                val item= listView.getItemAtPosition(position) as String;
                Toast.makeText(applicationContext, "El item seleccionado es $item", Toast.LENGTH_SHORT).show();//Lleva el contexto, el mensaje, la duración
                txtLugar.text=item
            }
        }
    }



}