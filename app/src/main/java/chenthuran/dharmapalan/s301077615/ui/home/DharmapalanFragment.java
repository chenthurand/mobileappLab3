package chenthuran.dharmapalan.s301077615.ui.home;
//Chenthuran Dharmapalan, Student Number: 301077615, Section: 002
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.graphics.Color;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import chenthuran.dharmapalan.s301077615.R;

public class DharmapalanFragment extends Fragment {

    private DharmapalanViewModel DharmapalanViewModel;
    private DharmapalanCanvasView Canvas;
    Color selectedColor;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DharmapalanViewModel =
                ViewModelProviders.of(this).get(DharmapalanViewModel.class);
        final View root = inflater.inflate(R.layout.fragment_home, container, false);
        Canvas = (DharmapalanCanvasView) root.findViewById(R.id.canvas);
        Button buttonSelection = root.findViewById(R.id.pen_option);
        buttonSelection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Spinner colourSpinner = root.findViewById(R.id.chenthuran_pen_color);
                TextView colourSpinnerText = (TextView) colourSpinner.getSelectedView();
                Spinner sizeSpinner = root.findViewById(R.id.chenthuran_pen_size);
                TextView sizeSpinnerText = (TextView) sizeSpinner.getSelectedView();
                String color = colourSpinnerText.getText().toString();
                String thickness = sizeSpinnerText.getText().toString();
                Canvas.getSelectedOptions(thickness, color);
            }
        });

        Button clearOptions = root.findViewById(R.id.clear_option);
        clearOptions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Canvas.clearPath();

            }
        });

        DharmapalanViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
            }
        });
        return root;
    }
}