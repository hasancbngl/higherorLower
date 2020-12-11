package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
         int number;
   public void makeToast(String string){
       Toast.makeText(MainActivity.this,  string , Toast.LENGTH_SHORT).show();
   }

   public void guess(View view) {
       EditText numberGuessed = (EditText) findViewById(R.id.numberGuessed);


       int numberGuessedint = Integer.parseInt(numberGuessed.getText().toString()); //convert string to int


       if(numberGuessedint == number) {
          makeToast("That's right. \n Play again!!");
           Random random= new Random();
           number=random.nextInt(25) + 1;
       }

       else if(numberGuessedint > number) {
           makeToast("Lower");
       }
       else {  makeToast("Higher"); }


   }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Random random= new Random();
        number=random.nextInt(25) + 1; //it generates number 1-25.



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
