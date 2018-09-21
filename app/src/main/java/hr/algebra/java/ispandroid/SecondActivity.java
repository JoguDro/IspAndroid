package hr.algebra.java.ispandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView tv1 ;
    private TextView tv2 ;
    private TextView tv3 ;
    private TextView tv4 ;
    private TextView tv5 ;
    private TextView tv6 ;
    private TextView tv7 ;

    private Button btnDa;
    private Button btnNe;
    private Button btnZatvori;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        initWidgets();

        initBottuns();

        initGetData();

    }
    private void initBottuns() {
        btnZatvori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnDa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent e = new Intent(SecondActivity.this, MainActivity.class);

                startActivity(e);


            }
        });

        btnNe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    private void initWidgets() {
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);
        tv5 = findViewById(R.id.tv5);
        tv6 = findViewById(R.id.tv6);
        tv7 = findViewById(R.id.tv7);

        btnDa = findViewById(R.id.btnDa);
        btnNe = findViewById(R.id.btnNe);
        btnZatvori = findViewById(R.id.btnZatvori);
    }
    private void initGetData() {
        Intent i = getIntent();

        tv1.setText(i.getStringExtra(MainActivity.KEY_IME));
        tv2.setText(i.getStringExtra(MainActivity.KEY_PREZIME));
        tv3.setText(i.getStringExtra(MainActivity.KEY_ADRESA));
        tv4.setText(i.getStringExtra(MainActivity.KEY_GRADOVI));
        tv5.setText(i.getStringExtra(MainActivity.KEY_OIB));
        tv6.setText(i.getStringExtra(MainActivity.KEY_TELEFON));
        tv6.setText(i.getStringExtra(MainActivity.KEY_SPOL));

    }

}
