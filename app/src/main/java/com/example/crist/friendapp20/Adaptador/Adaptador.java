package com.example.crist.friendapp20.Adaptador;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.crist.friendapp20.R;
import com.example.crist.friendapp20.model.Friend;

import java.util.List;

/**
 * Created by crist on 06/02/2018.
 */

public class Adaptador extends ArrayAdapter<Friend> {
    private Context ctx;
    private List<Friend> amigos;

    public Adaptador(@NonNull Context context, List<Friend> objects) {
        super(context, R.layout.activity_seccion, objects);
        ctx = context;
        amigos = objects;
    }

    @NonNull
    @Override
    public View getView (int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        LayoutInflater inflater=LayoutInflater.from(ctx);
        View row=inflater.inflate(R.layout.activity_seccion,null);
        ImageView photo=row.findViewById(R.id.imageSeccion);
        TextView nom = row.findViewById(R.id.textNombre);
        Friend friend = amigos.get(position);
        photo.setImageResource(friend.getFoto());
        nom.setText(friend.getNombre());

        return row;
    }

}
