package tdc.edu.vn.myapplication.DataBase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {



    //CSDL
    public DBHelper( Context context) {
        super(context, "QLThietBi", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql="create table ThietBi(matb text, tentb text)";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
