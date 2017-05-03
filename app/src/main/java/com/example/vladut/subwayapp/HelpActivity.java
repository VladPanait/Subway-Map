package com.example.vladut.subwayapp;

import android.graphics.Color;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HelpActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private List<MarkerOptions> markers;
    private PolylineOptions polylineM1;
    private PolylineOptions polylineM2;
    private PolylineOptions polylineM3;
    private PolylineOptions polylineM4;
    private MarkerOptions centerMarker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
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
        loadMarkers();

        // Add a marker in Sydney and move the camera
        mMap.addMarker(centerMarker);

        Iterator<MarkerOptions> markerIterator = markers.iterator();
        while(markerIterator.hasNext())
        {
            mMap.addMarker(markerIterator.next());
        }

        mMap.addPolyline(polylineM1
                .width(4)
                .color(Color.YELLOW));

        mMap.addPolyline(polylineM2
                .width(5)
                .color(Color.BLUE));

        mMap.addPolyline(polylineM3
                .width(6)
                .color(Color.RED));

        mMap.addPolyline(polylineM4
                .width(5)
                .color(Color.GREEN));

        LatLng Unirii = new LatLng(44.427654, 26.102633);
        CameraUpdate yourLocation = CameraUpdateFactory.newLatLngZoom(Unirii, 11);
        mMap.animateCamera(yourLocation);
    }

    private void loadMarkers(){
        LatLng location = new LatLng(44.427654, 26.102633);
        centerMarker = new MarkerOptions()
                .position(location)
                .title("Piata Unirii")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));


        // data base
        markers = new ArrayList<MarkerOptions>();
        polylineM1 = new PolylineOptions();
        polylineM2 = new PolylineOptions();
        polylineM3 = new PolylineOptions();
        polylineM4 = new PolylineOptions();

        addMarkerM2(new LatLng(44.480638, 26.116723), "Pipera", 0);
        addMarkerM2(new LatLng(44.479214, 26.100530), "Aurel Vlaicu", 0);
        addMarkerM2(new LatLng(44.466138, 26.086529), "Aviatorilor", 0);
        addMarkerM2(new LatLng(44.452264, 26.086374), "Piata Victoriei M2", (float)-10);
        addMarkerM2(new LatLng(44.445783, 26.097592), "Piata Romana", 0);
        addMarkerM2(new LatLng(44.435512, 26.102535), "Universitate", 0);
        addMarkerM2(new LatLng(44.427654, 26.102633), "Unirii M2", 0);
        addMarkerM2(new LatLng(44.414758, 26.104665), "Tineretului", 0);
        addMarkerM2(new LatLng(44.404510, 26.096224), "Eroii Revolutiei", 0);
        addMarkerM2(new LatLng(44.427654, 26.102633), "Constantin Brancoveanu", 0);
        addMarkerM2(new LatLng(44.392949, 26.122291), "Piata Sudului", 0);
        addMarkerM2(new LatLng(44.379593, 26.135372), "Aparatorii Patriei", 0);
        addMarkerM2(new LatLng(44.368914, 26.143660), "Dimitrie Leonida", 0);
        addMarkerM2(new LatLng(44.361192, 26.149215), "Berceni", 0);

        addMarkerM1(new LatLng(44.419598, 26.139918), "Dristor", 0);
        addMarkerM1(new LatLng(44.432363, 26.138488), "Piata Muncii", 0);
        addMarkerM1(new LatLng(44.440947, 26.133102), "Piata Iancului", 0);
        addMarkerM1(new LatLng(44.449927, 26.124054), "Obor", 0);
        addMarkerM1(new LatLng(44.452998, 26.104893), "Stefan cel Mare", 0);
        addMarkerM1(new LatLng(44.452264, 26.086374), "Piata Victoriei M1", (float)10);
        addMarkerM1(new LatLng(44.447139, 26.076821), "Gara de Nord M1", (float)10);
        addMarkerM1(new LatLng(44.450356, 26.068903), "Basarab M1", (float)10);
        addMarkerM1(new LatLng(44.451804, 26.047697), "Crangasi", 0);
        addMarkerM1(new LatLng(44.445304, 26.046719), "Petrache Poienaru", 0);
        addMarkerM1(new LatLng(44.442834, 26.059889), "Grozavesti", 0);
        addMarkerM1(new LatLng(44.434946, 26.075713), "Eroilor M1", (float)10);
        addMarkerM1(new LatLng(44.432927, 26.089669), "Izvor M1", (float)10);
        addMarkerM1(new LatLng(44.427654, 26.102633), "Unirii M1", (float)25);
        addMarkerM1(new LatLng(44.416697, 26.113362), "Timpuri Noi M1", (float)10);
        addMarkerM1(new LatLng(44.411279, 26.126022), "Mihai Bravu M1", (float)10);
        addMarkerM1(new LatLng(44.419598, 26.139918), "Dristor M1", (float)10);
        addMarkerM1(new LatLng(44.425011, 26.162721), "Titan", 0);
        addMarkerM1(new LatLng(44.435572, 26.169427), "Costin Georgian", 0);
        addMarkerM1(new LatLng(44.434374, 26.185746), "Republica", 0);
        addMarkerM1(new LatLng(44.440625, 26.192511), "Pantelimon ", 0);


        addMarkerM3(new LatLng(44.430114, 25.988510), "Preciziei", 0);
        addMarkerM3(new LatLng(44.434039, 26.004120), "Pacii", 0);
        addMarkerM3(new LatLng(44.434312, 26.021498), "Gorjului", 0);
        addMarkerM3(new LatLng(44.434549, 26.033278), "Lujerului", 0);
        addMarkerM3(new LatLng(44.434841, 26.055001), "Politehnnica", 0);
        addMarkerM3(new LatLng(44.434946, 26.075713), "Eroilor M3", (float)-10);
        addMarkerM3(new LatLng(44.432927, 26.089669), "Izvor M3", (float)-10);
        addMarkerM3(new LatLng(44.427654, 26.102633), "Unirii M3", (float)-25);
        addMarkerM3(new LatLng(44.416697, 26.113362), "Timpuri Noi M3", (float)-10);
        addMarkerM3(new LatLng(44.411279, 26.126022), "Mihai Bravu M3", (float)-10);
        addMarkerM3(new LatLng(44.419598, 26.139918), "Dristor M3", (float)-10);
        addMarkerM3(new LatLng(44.413458, 26.160110), "Nicolae Grigorescu", 0);
        addMarkerM3(new LatLng(44.410476, 26.174386), "1 Decembrie 1918", 0);
        addMarkerM3(new LatLng(44.407437, 26.194837), "Nicolae Teclu", 0);
        addMarkerM3(new LatLng(44.405686, 26.208722), "Anghel Saligny", 0);

        addMarkerM4(new LatLng(44.447139, 26.076821), "Gara de Nord M4", (float)-10);
        addMarkerM4(new LatLng(44.450356, 26.068903), "Basarab M4", (float)-10);
        addMarkerM4(new LatLng(44.461837, 26.057328), "Grivita", 0);
        addMarkerM4(new LatLng(44.470389, 26.050646), "1Mai", 0);
        addMarkerM4(new LatLng(44.482561, 26.040952), "Jiului", 0);
        addMarkerM4(new LatLng(44.487291, 26.037211), "Parc Bazilescu", 0);
        addMarkerM4(new LatLng(44.493597, 26.029542), "Laminorului", 0);
        addMarkerM4(new LatLng(44.503382, 26.025104), "Straulesti", 0);

    }

    private void addMarkerM1(LatLng pos, String title, float rot){
        polylineM1.add(pos);
        markers.add(new MarkerOptions()
                .position(pos)
                .title(title)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
                .rotation(rot));
    }

    private void addMarkerM2(LatLng pos, String title, float rot){
        polylineM2.add(pos);
        markers.add(new MarkerOptions()
                .position(pos)
                .title(title)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
                .rotation(rot));
    }

    private void addMarkerM3(LatLng pos, String title, float rot){
        polylineM3.add(pos);
        markers.add(new MarkerOptions()
                .position(pos)
                .title(title)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED))
                .rotation(rot));
    }

    private void addMarkerM4(LatLng pos, String title, float rot){
        polylineM4.add(pos);
        markers.add(new MarkerOptions()
                .position(pos)
                .title(title)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
                .rotation(rot));
    }
}
