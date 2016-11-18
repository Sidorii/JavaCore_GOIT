package module6.HW;

import java.util.ArrayList;

public class UserUtil {


    public static User[] uniqueUsers(User[] users){

        users = deleteEmptyUsers(users);

        User usersResult[] = new User[users.length];
        boolean isEquals = false;

        for(int i = 0; i < users.length;i++){
            for (int j = 0; j < usersResult.length;j++)
                if (users[i].equals(usersResult[j])) {
                    isEquals = true;
                    break;
                }

            if(!isEquals)
                usersResult[i] = users[i];
        }



        return deleteEmptyUsers(usersResult) ;
    }


    public static User[] usersWithConditionalBalance(User[] users, int balance){
        users = deleteEmptyUsers(users);

        User[] result = new User[users.length];

        for(int i = 0; i < users.length;i++)
            if(users[i].getBalance() == balance)
                result[i] = users[i];

        return deleteEmptyUsers(result);
    }


    public static final User[] paySalaryToUsers(User[] users){
        users = deleteEmptyUsers(users);
        for(User user:users)
            user.setBalance(user.getBalance() + user.getSalary());

        return users;
    }

    public static final Long[] getUsersId(User[] users){
        users = deleteEmptyUsers(users);
        Long ids[] = new Long[users.length];

        for(int i = 0; i < users.length;i++)
            ids[i] = users[i].getId();

        return ids;
    }


    public static User[] deleteEmptyUsers(User[] users){

        ArrayList<User> usersResult = new ArrayList<>();

        for(User user:users)
            if (user != null)
                usersResult.add(user);

        return usersResult.toArray(new User[usersResult.size()]);
    }

}
