package com.example.android.miwokappfragmets;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.List;

public class WordAdapter  extends ArrayAdapter<Word> {
    private int mColorResourceId;

    public WordAdapter(Activity context, List<Word> words, int ColorResourceId) {
        super(context, 0, words);
        mColorResourceId=ColorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView=convertView;
        if(listItemView==null){
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }


        Word currentWord = getItem(position);
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getmMiwokTranslation());

        TextView deafultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        deafultTextView.setText(currentWord.getmDefaultTranslation());

        ImageView ImageResourceId= (ImageView) listItemView.findViewById(R.id.image);
        if(currentWord.hasImage()) {
            ImageResourceId.setImageResource(currentWord.getmImageResourceId());
            ImageResourceId.setVisibility(View.VISIBLE);
        }
        else{
            ImageResourceId.setVisibility(View.GONE);
        }


        View TextContainer=listItemView.findViewById(R.id.text_conatiner);
        int color= ContextCompat.getColor(getContext(),mColorResourceId);
        TextContainer.setBackgroundColor(color);
        return listItemView;


    }
}


