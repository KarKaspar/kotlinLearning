package com.example.append

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.append.ui.theme.AppendTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)
    }

    fun btn1OnClick(view: View) {
        Log.i("MAIN","Button 1 pressed")
        Log.v("MAIN","v")
        Log.d("MAIN","d")
        Log.w("MAIN","w")
        Log.e("MAIN","e")
        Log.wtf("MAIN","WHAT THE HELL NOW?")

        Toast.makeText(this,"Why did you press me! I didn't ask for that",Toast.LENGTH_SHORT).show()
    }
    fun btn2OnClick(view: View) {
        Log.d("Main","Button 2 pressed")
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }
}
