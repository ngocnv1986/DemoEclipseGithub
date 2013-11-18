package com.example.androidantbuild2;

import org.apache.log4j.Logger;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;

public class MainActivity extends FragmentActivity {
	private static Logger log = Logger.getLogger(MainActivity.class);

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		log.info("Total2 = alsaklskladklasklda");
		
		FragmentTransaction t = this.getSupportFragmentManager().beginTransaction();
		t.replace(R.id.content, new MyFragment());
		t.commit();

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
