package com.example.vaibhav.e_commerce_cart2;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class E_commerce_cart2Activity extends AppCompatActivity {
    Typeface fonts1,fonts2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e_commerce_cart2);

        fonts1 =  Typeface.createFromAsset(E_commerce_cart2Activity.this.getAssets(),
                "fonts/OpenSans-Regular.ttf");

        fonts2 =  Typeface.createFromAsset(E_commerce_cart2Activity.this.getAssets(),
                "fonts/OpenSans-Semibold.ttf");

        TextView t =(TextView)findViewById(R.id.name1);
        t.setTypeface(fonts2);
        TextView t1 =(TextView)findViewById(R.id.order1);
        t1.setTypeface(fonts1);
        TextView t2 =(TextView)findViewById(R.id.name2);
        t2.setTypeface(fonts1);
        TextView t3=(TextView)findViewById(R.id.name3);
        t3.setTypeface(fonts1);
        TextView t4 =(TextView)findViewById(R.id.name4);
        t4.setTypeface(fonts1);
        TextView t5 =(TextView)findViewById(R.id.card1);
        t5.setTypeface(fonts2);
        TextView t6 =(TextView)findViewById(R.id.card2);
        t6.setTypeface(fonts1);
        TextView t7 =(TextView)findViewById(R.id.card3);
        t7.setTypeface(fonts1);
        TextView t8 =(TextView)findViewById(R.id.ccv1);
        t8.setTypeface(fonts2);
        TextView t9 =(TextView)findViewById(R.id.cvv2);
        t9.setTypeface(fonts1);
        TextView t10 =(TextView)findViewById(R.id.ccv3);
        t10.setTypeface(fonts1);
        TextView t11 =(TextView)findViewById(R.id.date1);
        t11.setTypeface(fonts2);
        TextView t12 =(TextView)findViewById(R.id.calendarTxt);
        t12.setTypeface(fonts1);
        TextView t13 =(TextView)findViewById(R.id.addL1);
        t13.setTypeface(fonts2);
        TextView t14 =(TextView)findViewById(R.id.addL2);
        t14.setTypeface(fonts1);
        TextView t15 =(TextView)findViewById(R.id.addL3);
        t15.setTypeface(fonts2);
        TextView t16 =(TextView)findViewById(R.id.addL4);
        t16.setTypeface(fonts1);
        TextView t17 =(TextView)findViewById(R.id.city1);
        t17.setTypeface(fonts2);
        TextView t18 =(TextView)findViewById(R.id.city2);
        t18.setTypeface(fonts1);
        TextView t19 =(TextView)findViewById(R.id.state1);
        t19.setTypeface(fonts2);
        TextView t20 =(TextView)findViewById(R.id.state2);
        t20.setTypeface(fonts1);
        TextView t21 =(TextView)findViewById(R.id.zip1);
        t21.setTypeface(fonts2);
        TextView t22 =(TextView)findViewById(R.id.zip2);
        t22.setTypeface(fonts1);
        TextView t23 =(TextView)findViewById(R.id.cou1);
        t23.setTypeface(fonts2);
        TextView t24 =(TextView)findViewById(R.id.cou2);
        t24.setTypeface(fonts1);
        TextView t25 =(TextView)findViewById(R.id.comment1);
        t25.setTypeface(fonts2);
        TextView t26 =(TextView)findViewById(R.id.comment2);
        t26.setTypeface(fonts1);
        TextView t27 =(TextView)findViewById(R.id.pay);
        t27.setTypeface(fonts1);
        TextView t28 =(TextView)findViewById(R.id.pay1);
        t28.setTypeface(fonts1);
    }
}