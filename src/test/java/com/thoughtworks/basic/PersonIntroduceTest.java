package com.thoughtworks.basic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PersonIntroduceTest {


    @Test
    public void when_give_Name_IS_TOM_AGE_IS_21_should_introduce() {
        //given
        String name="Tom";
        int age=21;
        // when
        String introduceResult=PersonIntroduce.introduce(name,age);
        //then
        assertEquals(introduceResult,"My name is Tom. I am 21 years old.");
    }
}
