package com.pacman.EmoCare.ui.helpline;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.pacman.EmoCare.R;
import com.pacman.EmoCare.ui.home.MainActivity;

import android.os.Bundle;

public class helplineActivity extends MainActivity {

    private static final int REQUEST_CALL = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FrameLayout contentFrameLayout = findViewById(R.id.frag_container);
        getLayoutInflater().inflate(R.layout.activity_helpline, contentFrameLayout);

        findViewById(R.id.kidsHelpCall).setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                call("tel:1-800-662-4357");
            }
        });

        findViewById(R.id.kidsHelpVisit).setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                visit("https://findtreatment.gov/");
            }
        });



        findViewById(R.id.safeHavenCall).setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                call("tel:202-307-6027");
            }
        });

        findViewById(R.id.safeHavenVisit).setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                visit("https://www.usa.gov/agencies/office-on-violence-against-women");
            }
        });



        findViewById(R.id.transLifelineCall).setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                call("tel:877-565-8860");
            }
        });

        findViewById(R.id.transLifelineVisit).setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                visit("https://translifeline.org/contact/");
            }
        });



        findViewById(R.id.chimoHelpCall).setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                call("tel:1-800-969-6642");
            }
        });

        findViewById(R.id.chimoHelpVisit).setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                visit("https://mhanational.org/issues/state-mental-health-america");
            }
        });



        findViewById(R.id.someOtherCall).setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                call("tel:800-950-6264");
            }
        });

        findViewById(R.id.someOtherVisit).setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                visit("https://www.nami.org/help");
            }
        });


        findViewById(R.id.crisisServicesCall).setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                call("tel:1-800-273-8255");
            }
        });

        findViewById(R.id.crisisServicesVisit).setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                visit("https://988lifeline.org/our-crisis-centers/");
            }
        });



        findViewById(R.id.hopeForWellnessCall).setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                call("tel:1-866-745-0805");
            }
        });

        findViewById(R.id.hopeForWellnessVisit).setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                visit("https://americanaddictioncenters.org/");
            }
        });

        findViewById(R.id.drugRehabCall).setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                call("tel:988");
            }
        });

        findViewById(R.id.drugRehabVisit).setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                visit("https://www.veteranscrisisline.net/");
            }
        });
    }





    public void call(String phone) {
        if (ContextCompat.checkSelfPermission(helplineActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(helplineActivity.this, new String[] {Manifest.permission.CALL_PHONE}, REQUEST_CALL);
        }

        else {
            Intent callIntent = new Intent(Intent.ACTION_CALL);
            callIntent.setData(Uri.parse(phone));
            startActivity(callIntent);
        }
    }

    public void visit(String website) {

        Intent viewIntent = new Intent(Intent.ACTION_VIEW);
        viewIntent.setData(Uri.parse(website));
        startActivity(viewIntent);
    }
}
