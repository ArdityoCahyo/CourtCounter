package com.android.ardityodev.courtcounter;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int awala = 0;
    int awalb = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void first(View View) {
        setContentView(R.layout.activity_main);
    }

    public void second(View View) {
        setContentView(R.layout.second_activity);
    }

    public void plus3a(View view) {
        TextView jumlaha = (TextView) findViewById(R.id.jumlaha);
        awala += 3;
        jumlaha.setText(""+awala);
    }

    public void plus2a(View view) {
        TextView jumlaha = (TextView) findViewById(R.id.jumlaha);
        awala += 2;
        jumlaha.setText(""+awala);
    }

    public void plus1a(View view) {
        TextView jumlaha = (TextView) findViewById(R.id.jumlaha);
        awala += 1;
        jumlaha.setText(""+awala);
    }

    public void reseta(View view) {
        TextView jumlaha = (TextView) findViewById(R.id.jumlaha);
        jumlaha.setText("" + (0 * awalb));
    }

    public void plus3b(View view) {
        TextView jumlahb = (TextView) findViewById(R.id.jumlahb);
        awalb += 3;
        jumlahb.setText(""+awalb);
    }

    public void plus2b(View view) {
        TextView jumlahb = (TextView) findViewById(R.id.jumlahb);
        awalb += 2;
        jumlahb.setText(""+awalb);
    }

    public void plus1b(View view) {
        TextView jumlahb = (TextView) findViewById(R.id.jumlahb);
        awalb += 1;
        jumlahb.setText(""+awalb);
    }

    public void reset(View view) {
        TextView jumlaha = (TextView) findViewById(R.id.jumlaha);
        TextView jumlahb = (TextView) findViewById(R.id.jumlahb);
        awala = 0;
        awalb = 0;
        jumlaha.setText(awala+"");
        jumlahb.setText(awalb+"");
        Toast.makeText(this, "Data ter-Reset!", Toast.LENGTH_SHORT).show();

    }
}
