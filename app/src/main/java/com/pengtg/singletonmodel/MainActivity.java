package com.pengtg.singletonmodel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.pengtg.singletonmodel.utils.CommonLog;
import com.pengtg.singletonmodel.utils.LogFactory;

public class MainActivity extends AppCompatActivity {


    private Button testSingleton = null;
    DoubleCheckLockSingleton doubleCheckLockSingleton = null;
    StaticInnerClassSingleton staticInnerClassSingleton = null;
    EnumSingleton enumSingleton = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testSingleton = (Button)findViewById(R.id.test_singleton);
        doubleCheckLockSingleton = (DoubleCheckLockSingleton)SingletonManager.getService(SingletonManager.DCLSINGLETON);
        staticInnerClassSingleton = (StaticInnerClassSingleton)SingletonManager.getService(SingletonManager.SICSINGLETON);
        enumSingleton = (EnumSingleton)SingletonManager.getService(SingletonManager.ENUMSINGLETON);

        testSingleton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doubleCheckLockSingleton.print();
                staticInnerClassSingleton.print();
                enumSingleton.print();
            }
        });
    }
}
