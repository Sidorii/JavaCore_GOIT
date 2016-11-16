package module5.homework;

import java.util.Arrays;

/**
 * Created by Иван on 16.11.2016.
 */
public class Main {

    public static void main(String[] args) {

        Controller controller = new Controller();

        controller.requestRooms(112,5,"Kiev","Hilary");
        controller.requestRooms(115,7,"Kiev","Hilary");
        controller.requestRooms(103,2,"Kiev","Hostel19");
        controller.requestRooms(0,0,"Kiev","Hilary");


        API[] apis = controller.getApis();


        System.out.println(Arrays.deepToString(controller.check(apis[0],apis[1])));
        System.out.println(Arrays.deepToString(controller.check(apis[2],apis[1])));
        System.out.println(Arrays.deepToString(controller.check(apis[0],apis[2])));
    }
}
