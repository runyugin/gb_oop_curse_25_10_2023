package org.hm3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleAddArrayHuman {
    private ArrayList<Human> humanList = new ArrayList<>();

    public ArrayList<Human> getHumanList() {
        return humanList;
    }

    public ArrayList<Human> add(){

        try (Scanner console = new Scanner(System.in)){

            boolean isExit = false;
            while (!isExit)
            {

                try {

                String s = console.nextLine();
                isExit = s.equals("exit");

                if (isExit) break;

                String[] arr = s.split(" ");

                if (arr.length!=6) throw new MyExeptionEnterHuman();

                if(!(arr[4].matches("\\d+"))) throw new MyExeptionPhone();

                if(arr[4].length()!=11) throw new MyExeptionPhone();

                if (!isValidDate(arr[3])) throw new MyExeptionData();

                if ((arr[5].length()!=1) && (arr[5].indexOf('f') != -1 || arr[5].indexOf('m') != -1)) throw new MyExeptionSex();


                Human human = new Human(arr[0],arr[1],arr[2],arr[3],arr[4],arr[5]);

                humanList.add(human);
                    writter(human);

                } catch (MyExeptionEnterHuman | MyExeptionData | MyExeptionPhone | MyExeptionSex e){
                    System.out.println(e.getMessage());
                }

            }
        }

        return humanList;
    }

    private boolean isValidDate(String date) {
        boolean check;
        String date1 = "^(0?[1-9]|[12][0-9]|3[01]).(0?[1-9]|1[012]).([12][0-9]{3})$";
        check = date.matches(date1);

        return check;
    }

    public void writter(Human human) {

        String str = human.toString();
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(human.getSurname() + ".txt", true))) {
            writer.append("\r\n");
            writer.append(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
