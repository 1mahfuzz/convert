package mahfuz.convert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

/** Information About This activity
 * This is the MeterActivity
 * This will handle all the work for liter conversion */
public class LiterActivity extends AppCompatActivity {
    //Constants goes here
    private static final String TAG = "Convert";
    //Widgets declaring the widgets
    Spinner mSpinner1,mSpinner2;
    Button mGenarateButton;
    TextView mDisplayView;
    EditText mValue;
    //Variables
    public int mFirstNum; //this varibale is used for the index of selected item in spinner1
    public int mSecondNum; //this varibale is used for the index of selected item in spinner1
    double mEditTextValue; //store the value given by user in the edittext
    public String mUnit; // store the selected item of spinner2 in the variable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liter);
    }
}
