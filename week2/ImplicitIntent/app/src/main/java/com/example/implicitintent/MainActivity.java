package com.example.implicitintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editTextWebsite;
    private EditText editTextLocation;
    private EditText editShareText

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextWebsite = findViewById(R.id.txt_link);
        editTextLocation = findViewById(R.id.txt_location);
        editShareText = findViewById(R.id.txt_texts);
    }

    public void openWebsite(View view) {
        String url = editTextWebsite.getText().toString();
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

        if(intent.resolveActivity(getPackageManager())!=null){
            startActivity(intent);
        }
        else {
            Log.d("ImplicitIntent","Can't handle this");
        }
    }

    public void openLocation(View view) {
        String loc = editTextLocation.getText().toString();
        Uri address = Uri.parse("geo:0,0?q="+loc);

        Intent intent = new Intent(Intent.ACTION_VIEW, address);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't handle this intent!");
        }
    }

    public void shareText(View view) {
        String text = editShareText.getText().toString();
        String mimeType = "text/plain";

        ShareCompat.IntentBuilder
                .from(this)
                .setType(mimeType)
                .setChooserTitle("Share this text with: ")
                .setText(text)
                .startChooser();
    }
}
