package br.com.searchtag.iotframeworkexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.QuickContactBadge;

import javax.security.auth.callback.Callback;

import br.com.searchtag.iotframework.iotframework.IoTFrameworkClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final IoTFrameworkClass ioTFrameworkClass = new IoTFrameworkClass();

        Button buttonLogin = findViewById(R.id.button_login);
        Button buttonAddObject = findViewById(R.id.button_add_object);
        Button buttonGetGeo = findViewById(R.id.button_get_geo);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ioTFrameworkClass.login("teste","teste");
                ioTFrameworkClass.logEvent(1, "buttonLogin", null);
            }
        });

        ...

        buttonAddObject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ioTFrameworkClass.addObject("teste_database", new Object());
                ioTFrameworkClass.logEvent(1, "buttonAddObject", null);
            }
        });

        ...

        buttonGetGeo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ioTFrameworkClass.getGeoData(new Callback() {
                    // GeoData Recebido
                });
                ioTFrameworkClass.logEvent(1, "buttonGetGeo", null);
            }
        });

        ioTFrameworkClass.onNotificationReceived(new Callback() {
            // Notificação recebida
        });

    }
}
