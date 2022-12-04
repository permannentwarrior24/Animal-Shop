package src;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 112200338周嘉裕
 * @date 2022/11/13
 */
public class Test {
    public static void main(String[] args) {
        MyAnimalShop shop = new MyAnimalShop();
        System.out.println("欢迎使用宠物店管理系统！");
        Scanner in = new Scanner(System.in);
        ArrayList<Animal> list1 = new ArrayList<>();
        ArrayList<Customer> list2 = new ArrayList<>();
        list1.add(new ChineseRuralDog("小黑", 1, "F", 100, true));
        list1.add(new Cat("小黄", 2, "M", 200));
        list1.add(new Rabbit("小白", 3, "F", 50));

        while (true) {
            System.out.print("\n可操作的选项如下:\n" +
                    "1.查看商店内所有宠物的信息\n" +
                    "2.买入新动物\n" +
                    "3.招待顾客\n" +
                    "4.歇业，查看今日的顾客信息和利润\n" +
                    "5.按名字查找指定宠物的信息\n" +
                    "6.输入一天开始时拥有的金额\n" +
                    "7.按其他任意键退出系统\n");
            System.out.print("请键入功能编号对学生信息进行管理:");
            int option = in.nextInt();
            switch (option) {
                case 1:
                    //查看所有宠物的信息
                    shop.showAllPets(list1);
                    break;
                case 2:
                    //买入新动物
                    shop.buyAnimals(list1);
                    break;
                case 3:
                    //招待顾客
                    shop.entertainCustomers(list2);
                    break;
                case 4:
                    //歇业，查看今日的顾客信息和利润
                    shop.closeShop(list2);
                    break;
                case 5:
                    System.out.print("请输入要查找的宠物的名字:");
                    String name = in.next();
                    shop.findAnimal(name, list1);//按名字查找宠物
                    break;
                case 6:
                    System.out.print("请输入金额：");
                    shop.initialAmount = in.nextDouble();
                    shop.balance = shop.initialAmount;
                    break;
                case 7:
                    System.out.println("再见,欢迎再次使用宠物店管理系统!");
                    System.exit(0);//退出系统
                default:
                    System.out.print("您输入的编号有误，请重新输入：");
            }
        }
    }
}
