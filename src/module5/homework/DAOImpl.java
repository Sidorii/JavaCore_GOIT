package module5.homework;

import java.util.HashMap;

import java.util.Map;


/**
 * Created by Иван on 16.11.2016.
 */
public class DAOImpl implements DAO{

    private Map<Long,Room> rooms;

    public DAOImpl(){
        rooms = new HashMap<>();
    }

    @Override
    public Room save(Room room) {
        System.out.println(room + " id saved into DB");
        rooms.put(room.getId(),room);
        return room;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println(room + " deleted from DB");
        rooms.remove(room.getId(),room);
        return true;
    }

    @Override
    public Room update(Room room) {
        System.out.println("Information about " + room + " is updt.");
        rooms.replace(room.getId(),room);
        return room;
    }

    @Override
    public Room findByID(long id) {
        System.out.println("Search room by id...");
        return rooms.get(id);
    }

    @Override
    public Room[] getAll() {
        return rooms.values().toArray(new Room[rooms.size()]);
    }
}