package net.deadlights.project0;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((Button)findViewById(R.id.btnSpotify)).setOnClickListener(this);
        ((Button)findViewById(R.id.btnXYZ)).setOnClickListener(this);
        ((Button)findViewById(R.id.btnScores)).setOnClickListener(this);
        ((Button)findViewById(R.id.btnLibrary)).setOnClickListener(this);
        ((Button)findViewById(R.id.btnCapstone)).setOnClickListener(this);
        ((Button)findViewById(R.id.btnBigger)).setOnClickListener(this);
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

    public void buttonClicked(int id) {
        String message = null;
        switch(id)
        {
            case R.id.btnSpotify:
                message = "This button will launch the Spotify app!";
                break;
            case R.id.btnScores:
                message = "This button will launch the Scores app!";
                break;
            case R.id.btnLibrary:
                message = "This button will launch the Library app!";
                break;
            case R.id.btnBigger:
                message = "This button will launch the 'Build it Bigger' app!";
                break;
            case R.id.btnXYZ:
                message = "This button will launch the XYZ Reader app!";
                break;
            case R.id.btnCapstone:
                message = "This button will launch my capstone app!";
                break;
        }
        if (message != null)
        {
            Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onClick(View v) {
        buttonClicked(v.getId());
    }
}
