package ec.edu.tecnologico.pruebaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Button mButtonSend;
    private Button botonVerResultados;
    private EditText mEditTextDate;

    Spinner spinnerColores;
    ArrayAdapter<String> arrayColores;
    String cadenaColores[]={"Amarillo","Azul","Rojo"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botonVerResultados =(Button) findViewById(R.id.buttonverresultados);
        botonVerResultados.setOnClickListener(startActivity);


        //setViews();
        spinnerColores=(Spinner)findViewById(R.id.colores);

      //  spinnerColores.setOnItemClickListener((AdapterView.OnItemClickListener) this);

        arrayColores = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,cadenaColores);
        spinnerColores.setAdapter(arrayColores);

    }

    private void setViews() {
    /*  // Button
        mButtonSend = (Button) findViewById(R.id.button);

        // EditText
        mEditTextDate = (EditText) findViewById(R.id.editText);
        spinnerColores = (Spinner) findViewById(R.id.colores);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.spinner_data, android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        spinnerColores.setAdapter(adapter);*/
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
    /*   if (cadenaColores.equals("Amarillo");{


        }*/

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
    private View.OnClickListener startActivity = new View.OnClickListener() {
        @Override


        public void onClick(View view) {

            Intent intent = new Intent(MainActivity.this, VentanaResultados.class);
            startActivity(intent);

        }
        };
}