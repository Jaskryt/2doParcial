package com.example.boton.examen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FacC extends AppCompatActivity {
    EditText text;
    TextView tot;
    int aconver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fa_c);
        try {
            Button conver = findViewById(R.id.convertir);
            text = findViewById(R.id.cont);
            tot = findViewById(R.id.Convertido);
            conver.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    aconver = Integer.parseInt(text.getText().toString());
                    tot.setText((String.valueOf((aconver-32)*0.5))+"ºF");
                }
            });
        }
        catch (Exception ex){
            Toast toast1 = Toast.makeText(getApplicationContext(),"Error",Toast.LENGTH_SHORT);
            toast1.show();
        }
    }
}

