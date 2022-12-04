package src;

import java.util.ArrayList;

/**
 * @author 112200338周嘉裕
 * @date 2022/12/4
 */
public class MyAnimalShop implements AnimalShop {
    double balance = 10000;
    boolean isOpen;
    static ArrayList<Animal> list1 = new ArrayList<>();
    static ArrayList<Customer> list2 = new ArrayList<>();

    @Override
    public void buyAnimals() {

    }

    @Override
    public void entertainCustomers(ArrayList<Customer> list2) {

    }

    @Override
    public void closeShop(ArrayList<Customer> list2) {
        System.out.println("今天光顾的客户的信息如下：");

    }

    @Override
    public void showAllPets(ArrayList<Animal> list1) {
        if (list1.size() == 0) {
            System.out.println("您的宠物商店目前没有宠物!");
        }
        for (Animal pet : list1) {
            pet.toString();
        }
    }

}
