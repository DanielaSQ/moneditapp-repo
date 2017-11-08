package appmovil.moneditapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class IniciarSesion extends AppCompatActivity {
    TextView saludo,nUsuario,contrasenia,mensajie;
    EditText escrUsuario,escrContraseñia;
    ImageView imgenFace,imgenGoogle;
    Button botonAcept;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_sesion);

        saludo = (TextView) findViewById(R.id.txt_Sesion);
        nUsuario = (TextView) findViewById(R.id.txt_nombre);
        contrasenia = (TextView) findViewById(R.id.txt_contra);
        mensajie = (TextView) findViewById(R.id.txt_mensaje);
        escrUsuario = (EditText) findViewById(R.id.edit_name);
        escrContraseñia = (EditText) findViewById(R.id.edit_pass);
        imgenFace = (ImageView) findViewById(R.id.img_face);
        imgenGoogle = (ImageView) findViewById(R.id.img_goo);
        botonAcept = (Button) findViewById(R.id.btn_iniciar);

        botonAcept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent botonAcept = new Intent(IniciarSesion.this,Drawable.class);
                startActivity(botonAcept);
            }
        });


    }
}
