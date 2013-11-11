package com.bignerdranch.android.geoquiz;

public class TrueFalse {
	private int mQuestion; //id of question string resource
	
	private boolean mTrueQuestion;
	private boolean mCheatedQuestion = false; //True iff the user cheated on this question
	
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

	public boolean isCheatedQuestion() {
		return mCheatedQuestion;
	}

	public void setCheatedQuestion(boolean cheatedQuestion) {
		mCheatedQuestion = cheatedQuestion;
	}

}
