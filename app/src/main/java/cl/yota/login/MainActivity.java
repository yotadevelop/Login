package cl.yota.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void confirm(View view) {
        Intent intent = new Intent(this, API.class);
        startActivity(intent);
    }

    public void signUp(View view) {
        Intent intent = new Intent(this, Registration.class);
        startActivity(intent);
    }
}