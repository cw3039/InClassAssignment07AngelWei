package com.example.inclassassignment07_angelwei;
import java.io.Serializable;

/**
 * Created by weiyingzhu on 18/3/6.
 */

public class Fruit implements Serializable {
    private String name;
    private int age;
    boolean eat;

    public Fruit(String name, int age, boolean eat) {
        this.name = name;
        this.age = age;
        this.eat = eat;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isEat() {
        return eat;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEat(boolean eat) {
        this.eat = eat;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", eat=" + eat +
                '}';
    }
}
