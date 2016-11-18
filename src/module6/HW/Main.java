package module6.HW;

import sun.plugin.javascript.navig.Array;

import java.util.Arrays;
import java.util.UUID;

/**
 * Created by Иван on 18.11.2016.
 */
public class Main {

    public static void main(String[] args) {

        User u1 = new User(001,"Jack","Sparrow",5000,18000);
        User u2 = new User(002,"Darth","Vader",100000,9999999);
        User u3 = new User(001,"Jack","Sparrow",5000,18000);

        User users[] = new User[]{u1,u2,u3,null};

        printArray(UserUtil.paySalaryToUsers(users));
        printArray(UserUtil.deleteEmptyUsers(users));
        printArray(UserUtil.uniqueUsers(users));
        printArray(UserUtil.usersWithConditionalBalance(users,u1.getBalance()));
        printArray(UserUtil.getUsersId(users));

    }

    private static void printArray(Object[]array){
        System.out.println(Arrays.deepToString(array));
    }
}
