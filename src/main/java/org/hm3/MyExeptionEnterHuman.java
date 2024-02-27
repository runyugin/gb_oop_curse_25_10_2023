package org.hm3;

public class MyExeptionEnterHuman extends ArrayIndexOutOfBoundsException {
    public MyExeptionEnterHuman() {
        super("Данные ведены не по шаблону (Фамилия Имя Отчество дата_рождения номер_телефона пол)!!!");
    }
}
