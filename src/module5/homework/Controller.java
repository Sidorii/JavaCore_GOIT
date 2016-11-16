package module5.homework;


import java.util.HashSet;


/**
 * Created by Иван on 16.11.2016.
 */
public class Controller implements DAO {

    private API apis[];
    private DAOImpl db;

    @Override
    public Room save(Room room) {
        return db.save(room);
    }

    @Override
    public boolean delete(Room room) {
        return db.delete(room);
    }

    @Override
    public Room update(Room room) {
        return db.update(room);
    }

    @Override
    public Room findByID(long id) {
        return db.findByID(id);
    }

    @Override
    public Room[] getAll() {
        return db.getAll();
    }

    Controller(){
        apis = new API[3];
        db = new DAOImpl();
        apis[0] = new BookingComAPI();
        apis[1] = new GoogleAPI();
        apis[2] = new TripAdvisorAPI();
    }

    Room[] requestRooms(int price, int persons, String city, String hotel){

        Room[] rooms = new Room[0];

        for(API entity:apis){
            rooms = concatArrays(rooms,entity.findRooms(price,persons,city,hotel));
        }

        for (Room room: rooms){
            db.save(room);
        }
        return rooms;
    }

    private Room[] concatArrays(Room[] array1, Room[]array2){

        Room resultArray[] = new Room[array1.length + array2.length];
        int i = 0;

        for (Room o: array1){
            resultArray[i++] = o;
        }

        for(Room o: array2){
            resultArray[i++] = o;
        }

        return resultArray;
    }

    public Room[] check(API api1, API api2){

        Room room;
        int number = 0;
        HashSet<Room> resultList = new HashSet<>();
        Room[] api1Rooms,api2Rooms;


        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            room = db.findByID(i);

            if (room == null)
                break;

            api1Rooms = api1.findRooms(room.getPrice(),room.getPersons(),room.getCityName(),room.getHotelName());

            api2Rooms = api2.findRooms(room.getPrice(),room.getPersons(),room.getCityName(),room.getHotelName());


            for (int j = 0; j < api1Rooms.length;j++){

                for(int k = 0; k < api2Rooms.length;k++)
                    if (api1Rooms[j].equals(api2Rooms[k]))
                        resultList.add(api1Rooms[j]);
            }
        }

        return resultList.toArray(new Room[resultList.size()]);
    }

    public API[] getApis() {
        return apis;
    }
}
