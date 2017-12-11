package mahfuz.convert;

/**
 * Created by mahfuz on 10/12/17.
 */

import android.util.Log;
import android.widget.Toast;

import static mahfuz.convert.ControllerActivity.TAG;

/** Information About this class
  *This class will calcuate and return data
  *This class will require three parameter
  *This class will be in lots of use */

public class Calculate {

    //global variable
    int mLoop;
    int mNumberOfZero = 1;
    int mNumberToMultiply;
    double mAnswer;

    //A non argumented constructor
    public Calculate(){
        //This constructor does not do anything
    }
    //This is a parameteries constructor
    public double getAnswer(int firstNum,int secondNum,double value){
        if (firstNum > secondNum){ // check if the first number is greater than second number
            mLoop = ( firstNum - secondNum ); // subtract second number from first number and then subtract 1

            String answerInText = String.valueOf(mNumberOfZero); // convert int into string
            for (int i = 1; i <= mLoop; i++){ // run the loop to the value of mLoop
                answerInText = answerInText.concat("0"); // concat 0 to 1 each time the loop run
            }

            mNumberToMultiply = Integer.parseInt(answerInText); // make the string integer type
            mAnswer = value / mNumberToMultiply; // multiply the number of value by mNumberToMultiply
            Log.d(TAG, "Calculate: "+mAnswer); // show the output in logcat

        } else if (firstNum < secondNum ){
            mLoop = ( secondNum - firstNum ); // subtract second number from first number and then subtract 1

            String answerInText = String.valueOf(mNumberOfZero); // convert int into string
            for (int i = 1; i <= mLoop; i++){ // run the loop to the value of mLoop
                answerInText = answerInText.concat("0"); // concat 0 to 1 each time the loop run
            }

            mNumberToMultiply = Integer.parseInt(answerInText); // make the string integer type
            mAnswer = value * mNumberToMultiply; // multiply the number of value by mNumberToMultiply
            Log.d(TAG, "Calculate: "+mAnswer); // show the output in logcat
        } else if (firstNum == secondNum) { // check if the two number is equal
            mAnswer = value; // if both number is equal then set the answer to value
        } else {
            mAnswer = -0; //if all the condition failed then set the answer to -0
        }
        return mAnswer; // return answer to activity
    }
}
