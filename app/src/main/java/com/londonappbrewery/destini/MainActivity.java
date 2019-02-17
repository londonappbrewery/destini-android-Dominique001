package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryTextView;
    Button mButtonTop,mButtonBottom;
    int mStory,mText,mTextTop,mTextBottom;

    private TextButtons[] mTextButtons = new TextButtons[]{
            new TextButtons(R.string.T1_Story,R.string.T1_Ans1,R.string.T1_Ans2),
            new TextButtons(R.string.T2_Story,R.string.T2_Ans1,R.string.T2_Ans2),
            new TextButtons(R.string.T3_Story,R.string.T3_Ans1,R.string.T3_Ans2),
            new TextButtons(R.string.T4_End,0,0),
            new TextButtons(R.string.T5_End,0,0),
            new TextButtons(R.string.T6_End,0,0)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        mButtonTop = (Button) findViewById(R.id.buttonTop);
        mButtonBottom = (Button) findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Destiny","Top");
                UpdatePage(1);
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Destiny","Bottom");
                UpdatePage(2);
            }
        });


    }

    private void UpdatePage(int buttonPressed){

        Log.d("Destiny","buttonPressed: "+buttonPressed);
        Log.d("Destiny","mStory: "+mStory);
        if(buttonPressed == 1){
            if(mStory == 0){
                mStory = 2;
                Log.d("Destiny","mStory wordt: "+mStory);
            }else if(mStory == 1){
                mStory = 2;
                Log.d("Destiny","mStory wordt: "+mStory);
            }else if(mStory == 2){
                mStory = 5;
                Log.d("Destiny","mStory wordt: "+mStory);
            }
        }else{
            if(mStory == 0){
                mStory = 1;
                Log.d("Destiny","mStory wordt: "+mStory);
            }else if(mStory == 1){
                mStory = 3;
                Log.d("Destiny","mStory wordt: "+mStory);
            }else if(mStory == 2){
                mStory = 4;
                Log.d("Destiny","mStory wordt: "+mStory);
            }
        }

        mText = mTextButtons[mStory].getTextID();
        mTextTop = mTextButtons[mStory].getTextButtonTop();
        mTextBottom = mTextButtons[mStory].getTextButtonBottom();

        mStoryTextView.setText(mText);
        if(mTextTop != 0){
            mButtonTop.setText(mTextTop);
            mButtonBottom.setText(mTextBottom);
        }else{
            mButtonTop.setVisibility(View.GONE);
            mButtonBottom.setVisibility(View.GONE);
        }

    }
}
