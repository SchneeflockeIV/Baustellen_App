package comschneeflockeivbaustellen_app.github.baustellen_app;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class ListAdapter extends CursorAdapter{

    LayoutInflater inflater;
    int itemLayout;
    String[] from;
    int[] to;

    //Konstruktor füllt Values der Liste
    public ListAdapter(Context ctx, int itemLayout, Cursor c, String[] from, int[] to, int flags){
        super(ctx, c, flags);
        inflater = LayoutInflater.from(ctx);
        this.itemLayout = itemLayout;
        this.from = from;
        this.to = to; }

    //Erzeugen des View mit eigenem Adapter
    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent){
        View v = inflater.inflate(itemLayout, parent, false);
        return v;
    }

    //Koppeln mit View und dem Layout
    @Override
    public void bindView(View v, Context ctx, Cursor c){
        int image = c.getInt(c.getColumnIndexOrThrow(from[0]));
        ImageView imageView = (ImageView) v.findViewById(to[0]);
        imageView.setImageResource(image);

        String title = c.getString(c.getColumnIndexOrThrow(from[1]));
        TextView textView1 = (TextView) v.findViewById(to[1]);
        textView1.setText(title);

        String subTitle = c.getString(c.getColumnIndexOrThrow(from[2]));
        TextView textView2 = (TextView) v.findViewById(to[2]);
        textView2.setText(subTitle);
    }
}
