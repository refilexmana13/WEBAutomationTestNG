package com.Refi.stepDef;

import com.Refi.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hook extends BaseTest {

    @Before
    public void beforeTest() {
        getDriver();
    }

    @After
    public void afterTest() {
        driver.quit();
    }
}
