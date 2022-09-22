package mx.edu.tesoem.p37s2120222dse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 EditText txtnum1, txtnum2;
 Button btncalcula, btnres, btnmulti, btndiv;
 TextView lblresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnum1 = findViewById(R.id.txtnum1);
        txtnum2 = findViewById(R.id.txtnum2);

        lblresult = findViewById(R.id.lblresult);

        btncalcula = findViewById(R.id.btncalcula);
        btnres = findViewById(R.id.btnres);
        btnmulti = findViewById(R.id.btnmulti);
        btndiv =  findViewById(R.id.btndiv);

        btncalcula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 =Integer.parseInt(txtnum1.getText().toString());
                int num2 =Integer.parseInt(txtnum2.getText().toString());

                lblresult.setText("Resultado Suma: "+String.valueOf(num1+num2));
            }
        });

        btnres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 =Integer.parseInt(txtnum1.getText().toString());
                int num2 =Integer.parseInt(txtnum2.getText().toString());

                lblresult.setText("Resultado Resta: "+String.valueOf(num1-num2));
            }
        });

        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 =Integer.parseInt(txtnum1.getText().toString());
                int num2 =Integer.parseInt(txtnum2.getText().toString());

                lblresult.setText("Resultado Multiplicacion: "+String.valueOf(num1*num2));
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 =Integer.parseInt(txtnum1.getText().toString());
                int num2 =Integer.parseInt(txtnum2.getText().toString());

                lblresult.setText("Resultado Division: "+String.valueOf(num1/num2));
            }
        });
    }
}