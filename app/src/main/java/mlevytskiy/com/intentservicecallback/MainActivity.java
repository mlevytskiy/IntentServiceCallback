package mlevytskiy.com.intentservicecallback;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ResultReceiver resultReceiver = new ResultReceiver(new Handler()) {

        protected void onReceiveResult(int resultCode, Bundle resultData) {
            Toast.makeText(MainActivity.this, "onReceiveResult", Toast.LENGTH_LONG).show();
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent serIntent = new Intent(this, CustomIntentService.class);
        serIntent.putExtra("test", resultReceiver);
        startService(serIntent);
    }


}
