package com.Apple.iPhone;

import com.Apple.iPhone.Entidades.*;

public class Main {
    public static void main(String[] args) {

        iPhone iPhoneXr = new iPhone("XR", 002554, 2020);
        iPhoneXr.playAndPause(iPhoneXr.selectMusic("Bilu bilu"));
        iPhoneXr.answer(new Contact(71988881111L));

    }
}
