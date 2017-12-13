package mahfuz.convert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
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
        //initilizing spinner
        mSpinner1 = findViewById(R.id.spinner1);
        mSpinner2 = findViewById(R.id.spinner2);
        //initilizing button
        mGenarateButton = findViewById(R.id.buttonGenarate);
        //initilizing textview
        mDisplayView = findViewById(R.id.answerView);
        //initilizing edittext
        mValue = findViewById(R.id.value);

        String[] dropDownValues; // this variable will contain the values for spinner
        dropDownValues = getResources().getStringArray(R.array.units_liter); // getting the string array from string file and putting it to dropDownValues Variable

        //Creating a adpter for spinner
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,dropDownValues);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //setting the adapter with spinner
        mSpinner1.setAdapter(adapter); // spinner1 adapter set
        mSpinner2.setAdapter(adapter); // spinner2 adapter set

    }
}
