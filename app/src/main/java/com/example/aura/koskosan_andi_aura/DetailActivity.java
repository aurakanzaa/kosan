package com.example.aura.koskosan_andi_aura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        KamarDetailFragment frag = (KamarDetailFragment) getSupportFragmentManager().findFragmentById(R.id.detail_frag);
//        frag.setResep(1);
        Bundle b = getIntent().getExtras();
        frag.setKos(b.getLong("id"));
    }
}
