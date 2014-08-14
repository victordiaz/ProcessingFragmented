//package processing.test;
//
//import java.io.File;
//import java.io.IOException;
//import java.net.MalformedURLException;
//import java.net.URL;
//
//import org.json.JSONArray;
//import org.json.JSONException;
//import org.json.JSONObject;
//
//import processing.core.PApplet;
//
//import android.app.Activity;
//import android.os.Bundle;
//import android.os.Looper;
//import android.util.Log;
//
//
//public class ProcessingActivity extends Activity {
//
//	@Override
//	public void onCreate(Bundle savedInstanceState) {
//		super.onCreate(savedInstanceState);
//
//    }
//
//
//	public void setup() {
//
//		frameRate(12);
//		smooth();
//
//	}
//
//	public void draw() {
//		background(255);
//
//		if (frameCount == 1) {
//			Looper.prepare();
//		}
//
//		fill(125);
//		ellipse(mouseX, mouseY, 125, 125);
//
//
//	}
//
//    //public int sketchWidth() {
//    //    return 200;
//    //}
//
//
//    //public int sketchHeight() {
//    //    return 200;
//    //}
//
//
//    public String sketchRenderer() {
//        return OPENGL;
//    }
//
//    @Override
//    public void onBackPressed() {
//        exit();
//    }
//
//
//
//}
