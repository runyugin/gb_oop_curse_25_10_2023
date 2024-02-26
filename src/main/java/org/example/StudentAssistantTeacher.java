package org.example;

public class StudentAssistantTeacher  implements  StudentAssistantInterface {

    public void studentAssistantMatch(String  item ){
        System.out.println( "Я помогаю учителю по " + item);
    }

    public void studentAssistantLength(String  item){
        System.out.println( "Я помогаю учителю по " + item);
    }

    public void stusentAssisstantProgramming(String item, User assis){
        System.out.println(assis +  "Я помогаю учителю по " + item);
    }


    @Override
    public void assistant(String item, User assis) {

    }
}
