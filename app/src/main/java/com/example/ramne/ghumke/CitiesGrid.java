package com.example.ramne.ghumke;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.example.ramne.ghumke.description.Citydescription;

public class CitiesGrid extends AppCompatActivity {

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

        CustomGrid adapter = new CustomGrid(CitiesGrid.this,cities,imageId);
        grid=(GridView)findViewById(R.id.grid1);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(CitiesGrid.this, "You Clicked at " +cities[+ position], Toast.LENGTH_LONG).show();
                Intent intent=new Intent(CitiesGrid.this,Citydescription.class);
                if(position>=0 && position <=7)
                {
                    intent.putExtra("lucknow",position+1);
                    startActivity(intent);
                }

                if(position==8)
                {
                    Intent i=new Intent(CitiesGrid.this,AddPlace.class);
                    startActivity(i);
                }

            }
        });


    }

}