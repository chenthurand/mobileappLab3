package chenthuran.dharmapalan.s301077615.ui.dashboard;
//Chenthuran Dharmapalan, Student Number: 301077615, Section: 002
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ChenthuranViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ChenthuranViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}