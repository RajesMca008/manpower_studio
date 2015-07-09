package com.versatilemobitech.eaglemanpower.ui;

import android.content.Context;
import android.text.Html;
import android.util.AttributeSet;
import android.widget.TextView;

public class HTMLTextView extends TextView {

	public HTMLTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		init();
	}
	
	public HTMLTextView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		init();
	}

	private void init(){
	       setText(Html.fromHtml(getText().toString()));
	    } 
}
