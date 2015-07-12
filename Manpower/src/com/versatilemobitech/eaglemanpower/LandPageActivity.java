package com.versatilemobitech.eaglemanpower;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class LandPageActivity extends Activity implements OnClickListener{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home_screen);
		findViewById(R.id.about_id).setOnClickListener(this);

		findViewById(R.id.contact_id).setOnClickListener(this);

		findViewById(R.id.book_id).setOnClickListener(this);

		findViewById(R.id.offer_id).setOnClickListener(this);
		findViewById(R.id.amc_id).setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {

Intent intent=new Intent(LandPageActivity.this,MainActivity.class);
		switch (v.getId()) {
		case R.id.about_id:
			intent.putExtra("TAB", 8);
			
			break;

		case R.id.contact_id:
			intent.putExtra("TAB", 7);
			break;
		case R.id.book_id:
			intent.putExtra("TAB", 5);
			break;
		case R.id.offer_id:
			intent.putExtra("TAB", 4);
			break;
		case R.id.amc_id:
			intent.putExtra("TAB", 1);
			break;

		default:
			break;
		}

		startActivity(intent);
	}

}
