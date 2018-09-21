package hr.algebra.java.ispandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String KEY_IME = "ime";
    public static final String KEY_PREZIME = "prezima";
    public static final String KEY_ADRESA = "adresa";
    public static final String KEY_GRADOVI = "gradovi";
    public static final String KEY_OIB = "oib";
    public static final String KEY_TELEFON = "telefon";
    public static final String KEY_SPOL = "spol";
    private EditText etIme;
    private EditText etPrezima;
    private EditText etAdresa;
    private EditText etOib;
    private EditText etTel;
    private Spinner spGradovi;
    private RadioGroup rgSpol;

    private RadioButton radioButton;
    private Button btnSpremiPod;

    String ime;
    int radioid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etIme = findViewById(R.id.etIme);
        etPrezima = findViewById(R.id.etPrezima);
        etAdresa = findViewById(R.id.etAdresa);
        etOib = findViewById(R.id.etOib);
        etTel = findViewById(R.id.etTel);
        spGradovi = findViewById(R.id.spGradovi);
        rgSpol = findViewById(R.id.rgSpol);
        btnSpremiPod = findViewById(R.id.btnSpremiPod);


        btnSpremiPod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String podaci[] = {etIme.getText().toString(),
                        etPrezima.getText().toString(), ime,
                        etOib.getText().toString(),
                        etTel.getText().toString()};
                for (String spremljeno : podaci) {
                    Toast.makeText(MainActivity.this, spremljeno, Toast.LENGTH_SHORT).show();
                }

                radioid = rgSpol.getCheckedRadioButtonId();
                radioButton = findViewById(radioid);
                Toast.makeText(MainActivity.this, radioButton.getText(), Toast.LENGTH_SHORT).show();

                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra(KEY_IME, "ime: " +  etIme.getText().toString());
                i.putExtra(KEY_PREZIME, "prezime: " +  etPrezima.getText().toString());
                i.putExtra(KEY_ADRESA, "adresa: " +  etAdresa.getText().toString());
                i.putExtra(KEY_GRADOVI, "grad: " +  ime);
                i.putExtra(KEY_OIB, "oib: " +  etOib.getText().toString());
                i.putExtra(KEY_TELEFON, "telefon: " +  etTel.getText().toString());
                i.putExtra(KEY_SPOL, "spol: " +  radioButton.getText());

                startActivity(i);


            }
        });






    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Hvala na koristenju apliakcije", Toast.LENGTH_SHORT).show();
    }

}
