package com.example.aula1305;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int num = 0;
    int tot = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mais1(View view) {
        TextView numcafepre = findViewById(R.id.numcafepre);
        TextView total = findViewById(R.id.total);
        if(num >= 0) {
            num++;
            numcafepre.setText("" + num);
            tot += 5;
            total.setText("Preço total: R$" + tot);
        }else {
            numcafepre.setText("0");
            total.setText("Preço total: R$0,00");

        }
    }

    public void menos1(View view) {
        TextView numcafepre = findViewById(R.id.numcafepre);
        TextView total = findViewById(R.id.total);
        if(num != 0) {
            num--;
            numcafepre.setText("" + num);
            tot -= 5;
            total.setText("Preço total: R$"+ tot);

        }else {
            numcafepre.setText("0");
            total.setText("Preço total: R$0,00");
        }
    }

    public void mais2(View view) {
        TextView numcafelei = findViewById(R.id.numcafelei);
        TextView total = findViewById(R.id.total);
        if(num >= 0) {
            num++;
            numcafelei.setText("" + num);
            tot += 8;
            total.setText("Preço total: R$" + tot);
        }else {
            numcafelei.setText("0");
            total.setText("Preço total: R$0,00");

        }
    }

    public void menos2(View view) {
        TextView numcafelei = findViewById(R.id.numcafelei);
        TextView total = findViewById(R.id.total);
        if(num != 0) {
            num--;
            numcafelei.setText("" + num);
            tot -= 8;
            total.setText("Preço total: R$"+ tot);

        }else {
            numcafelei.setText("0");
            total.setText("Preço total: R$0,00");
        }
    }

    public void mais3(View view) {
        TextView numcafeexp = findViewById(R.id.numcafeexp);
        TextView total = findViewById(R.id.total);
        if(num >= 0) {
            num++;
            numcafeexp.setText("" + num);
            tot += 8;
            total.setText("Preço total: R$" + tot);
        }else {
            numcafeexp.setText("0");
            total.setText("Preço total: R$0,00");

        }
    }

    public void menos3(View view) {
        TextView numcafeexp = findViewById(R.id.numcafeexp);
        TextView total = findViewById(R.id.total);
        if(num != 0) {
            num--;
            numcafeexp.setText("" + num);
            tot -= 8;
            total.setText("Preço total: R$"+ tot);

        }else {
            numcafeexp.setText("0");
            total.setText("Preço total: R$0,00");
        }
    }

    public void mais4(View view) {
        TextView numcafecap = findViewById(R.id.numcafecap);
        TextView total = findViewById(R.id.total);
        if(num >= 0) {
            num++;
            numcafecap.setText("" + num);
            tot += 15;
            total.setText("Preço total: R$" + tot);
        }else {
            numcafecap.setText("0");
            total.setText("Preço total: R$0,00");

        }
    }

    public void menos4(View view) {
        TextView numcafecap = findViewById(R.id.numcafecap);
        TextView total = findViewById(R.id.total);
        if(num != 0) {
            num--;
            numcafecap.setText("" + num);
            tot -= 15;
            total.setText("Preço total: R$"+ tot);

        }else {
            numcafecap.setText("0");
            total.setText("Preço total: R$0,00");
        }
    }
}
