package com.versatilemobitech.eaglemanpower;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class BookOnline extends Fragment {
	
	public BookOnline(){}
	
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.book_online, container, false);
        
        final EditText fullname=(EditText)rootView.findViewById(R.id.full_name);
        
        final EditText email=(EditText)rootView.findViewById(R.id.email);
        final EditText contact=(EditText)rootView.findViewById(R.id.phone);
        
        //final EditText helptopic=(EditText)rootView.findViewById(R.id.help_topic);
        
        final Spinner helptopic=(Spinner)rootView.findViewById(R.id.help_topic);
       
       
        
        Button submit=(Button)rootView.findViewById(R.id.submit_id);
        
        submit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {

				if(fullname.getText().toString().length()>0 && email.getText().toString().length()>0 && contact.getText().toString().length()>9&& helptopic.getSelectedItem().toString().length()>0)
				{
				sendEmail(fullname,email,contact,helptopic.getSelectedItem().toString());
				}
				else{
					if(fullname.getText().toString().length()<=0)
						fullname.setError("Invalid");
					
					if(email.getText().toString().length()<=0)
						email.setError("Invalid");
					
					
					if(contact.getText().toString().length()<9)
						contact.setError("Invalid");
					
					
					//if(helptopic.getSelectedItem().toString().length()<=0)
						//helptopic.setError("Invalid");
				}
			}
		});
         
        
         
        return rootView;
    }


	private void sendEmail(EditText fullname, EditText email, EditText contact,
			String helptopic) {
		 
		Intent gmail = new Intent(Intent.ACTION_VIEW);
        gmail.setClassName("com.google.android.gm","com.google.android.gm.ComposeActivityGmail");
        gmail.putExtra(Intent.EXTRA_EMAIL, new String[] { "eaglemanpower.mallikarjuna@gmail.com" });
       // gmail.setData(Uri.parse("jckdsilva@gmail.com"));
        gmail.putExtra(Intent.EXTRA_SUBJECT, "Eagle Manpower service");
        gmail.setType("plain/text");
        gmail.putExtra(Intent.EXTRA_TEXT, "Name :"+fullname.getText().toString()+". \n"+"Contact :"+contact.getText().toString()+". \n"+"Help topic :"+helptopic+".");
        startActivity(gmail);
		
	}
}
