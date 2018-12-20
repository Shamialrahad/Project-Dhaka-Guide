package com.example.shami.dhakaguide;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng annana = new LatLng(23.809220, 90.413439);
        mMap.addMarker(new MarkerOptions().position(annana).title("Annana Shopping Complex"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(annana));

        LatLng Colony = new LatLng(23.811988, 90.395801);
        mMap.addMarker(new MarkerOptions().position(Colony).title("Mes Colony"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Colony));

        LatLng wireless = new LatLng(23.784016, 90.415357);
        mMap.addMarker(new MarkerOptions().position(wireless).title("Gulshan wireless"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(wireless));

        LatLng Mohakhali = new LatLng(23.785129, 90.399186);
        mMap.addMarker(new MarkerOptions().position(Mohakhali).title("Mohakhali New Airport Road"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Mohakhali));

        LatLng Kolabagan = new LatLng(23.745910, 90.382285);
        mMap.addMarker(new MarkerOptions().position(Kolabagan).title("Kolabagan,dhanmondi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Kolabagan));

        LatLng jamuna = new LatLng(23.813426, 90.424382);
        mMap.addMarker(new MarkerOptions().position(jamuna).title("jamuna Future park "));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(jamuna));

        LatLng Banani = new LatLng(23.814213, 90.424382);
        mMap.addMarker(new MarkerOptions().position(Banani).title("Banani lake Park"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Banani));

        LatLng Rampura = new LatLng(23.813426, 90.424395);
        mMap.addMarker(new MarkerOptions().position(Rampura).title("Rampura TV centre"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Rampura));

        LatLng Airport = new LatLng(23.823423, 90.399186);
        mMap.addMarker(new MarkerOptions().position(Airport).title("Airport Branch"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Airport));
    }
}
