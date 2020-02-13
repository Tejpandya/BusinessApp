package com.app.businessapp.Database;



import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface LibraryDao {

    @Insert
    void insertAll(Library libraries);

    @Query("SELECT * FROM library WHERE User_Id= :user_id")
    List<Library> getAllLibraryData(String user_id);


    @Query("SELECT * FROM library WHERE Title = :title AND User_Id= :user_id")
    Library getSingleLibraryData(String title, String user_id);






}
