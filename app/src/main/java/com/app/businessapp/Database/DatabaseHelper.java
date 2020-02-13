package com.app.businessapp.Database;

import android.app.Activity;
import android.content.Context;



import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

public class DatabaseHelper {
    Activity context;


    public DatabaseHelper(Activity context) {
        this.context = context;
    }




   /* public List<Library> getAllLibraryData() {
        return AppDatabase.getAppDatabase(context).libraryDao().getAllLibraryData(user_id);
    }


    public Library getSingleLibraryData(String title) {
        return AppDatabase.getAppDatabase(context).libraryDao().getSingleLibraryData(title, user_id);
    }


    public void replaceLibraryModule(String library_module , String  title){
        AppDatabase.getAppDatabase(context).libraryDao().replaceLibraryModule( library_module,title,user_id);
    }
*/

}
