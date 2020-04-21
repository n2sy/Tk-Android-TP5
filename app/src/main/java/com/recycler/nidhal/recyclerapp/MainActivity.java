package com.recycler.nidhal.recyclerapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    private final LinkedList<String> mWordList = new LinkedList<>();
    //on aurait pu utiliser une autre structure de données comme  :
    //private final List<String> wordsList = new ArrayList<>();

    private RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // Ajouter des éléments au RecyclerView.
        for (int i = 0; i < 20; i++) {
            mWordList.addLast("Element " + i);
        }

        // Créer une variable de type reycylerView
        mRecyclerView = findViewById(R.id.recyclerview);

        // Créer l'Adapter et lui passer la liste dont il va afficher les éléments
        mAdapter = new WordListAdapter(this, mWordList);

        // Connecter l'Adapter à notre RecyclerView
        mRecyclerView.setAdapter(mAdapter);

        // Passer au RecyclerView le LayoutManager désiré
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));


    }

   
}

