package com.example.asd;

import static com.example.asd.TaskListFragment.TaskHolder.KEY_EXTRA_TASK_ID;;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import java.util.UUID;

public class MainActivity extends SingleFragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected Fragment createFragment()
    {
        /*FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragment = fragmentManager.findFragmentById(R.id.fragment_container);

        if (fragment == null)
        {
            fragment = new TaskFragment();
            fragmentManager.beginTransaction().add(R.id.fragment_container, fragment).commit();
        }
        return fragment;*/

        UUID taskId = (UUID) getIntent().getSerializableExtra(KEY_EXTRA_TASK_ID);
        return TaskFragment.newInstance(taskId);
    }
}