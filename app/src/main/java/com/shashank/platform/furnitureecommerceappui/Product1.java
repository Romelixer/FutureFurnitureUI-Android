package com.shashank.platform.furnitureecommerceappui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;

public class Product1 extends Activity {
     CardView cardView1;
     Button button1;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_1);
        cardView1 = findViewById(R.id.Watalappan_Card_View);
        button1 = findViewById(R.id.buynowbtn1);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i  = new Intent(Product1.this,Recipe1.class);
                startActivity(i);
            }
        });
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://buyuniversal.lk/"));
                startActivity(intent);
            }
        });
    }


}
