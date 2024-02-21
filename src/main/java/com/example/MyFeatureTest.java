package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MyFeatureTest {

    @Test
    public void testAdd() {
        MyFeature feature = new MyFeature();
        int result = feature.add(3, 4);
        assertEquals(7, result);
    }
}
