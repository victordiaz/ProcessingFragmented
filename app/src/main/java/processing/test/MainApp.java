package processing.test;

import android.app.Application;
import android.content.Context;
import android.util.Log;

public class MainApp extends Application {

	private static boolean isRunning = false;

	private static Context c;

	

	@Override
	public void onCreate() {
		super.onCreate();

		c = getApplicationContext();
		Log.d("debug", "app created"); 


	}

	public void onLowMemory() {
		Log.d("ll", "on low memory"); 
	};

	@Override
	public void onTerminate() {
		super.onTerminate();
		

	}

	public static boolean isRunning() {

		return isRunning;
	}

	public static void setRunning(boolean b) {
		isRunning = true;

	}


	public final static Context getContext() {
		return c;
	}

}
