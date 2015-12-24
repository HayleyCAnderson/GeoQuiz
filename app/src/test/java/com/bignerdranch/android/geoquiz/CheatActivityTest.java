package com.bignerdranch.android.geoquiz;

import android.os.Build;
import android.widget.Button;
import android.widget.TextView;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.util.ActivityController;

/**
 * Created by Hayley on 11/23/15.
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.KITKAT)
public class CheatActivityTest {
    private CheatActivity mCheatActivity;

    @Before
    public void setUp() throws Exception {
        ActivityController<CheatActivity> mActivityController =
                Robolectric.buildActivity(CheatActivity.class);
        mActivityController.create().start().resume().visible();
        mCheatActivity = mActivityController.get();
    }

    @Test
    public void shouldHaveAnswerText() throws Exception {
        TextView answerText = (TextView) mCheatActivity.findViewById(R.id.answerTextView);
        Assert.assertNotNull(answerText);
    }

    @Test
    public void shouldHaveShowAnswerButtonWithCorrectText() throws Exception {
        Button showAnswerButton = (Button) mCheatActivity.findViewById(R.id.showAnswerButton);

        Assert.assertNotNull(showAnswerButton);
        Assert.assertEquals("Show Answer", showAnswerButton.getText());
    }
}
