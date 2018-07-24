package br.com.searchtag.iotframework.iotframework;

import android.content.Context;
import android.os.Handler;

import java.util.List;

import javax.security.auth.callback.Callback;

public interface IoTFrameworkInterface {

    void init(Context context);

    Object login(String login, String password);
    Object logout();

    Boolean createDocument(String databaseName);
    Boolean addObject(String databaseName, Object object);
    List getObjectsForDocument(String databaseName, Callback callback);
    List getObjectsWithQuery(String databaseName, String query, Callback callback);

    Object getGeoData(Callback callback);
    Object getGeoLocation(Callback callback);

    Object logEvent(Integer event, String text, Object object);

    void subscribeTopic(String topic);
    Object onNotificationReceived(Callback callback);

}
