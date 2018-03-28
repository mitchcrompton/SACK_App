package com.example.groupb.sack_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
    }

    public void toParents(View view) {
        Intent intent = new Intent(this, ParentsActivity.class);
        startActivity(intent);
    }

    public void toSiblings(View view) {
        Intent intent = new Intent(this, SiblingsActivity.class);
        startActivity(intent);
    }

    public void toExtendedFamily(View view) {
        Intent intent = new Intent(this, ExtendedFamilyActivity.class);
        startActivity(intent);
    }

    //Nav Bar Methods
    public void toResources(View view) {
        Intent intent = new Intent( this, ResourcesActivity.class);
        startActivity(intent);
    }
    public void toHome(View view) {
        Intent intent = new Intent( this, HomeScreenActivity.class);
        startActivity(intent);
    }
    public void toContact(View view) {
        Intent intent = new Intent( this, ContactActivity.class);
        startActivity(intent);
    }
}
