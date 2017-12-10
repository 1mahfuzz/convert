package mahfuz.convert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/*        Information About this activity       */
/*
 * This activity will start different activity. Like MeterActivity,LiterActivity,GramActivity
 * This activity will launch at the start of app when the app is complete
 *
*/

public class ControllerActivity extends AppCompatActivity {

    //Constants goes here
    public static final String  TAG = "Convert";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controller);

        //Calling MeterActivity via Intent
    }
}
