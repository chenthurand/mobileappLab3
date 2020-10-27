package chenthuran.dharmapalan.s301077615.ui.dashboard;
//Chenthuran Dharmapalan, Student Number: 301077615, Section: 002
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import chenthuran.dharmapalan.s301077615.R;

public class ChenthuranFragment extends Fragment {

    private ChenthuranViewModel ChenthuranViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ChenthuranViewModel =
                ViewModelProviders.of(this).get(ChenthuranViewModel.class);
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);
        final TextView textView = root.findViewById(R.id.text_dashboard);
        ChenthuranViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}