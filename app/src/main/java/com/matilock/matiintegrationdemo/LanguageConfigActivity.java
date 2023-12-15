package com.matilock.matiintegrationdemo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.metamap.metamap_sdk.Metadata;
import com.metamap.metamap_sdk.MetamapButton;
import com.metamap.metamap_sdk.metadata.MetamapLanguage;
import com.metamap.metamap_sdk.metadata.UIConfig;

public class LanguageConfigActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metamap_button);

        MetamapButton btn = findViewById(R.id.metamapButton);

        btn.setParams(
                this,
                "YOUR_CLIENT_ID",
                "YOUR_FLOW_ID",
                new Metadata.Builder()
                        .uiConfig(new UIConfig(MetamapLanguage.SPANISH))
                        .build()
        );
    }
}
