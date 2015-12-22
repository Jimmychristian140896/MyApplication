package com.tb_pam_7319.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a="toni";
        a="123";

        Intent intent = this.getIntent();
        if (intent.getAction().equals(Intent.ACTION_SEND)) {

            String text_data = intent.getStringExtra(Intent.EXTRA_TEXT);
            Toast.makeText(getApplicationContext(),text_data,Toast.LENGTH_LONG).show();

            String h="http://admin.id.kurioapps.com/article/submit_pin?url=";

            String u=text_data;
            //window.open(h+u);
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(h+u));
            startActivity(browserIntent);
            // and now you can handle this text here what you want to do.
        }
    }
    public String pacar() {
        return "pacar";
    }

    public String j() {
        return "j123";
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
