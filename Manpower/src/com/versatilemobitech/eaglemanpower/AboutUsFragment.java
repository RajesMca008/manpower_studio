package com.versatilemobitech.eaglemanpower;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class AboutUsFragment extends Fragment {


public AboutUsFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.about_us, container, false);
        
        TextView textView=(TextView)rootView.findViewById(R.id.text1);
        TextView textView2=(TextView)rootView.findViewById(R.id.text2);
        TextView textView3=(TextView)rootView.findViewById(R.id.text3);
        TextView textView4=(TextView)rootView.findViewById(R.id.text4);
        
        
         String value = getString(R.string.para1);
        textView.setText(Html.fromHtml(value));
        textView.setMovementMethod(LinkMovementMethod.getInstance()); 
        
        
        String value2 = getString(R.string.para2);
        textView2.setText(Html.fromHtml(value2));
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        
        
        String value3 = getString(R.string.para3);
        textView3.setText(Html.fromHtml(value3));
        textView3.setMovementMethod(LinkMovementMethod.getInstance());
        
        
        String value4 = getString(R.string.para4);
        textView4.setText(Html.fromHtml(value4));
        textView4.setMovementMethod(LinkMovementMethod.getInstance());
        
         
        return rootView;
    }
}
