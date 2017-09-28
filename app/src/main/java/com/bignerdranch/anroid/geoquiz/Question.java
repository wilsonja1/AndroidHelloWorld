package com.bignerdranch.anroid.geoquiz;

import android.widget.Button;
import android.widget.TextView;

/**
 * Created by battl on 9/27/2017.
 */

public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public Question(int textResId, boolean answerTrue){
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }

}
