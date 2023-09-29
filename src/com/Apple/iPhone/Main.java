package com.Apple.iPhone;

import com.Apple.iPhone.Entidades.*;

public class Main {
    public static void main(String[] args) {

        iPhone iPhoneXr = new iPhone("XR", 002554, 2020);

        iPhoneXr.playAndPause(iPhoneXr.selectMusic("Bilu bilu"));
        iPhoneXr.playAndPause(iPhoneXr.selectMusic("A Casa ao Lado"));

        iPhoneXr.call(new Contact(71981881340L));
        iPhoneXr.answer(new Contact(71999787954L));
        iPhoneXr.answer(new Contact(71999787954L));
        iPhoneXr.answer(new Contact(71999787954L));
        iPhoneXr.call(new Contact(71988133040L));
        iPhoneXr.call(new Contact(71988133040L));

        iPhoneXr.showPage("http://google.com");

    }
}
