package org.example;

public class Cat extends Players implements Skill{

    private String name;
    private int heigh_jamp;
    private int run_distance;

    public Cat(String name, int heigh_jamp, int run_distance) {
        this.name = name;
        this.heigh_jamp = heigh_jamp;
        this.run_distance = run_distance;
    }

    @Override
    public void jamp() {
        System.out.println("Прыгаем");
    }

    public int getHeigh_jamp() {
            return heigh_jamp;
            }

    public int getRun_distance() {
            return run_distance;
            }

    public void run() {
            System.out.println("Бежим");
            }

}
