package appmovil.moneditapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class ingresa extends AppCompatActivity {

    EditText q,w;
    TextView t;
    ImageView im;
    Button bu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresa);

        q = (EditText) findViewById(R.id.ed_su);
        w = (EditText) findViewById(R.id.texto);
        t = (TextView) findViewById(R.id.t_apun);
        im = (ImageView) findViewById(R.id.i_pa);
        bu = (Button) findViewById(R.id.btn_elige);
    }
}
