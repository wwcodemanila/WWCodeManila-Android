package com.example.miyalisha.simplerandomgallery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int currentSelection = 0;
    private ImageView imageView;
    private TextView textView;
    private List<Tree> treeList;
    private int resID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_linear);

        treeList = getTreeDataList();

        imageView = (ImageView) findViewById(R.id.treeImageView);
        textView = (TextView) findViewById(R.id.aboutTextView);

        resID = getResourceID(treeList.get(0));
        textView.setText(treeList.get(0).getDescription());
        imageView.setImageResource(resID);
    }

    public void nextRandomPhoto(View view) {
        Log.i("Info", "The button was clicked!");

        int random = currentSelection;
        while (random == currentSelection) {
            random = new Random().nextInt(treeList.size());
        }
        currentSelection = random;
        Tree tree = treeList.get(random);

        resID = getResourceID(tree);
        imageView.setImageResource(resID);
        textView.setText(tree.getDescription());
        Toast.makeText(this, tree.getName(), Toast.LENGTH_SHORT).show();

    }

    private List<Tree> getTreeDataList() {
        List<Tree> treeList = new ArrayList<>();

        Tree agohoPalawan = new Tree();
        agohoPalawan.setName("Agoho-Palawan");
        agohoPalawan.setEcoClass("Endemic");
        agohoPalawan.setDescription("Agoho-Palawan grows to 5m tall and sends spreading branches from its straight trunk.");
        agohoPalawan.setImageName("agohopalawan");

        Tree balok = new Tree();
        balok.setName("Ahern's Balok");
        balok.setEcoClass("Endemic");
        balok.setDescription("The Ahern's balok, considered a wild tree, is rarely used as an ornamental tree, although " +
                "its cascading clusters of purple flowers, non unlike little ripe grapes, are a sight to behold.");
        balok.setImageName("balok");

        Tree akle = new Tree();
        akle.setName("Akle");
        akle.setEcoClass("Indigenous");
        akle.setDescription("Akle wood is dubbed as the most beautiful of Philippine woods due to its color, " +
                "good grain quality and durability.");
        akle.setImageName("akle");

        treeList.add(agohoPalawan);
        treeList.add(akle);
        treeList.add(balok);
        return treeList;
    }

    private int getResourceID(Tree tree) {
        int resourceID = this.getResources().getIdentifier(tree.getImageName(), "drawable", this.getPackageName());
        return resourceID;
    }
}
