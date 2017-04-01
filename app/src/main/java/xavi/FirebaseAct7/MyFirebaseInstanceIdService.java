package xavi.FirebaseAct7;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

import static android.content.ContentValues.TAG;

/**
 * Created by Xavi on 28/3/17.
 */

public class MyFirebaseInstanceIdService extends FirebaseInstanceIdService{

    @Override
    public void onTokenRefresh(){
        String refreshtoken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG,"Refreshed token: "+ refreshtoken);

        sendRegistrationToServer(refreshtoken);
    }

    private void sendRegistrationToServer(String refreshtoken) {

    }

}
