package com.faustocheca.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


class Animal {
    public void move() {
        Log.d(">> super method: ", "Animals can move" );
    }
}


class Dog extends Animal {
    @Override
    public void move() {
        super.move();
        Log.d(">> override method: ", "Dogs can move while jumping and barking");
    }


}





public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Dog myDog = new Dog();
        myDog.move();









    }
}
