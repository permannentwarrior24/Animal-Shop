package src;

import java.time.LocalDateTime;
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
        list1.add(new Pet("小白", 1, "F", "狗", 100, 200));
        list1.add(new Pet("张三", 2, "M", "猫", 200, 400));
        list1.add(new Pet("小小", 3, "F", "狗", 900, 876));
        LocalDateTime currentTime = LocalDateTime.now();
        int hour = currentTime.getHour();
        if (hour > 22 || hour < 9) {
            shop.closeShop(list2);
        }
        while (true) {
            System.out.printf("请选择要执行的操作:\n1.查看所有宠物 2. 0.退出");
            int option = in.nextInt();
            switch (option) {//分支选择要进行的操作
                case 1:
                    petBiz.showAllPets(pets);//查看所有宠物信息
                    break;
                case 2:
                    System.out.print("请输入要查找的宠物名字:");
                    String name = input.next();
                    petBiz.findPetByName(name, pets);//按名字查找宠物
                    break;
                case 3:
                    System.out.print("请输入要删除的宠物的名字:");
                    String name1 = input.next();
                    petBiz.deletePetByName(name1, pets, pets1);//按名字删除宠物
                    break;
                case 4:
                    Pet pet = petBiz.petInformation();//添加宠物信息
                    pets.add(pet);//将传递的宠物信息添加到集合中
                    System.out.println("添加成功!!");//输出提示信息
                    break;
                case 5:
                    System.out.print("请输入要修改的宠物名字:");
                    String name2 = input.next();//录入需要修改的宠物信息
                    petBiz.updatePets(name2, pets);//调用修改宠物信息的方法，传递参数为录入的宠物姓名
                    break;
                case 6:
                    petBiz.sortByInprice(pets);//调用按进价排序的方法
                    petBiz.showAllPets(pets);//将排序后的集合输出
                    break;
                case 7:
                    petBiz.sortByOutPrice(pets);
                    petBiz.showAllPets(pets);
                    break;
                case 8:
                    petBiz.sortByProfit(pets);
                    petBiz.showAllPets(pets);
                    break;
                case 9:
                    petBiz.findDeletePets(pets1);//查看已经删除的数据信息
                    break;
                case 0:
                    System.out.println("再见,欢迎再次使用宠物店管理系统!");
                    System.exit(0);
                default:
                    System.out.println("您输入的选项有误，请重新输入：");
            }
        }
    }
}
