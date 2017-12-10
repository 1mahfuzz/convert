package mahfuz.convert;

/**
 * Created by mahfuz on 10/12/17.
 */

import android.util.Log;

import static mahfuz.convert.ControllerActivity.TAG;

/** Information About this class
  *This class will calcuate and return data
  *This class will require three parameter
  *This class will be in lots of use */

public class Calculate {

    //global variable
    int mLoop;
    int mNumberToMultiply = 10;
    int mNumberOfZero = 1;

    //A non argumented constructor
    public Calculate(){
        //This constructor does not do anything
    }

    //This is a parameteries constructor
    public Calculate(int firstNum,int secondNum){

        if (firstNum > secondNum){ // check if the first number is greater than second number
            mLoop = ( firstNum - secondNum ) - 1; // subtract second number from first number and then subtract 1

            String answerInText = String.valueOf(mNumberOfZero); // convert int into string

            for (int i = 0; i <= mLoop; i++){ // run the loop to the value of mLoop
                answerInText = answerInText.concat("0"); // concat 0 to 1 each time the loop run
            }
            Log.d(TAG, "Calculate: "+answerInText); // show the output in logcat
        }




    }

}
