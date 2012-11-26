package com.example.puzzle_pics;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

public class PreSetting extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pre_setting);
		findViewById(R.id.button3x3).setOnClickListener(this);
		findViewById(R.id.button4x4).setOnClickListener(this);
		findViewById(R.id.button5x5).setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_pre_setting, menu);
		return true;
	}

	public void onClick(View v) {
		Intent startIntent = new Intent(this, ImageChoose.class);
		switch(v.getId()){
		case R.id.button3x3:
			startIntent.putExtra("gameType", 3);
			this.startActivity(startIntent);
			break;
		case R.id.button4x4:
			startIntent.putExtra("gameType", 4);
			this.startActivity(startIntent);
			break;
		case R.id.button5x5:
			startIntent.putExtra("gameType", 5);
			this.startActivity(startIntent);
			break;
		}
		
	}

}
