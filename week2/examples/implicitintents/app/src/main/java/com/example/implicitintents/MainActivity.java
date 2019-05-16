package com.example.implicitintents;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText mWebsiteEditText;
    private EditText mLocationEditText;
    private EditText mShareEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWebsiteEditText = findViewById(R.id.editTextUri);
        mLocationEditText = findViewById(R.id.editTextLocation);
        mShareEditText = findViewById(R.id.EditTextShare);
    }

    public void openUri(View view) {
        //Get the URL text
        String url = mWebsiteEditText.getText().toString();

        //Parse the URI and create the intent.
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW,webpage);

        //Find an activity that can handle the intent and start that activity.
        if(intent.resolveActivity(getPackageManager()) != null){
            startActivity(intent);
        }
        else{
            Log.d("ImplicitIntents","Can't handle this!");
        }

    }

    public void btnLocation(View view) {
        //Get the string indicating a location.
        String Loc = mLocationEditText.getText().toString();

        //Parse the location and create the intent
        Uri addressUri = Uri.parse("geo:0,0?q=" +Loc);
        Intent intent = new Intent(Intent.ACTION_VIEW,addressUri);

        //Find an acitivity to handle the intent and start that acitivity
        if(intent.resolveActivity(getPackageManager()) != null){
            startActivity(intent);
        }
        else{
            Log.d("ImplicitIntents","Can't handle this intent!");
        }

    }

    public void btnShare(View view) {
        //get the string value of share text
        String sText = mShareEditText.getText().toString();
        String mimeType = "text/plain";
        ShareCompat.IntentBuilder
                .from(this)
                .setType(mimeType)
                .setChooserTitle("Share this text with:")
                .setText(sText)
                .startChooser();
    }

    public void btnCamera(View view) {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if(takePictureIntent.resolveActivity(getPackageManager()) != null){
            startActivity(takePictureIntent);
        }
    }
}
