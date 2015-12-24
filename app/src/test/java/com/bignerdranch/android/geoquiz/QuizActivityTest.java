package com.bignerdranch.android.geoquiz;

import android.os.Build;
import android.widget.Button;
import android.widget.ImageButton;
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
 * Created by handerson on 11/15/15.
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.KITKAT)
public class QuizActivityTest {
    private QuizActivity mQuizActivity;

    @Before
    public void setUp() throws Exception {
        ActivityController<QuizActivity> mActivityController =
                Robolectric.buildActivity(QuizActivity.class);
        mActivityController.create().start().resume().visible();
        mQuizActivity = mActivityController.get();
    }

    @Test
    public void shouldHaveQuestionText() throws Exception {
        TextView questionText = (TextView) mQuizActivity.findViewById(R.id.question_text_view);
        Assert.assertNotNull(questionText);
    }

    @Test
    public void shouldHaveImageButtons() throws Exception {
        ImageButton nextButton = (ImageButton) mQuizActivity.findViewById(R.id.next_button);
        ImageButton backButton = (ImageButton) mQuizActivity.findViewById(R.id.back_button);

        Assert.assertNotNull(nextButton);
        Assert.assertNotNull(backButton);
    }

    @Test
    public void shouldHaveButtonsWithCorrectText() throws Exception {
        Button cheatButton = (Button) mQuizActivity.findViewById(R.id.cheat_button);
        Button trueButton = (Button) mQuizActivity.findViewById(R.id.true_button);
        Button falseButton = (Button) mQuizActivity.findViewById(R.id.false_button);

        Assert.assertNotNull(cheatButton);
        Assert.assertEquals("Cheat!", cheatButton.getText());
        Assert.assertNotNull(trueButton);
        Assert.assertEquals("True", trueButton.getText());
        Assert.assertNotNull(falseButton);
        Assert.assertEquals("False", falseButton.getText());
    }
}