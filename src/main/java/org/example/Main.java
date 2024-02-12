package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Barrier runRoad_1 = new RunRoad(30);
        Barrier runRoad_2 = new RunRoad(80);
        Barrier runRoad_3 = new RunRoad(180);

        Barrier wall_1 = new Wall(1);
        Barrier wall_2 = new Wall(3);
        Barrier wall_3 = new Wall(5);

        ArrayList<Barrier> barriers = new ArrayList<>();

        barriers.add(runRoad_1);
        barriers.add(wall_1);
        barriers.add(runRoad_2);
        barriers.add(wall_2);
        barriers.add(runRoad_3);
        barriers.add(wall_3);


        ArrayList<Players> players = new ArrayList<>();

        Players player_1 = new Human("Ivan", 2, 1000);
        Players player_2 = new Cat("Kity", 3,500);
        Players player_3 = new Robot("Walle", 0, 5000);

        players.add(player_1);
        players.add(player_2);
        players.add(player_3);



        for (int i = 0; i < barriers.size(); i++) {

            if(barriers.get(i) instanceof Wall ) {
                System.out.println(((Wall) barriers.get(i)).getHeight());

            }
            else if (barriers.get(i) instanceof RunRoad ) {
                System.out.println(((RunRoad)barriers.get(i)).getDistance());
            }

        }


    }
}