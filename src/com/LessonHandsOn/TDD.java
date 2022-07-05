package com.LessonHandsOn;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TDD {
    @Test
    public void testIsTrue(){
        LessonHandsOn lho = new LessonHandsOn();
        Assert.assertEquals(true, lho.isTrue(6));

    }




}
