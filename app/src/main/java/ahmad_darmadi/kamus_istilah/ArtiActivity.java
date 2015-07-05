package ahmad_darmadi.kamus_istilah;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ScrollView;
import android.widget.TextView;


public class ArtiActivity extends Activity {

    private TextView   txtArti ,txtIstilah ;

    @Override
    protected  void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arti);

        txtArti = (TextView) findViewById(R.id.arti);

        txtArti.setMovementMethod(new ScrollingMovementMethod());

        txtIstilah = (TextView) findViewById(R.id.istilah);



        Bundle b = getIntent().getExtras();
        if (b != null)
        {
            txtIstilah.setText(b.getString("istilah"));
            txtArti.setText(b.getString("arti"));
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_arti, menu);
        return true;
    }
}

