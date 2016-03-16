package mlevytskiy.com.intentservicecallback;

import android.app.IntentService;
import android.content.Intent;
import android.os.ResultReceiver;
import android.os.SystemClock;

/**
 * Created by max on 16.03.16.
 */
public class CustomIntentService extends IntentService {

    private ResultReceiver resultReceiver;

    public CustomIntentService() {
        super("CustomIntentService");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        resultReceiver = intent.getParcelableExtra("test");
        SystemClock.sleep(5000);
        resultReceiver.send(0, null);
    }

}
