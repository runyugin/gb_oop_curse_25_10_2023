package org.hm3;

public class MyExeptionPhone extends NumberFormatException{

    public MyExeptionPhone() {
        super("Телефон введен не правильно!!!");
    }
}
