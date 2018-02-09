package com.example.crist.friendapp20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.crist.friendapp20.Adaptador.Adaptador;
import com.example.crist.friendapp20.model.Friend;

public class MainActivity extends AppCompatActivity {
    public static final String FRIEND_KEY="clave";
    //Friend amigo = new Friend();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView miGridV = (GridView) findViewById(R.id.myGridView);
        Adaptador miAdap = new Adaptador(this, Friend.arrayAmigos);
        miGridV.setAdapter(miAdap);

        miGridV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(MainActivity.this, FriendDetailActivity.class);
                i.putExtra(FRIEND_KEY, position);
                startActivity(i);
            }
        });

    }
}
