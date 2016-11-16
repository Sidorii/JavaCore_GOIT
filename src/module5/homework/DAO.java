package module5.homework;

/**
 * Created by Иван on 16.11.2016.
 */
public interface DAO {


    Room save(Room room);
    boolean delete(Room room);
    Room update(Room room);
    Room findByID(long id);
    Room[] getAll();
}
