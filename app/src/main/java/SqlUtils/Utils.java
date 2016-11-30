package SqlUtils;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import DBInFo.DbInfo;
import newcustom.edu.feicui.com.database.Sqlhelper;

/**
 * Created by lenovo on 2016/11/27.
 */

public class Utils {
  Sqlhelper sqlhelper;
   Context context;
    public Utils(Context context){
        this.context=context;
        sqlhelper=new Sqlhelper(context);
    }
    public void insert(){
        SQLiteDatabase database =sqlhelper.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put("_name","pp");
        values.put("_age",25);
        values.put("_height","180");
        database.insert(DbInfo.TABLE_NAME,null,values);

    }
public void update(){
    SQLiteDatabase database =sqlhelper.getWritableDatabase();
    ContentValues values=new ContentValues();
    values.put("_age",100);
    database.update(DbInfo.TABLE_NAME,values,"_name"+" = ?",new String[]{"pp"+""});
}
public void query(){
    SQLiteDatabase database =sqlhelper.getReadableDatabase();
//    Cursor cursor = database.query(DbInfo.TABLE_NAME, new String[]{"_name"}, "_name" + " = ?", new String[]{"pp" + ""}, null, null, null);
    Cursor cursor = database.query(DbInfo.TABLE_NAME,null,null,null,null,null,null);

    while (cursor.moveToNext()){
    String name=cursor.getString(cursor.getColumnIndex("_name"));
    int age=cursor.getInt(cursor.getColumnIndex("_age"));
    String height=cursor.getString(cursor.getColumnIndex("_height"));
    Log.e("---","name"+name+"age"+age+"height"+height);

}


}
}
