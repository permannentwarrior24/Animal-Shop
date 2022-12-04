package src;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 112200338周嘉裕
 * @date 2022/12/4
 */
public class MyAnimalShop implements AnimalShop {
    //余额
    double balance;
    //一天开始时拥有的金额
    double initialAmount;
    //店铺是否营业
    boolean isOpen;
    static ArrayList<Animal> list1 = new ArrayList<>();
    static ArrayList<Customer> list2 = new ArrayList<>();
    Scanner in = new Scanner(System.in);

    @Override
    public void buyAnimals(ArrayList<Animal> list1) throws InsufficientBalanceException {
        System.out.println("有以下三种宠物：1.猫；2.中华田园狗；3.兔子");
        for (; ; ) {
            System.out.print("您买入了哪种宠物？请输入对应编号（输入0返回菜单）：");
            int option = in.nextInt();
            switch (option) {
                case 1:
                    Cat cat = new Cat();
                    if ((balance - cat.price) < 0)
                        throw new InsufficientBalanceException("您的余额不足，无法购买！所剩余额为：" + balance + "元");
                    else {
                        balance -= cat.price;
                        System.out.print("名字：");
                        cat.name = in.next();
                        System.out.print("年龄：");
                        cat.age = in.nextInt();
                        System.out.print("性别：");
                        cat.gender = in.next();
                        list1.add(cat);
                    }
                    break;
                case 2:
                    ChineseRuralDog dog = new ChineseRuralDog();
                    if ((balance - dog.price) < 0)
                        throw new InsufficientBalanceException("您的余额不足，无法购买！");
                    else {
                        balance -= dog.price;
                        System.out.print("名字：");
                        dog.name = in.next();
                        System.out.print("年龄：");
                        dog.age = in.nextInt();
                        System.out.print("性别：");
                        dog.gender = in.next();
                        System.out.print("是否注射过狂犬病疫苗：");
                        dog.isVaccineInjected = in.nextBoolean();
                        list1.add(dog);
                    }
                    break;
                case 3:
                    Rabbit rabbit = new Rabbit();
                    if ((balance - rabbit.price) < 0)
                        throw new InsufficientBalanceException("您的余额不足，无法购买！");
                    else {
                        balance -= rabbit.price;
                        System.out.print("名字：");
                        rabbit.name = in.next();
                        System.out.print("年龄：");
                        rabbit.age = in.nextInt();
                        System.out.print("性别：");
                        rabbit.gender = in.next();
                        list1.add(rabbit);
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.print("您输入的编号有误，请重新输入：");
            }
        }
    }

    @Override
    public void entertainCustomers(ArrayList<Customer> list2) throws AnimalNotFountException {
        Customer customer = new Customer();
        list2.add(customer);
        customer.arrivalTimes++;
        customer.newestTime = LocalDate.now();
        System.out.print("客户想购买哪只动物：");
        String animalName = in.next();
        //标记动物是否存在
        boolean flag = false;
        for (Animal a : list1) {
            if (a.name.equals(animalName)) {
                System.out.println(a.toString());
                System.out.print("请输入本次卖出的价格：");
                a.sellPrice = in.nextInt();
                //把钱入账
                balance += a.sellPrice;
                flag = true;
                //将动物移出列表
                list2.remove(a);
                break;
            }
        }
        if (!flag)
            throw new AnimalNotFountException("店内不存在这只动物！");
    }

    @Override
    public void closeShop(ArrayList<Customer> list2) {
        LocalDateTime currentTime = LocalDateTime.now();
        int hour = currentTime.getHour();
        if (hour > 22 || hour < 9) {
            isOpen = false;
        } else isOpen = true;
        if (isOpen)
            System.out.println("未到歇业时间，商店还在营业中！");
        else {
            //标记今天是否有顾客
            boolean flag = false;
            double profit = 0;
            //输出客户信息
            System.out.println("今天光顾的客户的信息如下：");
            for (Customer c : list2) {
                if (c.newestTime.getDayOfYear() == currentTime.getDayOfYear()) {
                    System.out.println(c.toString());
                    //计算利润
                    profit += balance - initialAmount;
                }
            }
            if (!flag) {
                System.out.println("今天没有顾客！");
            } else System.out.println("今天的利润为：" + profit + "元");
        }
    }

    @Override
    public void showAllPets(ArrayList<Animal> list1) {
        if (list1.size() == 0) {
            System.out.println("您的宠物商店目前没有宠物!");
        } else for (Animal pet : list1) {
            System.out.println(pet.toString());
        }
    }

    public void findAnimal(String name, ArrayList<Animal> list1) {
        //标记动物是否存在
        boolean flag = false;
        for (Animal pet : list1) {
            if (pet.name.equals(name)) {
                System.out.println(pet.toString());
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("店内不存在这只宠物!");
        }
    }
}
