package mahfuz.convert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

/** Information About This activity
  * This is the MeterActivity
  * This will handle all the work for meter conversion */

public class MeterActivity extends AppCompatActivity {

    //Constants goes here
    private static final String TAG = "Convert";
    //Widgets
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
        setContentView(R.layout.activity_meter);
        //initilizing spinner
        mSpinner1 = findViewById(R.id.spinner1);
        mSpinner2 = findViewById(R.id.spinner2);
        //initilizing button
        mGenarateButton = findViewById(R.id.buttonGenarate);
        //initilizing textview
        mDisplayView = findViewById(R.id.answerView);
        //initilizing edittext
        mValue = findViewById(R.id.value);

        String[] dropDownValues; // this variable will conatin the values for spinner
        dropDownValues = getResources().getStringArray(R.array.units); // getting the string array from string file and putting it to dropDownValues Variable

        //Creating a adpter for spinner
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,dropDownValues);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //setting the adapter with spinner
        mSpinner1.setAdapter(adapter); // spinner1 adapter set
        mSpinner2.setAdapter(adapter); // spinner2 adapter set

        mSpinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Log.d(TAG, "onItemSelected: Position: "+position); //print the position of the selected item in the logcat
                mFirstNum = position + 1; //get the position of the selected item
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        mSpinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Log.d(TAG, "onItemSelected: Position: "+position); //print the position of the selected item in the logcat
                mSecondNum = position + 1; //get the position of the selected item
                mUnit = adapterView.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        mGenarateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mEditTextValue = Double.parseDouble(mValue.getText().toString()); // converting text in double

                Calculate calculate = new Calculate(); //calling the constructor of calculate class

                double answer; // creating an double variable which will contain answer;

                answer = calculate.getAnswer(mFirstNum,mSecondNum,mEditTextValue); // calling getAnswer method in calculate class for answer and passing few parameters

                if (answer == -0){ // checking that the answer is equal to -0
                    Toast.makeText(getApplicationContext(),R.string.error,Toast.LENGTH_SHORT).show(); // if the answer is equal to -0 show this toast
                }else {
                    mDisplayView.setText(""+answer+mUnit.toLowerCase()); // if the answer is not equal to -0 then set the display view textview to answer
                }
            }
        });
    }
}
