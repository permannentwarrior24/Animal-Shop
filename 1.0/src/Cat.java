package src;

import src.Animal;

/**
 * @author 112200338周嘉裕
 * @date 2022/11/14
 */
public class Cat extends Animal {
    final double price = 200;

    public Cat(String name, int age, String gender, double price) {
        super(name, age, gender, price);
    }

    public Cat() {
    }
}
