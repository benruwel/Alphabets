package com.moringa.alphabetgrid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class AlphabetAdapter extends BaseAdapter {

    private Context mContext;
    private String[] mLetters;

    public AlphabetAdapter(Context mContext, String[] mLetters) {
        this.mContext = mContext;
        this.mLetters = mLetters;
    }

    @Override
    public int getCount() {
        return mLetters.length;
    }

    @Override
    public Object getItem(int i) {
        return mLetters[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View gridView;
        View convertView = null;
        if (convertView == null) {
            // get layout from xml file
            gridView = inflater.inflate(R.layout.alphabet_grid_item, null);
            // pull views
            TextView letterView = (TextView) gridView
                    .findViewById(R.id.grid_item_letter);
            // set values into views
            letterView.setText(mLetters[i]);  // using dummy data for now

        } else {
            gridView = (View) convertView;
        }
        return gridView;
    }
}
