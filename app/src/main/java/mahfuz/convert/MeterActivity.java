package mahfuz.convert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/* Information About This activity */
/*
* This is the MeterActivity
* This will handle all the work for meter conversion */

public class MeterActivity extends AppCompatActivity {
    private static final String TAG = "Convert";

    //Constants goes here

    //Widgets

    Spinner mSpinner1,mSpinner2;

    //Variables
    public int mFirstNum; //this varibale is used for the index of selected item in spinner1
    public int mSecondNum; //this varibale is used for the index of selected item in spinner1

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meter);

        //initilizing spinner
        mSpinner1 = findViewById(R.id.spinner1);
        mSpinner2 = findViewById(R.id.spinner2);

        String[] dropDownValues; // this variable will conatin the values for spinner

        dropDownValues = getResources().getStringArray(R.array.units); // getting the string array from string file and putting it to dropDownValues Variable

        //Creating a adpter for spinner

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,dropDownValues);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //setting the adapter with spinner
        mSpinner1.setAdapter(adapter); // spinner1 adapter set
        mSpinner2.setAdapter(adapter); // spinner2 adapter set

        mSpinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d(TAG, "onItemSelected: Position: "+i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        mSpinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}
