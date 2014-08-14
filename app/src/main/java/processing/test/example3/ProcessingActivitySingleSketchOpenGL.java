package processing.test.example3;

import processing.core.PApplet;
import processing.test.R;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;


public class ProcessingActivitySingleSketchOpenGL extends FragmentActivity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mainprocessingwrapper);

		addProcessingSketch(new ProcessingSketchOpengl1(), R.id.f1);

	} 

	public void addProcessingSketch(PApplet processing, int fragmentPosition) {

		FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
		ft.add(fragmentPosition, processing);
		ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
		ft.commit();

	}  
	
}
