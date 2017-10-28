package noel.co.ke.toaster;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnWarning, btnInfo, btnDefault, btnSuccess, btnError, btnCustom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnWarning = (Button) findViewById(R.id.btn_warning);
        btnWarning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toaster.makeText(getApplicationContext(), "This is a WARNING toast", Toaster.LENGTH_SHORT, Toaster.WARNING).show();
            }
        });

        btnInfo = (Button) findViewById(R.id.btn_info);
        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toaster.makeText(getApplicationContext(), "This is an INFO toast", Toaster.LENGTH_SHORT, Toaster.INFO).show();
            }
        });

        btnDefault = (Button) findViewById(R.id.btn_default);
        btnDefault.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toaster.makeText(getApplicationContext(), "This is an DEFAULT toast", Toaster.LENGTH_SHORT, Toaster.DEFAULT).show();
            }
        });

        btnSuccess = (Button) findViewById(R.id.btn_success);
        btnSuccess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toaster.makeText(getApplicationContext(), "This is a SUCCESS toast", Toaster.LENGTH_SHORT, Toaster.SUCCESS).show();
            }
        });

        btnError = (Button) findViewById(R.id.btn_error);
        btnError.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toaster.makeText(getApplicationContext(), "This is an ERROR toast", Toaster.LENGTH_SHORT, Toaster.ERROR).show();
            }
        });

        btnCustom = (Button) findViewById(R.id.btn_custom);
        btnCustom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toaster.makeText(getApplicationContext(), "This is a CUSTOM toast", Toaster.LENGTH_SHORT, Toaster.CUSTOM, R.drawable.ic_check_circle_white_24px, R.color.default_color).show();
            }
        });


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toaster.makeText(getApplicationContext(), "This is the message", Toaster.LENGTH_SHORT, Toaster.DEFAULT).show();
            }
        });
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
