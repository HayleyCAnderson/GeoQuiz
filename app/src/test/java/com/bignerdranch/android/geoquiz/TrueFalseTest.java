package com.bignerdranch.android.geoquiz;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Hayley on 11/23/15.
 */
public class TrueFalseTest {
    private TrueFalse mTrueFalse;

    @Before
    public void setUp() throws Exception {
        mTrueFalse = new TrueFalse(R.string.question_africa, false);
    }

    @Test
    public void shouldReturnQuestionInt() throws Exception {
        int questionInt = mTrueFalse.getQuestion();
        Assert.assertNotNull(questionInt);
    }

    @Test
    public void shouldReturnCorrectIsTrueBoolean() throws Exception {
        boolean isTrueBoolean = mTrueFalse.isTrueQuestion();
        Assert.assertEquals(false, isTrueBoolean);
    }
}
