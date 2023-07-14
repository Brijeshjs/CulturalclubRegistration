package com.example.clubregister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class razzel extends AppCompatActivity {

    private DataBaseHelper DB;
    EditText name;
    EditText usn;
    EditText email;
    EditText phone;
    EditText branch;
    Button register;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chords);
        DB= new DataBaseHelper(this);
        name=(EditText) findViewById(R.id.name);
        usn=(EditText) findViewById(R.id.USN);
        phone=(EditText) findViewById(R.id.phone);
        branch=(EditText) findViewById(R.id.Branch);
        email=(EditText) findViewById(R.id.mail);
        register=(Button) findViewById(R.id.Register);
        img=(ImageView) findViewById(R.id.imageButton) ;
        Adddata();}

    public  void Adddata(){
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isinserted=  DB.insertRazzelData(name.getText().toString(),usn.getText().toString(), phone.getText().toString(),branch.getText().toString(),email.getText().toString());
                if(isinserted=true)
                {
                    Toast.makeText(razzel.this,"data inserted",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(razzel.this,"data not inserted",Toast.LENGTH_SHORT).show();
                }
            }
        });




    }


}