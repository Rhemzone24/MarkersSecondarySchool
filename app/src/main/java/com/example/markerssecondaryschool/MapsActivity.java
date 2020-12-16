package com.example.markerssecondaryschool;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    ArrayList<LatLng> arrayList= new ArrayList<>();
    LatLng Philippines = new LatLng(12.3300, 122.4880);
    LatLng Binmeckeg = new LatLng(16.22954, 120.48827);
    LatLng Salagusog = new LatLng(15.78196, 120.66500);
    LatLng SanFilepe = new LatLng(15.82441, 120.59860);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        arrayList.add(Philippines);

        arrayList.add(Binmeckeg);
        arrayList.add(Salagusog);
        arrayList.add(SanFilepe);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(16.22954, 120.48827);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Rhemz's Secondary School"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        //Salagusog National High School/ school of pauline
        Marker m1 = googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(15.78196, 120.66500))
                .anchor(0.5f, 0.5f)
                .title("Jane pauline")
                .snippet("Secondary School"));
        // San Filepe High School/ School of PINO
        Marker m2 = googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(15.82441, 120.59860))
                .anchor(0.5f, 0.5f)
                .title("Pino")
                .snippet("Secondary School"));

        enableMyLocation();
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.getUiSettings().setZoomGesturesEnabled(true);
        mMap.getUiSettings().setCompassEnabled(true);
    }


    public void enableMyLocation() {

    }
}