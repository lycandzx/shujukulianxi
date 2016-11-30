package newcustom.edu.feicui.com.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import DBInFo.DbInfo;

/**
 * Created by lenovo on 2016/11/27.
 */

public class Sqlhelper extends SQLiteOpenHelper {
    public Sqlhelper(Context context) {

        super(context, DbInfo.DB_NAME,null,DbInfo.DB_VERSON);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql="create table student(_name Verchar(10),_age Integer,_height Verchar(10))";
        db.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
