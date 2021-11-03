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


        try {
            JSONObject json = new JSONObject();
            json.put("serviceId","yt");
            json.put("videoId", "J3k54wDsjP4");
            json.put("formatId","1");
            String result = JSONPost.postJSON("URL", json);
            System.out.println("SOUT " + result);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}