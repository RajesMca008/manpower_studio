package com.versatilemobitech.eaglemanpower;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Contactus extends Fragment {

public Contactus(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.contact_us, container, false);
        
        TextView textView=(TextView)rootView.findViewById(R.id.context_text);
        
        
        String value = getString(R.string.address);
        textView.setText(Html.fromHtml(value));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        
         
        return rootView;
    }
}
