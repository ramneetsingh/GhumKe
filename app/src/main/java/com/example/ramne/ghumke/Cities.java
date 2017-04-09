package com.example.ramne.ghumke;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.example.ramne.ghumke.description.Citydescription;

public class Cities extends AppCompatActivity {

    GridView grid;
    String[] cities = {
            "Ahemdabad",
            "Bengaluru",
            "Chennai",
            "Delhi",
            "Hyderabad",
            "Kolkata",
            "Lucknow",
            "Mumbai",
            "Add Your Place"
    } ;
    int[] imageId = {
            R.drawable.ahmedabad,
            R.drawable.bangalore,
            R.drawable.chennai,
            R.drawable.delhi,
            R.drawable.hyderabad,
            R.drawable.kolkata,
            R.drawable.lucknow,
            R.drawable.mumbai,
            R.drawable.plus
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cities);

        CustomGrid adapter = new CustomGrid(Cities.this,cities,imageId);
        grid=(GridView)findViewById(R.id.grid1);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(Cities.this, "You Clicked at " +cities[+ position], Toast.LENGTH_LONG).show();
                Intent intent=new Intent(Cities.this,Citydescription.class);
                if(position==6)
                {
                    intent.putExtra("lucknow",7);
                    startActivity(intent);
                }
                if(position==0)
                {
                    intent.putExtra("lucknow",1);
                    startActivity(intent);
                }
                if(position==1)
                {
                    intent.putExtra("lucknow",2);
                    startActivity(intent);
                }
                if(position==2)
                {
                    intent.putExtra("lucknow",3);
                    startActivity(intent);
                }
                if(position==3)
                {
                    intent.putExtra("lucknow",4);
                    startActivity(intent);
                }
                if(position==4)
                {
                    intent.putExtra("lucknow",5);
                    startActivity(intent);
                }
                if(position==5)
                {
                    intent.putExtra("lucknow",6);
                    startActivity(intent);
                }
                if(position==7)
                {
                    intent.putExtra("lucknow",8);
                    startActivity(intent);
                }
                if(position==8)
                {
                    Intent i=new Intent(Cities.this,place.class);
                    startActivity(i);
                }

            }
        });


    }

}