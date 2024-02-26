package org.example;

import java.time.LocalDate;

public class OmenAssistant extends  User {
    public OmenAssistant(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
    }
    public void saveData(String firstName){
        this.setFirstName(firstName);
        this.setSecondName("ИВАНОВИЧ");

    }

}
