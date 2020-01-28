package ec.edu.tecnologico.pruebaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VentanaResultados extends AppCompatActivity  {
    private Button botonRegresar ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana_resultados);
     //   botonRegresar.setOnClickListener(this);


        botonRegresar =(Button) findViewById(R.id.btnregresar);
    }



      /*  public void onClick(View view) {

            Intent intent1 = new Intent(VentanaResultados.this,MainActivity.class);
            startActivity(intent1);

        }*/

}
