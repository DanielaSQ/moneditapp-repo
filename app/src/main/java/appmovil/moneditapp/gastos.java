package appmovil.moneditapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class gastos extends AppCompatActivity {
    ImageView imanesita;
    Button mu;
    EditText lo,da;
    TextView tx;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gastos);

        imanesita = (ImageView) findViewById(R.id.view);
        mu = (Button) findViewById(R.id.boton);
        lo = (EditText) findViewById(R.id.numero);
        da = (EditText) findViewById(R.id.texto);
        tx = (TextView) findViewById(R.id.textapunta);


    }
}
