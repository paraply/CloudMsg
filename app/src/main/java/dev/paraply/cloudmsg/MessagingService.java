package dev.paraply.cloudmsg;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MessagingService extends FirebaseMessagingService {

  @Override
  public void onMessageReceived(RemoteMessage remoteMessage) {
    Log.d("!!!", "FROM:" + remoteMessage.getFrom());

    if (remoteMessage.getData().size() > 0) {
      Log.d("!!!", remoteMessage.getData().toString());
    }
  }

  @Override
  public void onNewToken(String token) {
    Log.d("!!!", "New token: " + token);
  }

  @Override
  public void onDeletedMessages() {
    Log.d("!!!", "Deleted messages");
  }
}
