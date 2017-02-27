package ws.tilda.anastasia.musicmachine;

import android.os.Looper;


public class DownloadThread extends Thread {
    public static final String TAG = DownloadThread.class.getSimpleName();
    public DownloadHandler mHandler;

    @Override
    public void run() {
        Looper.prepare();
        mHandler = new DownloadHandler();
        Looper.loop();
    }



}
