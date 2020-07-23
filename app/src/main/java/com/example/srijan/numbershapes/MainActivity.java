package com.example.srijan.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    class Numbers{

        int number;
        public boolean isSquare(){

            double squareRoot=Math.sqrt(number);
            if(squareRoot==Math.floor(squareRoot))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        public boolean isTriangular(){

            int x=1;
            int triangularnum=1;
            while(triangularnum<number)
            {
                x++;
                triangularnum=triangularnum+x;
            }
            if(triangularnum==number)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }

    public void testNumber(View view){

        Log.i("Info","Button pressed");
        EditText editText=(EditText)findViewById(R.id.editText);

      String message;
      if(editText.getText().toString().isEmpty())
      {
        message="Please enter a number";
      }
      else{
          Numbers num=new Numbers();
          num.number=Integer.parseInt(editText.getText().toString());
          message=editText.getText().toString();
          if(num.isSquare() && num.isTriangular())
          {
              message+=" is square and triangular";
          }
          else if(num.isTriangular())
          {
              message+=" is Triangular";
          }
          else if(num.isSquare())
          {
              message+=" is Square";
          }
          else
          {
              message+="is neither of them";
          }


      }
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();


    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}


























