package com.example.shami.dhakaguide;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TransportActivity extends AppCompatActivity {

    private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String,List<String>> listHash;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transport);

        listView = (ExpandableListView) findViewById(R.id.lvExp);
        initData();
        listAdapter = new ExpandableListAdapter(this,listDataHeader,listHash);
        listView.setAdapter(listAdapter);
    }
    private void initData() {
        listDataHeader = new ArrayList<>();
        listHash = new HashMap<>();
        listDataHeader.add("Green Dhaka");
        listDataHeader.add("TRUST LINE");
        listDataHeader.add("Dhaka Chaka");
        listDataHeader.add("PROVATI BONOSHRI PORIBOHON LIMITED");
        listDataHeader.add("6 NUMBER MOTIJHIL BANANI TRANSPORT LIMITED (LOCAL)");
        listDataHeader.add("CANTONMENT MINI SERVICE");
        listDataHeader.add("RAJDHANI EXPRESS");
        listDataHeader.add("BKash PORIBOHON LIMITED");
        listDataHeader.add("V.I.P PORIBOHON LIMITED");
        listDataHeader.add("BAHON PORIBOHON LIMITED");

        List<String> Green = new ArrayList<>();
        Green.add("Abdullahpur ⇄  Kuril ⇄ Bashundhara gate ⇄ Notun Bazar ⇄ Badda ⇄ Rampura ⇄ Kakrail ⇄ Paltan  ⇄ Gulistan  ⇄ Motijheel");

        List<String> Trust = new ArrayList<>();
        Trust.add(" Mirpur 10 ⇄ Cantonment ⇄ Banani ⇄ Notun Bazar");

        List<String> Dhaka = new ArrayList<>();
        Dhaka.add("Tejgaon-Gulshan Link Road ⇄  Shooting Club⇄Gulshan-1⇄Gulshan-2 ⇄ Banani ⇄ US Embassy");

        List<String> Provati = new ArrayList<>();
        Provati.add(" Gulistan ⇄ Polton ⇄ Malibag ⇄ Mogbazar ⇄ Saatrasta ⇄ Nabisko ⇄ Mohakhali ⇄ Bonani ⇄ Airport ⇄ Uttara ⇄ Abdullahpur ⇄ Tongi ⇄ Gazipur ⇄ Kaliyakoir");

        List<String> Banani = new ArrayList<>();
        Banani.add("Route 1:Motijhil ⇄ Gulistan ⇄ Polton ⇄ Malibag ⇄ Mogbazar ⇄ Karwanbazar ⇄ Farmgate ⇄Bijoy Sarani ⇄ Mohakhali ⇄ Gulshan 1 ⇄ Gulshan 2 ⇄ Notun Bazar");
        Banani.add("Route 2:Motijhil ⇄ Gulistan ⇄ Polton ⇄ Malibag ⇄ Mogbazar ⇄ Saatrasta ⇄ Nabisko ⇄ Mohakhali ⇄ Gulshan 1 ⇄ Badda Link Road ⇄ Notun Bazar");

        List<String> Mini = new ArrayList<>();
        Mini.add("Mirpur 14 ⇄ Kochukhet ⇄ Soinik Club ⇄ Kakoli ⇄ Banani");

        List<String> Rajdhani = new ArrayList<>();
        Rajdhani.add("Shaymoli ⇄ Asadgate ⇄ Kolabagan ⇄ Science Lab ⇄ Katabon ⇄ Shahbag ⇄ Gulistan");

        List<String> BKash = new ArrayList<>();
        BKash.add("Azimpur, Newmarket, Dhaka ⇄  Asad Gate ⇄ Mohakhali ⇄ Banani/Kakoli ⇄ Airport ⇄ Uttara ⇄ Dhour");

        List<String> Vip = new ArrayList<>();
        Vip.add("Azimpur, Newmarket, Dhaka ⇄  Asad Gate ⇄ Mohakhali ⇄ Banani/Kakoli ⇄ Airport ⇄ Uttara ⇄ Abdullahpur");

        List<String> Bahon = new ArrayList<>();
        Bahon.add("Abdullahpur ⇄  Kuril ⇄ Bashundhara gate ⇄ Notun Bazar ⇄ Badda ⇄ Rampura ⇄ Kakrail ⇄ Paltan  ⇄ Gulistan  ⇄ Motijheel");


        listHash.put(listDataHeader.get(0),Green);
        listHash.put(listDataHeader.get(1),Trust);
        listHash.put(listDataHeader.get(2),Dhaka);
        listHash.put(listDataHeader.get(3),Provati);
        listHash.put(listDataHeader.get(4),Banani);
        listHash.put(listDataHeader.get(5),Mini);
        listHash.put(listDataHeader.get(6),Rajdhani);
        listHash.put(listDataHeader.get(7),BKash);
        listHash.put(listDataHeader.get(8),Vip);
        listHash.put(listDataHeader.get(9),Bahon);
    }
}

