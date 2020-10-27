package chenthuran.dharmapalan.s301077615.ui.home;
//Chenthuran Dharmapalan, Student Number: 301077615, Section: 002
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

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