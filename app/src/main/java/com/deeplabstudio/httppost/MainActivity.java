package com.deeplabstudio.httppost;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.deeplabstudio.jsonpost.JSONPost;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String result = JSONPost.postJSON("URL", "{\"name\":\"Uğur\",\"surname\":\"Altınsoy\",\"data\":{\"title\":\"http post\",\"author\":\"Uğur ALtınsoy\"}}");
    }
}