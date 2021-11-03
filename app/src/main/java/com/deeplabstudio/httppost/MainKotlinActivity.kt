package com.deeplabstudio.httppost

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.deeplabstudio.jsonpost.JSONPost
import org.json.JSONException
import org.json.JSONObject

class MainKotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_kotlin)

        val result = JSONPost.postJSON(
            "URL",
            "{\"name\":\"Uğur\",\"surname\":\"Altınsoy\",\"data\":{\"title\":\"http post\",\"author\":\"Uğur ALtınsoy\"}}"
        )

    }
}