package chenthuran.dharmapalan.s301077615.ui.notifications;
//Chenthuran Dharmapalan, Student Number: 301077615, Section: 002
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class S301077615ViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public S301077615ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is notifications fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}