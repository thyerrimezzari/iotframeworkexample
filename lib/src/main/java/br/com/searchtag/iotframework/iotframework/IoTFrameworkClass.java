package br.com.searchtag.iotframework.iotframework;

import android.content.Context;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.List;

import javax.security.auth.callback.Callback;

/**
 * Created by thyerrimezzari on 15/07/2018.
 */

public class IoTFrameworkClass implements IoTFrameworkInterface{

    @Override
    public Boolean addObject(String databaseName, Object object) {
        DatabaseReference mDatabase;
        mDatabase = FirebaseDatabase.getInstance().getReference();
        mDatabase.child(databaseName).setValue(object);
        return true;
    }
    
    @Override
    public Object login(String login, String password) {
        return null;
    }

    @Override
    public void init(Context context) {

    }

    @Override
    public Object logout() {
        return null;
    }

    @Override
    public Boolean createDocument(String databaseName) {
        return null;
    }



    @Override
    public List getObjectsForDocument(String databaseName, Callback callback) {
        return null;
    }

    @Override
    public List getObjectsWithQuery(String databaseName, String query, Callback callback) {
        return null;
    }

    @Override
    public Object getGeoData(Callback callback) {
        return null;
    }

    @Override
    public Object getGeoLocation(Callback callback) {
        return null;
    }

    @Override
    public Object logEvent(Integer event, String text, Object object) {
        return null;
    }

    @Override
    public void subscribeTopic(String topic) {

    }

    @Override
    public Object onNotificationReceived(Callback callback) {
        return null;
    }
}
