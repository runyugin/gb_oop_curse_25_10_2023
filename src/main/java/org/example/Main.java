package org.example;

import javax.lang.model.element.QualifiedNameable;
import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.TreeSet;


public class Main {
    public static void main(String[] args) {




        User oneUser = new User("Ярослав", "Янукович", "Янович", LocalDate.now());
        User twoUser = new User("Петров", "Петр", "Петрович", LocalDate.now());
        User threeUser = new User("Сидоров", "Семен", "Петрович", LocalDate.now());

        TreeSet<User> treeSet = new TreeSet<User>(new UserComparator<>());
        treeSet.add(oneUser);
        treeSet.add(twoUser);
        treeSet.add(threeUser);
        System.out.println(treeSet);

        System.out.println("//////////////////////////////");

        User oneTeacher1 = new User("Ярослав", "Ярославович", "Якин", LocalDate.now());
        User twoTeacher2 = new User("Глеб", "Глебович", "Петрович", LocalDate.now());
        User threeTeacher3 = new User("Екатерина", "Константиновна", "Каткова", LocalDate.now());

        TreeSet<User> treeSet2 = new TreeSet<User>(new TeacherComparator<>());
        treeSet2.add(oneTeacher1);
        treeSet2.add(twoTeacher2);
        treeSet2.add(threeTeacher3);
        System.out.println(treeSet2);

        System.out.println("////////////  S:   Принцип единственной ответственности /////////////////////////////");
        StudentAssistantTeacher assistantTeacher1 = new StudentAssistantTeacher();
        System.out.print(oneUser + " ");
        assistantTeacher1.studentAssistantMatch("Match");
        StudentAssistantTeacher assistantTeacher2 = new StudentAssistantTeacher();
        System.out.print(twoUser);
        assistantTeacher1.studentAssistantLength("length");
        System.out.println("///////////////  O:   Принцып открытости-закрытости    ////////////////////////////");
       StudentAssistantInterface inter = new StudentAssistantTeacher();   //AbstraktClass+ полиморфизм
                                                                         // /куда сохраняем ..StudentAssistantTeacher
       inter.assistant("programming", threeUser);

        System.out.println("/////////////  L:    Принцып постановки Барбары Лисков//////////");
        /// Подклассы должны заменять свои базовые классы

        test();
        ///////////////////  I:    Принцип разделения интерфейса  //////////////////////
        System.out.println("/////////////////   I:    Принцип разделения интерфейса /////////");
        Physics Lesson1 = new Physics();
        Lesson1.Physics();
        System.out.println("/////////////////////////");
        




//        Модифицировать учительский класс и связанные с ним,
//        добавив типизацию(Добавить iterator + comparator + teacherGroup)
    }


    public static void test(){



        User oneUser = new User("Ярослав", "Янукович", "Янович", LocalDate.now());
        User oneUser2 = new OmenAssistant("Djon", "Dep", "Янович",
                          LocalDate.ofYearDay(1,1));

        oneUser2.saveData("Ivan");

        if (oneUser2.getFirstName().compareTo(oneUser.getFirstName()) == 0 &&
            oneUser2.getSecondName() == oneUser.getSecondName()){
            System.out.println("Test ok");
        }else {
            System.out.println("test fail");
        }

    }

}
