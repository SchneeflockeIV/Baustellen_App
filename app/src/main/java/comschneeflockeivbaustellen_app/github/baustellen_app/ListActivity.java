package comschneeflockeivbaustellen_app.github.baustellen_app;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {

    ListView listView;
    DbManager db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_in_window);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        listView = (ListView) findViewById(R.id.LIST_LISTVIEW);

        db = new DbManager(this);
        Context ctx = this;
        int itemLayout = R.layout.simple_list_image_item_2;
     //   Cursor cursor = db.selectAllePersonen();

      //  String[] from = new String[] {db.SPALTE_PERSONEN_BILD, db.SPALTE_PERSONEN_NAME, db.SPALTE_PERSONEN_ADRESSE};
        int[] to = new int[] {R.id.LIST_IMAGE, R.id.LIST_TITLE, R.id.LIST_SUBTITLE};
    //    ListAdapter la = new ListAdapter(ctx, itemLayout, cursor, from, to, 0);
    //    listView.setAdapter(la);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
