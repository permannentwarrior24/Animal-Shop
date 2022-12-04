package src;

import java.time.LocalDate;

/**
 * @author 112200338周嘉裕
 * @date 2022/11/14
 */
public class Customer {
    String name;
    int arrivalTimes;
    LocalDate newestTime;

    @Override
    public String toString() {
        return "顾客名字："+name+"，到店次数："+arrivalTimes + "，最新到店时间："+newestTime;
    }
}
