package module5.homework;

import java.util.Date;

/**
 * Created by Иван on 16.11.2016.
 */
public class BookingComAPI  implements API{

    private Room[]rooms;

    public BookingComAPI(){
        rooms = new Room[5];

        for(int i = 0; i < rooms.length;i++){
            rooms[i] = new Room(i,100+i*5- i*2,i+2,new Date(),"Hilary","Kiev");
        }
        rooms[0] = new Room(0,0,0,new Date(),"Hilary","Kiev");
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {

        Room requestRoom = new Room(0,price,persons,new Date(),hotel,city);
        Room[] buffRooms = new Room[rooms.length];
        int i = 0;

        for(Room r:rooms){
            if(requestRoom.equals(r))
                buffRooms[i++] = r;
        }

        Room[] result = new Room[i];

        for(i = 0; i < result.length;i++){
            result[i] = buffRooms[i++];
        }

        return result;
    }

}
