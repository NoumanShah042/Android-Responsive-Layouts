package org.haqnawaz.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button submit ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(R.layout.layout_constraint);

        submit= findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Toast", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

/*

https://www.youtube.com/watch?v=xFkZE7hpjPs

* key Points for responsive layouts
* 1) we should test our app on different screen sizes ( dpi , ldpi , mdpi )
* 2) make layout for other screen sizes
* 3) test app in landscape mode
* 4) create landscape variation
*
* 5) if we change id of view in any screen file or landscape file it will be
*     reflected in all files
* 6) properties other than id may be changed
* 7) data will be saved while running app if we change variation from portrait to landscape or vise versa
*
*
*
*
*
* */