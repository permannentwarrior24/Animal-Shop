package src;

import src.Animal;

/**
 * @author 112200338周嘉裕
 * @date 2022/11/14
 */
public class Rabbit extends Animal {
    final double price=50;

    public Rabbit(String name, int age, String gender, double price) {
        super(name, age, gender, price);
    }

    public Rabbit() {
    }
}
