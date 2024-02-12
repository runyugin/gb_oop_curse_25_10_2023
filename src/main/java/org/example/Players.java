package org.example;

public class Players {

    private Barrier barrier;
    private Skill skill;

    public void jamp(Skill skill) {
        System.out.println(((Wall) barrier).getHeight());
        System.out.println("Прыгаем");
    }

    public void run(Skill skill) {
        System.out.println(((RunRoad) barrier).getDistance());
        System.out.println("Бежим");
    }

    public void go(Barrier barrier, Players players) {
        if (barrier instanceof Wall) {
            jamp(skill);

        } else if (barrier instanceof RunRoad) {
            run(skill);
        }

    }


}

