package com.example.ramne.ghumke;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String uname;
    String pswd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText username=(EditText)findViewById(R.id.username);
        final EditText password=(EditText)findViewById(R.id.password);


        final Button login=(Button)findViewById(R.id.login);

        login.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              uname=username.getText().toString();
              pswd=password.getText().toString();

                if(uname.equals("user123@example.com") && pswd.equals("User@1234"))
                {
                    Intent intent=new Intent(MainActivity.this,Cities.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(),"Successfully logged in",
                            Toast.LENGTH_LONG).show();
                }
                else
                    Toast.makeText(getApplicationContext(),"Incorrect username or password. Please try again!!!",
                            Toast.LENGTH_LONG).show();

            }
        });
    }
}
