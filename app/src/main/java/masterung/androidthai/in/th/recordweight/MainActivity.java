package masterung.androidthai.in.th.recordweight;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import masterung.androidthai.in.th.recordweight.utility.MyManager;

public class MainActivity extends AppCompatActivity {

    private MyManager myManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myManager = new MyManager(MainActivity.this);

//        Test Add User
        testAddUser();

//        DeleteUser


    }   // Main Method

    private void testAddUser() {
        myManager.addValueToUserTABLE("nick", "start",
                "weight", "height", "gender",
                "age");
    }

}   // Main Class
