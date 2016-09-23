package net.webersolutions.mychicagoteams;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class Cubs extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_cubs);

        String[] listOptions = {"Schedule", "Roster", "Scores", "Standings"};
        setListAdapter(new ArrayAdapter<>(this,R.layout.activity_cubs, R.id.options, listOptions));
    }

    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch(position) {
            case 0: startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://chicago.cubs.mlb.com/schedule/index.jsp?c_id=chc#y=2016&calendar=DEFAULT&m=9")));
                break;
            case 1: startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.cubs.mlb.com/chc/roster/")));
                break;
            case 2: startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.mlb.com/scoreboard")));
                break;
            case 3: startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://mlb.mlb.com/mlb/standings/index.jsp")));
                break;
        }

    }
}
