package processing.test.example2;

import processing.test.R;
import processing.core.PApplet;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;

public class ProcessingActivityMultipleSketch extends FragmentActivity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mainprocessingwrapper_multiple);

		addProcessingSketch(new ProcessingSketchDefaultRenderer1(), R.id.f1);
		addProcessingSketch(new ProcessingSketchDefaultRenderer2(), R.id.f2);

	} 

	public void addProcessingSketch(PApplet processing, int fragmentPosition) {

		FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
		ft.add(fragmentPosition, processing);
		ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
		ft.commit();

	}  
	
}
