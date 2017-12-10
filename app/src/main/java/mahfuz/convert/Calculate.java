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
    int answer;
    int one = 1;

    //A non argumented constructor
    public Calculate(){
        //This constructor does not do anything
    }

    //This is a parameteries constructor
    public Calculate(int firstNum,int secondNum){

        if (firstNum > secondNum){
            answer = ( firstNum - secondNum ) - 1;

            String answerInText = String.valueOf(answer);
            answerInText = one + answerInText;

            Log.d(TAG, "Calculate: "+answerInText);
        }



    }

}
