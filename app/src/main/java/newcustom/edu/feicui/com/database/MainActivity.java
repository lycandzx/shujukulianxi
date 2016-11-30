package newcustom.edu.feicui.com.database;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import SqlUtils.Utils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       Utils utils=new Utils(this);
//      utils.insert();
//        utils.update();
        utils.query();
    }
}
