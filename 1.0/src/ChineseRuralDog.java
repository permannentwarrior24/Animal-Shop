package src;

import src.Animal;

/**
 * @author 112200338周嘉裕
 * @date 2022/11/14
 */
public class ChineseRuralDog extends Animal {
    final double price = 100;
    boolean isVaccineInjected;

    public ChineseRuralDog(String name, int age, String gender, double price, boolean isVaccineInjected) {
        super(name, age, gender, price);
        this.isVaccineInjected = isVaccineInjected;
    }

    public ChineseRuralDog() {
    }

    @Override
    public String toString() {
        return "名字：" + name + "，年龄：" + age + "，性别：" + gender + "，价格：" + price + "，是否注射过狂犬病疫苗：" + isVaccineInjected;
    }
}