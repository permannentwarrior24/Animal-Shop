package src;

import java.util.ArrayList;

/**
 * @author 112200338周嘉裕
 * @date 2022/11/14
 */
public interface AnimalShop {
    void buyAnimals();

    void entertainCustomers(ArrayList<Customer> list2);

    void closeShop(ArrayList<Customer> list2);

    void showAllPets(ArrayList<Animal> list1);
}
