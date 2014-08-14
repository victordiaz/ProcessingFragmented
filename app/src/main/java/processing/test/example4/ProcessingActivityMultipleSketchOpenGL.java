package processing.test.example4;

import processing.core.PApplet;
import processing.test.R;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;


public class ProcessingActivityMultipleSketchOpenGL extends FragmentActivity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mainprocessingwrapper_multiple);

		addProcessingSketch(new ProcessingSketchOpengl1(), R.id.f1);
		addProcessingSketch(new ProcessingSketchOpengl2(), R.id.f2);

	} 

	public void addProcessingSketch(PApplet processing, int fragmentPosition) {

		FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
		ft.add(fragmentPosition, processing);
		ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
		ft.commit();

	}  
	
}
