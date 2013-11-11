package com.bignerdranch.android.geoquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CheatActivity extends Activity {
	
	private static final String TAG = "CheatActivity";
	private static final String KEY_CHEATER = "cheater";
	
	public static final String EXTRA_ANSWER_IS_TRUE =
			"com.bignerdranch.android.geoquiz.answer_is_true";
	public static final String EXTRA_ANSWER_SHOWN =
			"com.bignerdranch.android.geoquiz.answer_shown";
	
	private boolean mAnswerIsTrue;
	private boolean mIsAnswerShown;
	
	private TextView mAnswerTextView; 
	private Button mShowAnswer;
	
	private void setAnswerShownResult(boolean isAnswerShown) {
		mIsAnswerShown = isAnswerShown;
		Intent data = new Intent();
		data.putExtra(EXTRA_ANSWER_SHOWN, isAnswerShown);
		setResult(RESULT_OK, data);
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.activity_cheat);
			
		if (savedInstanceState != null) {
			setAnswerShownResult(savedInstanceState.getBoolean(KEY_CHEATER, false));
		} else {
			setAnswerShownResult(false);
		}
		
		mAnswerTextView = (TextView)findViewById(R.id.answerTextView);
		
		mShowAnswer = (Button)findViewById(R.id.showAnswerButton);
		mShowAnswer.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (mAnswerIsTrue) {
					mAnswerTextView.setText(R.string.true_button);
				} else {
					mAnswerTextView.setText(R.string.false_button);
				}
				setAnswerShownResult(true);
			}
		});
		
		mAnswerIsTrue = getIntent().getBooleanExtra(EXTRA_ANSWER_IS_TRUE, false);
	}
	
	@Override
	public void onSaveInstanceState(Bundle savedInstanceState) {
		super.onSaveInstanceState(savedInstanceState);
		Log.i(TAG, "onSaveInstanceState");
		savedInstanceState.putBoolean(KEY_CHEATER, mIsAnswerShown);
	}

}
