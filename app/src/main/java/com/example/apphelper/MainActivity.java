package com.example.apphelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickFacebook(View v){
        Uri webpage = Uri.parse("https://www.facebook.com");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void clickMessenger(View v){
        Uri webpage = Uri.parse("https://www.messenger.com");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void clickMap(View v){
        Uri webpage = Uri.parse("https://www.google.com/maps");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void clickChrome(View v){
        Uri webpage = Uri.parse("https://www.google.com");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void clickAudible(View v){
        Uri webpage = Uri.parse("https://www.audible.com");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void clickSpotify(View v){
        Uri webpage = Uri.parse("https://www.spotify.com");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void clickWeather(View v){
        Uri webpage = Uri.parse("https://www.accuweather.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void clickWords(View v){
        Uri webpage = Uri.parse("https://play.google.com/store/apps/details?id=com.zynga.words3");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void clickMessages(View v){
        Uri webpage = Uri.parse("https://messages.google.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void clickCalendar(View v){
        Uri webpage = Uri.parse("https://calendar.google.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }
}