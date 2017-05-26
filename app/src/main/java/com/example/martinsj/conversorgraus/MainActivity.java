package com.example.martinsj.conversorgraus;

import android.icu.text.DecimalFormat;
import android.icu.text.NumberFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double recebeTemperatura= 0.0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView kelvin = (TextView) findViewById(R.id.kelvin);
        final TextView fah = (TextView) findViewById(R.id.fah);
        final TextView celsius = (TextView) findViewById(R.id.celsius);
        final SeekBar bar = (SeekBar) findViewById(R.id.seekBar);
        bar.setMax(100);


        bar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
               recebeTemperatura= (double) (progress/1);

                double valorKelvin = recebeTemperatura + 273;
                kelvin.setText(valorKelvin+" K");


                double valorFah = (1.8 * recebeTemperatura) + 32;
                fah.setText(String.format(valorFah+"ºF") );

                celsius.setText(recebeTemperatura+"ºC");

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
   }


}
