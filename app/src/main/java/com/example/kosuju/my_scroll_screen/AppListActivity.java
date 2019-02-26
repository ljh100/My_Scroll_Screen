package com.example.kosuju.my_scroll_screen;

import java.util.List;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class AppListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_list);

        //list 가져옴
        ListView listview = (ListView) findViewById(R.id.list_view);
        PackageManager pm = getPackageManager();

        List<ApplicationInfo> infos = pm.getInstalledApplications(PackageManager.GET_META_DATA);



    }
}
