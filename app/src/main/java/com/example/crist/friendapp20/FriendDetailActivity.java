package com.example.crist.friendapp20;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.crist.friendapp20.model.Friend;

public class FriendDetailActivity extends AppCompatActivity {   //implements RatingBar.OnRatingBarChangeListener
    RatingBar rate;
    ImageView foto;
    TextView miTexto;
    TextView miDesc;
    Button botonVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend_detail);

        Intent i = getIntent();
        int amiKey=i.getIntExtra(MainActivity.FRIEND_KEY,0);
        Friend ami=Friend.arrayAmigos.get(amiKey);

        rate = (RatingBar) findViewById(R.id.rate);
        foto = (ImageView) findViewById(R.id.idFoto);
        miTexto = (TextView) findViewById(R.id.idTexto);
        miDesc = (TextView) findViewById(R.id.idDescripcion);
        botonVolver = (Button) findViewById(R.id.botonVolver);

        foto.setImageResource(ami.getFoto());
        miTexto.setText(ami.getNombre());
        miDesc.setText(ami.getDescripcion());

        rate.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                Toast.makeText(getApplicationContext(), "Has puntuado "+(rating*2),Toast.LENGTH_LONG).show();
            }
        });

        botonVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FriendDetailActivity.this, MainActivity.class);
                startActivity(i);
            }
        });

    }
/*
    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        rate.setText(rating);
    }*/
}
