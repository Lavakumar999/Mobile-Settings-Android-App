package com.example.lavakumar.os_operation;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        ListView lstviewsettings = (ListView)findViewById(R.id.lstSettings);
        final String[] settingsString ={"Internal Storage","Bluetooth","Airplane mode","Wifi","Data Roaming","Data Settings","Application Details","Privacy Settings","Security Settings","Locale Settings","Location settings","MemoryCard Settings","Application Development","DeviceInfo settings","Dispaly settings","Manage Applications","Search settings","Sharing Settings","Network Settings"};
        ArrayAdapter<String> arraySettings = new
                ArrayAdapter<String>(settings.this,android.R.layout.simple_list_item_1,settingsString);
        lstviewsettings.setAdapter(arraySettings);
        lstviewsettings.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                switch (position) {
                    case 0:
                        Toast.makeText(settings.this, settingsString[position] + " isClicked", Toast.LENGTH_SHORT).show();
                        Intent internal = new Intent();
                        internal.setAction(android.provider.Settings.ACTION_INTERNAL_STORAGE_SETTINGS);
                        startActivity(internal);
                        break;
                    case 1:
                        Toast.makeText(settings.this, settingsString[position] + " isClicked", Toast.LENGTH_SHORT).show();
                        Intent Bluetooth = new Intent();
                        Bluetooth.setAction(android.provider.Settings.ACTION_BLUETOOTH_SETTINGS);
                        startActivity(Bluetooth);
                        break;
                    case 3:
                        Toast.makeText(settings.this, settingsString[position] + " isClicked", Toast.LENGTH_SHORT).show();
                        Intent Airplane = new Intent();
                        Airplane.setAction(android.provider.Settings.ACTION_BLUETOOTH_SETTINGS);
                        startActivity(Airplane);
                        break;
                    case 4:
                        Toast.makeText(settings.this, settingsString[position] + " isClicked", Toast.LENGTH_SHORT).show();
                        Intent Wifi = new Intent();
                        Wifi.setAction(android.provider.Settings.ACTION_WIFI_IP_SETTINGS);
                        startActivity(Wifi);
                        break;
                    case 5:
                        Toast.makeText(settings.this, settingsString[position] + " isClicked", Toast.LENGTH_SHORT).show();
                        Intent DataRoaming = new Intent();
                        DataRoaming.setAction(android.provider.Settings.ACTION_DATA_ROAMING_SETTINGS);
                        startActivity(DataRoaming);
                        break;
                    case 6:
                        Toast.makeText(settings.this, settingsString[position] + " isClicked", Toast.LENGTH_SHORT).show();
                        Intent DataSettings = new Intent();
                        DataSettings.setAction(Settings.ACTION_DATE_SETTINGS);
                        startActivity(DataSettings);
                        break;
                    case 7:
                        Toast.makeText(settings.this, settingsString[position] + " isClicked", Toast.LENGTH_SHORT).show();
                        Intent Application = new Intent();
                        Application.setAction(android.provider.Settings.ACTION_APPLICATION_SETTINGS);
                        startActivity(Application);
                        break;
                    case 8:
                        Toast.makeText(settings.this, settingsString[position] + " isClicked", Toast.LENGTH_SHORT).show();
                        Intent Privacy = new Intent();
                        Privacy.setAction(android.provider.Settings.ACTION_PRIVACY_SETTINGS);
                        startActivity(Privacy);
                        break;
                    case 9:
                        Toast.makeText(settings.this, settingsString[position] + " isClicked", Toast.LENGTH_SHORT).show();
                        Intent Security = new Intent();
                        Security.setAction(android.provider.Settings.ACTION_PRIVACY_SETTINGS);
                        startActivity(Security);
                        break;
                    case 10:
                        Toast.makeText(settings.this, settingsString[position] + " isClicked", Toast.LENGTH_SHORT).show();
                        Intent Locale = new Intent();
                        Locale.setAction(android.provider.Settings.ACTION_LOCALE_SETTINGS);
                        startActivity(Locale);
                        break;
                    case 11:
                        Toast.makeText(settings.this, settingsString[position] + " isClicked", Toast.LENGTH_SHORT).show();
                        Intent Location = new Intent();
                        Location.setAction(android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                        startActivity(Location);
                        break;
                    case 12:
                        Toast.makeText(settings.this, settingsString[position] + " isClicked", Toast.LENGTH_SHORT).show();
                        Intent MemoryCard = new Intent();
                        MemoryCard.setAction(android.provider.Settings.ACTION_MEMORY_CARD_SETTINGS);
                        startActivity(MemoryCard);
                        break;
                    case 13:
                        Toast.makeText(settings.this, settingsString[position] + " isClicked", Toast.LENGTH_SHORT).show();
                        Intent ApplicationDevelop = new Intent();
                        ApplicationDevelop.setAction(android.provider.Settings.ACTION_APPLICATION_DEVELOPMENT_SETTINGS);
                        startActivity(ApplicationDevelop);
                        break;
                    case 14:
                        Toast.makeText(settings.this, settingsString[position] + " isClicked", Toast.LENGTH_SHORT).show();
                        Intent DeviceInfo = new Intent();
                        DeviceInfo.setAction(android.provider.Settings.ACTION_DEVICE_INFO_SETTINGS);
                        startActivity(DeviceInfo);
                        break;
                    case 15:
                        Toast.makeText(settings.this, settingsString[position] + " isClicked", Toast.LENGTH_SHORT).show();
                        Intent Dispaly = new Intent();
                        Dispaly.setAction(android.provider.Settings.ACTION_DISPLAY_SETTINGS);
                        startActivity(Dispaly);
                        break;
                    case 16:
                        Toast.makeText(settings.this, settingsString[position] + " isClicked", Toast.LENGTH_SHORT).show();
                        Intent Manage = new Intent();
                        Manage.setAction(android.provider.Settings.ACTION_MANAGE_APPLICATIONS_SETTINGS);
                        startActivity(Manage);
                        break;
                    case 17:
                        Toast.makeText(settings.this, settingsString[position] + " isClicked", Toast.LENGTH_SHORT).show();
                        Intent Search = new Intent();
                        Search.setAction(android.provider.Settings.ACTION_SEARCH_SETTINGS);
                        startActivity(Search);
                        break;
                    case 18:
                        Toast.makeText(settings.this, settingsString[position] + " isClicked", Toast.LENGTH_SHORT).show();
                        Intent Sharing = new Intent();
                        Sharing.setAction(android.provider.Settings.ACTION_NFCSHARING_SETTINGS);
                        startActivity(Sharing);
                        break;
                    case 19:
                        Toast.makeText(settings.this, settingsString[position] + " isClicked", Toast.LENGTH_SHORT).show();
                        Intent network = new Intent();
                        network.setAction(android.provider.Settings.ACTION_NETWORK_OPERATOR_SETTINGS);
                        startActivity(network);
                        break;
                }
            }
        });
    }
}
