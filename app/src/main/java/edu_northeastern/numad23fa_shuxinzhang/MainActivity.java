package edu_northeastern.numad23fa_shuxinzhang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "ShuxinZHANG, zhang.shuxi@northeastern.edu", Toast.LENGTH_LONG).show();

            }
        });
    }

    public void openAboutMe(){
        Intent intent = new Intent(this, AboutMe.class);
        startActivity(intent);
    }
}