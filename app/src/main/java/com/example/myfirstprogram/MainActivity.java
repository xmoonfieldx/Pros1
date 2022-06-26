package com.example.myfirstprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name;
    EditText contact;
    EditText email;
    TextView names;
    TextView contacts;
    TextView emails;
    Button ok;
    TextView one;
    TextView two;
    TextView three;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name);
        contact=findViewById(R.id.contact);
        email=findViewById(R.id.email);
        names=findViewById(R.id.p1);
        contacts=findViewById(R.id.p2);
        emails=findViewById(R.id.p3);
        one=findViewById(R.id.tv1);
        two=findViewById(R.id.tv2);
        three=findViewById(R.id.tv3);
        image=findViewById(R.id.imageView);
        ok=findViewById(R.id.mybutton);
        //toast=findViewById(R.id.button3);
        /*toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });*/
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setImageResource(R.drawable.welcome);
                String item1 = name.getText().toString();
                String item2 = contact.getText().toString();
                String item3 = email.getText().toString();
                name.setVisibility(View.INVISIBLE);
                names.setVisibility(View.INVISIBLE);
                contact.setVisibility(View.INVISIBLE);
                contacts.setVisibility(View.INVISIBLE);
                email.setVisibility(View.INVISIBLE);
                emails.setVisibility(View.INVISIBLE);
                one.setText(item1);

                two.setText(item2);
                three.setText(item3);
                Toast.makeText(getApplicationContext(),"Welcome back to my YouTube channel",Toast.LENGTH_LONG).show();
            }
        });

    }
}