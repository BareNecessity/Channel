package com.example.materialdesign;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class CassavaFarms extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cassava_farms);
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(getString(R.string.app_name));
        toolbar.setNavigationIcon(R.drawable.ic_baseline_arrow_back_24);

        Toolbar barChart = findViewById(R.id.barChart);
        barChart.setTitle("35% ROI in 7 months");
        barChart.setNavigationIcon(R.drawable.ic_baseline_multiline_chart_24);

        Toolbar wallet = findViewById(R.id.wallet);
        wallet.setTitle("#50,000");
        wallet.setNavigationIcon(R.drawable.ic_baseline_account_balance_wallet);

        Toolbar locator = findViewById(R.id.location);
        locator.setTitle("Oyo");
       locator.setNavigationIcon(R.drawable.ic_baseline_location_on);




    }
}