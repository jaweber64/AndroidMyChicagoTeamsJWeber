package net.webersolutions.mychicagoteams;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Redstars extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redstars);

        Button schbutton = (Button) findViewById(R.id.btnSched);
        Button rbutton = (Button) findViewById(R.id.btnRoster);
        Button scbutton = (Button) findViewById(R.id.btnScores);
        Button stbutton = (Button) findViewById(R.id.btnStandings);

        schbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://chicagoredstars.com/schedule/")));


            }
        });

        rbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://chicagoredstars.com/roster/")));


            }
        });

        scbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nwslsoccer.com/schedule")));


            }
        });

        stbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.nwslsoccer.com/standings-1")));


            }
        });
    }
}
