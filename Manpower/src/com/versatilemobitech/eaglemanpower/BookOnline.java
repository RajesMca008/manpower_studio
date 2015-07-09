package com.versatilemobitech.eaglemanpower;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BookOnline extends Fragment {
	
	public BookOnline(){}
	
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.book_online, container, false);
         
        return rootView;
    }
}
