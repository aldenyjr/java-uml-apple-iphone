package com.Apple.iPhone.Interfaces;

import com.Apple.iPhone.Entidades.Contact;

public interface mobilePhone extends musicPlayer, Telephone, InternetBrowser{

    void call(Contact contact);
}
