package com.majd.builditbigger;


import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import static java.util.concurrent.TimeUnit.SECONDS;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

/**
 * Created by majd on 10/17/17.
 */
@RunWith(AndroidJUnit4.class)

public class EndpointsAsyncTaskTest {
    @Test
    public void testDoInBackground() throws InterruptedException, ExecutionException, TimeoutException {
        MainActivity mainActivity=new MainActivity();
        JokeAsyncTask jokeAsyncTask=new JokeAsyncTask(mainActivity);
        jokeAsyncTask.execute();
        try {
            String result=jokeAsyncTask.get(30, SECONDS);
            assertNotNull(result);
            assertTrue(result.length() > 0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }

    }
}