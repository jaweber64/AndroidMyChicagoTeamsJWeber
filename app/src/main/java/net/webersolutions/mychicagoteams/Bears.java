package net.webersolutions.mychicagoteams;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bears extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bears);

        Button schbutton = (Button) findViewById(R.id.btnSched);
        Button rbutton = (Button) findViewById(R.id.btnRoster);
        Button scbutton = (Button) findViewById(R.id.btnScores);
        Button stbutton = (Button) findViewById(R.id.btnStandings);

        schbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.chicagobears.com/gameday/schedule.html")));


            }
        });

        rbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.chicagobears.com/team/roster.html")));


            }
        });

        scbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nfl.com/scores")));


            }
        });

        stbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nfl.com/standings")));


            }
        });

    }
}
