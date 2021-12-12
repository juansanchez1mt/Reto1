package com.example.reto1;
/*
@author Juan Camilo Sanchez
 */
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/*Clase principal*/
public class MainActivity extends AppCompatActivity {

    /*
    Atributo Girnalda
     */
    private Button btnGirnalda;
    /*
    Atributo Papa noel
    */
    private Button btnPapaNoel;
    /*
    Atributo Esfera
    */
    private Button btnPelota;


/*
Metodo onCreate
 */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*
        Metodo mostrar actionbar
        */
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        /*
        Metodo titulo
        */
        getSupportActionBar().setTitle("Mis Productos navideños");
        /*
        Metodo suptitulo
        */
        getSupportActionBar().setSubtitle("Seleccione sus productos a comprar");
        /*
        Metodo para mostrar el icono de la app
        */
        getSupportActionBar().setLogo(R.mipmap.icono1);
        /*
        Metodo habilitar el logo
        */
        getSupportActionBar().setDisplayUseLogoEnabled(true);





        btnPelota = (Button) findViewById(R.id.btnComprar);

        btnPelota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ProductoActividad2.class);
                startActivity(intent);
            }
        });


        btnPapaNoel = (Button) findViewById(R.id.btnComprar2);

        btnPapaNoel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ProductoActividad3.class);
                startActivity(intent);
            }
        });



        btnGirnalda = (Button) findViewById(R.id.btnComprar3);

        btnGirnalda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ProductoActividad.class);
                startActivity(intent);
            }
        });


    }

     /*
     Metodo OptionsMenu
      */
    @Override

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mimenu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    /*
    Metodo ItemSelected
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.Productos) {
            Toast.makeText(getApplicationContext(), "Usted ha seleccionado la opción de Productos", Toast.LENGTH_LONG).show();
        }
        if (id == R.id.Servicios) {
            Toast.makeText(getApplicationContext(), "Usted ha seleccionado la opción de Servicios", Toast.LENGTH_LONG).show();
        }
        if (id == R.id.Surcursales) {
            Toast.makeText(getApplicationContext(), "Usted ha seleccionado la opción de Surcursales", Toast.LENGTH_LONG).show();
        }




        return super.onOptionsItemSelected(item);




    }


}