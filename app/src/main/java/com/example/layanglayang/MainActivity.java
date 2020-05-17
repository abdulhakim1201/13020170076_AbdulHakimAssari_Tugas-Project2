package com.example.layanglayang;



import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


public class MainActivity extends AppCompatActivity {

    int d1, d2, c;
    private Toolbar toolbar;
    private EditText diagonalv, diagonalh, luas;
    private TextView hasil;
    private Button hitung, reset;
    String diagonal1, diagonal2,d3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("Abdul Hakim Assari ");
        toolbar.setSubtitle("13020170076");
        toolbar.setLogo(R.drawable.layang);

        init();

    }

    void init() {
        diagonalv = (EditText) findViewById(R.id.editText);
        diagonalh = (EditText) findViewById(R.id.editText2);
        luas = (EditText) findViewById(R.id.editText3);
        hasil = (TextView) findViewById(R.id.editText3);
        hitung = (Button) findViewById(R.id.button);
        reset = (Button) findViewById(R.id.button2);


        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int a1 = Integer.parseInt(diagonalv.getText().toString());
                int a2 = Integer.parseInt(diagonalh.getText().toString());

                d1 = a1;
                d2 = a2;


                c = (d1 * d2) / 2;

                hasil.setText("   " + c);
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasil.setText("");
                diagonalv.setText("");
                diagonalh.setText("");
                diagonalv.requestFocus();
            }
        });
        validasidata();
    }
        public void validasidata(){
        diagonal1 = diagonalv.getText().toString();
        diagonal2 = diagonalh.getText().toString();
        d3 = luas.getText().toString();

        if(TextUtils.isEmpty(diagonal1)){
            diagonalv.setError("Harap di isi");
        }else if(TextUtils.isEmpty(diagonal2)){
            diagonalh.setError("Isi tidak boleh kosong");
            return;
      
        }


      }
    }











        





