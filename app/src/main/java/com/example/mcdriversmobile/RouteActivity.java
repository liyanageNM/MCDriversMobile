package com.example.mcdriversmobile;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.Dash;
import com.google.android.gms.maps.model.Dot;
import com.google.android.gms.maps.model.Gap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import com.google.android.gms.maps.model.PolylineOptions;

import static com.example.mcdriversmobile.R.id.map;


public class RouteActivity extends AppCompatActivity
        implements
        OnMapReadyCallback {

    private static final int COLOR_BLACK_ARGB = 0xff000000;
    private static final int COLOR_WHITE_ARGB = 0xffffffff;
    private static final int COLOR_GREEN_ARGB = 0xff388E3C;
    private static final int COLOR_PURPLE_ARGB = 0xff81C784;
    private static final int COLOR_ORANGE_ARGB = 0xffF57F17;
    private static final int COLOR_BLUE_ARGB = 0xffF9A825;

    private static final int POLYLINE_STROKE_WIDTH_PX = 12;
    private static final int POLYGON_STROKE_WIDTH_PX = 8;
    private static final int PATTERN_DASH_LENGTH_PX = 20;
    private static final int PATTERN_GAP_LENGTH_PX = 20;
    private static final PatternItem DOT = new Dot();
    private static final PatternItem DASH = new Dash(PATTERN_DASH_LENGTH_PX);
    private static final PatternItem GAP = new Gap(PATTERN_GAP_LENGTH_PX);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Retrieve the content view that renders the map.
        setContentView(R.layout.activity_route);

        // Get the SupportMapFragment and request notification when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map when it's available.
     * The API invokes this callback when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera.
     * In this tutorial, we add polylines and polygons to represent routes and areas on the map.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {

        // Add polylines to the map.
        // Polylines are useful to show a route or some other connection between points.
        googleMap.addPolyline(new PolylineOptions()
                .clickable(true)
                .add(
                        new LatLng(6.861287, 79.864229),
                        new LatLng(6.856025, 79.865291),
                        new LatLng(6.850933, 79.866010),
                        new LatLng(6.847695, 79.866203),
                        new LatLng(6.841846, 79.866935),
                        new LatLng(6.843082, 79.870685),
                        new LatLng(6.845882, 79.871499),
                        new LatLng(6.847831, 79.869772),
                        new LatLng(6.850622, 79.870126),
                        new LatLng(6.850970, 79.868240),
                        new LatLng(6.853879, 79.868430),
                        new LatLng(6.853996, 79.867744),
                        new LatLng(6.856169, 79.866939),
                        new LatLng(6.856521, 79.869267),
                        new LatLng(6.857895, 79.870222),
                        new LatLng(6.860238, 79.866724),
                        new LatLng(6.861538, 79.866156),
                        new LatLng(6.861272, 79.865018),
                        new LatLng(6.861287, 79.864229)));

        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(6.861287, 79.864229), 15));

    }

}
