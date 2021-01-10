package dilshod.iskandarov.room_database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import static androidx.room.OnConflictStrategy.REPLACE;
@Dao
public interface MainDao {
    // Insert query
    @Insert(onConflict = REPLACE)
    void insert(MainData mainData);

    // Delete query
    @Delete
    void delete(MainData mainData);

    // Delete all query
    @Delete
    void reset(List<MainData> mainData);

    // Update Query
    @Query("UPDATE table_Name SET text = :sText WHERE ID = :sID")
    void update(int sID, String sText);

    // Get all query
    @Query("SELECT  * FROM table_Name")
    List<MainData> getAll();

}
