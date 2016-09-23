package net.webersolutions.mychicagoteams;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Blackhawks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blackhawks);

        Button schbutton = (Button) findViewById(R.id.btnSched);
        Button rbutton = (Button) findViewById(R.id.btnRoster);
        Button scbutton = (Button) findViewById(R.id.btnScores);
        Button stbutton = (Button) findViewById(R.id.btnStandings);

        schbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.nhl.com/blackhawks/schedule/2016-09-01/CT")));


            }
        });

        rbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.nhl.com/blackhawks/roster")));


            }
        });

        scbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.nhl.com/scores")));


            }
        });

        stbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.nhl.com/standings")));


            }
        });
    }
}
