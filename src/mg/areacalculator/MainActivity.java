package mg.areacalculator;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

import mg.areacalculatorfree.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {
	
	private InterstitialAd interstitial;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// Create the interstitial.
	    interstitial = new InterstitialAd(this);
	    interstitial.setAdUnitId("a1535bd3aaa933b");
	    
	    
	    interstitial.setAdListener(new AdListener() {
	        @Override
	        public void onAdLoaded() {
	          
	        	displayInterstitial();

	          
	        }
	        @Override
	        public void onAdFailedToLoad(int errorCode) {
	          
	        }
	    });
		
	    // Create ad request.
	    
	    AdRequest adRequest = new AdRequest.Builder().build();
	    
	   
	    
	    
	    
	    // Begin loading your interstitial.
	    interstitial.loadAd(adRequest);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void cTA(View view) {
	    // Do something in response to button
		Intent intent = new Intent(this, CalculateTriangleArea.class);
		startActivity(intent);
	}
	
	public void cRA(View view) {
	    // Do something in response to button
		Intent intent = new Intent(this, CalculateRectangleArea.class);
		startActivity(intent);
	}
	
	public void cSA(View view) {
	    // Do something in response to button
		Intent intent = new Intent(this, CalculateSquareArea.class);
		startActivity(intent);
	}
	
	public void cPA(View view) {
	    // Do something in response to button
		Intent intent = new Intent(this, CalculateParallelogramArea.class);
		startActivity(intent);
	}
	
	public void cTrapezoidA(View view) {
	    // Do something in response to button
		Intent intent = new Intent(this, CalculateTrapezoidArea.class);
		startActivity(intent);
	}
	
	public void cEA(View view) {
	    // Do something in response to button
		Intent intent = new Intent(this, CalculateEllipseArea.class);
		startActivity(intent);
	}
	
	public void cCA(View view) {
	    // Do something in response to button
		Intent intent = new Intent(this, CalculateCircleArea.class);
		startActivity(intent);
	}
	
	public void cSectorA(View view) {
	    // Do something in response to button
		Intent intent = new Intent(this, CalculateSectorArea.class);
		startActivity(intent);
	}
	
	// Invoke displayInterstitial() when you are ready to display an interstitial.
		  public void displayInterstitial() {
		    if (interstitial.isLoaded()) {
		      interstitial.show();
		    }
		  }

}
