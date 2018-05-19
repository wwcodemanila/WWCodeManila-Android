package com.example.miyalisha.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        char randomLetter = (char)(new Random().nextInt(26) + 'A');

        HashMap<String,String> colorMap = new HashMap<>();
        colorMap.put("Red", "Spinning");
        colorMap.put("Yellow", "Expanding");
        colorMap.put("Orange", "Pulsating");
        colorMap.put("Blue", "Hypothetical");
        colorMap.put("Green", "Bursting");
        colorMap.put("Purple", "Flickering");

        HashMap<String,String> birthMonthMap = new HashMap<>();
        birthMonthMap.put("January", "Supermassive");
        birthMonthMap.put("February", "Dead");
        birthMonthMap.put("March", "Gaseous");
        birthMonthMap.put("April", "Rocky");
        birthMonthMap.put("May", "Invisible");
        birthMonthMap.put("June", "Ringed");
        birthMonthMap.put("July", "Radioactive");
        birthMonthMap.put("August", "Volcanic");
        birthMonthMap.put("September", "Hot");
        birthMonthMap.put("October", "Binary");
        birthMonthMap.put("November", "Rogue");
        birthMonthMap.put("December", "Icy");

        HashMap<String,String> letterMap = new HashMap<>();
        letterMap.put("A", "Black hole");
        letterMap.put("B", "Quasar");
        letterMap.put("C", "Asteroid");
        letterMap.put("D", "Meteor");
        letterMap.put("E", "White dwarf");
        letterMap.put("F", "Supernova");
        letterMap.put("G", "Blazar");
        letterMap.put("H", "Galaxy");
        letterMap.put("I", "Moon");
        letterMap.put("J", "Planet");
        letterMap.put("K", "Solar flare");
        letterMap.put("L", "Exoplanet");
        letterMap.put("M", "Wormhole");
        letterMap.put("N", "Comet");
        letterMap.put("O", "Brown dwarf");
        letterMap.put("P", "Star cluster");
        letterMap.put("Q", "Satellite");
        letterMap.put("R", "Nebula");
        letterMap.put("S", "Dwarf planet");
        letterMap.put("T", "Antimatter");
        letterMap.put("U", "Dark matter");
        letterMap.put("V", "Cosmic dust");
        letterMap.put("W", "Pulsar");
        letterMap.put("X", "Void");
        letterMap.put("Y", "Interstellar cloud");
        letterMap.put("Z", "Red giant");

        Random random = new Random();
        List<String> colorKeys = new ArrayList<String>(colorMap.keySet());
        String randomColorKey = colorKeys.get(random.nextInt(colorKeys.size()) );
        String colorValue = colorMap.get(randomColorKey);

        List<String> birthMonthKeys = new ArrayList<String>(birthMonthMap.keySet());
        String randomBirthMonthKey = birthMonthKeys.get(random.nextInt(birthMonthKeys.size()));
        String birthMonthValue = birthMonthMap.get(randomBirthMonthKey);

        Log.d("MainActivity", "Code Name: "
                + colorValue + " " + birthMonthValue + " " + letterMap.get(String.valueOf(randomLetter)));

    }
}
