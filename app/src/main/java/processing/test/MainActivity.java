package processing.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;

import processing.test.example1.ProcessingActivitySingleSketch;
import processing.test.example2.ProcessingActivityMultipleSketch;
import processing.test.example3.ProcessingActivitySingleSketchOpenGL;
import processing.test.example4.ProcessingActivityMultipleSketchOpenGL;
import processing.test.example5.ProcessingActivitySingleSketchBackground;

public class MainActivity extends Activity {

	LinearLayout ll;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		ll = new LinearLayout(this);
		ll.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT));
		ll.setOrientation(LinearLayout.VERTICAL);

		// actividades
		addButton("Single Sketch", ProcessingActivitySingleSketch.class);
		addButton("Multiple Sketch Normal Renderer", ProcessingActivityMultipleSketch.class);
		addButton("Single Sketch OpenGL", ProcessingActivitySingleSketchOpenGL.class);
		addButton("Multiple Sketch Opengl", ProcessingActivityMultipleSketchOpenGL.class);
		addButton("Single Sketch over Background", ProcessingActivitySingleSketchBackground.class);

		setContentView(ll);

	}

	public void addButton(String name, final Class cls) {

		Button btn = new Button(this);
		btn.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		btn.setText(name);

		btn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent(getApplicationContext(), cls));

			}
		});

		// btnTag.setId("name");
		ll.addView(btn);
	}

}
