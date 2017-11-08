package appmovil.moneditapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView bienvenida, nombreApp;
    ImageView imaLogo;
    Button botIniciar,botRegistrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bienvenida = (TextView) findViewById(R.id.txt_welcome);
        nombreApp = (TextView) findViewById(R.id.txt_nombre);
        imaLogo = (ImageView) findViewById(R.id.img_logo);
        botIniciar = (Button) findViewById(R.id.btn_ini);
        botRegistrar = (Button) findViewById(R.id.btn_regi);

        botIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent botIniciar = new Intent(MainActivity.this,IniciarSesion.class);
                startActivity(botIniciar);
            }
        });

        botRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent botRegistrar = new Intent(MainActivity.this,RegistrarSesion.class);
                startActivity(botRegistrar);
            }
        });


    }
}
