package chenthuran.dharmapalan.s301077615.ui.home;
//Chenthuran Dharmapalan, Student Number: 301077615, Section: 002

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;


public class DharmapalanViewModel extends ViewModel {

   private MutableLiveData<String> mText;

   public DharmapalanViewModel() {
      mText = new MutableLiveData<>();
      mText.setValue("This is home fragment");
   }

   public LiveData<String> getText() {
      return mText;
   }
}