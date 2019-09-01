package com.example.coc.labapp;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView image;
    EditText h;
    EditText w;
    TextView ww;
    TextView hh;
    Button cal;
    TextView result;
    EditText namej;
    EditText idd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Resources resources = this.getResources ( );

        int resourceID = resources.getIdentifier ( "sunset", "drawable", "com.example.coc.labapp" );


        ImageView image = (ImageView) this.findViewById ( R.id.image );

        image.setImageResource ( resourceID );





         h = findViewById(R.id.h);
         w = findViewById(R.id.w);
         result = findViewById(R.id.result);
         cal = findViewById(R.id.cal);

         cal.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 float weight = Float.parseFloat(w.getText().toString());
                 float height = Float.parseFloat(h.getText().toString());
                 float ans = (float) (weight / Math.pow(height/100.0,2.0));

                 result.setText(ans+"");
             }
         });







       


    }
}
