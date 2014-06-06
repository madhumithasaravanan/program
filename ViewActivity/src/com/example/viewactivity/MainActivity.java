package com.example.viewactivity;


import java.io.File;

import android.app.Activity;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;

import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Build;
import android.provider.MediaStore;

public class MainActivity extends Activity {
public Button b1,b2,b3,b4;
//public EditText ed;
private MediaPlayer player;
private static final int CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE = 100;
public static final int MEDIA_TYPE_IMAGE = 1;
Uri imageUri=null;  

//public static ImageView showImg=null;


@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
//EditText ed=(EditText) findViewById(R.id.editText1);
       final Button b1=(Button) findViewById(R.id.button1);
       final Button b2=(Button) findViewById(R.id.button2);
       final Button b3=(Button) findViewById(R.id.button3);
       final Button b4=(Button) findViewById(R.id.button4);
       
       b1.setOnClickListener(new OnClickListener() {
    	   
       

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		//String filename="Camera_Example.jpg";
		//ContentValues values=new ContentValues();
		//values.put(MediaStore.Images.Media.TITLE,filename);
		//values.put(MediaStore.Images.Media.DESCRIPTION,"Image capture by camera");
		//imageUri=getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI,values);
		
		Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
		//intent.putExtra(MediaStore.EXTRA_OUTPUT, imageUri);
		
	   
		startActivity(intent);

	
	}});
    	   
       
       b4.setOnClickListener(new OnClickListener(){

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			
			Intent intent = new Intent(MainActivity.this,SecondActivity.class);
			//EditText editText=(EditText) findViewById(R.id.edit_message);
			//String message=editText.getText().toString();
			//intent.putExtra(Extra_MESSAGE.toString();
			
			startActivity(intent);

		}
		
			
		

       });
       b2.setOnClickListener(new OnClickListener(){


@Override
public void onClick(View v) {
	// TODO Auto-generated method stub
	 Intent intent = new Intent();
	 intent.setComponent(new ComponentName("com.android.contacts","com.android.contacts.DialtactsContactsEntryActivity"));
	 startActivity(intent);
	
}
    });
b3.setOnClickListener(new OnClickListener(){
	

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
});
}
   

@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

   

}
