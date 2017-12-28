package com.lambda;

import com.github.javafaker.Faker;

import java.util.Locale;

/**
 * @author jackycheng
 * @date 2017-12-28-上午9:09
 */

public class LambdaTest {

    public static void lambdaTest() {
        Faker faker=new Faker(new Locale("zh-CN"));
        System.out.println(faker.date().birthday());
        System.out.println(faker.address().fullAddress());
    }
}
