package com.versatilemobitech.eaglemanpower;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.EditText;

public class BookOnline extends Fragment {
	
	public BookOnline(){}
	
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.book_online, container, false);
        
        EditText fullname=(EditText)rootView.findViewById(R.id.full_name);
        
        EditText email=(EditText)rootView.findViewById(R.id.email);
        EditText contact=(EditText)rootView.findViewById(R.id.phone);
        
        EditText helptopic=(EditText)rootView.findViewById(R.id.help_topic);
        
         
        sendEmail(fullname,email,contact,helptopic);
         
        return rootView;
    }


	private void sendEmail(EditText fullname, EditText email, EditText contact,
			EditText helptopic) {
		// TODO Auto-generated method stub
		
	}
}
