package net.webersolutions.mychicagoteams;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // declare/init array of chicago team names to be used in list
        String[] teamName = {"Bears","Black Hawks","Bulls","Cubs 1","Cubs 2","Fire",
                 "Red Stars","Sky","White Sox","Wolves"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.teams, teamName));
    }

    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch(position){
            case 0: startActivity(new Intent(MainActivity.this, Bears.class));
                break;
            case 1: startActivity(new Intent(MainActivity.this, Blackhawks.class));
                break;
            case 2: startActivity(new Intent(MainActivity.this, Bulls.class));
                break;
            case 3: startActivity(new Intent(MainActivity.this, Cubs2.class));  //buttons
                break;
            case 4: startActivity(new Intent(MainActivity.this, Cubs.class));   // listview
                break;
            case 5: startActivity(new Intent(MainActivity.this, Fire.class));
                break;
            case 6: startActivity(new Intent(MainActivity.this, Redstars.class));
                break;
            case 7: startActivity(new Intent(MainActivity.this, Sky.class));
                break;
            case 8: startActivity(new Intent(MainActivity.this, Sox.class));
                break;
            case 9: startActivity(new Intent(MainActivity.this, Wolves.class));
                break;
        }
    }

}
