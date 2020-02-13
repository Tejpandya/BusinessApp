package com.app.businessapp.Database;



import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "library")
public class Library {

    public void setId(int id) {
        this.id = id;
    }

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "User_Id")
    private String User_Id;

    @ColumnInfo(name = "Library_Id")
    private String Library_Id;

    @ColumnInfo(name = "Title")
    private String Title;

    @ColumnInfo(name = "Library_Module")
    private String Library_Module;


    public int getId() {
        return id;
    }


    public String getUser_Id() {
        return User_Id;
    }

    public void setUser_Id(String user_Id) {
        User_Id = user_Id;
    }

    public String getLibrary_Id() {
        return Library_Id;
    }

    public void setLibrary_Id(String library_Id) {
        Library_Id = library_Id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getLibrary_Module() {
        return Library_Module;
    }

    public void setLibrary_Module(String library_Module) {
        Library_Module = library_Module;
    }

    @Override
    public String toString() {
      return  "\"Library_Id\":\""+getLibrary_Id()+"\",\"Title\":\""+getTitle()+"\", \"Library_Module\":"+getLibrary_Module();

    }
}
