package chenthuran.dharmapalan.s301077615.ui.dashboard;
//Chenthuran Dharmapalan, Student Number: 301077615, Section: 002

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import chenthuran.dharmapalan.s301077615.R;

public class ChenthuranFragment extends Fragment {

    private ChenthuranViewModel ChenthuranViewModel;
    int timeDuration;
    AnimationDrawable frameAnimation;
    ImageView image;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ChenthuranViewModel =
                ViewModelProviders.of(this).get(ChenthuranViewModel.class);
        final View root = inflater.inflate(R.layout.fragment_dashboard, container, false);
        image = (ImageView) root.findViewById(R.id.ImageView_Boy);
        Button start = root.findViewById(R.id.ButtonStart);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Spinner spinner = root.findViewById(R.id.chenthuran_frame_speed);
                TextView spinnerText = (TextView) spinner.getSelectedView();
                String text = spinnerText.getText().toString();
                switch (text)
                {
                    case "0.1 Sec" : timeDuration = 100;
                        break;
                    case "0.15 Sec" : timeDuration = 150;
                        break;
                    case "0.2 Sec" : timeDuration = 200;
                        break;
                    case "0.25 Sec" : timeDuration = 250;
                        break;
                    default:break;
                }
                startAnimation();
            }
        });
        Button stop = root.findViewById(R.id.ButtonStop);
        stop.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                stopAnimation();
            }
        });
        return root;
    }


    private void startAnimation()
    {
        BitmapDrawable frame1 = (BitmapDrawable)getResources().getDrawable(R.drawable.boyimage1);
        BitmapDrawable frame2 = (BitmapDrawable)getResources().getDrawable(R.drawable.boyimage2);
        BitmapDrawable frame3 = (BitmapDrawable)getResources().getDrawable(R.drawable.boyimage3);
        BitmapDrawable frame4 = (BitmapDrawable)getResources().getDrawable(R.drawable.boyimage4);
        BitmapDrawable frame5 = (BitmapDrawable)getResources().getDrawable(R.drawable.boyimage5);
        BitmapDrawable frame6 = (BitmapDrawable)getResources().getDrawable(R.drawable.boyimage6);
        BitmapDrawable frame7 = (BitmapDrawable)getResources().getDrawable(R.drawable.boyimage7);
        BitmapDrawable frame8 = (BitmapDrawable)getResources().getDrawable(R.drawable.boyimage8);

        frameAnimation = new AnimationDrawable();
        frameAnimation.setOneShot(false);
        frameAnimation.addFrame(frame1,timeDuration);
        frameAnimation.addFrame(frame2,timeDuration);
        frameAnimation.addFrame(frame3,timeDuration);
        frameAnimation.addFrame(frame4,timeDuration);
        frameAnimation.addFrame(frame5,timeDuration);
        frameAnimation.addFrame(frame6,timeDuration);
        frameAnimation.addFrame(frame7,timeDuration);
        frameAnimation.addFrame(frame8,timeDuration);

        image.setBackground(frameAnimation);

        frameAnimation.setVisible(true,true);
        frameAnimation.start();
    }
    private void stopAnimation()
    {
        frameAnimation.stop();
        frameAnimation.setVisible(false,false);
    }
}