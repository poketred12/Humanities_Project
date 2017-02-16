package com.localhost.jooyeon.humanities_project;

import android.app.TabActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class StudyActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_study);
        TabHost th = getTabHost();
        TabHost.TabSpec ts1 = th.newTabSpec("단어 맞추기").setContent(R.id.tab1);
        th.addTab(ts1);

        TabHost.TabSpec ts2 = th.newTabSpec("숫자 맞추기").setContent(R.id.tab2);
        th.addTab(ts2);

        TabHost.TabSpec ts3 = th.newTabSpec("색깔 맞추기").setContent(R.id.tab3);
        th.addTab(ts3);
    }
}
