package com.example.ramne.ghumke.description;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ramne.ghumke.R;

public class Citydescription extends AppCompatActivity {

    int code;
    int []image={R.drawable.lkoimg1,R.drawable.ahm1,R.drawable.bang1,R.drawable.chen1,
            R.drawable.del1,R.drawable.hyd1,R.drawable.kol1,R.drawable.mum1};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_citydescription);

        TextView title=(TextView)findViewById(R.id.city);
        TextView language=(TextView)findViewById(R.id.language);
        TextView text=(TextView)findViewById(R.id.text);
        ImageView cityimage =(ImageView) findViewById(R.id.cityimg);


        Button gallery=(Button)findViewById(R.id.gallery);
        Button fplaces=(Button)findViewById(R.id.famousplaces);

        Intent mIntent = getIntent();
        code = mIntent.getIntExtra("lucknow", 0);


        if(code==7)
        {
            title.setText("Lucknow");
            language.setText("لکھنؤ");
            text.setText(R.string.lucknow);
            cityimage.setImageResource(image[0]);
        }
        if(code==1)
        {
            title.setText("Ahemdabad");
            language.setText("અમદાવાદ");
            text.setText(R.string.ahe);
            cityimage.setImageResource(image[1]);
        }
        if(code==2)
        {
            title.setText("Bangaluru");
            language.setText("ಬೆಂಗಳೂರು");
            text.setText(R.string.ban);
            cityimage.setImageResource(image[2]);
        }
        if(code==3)
        {
            title.setText("Chennai");
            language.setText("சென்னை");
            text.setText(R.string.che);
            cityimage.setImageResource(image[3]);
        }
        if(code==4)
        {
            title.setText("Delhi");
            language.setText("दिल्ली");
            text.setText(R.string.del);
            cityimage.setImageResource(image[4]);
        }
        if(code==5)
        {
            title.setText("Hyderabad");
            language.setText("హైదరాబాద్");
            text.setText(R.string.hyd);
            cityimage.setImageResource(image[5]);
        }
        if(code==6)
        {
            title.setText("Kolkata");
            language.setText("কলকাতা");
            text.setText(R.string.kol);
            cityimage.setImageResource(image[6]);
        }
        if(code==8)
        {
            title.setText("Mumbai");
            language.setText("मुंबई");
            text.setText(R.string.mum);
            cityimage.setImageResource(image[7]);
        }


        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Citydescription.this,Cityimg.class);
               if(code==7)
               {
                   intent.putExtra("lucknow",7);
                   startActivity(intent);
               } if(code==1)
                {
                    intent.putExtra("lucknow",1);
                    startActivity(intent);
                }
                if(code==2)
                {
                    intent.putExtra("lucknow",2);
                    startActivity(intent);
                }
                if(code==3)
                {
                    intent.putExtra("lucknow",3);
                    startActivity(intent);
                }
                if(code==4)
                {
                    intent.putExtra("lucknow",4);
                    startActivity(intent);
                }
                if(code==5)
                {
                    intent.putExtra("lucknow",5);
                    startActivity(intent);
                }
                if(code==6)
                {
                    intent.putExtra("lucknow",6);
                    startActivity(intent);
                }
                if(code==8)
                {
                    intent.putExtra("lucknow",8);
                    startActivity(intent);
                }

            }
        });

        fplaces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Citydescription.this,Cityplaces.class);
                if(code==7)
                {
                    intent.putExtra("lucknow",7);
                    startActivity(intent);
                } if(code==1)
                {
                    intent.putExtra("lucknow",1);
                    startActivity(intent);
                }
                if(code==2)
                {
                    intent.putExtra("lucknow",2);
                    startActivity(intent);
                }
                if(code==3)
                {
                    intent.putExtra("lucknow",3);
                    startActivity(intent);
                }
                if(code==4)
                {
                    intent.putExtra("lucknow",4);
                    startActivity(intent);
                }
                if(code==5)
                {
                    intent.putExtra("lucknow",5);
                    startActivity(intent);
                }
                if(code==6)
                {
                    intent.putExtra("lucknow",6);
                    startActivity(intent);
                }
                if(code==8)
                {
                    intent.putExtra("lucknow",8);
                    startActivity(intent);
                }
            }
        });
    }
}
