package com.example.puzzle_pics;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class Game extends Activity implements OnTouchListener {
	
	int xPos;
	int yPos;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game);
		// assign the onTouchListener method behavior below to the layout
		RelativeLayout layout = (RelativeLayout)findViewById(R.id.touchSensor);
		layout.setOnTouchListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_game, menu);
		return true;
	}

	public boolean onTouch(View v, MotionEvent me) {
		//Button testButton = (Button)findViewById(R.id.testButton);
		switch (v.getId()){
		case R.id.touchSensor:
			float xCordF = me.getX();
			float yCordF = me.getY();
			String xCord = String.valueOf(me.getX());
			String yCord = String.valueOf(me.getY());
			//RelativeLayout.LayoutParams parms=new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
			//parms.leftMargin=(int)xCordF - (int)(testButton.getWidth()/2);
			//parms.rightMargin=v.getWidth()/2-(int)xCordF-(int)(testButton.getWidth()/2);
			//parms.topMargin=(int)yCordF - (int)(testButton.getHeight()/2);
			//parms.bottomMargin=v.getHeight()-(int)yCordF -(int)(testButton.getHeight()/2);
			//testButton.setLayoutParams(parms);
			return true;
		}
		return false;
	}
	
}


