package src;

/**
 * @author 112200338周嘉裕
 * @date 2022/11/13
 */
abstract class Animal {
    String name;
    int age;
    String gender;
    double price,sellPrice;

    public Animal(String name, int age, String gender, double price) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.price = price;
    }

    public Animal() {
    }

    @Override
    public String toString() {
        return "名字：" + name + "，年龄：" + age + "，性别：" + gender + "，价格：" + price;
    }
}
