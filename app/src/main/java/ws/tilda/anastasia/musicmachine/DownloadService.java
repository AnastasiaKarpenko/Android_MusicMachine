package ws.tilda.anastasia.musicmachine;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;


public class DownloadService extends Service {
    public static final String TAG = DownloadService.class.getSimpleName();


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        String song = intent.getStringExtra(MainActivity.KEY_SONG);
        downloadSong(song);
        return Service.START_REDELIVER_INTENT;
    }

    private void downloadSong(String song) {
        long endTime = System.currentTimeMillis() + 10 * 1000;
        while (System.currentTimeMillis() < endTime) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Log.d(TAG, song + "Song downloaded!");

    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}