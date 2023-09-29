package com.Apple.iPhone.Interfaces;

import com.Apple.iPhone.Entidades.Contact;

public interface MobilePhone extends MusicPlayer, Telephone, InternetBrowser{

    void call(Contact contact);
}
