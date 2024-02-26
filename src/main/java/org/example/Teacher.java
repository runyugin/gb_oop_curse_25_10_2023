package org.example;

import java.time.LocalDate;

public class Teacher extends User implements Comparable<Teacher>{
    private Long teacherId;



    public Teacher(long teacherId,String firstName, String secondName,
                   String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.teacherId = teacherId;
    }

    public Long getTeacherId() {return teacherId;}

    public void setTeacherId(Long teacherId) {this.teacherId = teacherId;}



    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId='" + teacherId +'\'' +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", patronymic='" + super.getPatronymic() + '\'' +
                ", dateOfBirth=" + super.getDateOfBirth() +
                '}';
    }

    @Override
    public int compareTo(Teacher p) {return this.teacherId.compareTo(p.teacherId);}
}
