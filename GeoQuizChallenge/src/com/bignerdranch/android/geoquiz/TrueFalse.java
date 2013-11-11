package com.bignerdranch.android.geoquiz;

public class TrueFalse {
	private int mQuestion; //id of question string resource
	
	private boolean mTrueQuestion;
	
	/** A new True or False question to be managed by a QuizActivity.
	 * @param question The string id of the question to be displayed
	 * @param trueQuestion true iff the answer is "True"
	 */
	public TrueFalse(int question, boolean trueQuestion) {
		mQuestion = question;
		mTrueQuestion = trueQuestion;
	}

	public int getQuestion() {
		return mQuestion;
	}

	public void setQuestion(int question) {
		mQuestion = question;
	}

	public boolean isTrueQuestion() {
		return mTrueQuestion;
	}

	public void setTrueQuestion(boolean trueQuestion) {
		mTrueQuestion = trueQuestion;
	}

}
