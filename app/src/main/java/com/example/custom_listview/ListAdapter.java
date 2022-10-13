package com.example.custom_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.ArrayList;
public class ListAdapter extends ArrayAdapter<User> {
    public ListAdapter(Context context, ArrayList<User> userArrayList){
        super(context,R.layout.list_item,userArrayList);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        User user = getItem(position);
        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        ImageView imageView = convertView.findViewById(R.id.hero_pic);
        TextView userName = convertView.findViewById(R.id.heroName);
        TextView lastMsg = convertView.findViewById(R.id.realname);
        TextView type = convertView.findViewById(R.id.type);

        imageView.setImageResource(user.imageId);
        userName.setText(user.name);
        lastMsg.setText(user.realname);
        type.setText(user.type);
        return convertView;
    }
}
