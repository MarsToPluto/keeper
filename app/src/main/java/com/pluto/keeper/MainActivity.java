package com.pluto.keeper;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        // Save a token
        Utils.saveToken(this, "your_token_here");

        // Retrieve the token
        String token = Utils.getToken(this);
        System.out.println("Token: " + token);

        // Simulate saving and retrieving token multiple times
        Utils.saveToken(this, "another_token_here");
        String anotherToken = Utils.getToken(this);
        System.out.println("Another Token: " + anotherToken);
    }
}
