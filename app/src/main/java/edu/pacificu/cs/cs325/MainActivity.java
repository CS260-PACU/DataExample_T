package edu.pacificu.cs.cs325;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ArrayList<Course> cCourseList = new ArrayList<>();
        buildCourseList(cCourseList);

    }

    private void buildCourseList(ArrayList<Course> cList)
    {
        cList.add(new Course("CS", 150));
        cList.add(new Course("CS", 250));
        cList.add(new Course("CS", 200));
        cList.add(new Course("CS", 300));
        cList.add(new Course("CS", 325));
        cList.add(new Course("CS", 445));
        cList.add(new Course("CS", 460));
        cList.add(new Course("MATH", 226));
    }
}