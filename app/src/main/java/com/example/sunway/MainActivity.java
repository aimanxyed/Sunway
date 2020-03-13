package com.example.sunway;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


 //1 =tick , 0=cross , 2=empty
    int activePlayer= 0;
    int [] gameState = {2,2,2,2,2,2,2,2,2};
    int [][] winningPositions = {{0,1,2}, {3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8}, {2,4,6}};


    public void dropIn (View view)
    {

        ImageView counter = (ImageView) view;
      counter.setTranslationY(-1500);
      Log.i(" message ",  counter.getTag().toString());
      counter.setImageResource(R.drawable.cross);
      counter.animate().translationYBy(1500).rotation(3600).setDuration(300);
      int tappedCounter = Integer.parseInt(counter.getTag().toString());
      gameState[tappedCounter] = activePlayer;

      for(int[]winningPosition:winningPositions )
        {
            if (gameState[winningPosition[0]]==   )
        }


      if (activePlayer==1 )
      {
          counter.setImageResource(R.drawable.tick);
          activePlayer=0;
      }
      else if(activePlayer==0)
      {
          counter.setImageResource(R.drawable.cross);
          activePlayer=1;
      }
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
