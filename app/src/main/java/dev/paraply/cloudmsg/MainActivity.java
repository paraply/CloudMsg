package dev.paraply.cloudmsg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;

import static com.google.common.base.MoreObjects.firstNonNull;

public class MainActivity extends AppCompatActivity {

  private String mFCMToken;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    mFCMToken = FirebaseInstanceId.getInstance().getToken();
    Log.d("!!!",  firstNonNull(mFCMToken, ""));
  }
}
