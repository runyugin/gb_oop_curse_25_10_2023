package org.hm3;

public class Human {
    private String name;

    public String getSurname() {
        return surname;
    }

    private String surname;
    private String patronymic;
    private String birthday;
    private Long phone;
    private char sex;

    public Human(String surname, String name, String patronymic, String birthday, String phone, String sex) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.phone = Long.parseLong(phone);
        this.sex = sex.charAt(0);
    }

    @Override
    public String toString() {
        return String.format("<%s> <%s> <%s> <%s> <%s> <%s>", surname, name, patronymic, birthday, phone, sex);
    }
}
