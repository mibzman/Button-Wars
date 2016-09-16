package com.isotope.Button_Wars;


import android.app.Activity;
import android.os.Bundle;
import com.startapp.android.publish.StartAppSDK;

public class LevelList extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StartAppSDK.init(this, "107171153", "208427773", true);
        setContentView(R.layout.level_list);
    }
}
