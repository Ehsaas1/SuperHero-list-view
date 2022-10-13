package com.example.custom_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;


import com.example.custom_listview.databinding.ActivityMainBinding;
import com.example.custom_listview.databinding.ActivityUserBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int[] imageId = {R.drawable.antman,R.drawable.aquaman,R.drawable.atom,R.drawable.batgirl,R.drawable.batman,
                R.drawable.blackpanther,R.drawable.blackwidow,R.drawable.captain,R.drawable.captainmarvel,R.drawable.daredevil,
                R.drawable.deadpool, R.drawable.elektra,R.drawable.flash,R.drawable.gamora,R.drawable.ghostrider,
                R.drawable.greenarrow,R.drawable.greenlantern,R.drawable.hawkeye,R.drawable.brucebanners,R.drawable.humantourch,
                R.drawable.ironman,R.drawable.ladythor,R.drawable.magneto,R.drawable.professorx,R.drawable.quicksilver,
                R.drawable.scarletwitch,R.drawable.shaktiman,R.drawable.shehulk,R.drawable.spiderman,R.drawable.superman,
                R.drawable.thor,R.drawable.wolverine};

        String[] name = {"Ant-Man","Aquaman","The Atom","BatGirl","BatMan",
                "Black Panther","Black Widow","Captain America","Captain Marvel","Dare Devil",
                "Deadpool", "Elektra","Flash","Gamora","Ghost Rider",
                "Green Arrow","Green Lantern","Hawkeye","Hulk","Human Tourch",
                "Iron Man","Lady Thor","MagnetO","Professor X","Quick Silver",
                "Scarlet Witch","Shaktimaan","She Hulk","Spider-Man","SuperMan",
                "Thor","Wolverine"};

        String[] realname = {"Scott Lang","Arthur Curry","Dr. Raymond Palmer","Barbara Gordon","Bruce Wayne",
                "T'Challa","Natasha Romanoff","Steve Rogers","Carol Danvers","Matt Murdock",
                "Wade Wilson", "Elektra","Bartholomew Henry","Gamora Zen Whoberi Ben Titan","Johnny Blaze",
                "Oliver Jonas Queen","Hal Jordan","Clint Barton","Bruce Banner","Jonathan Lowell Spencer",
                "Tony Stark","Jane Foster","Max Eisenhardt","Charles Francis Xavier","Pietro Lensherr",
                "Wanda Maximoff","Pandit Gangadhar Vidyadhar Mayadhar Omkarnath Shastri","Jennifer Walters","Peter Parker","Clark Kent",
                "Thor Odinson","James Howlett"};

        String[] type = {"Hero","Hero","Hero","Hero","Hero",
                "Hero","Hero","Hero","Hero","Hero",
                "Anti-Hero","Anti-Hero", "Hero","Hero","Anti-Hero",
                "Hero","Hero","Hero","Hero","Hero",
                "Hero","Hero","Anti-Hero","Hero","Hero",
                "Anti-Hero","Hero","Hero","Hero","Hero",
                "Hero","Hero"};

        String[] powers = {"Shrink and Enlarge himself using Pym particles","Super human strength breath under water and Manipulate water","Shrink and Enlarge himself","she has been trained beyond peak of physical fitness including great speed, flexibility and strength","Batman does not possess any superpowers, instead relying on his intellect, fighting skills, and wealth",
                "Heightened strength, speed, stamina agility and reflexes master of martial arts, acrobatics & hand-held weaponry","Expert spy, tactician Master martial artist and hand-to-hand combatant","After being infused with the Super-Soldier serum, Steve Roger's body reached the upper-most limits of human perfection in strength, stamina, agility, and durability","Her powers include enhanced strength, stamina, agility, and durability, as well as flight, and almost total immunity to toxins and poisons",
                "Superhuman agility, reflexes, senses, and balance Echolocative radar sense Mastery of stick-fighting, martial arts, hand-to-hand combatant, and acrobatics Utilizing billy club with multi-purpose functions Expertise in criminology","dRegeneration/Healing Factor. Extended longevity. Skilled marksman, swordsman, martial artist and hand-to-hand combatant. Master assassin. Using devices granting teleportation and holographic disguise. Fourth wall breaks. Peak human speed. Superhuman strength, durability, stamina, reflexes and agility",
                "Elektra possesses levels of strength, speed, agility, reflexes, stamina","superhuman speed","superhuman strength and agility and an accelerated healing factor","His connection to the Hell Charger, his ride, is a power unto itself, giving him the ability to teleport short distances, create portals, and become intangible with pieces of the car superhuman speed, strength, durability, and a regenerative healing ability",
                "Peak human physical and mental conditioning Highly skilled martial artist and hand-to-hand combatant Master archer and marksman Expert acrobat Utilizing high-tech equipment, armor, compound bow, and various types of specialty arrows","the ability to conjure constructs","He is an exceptional fencer, acrobat and marksman, having been trained from childhood in the circus and by the criminals Trick Shot and Swordsman","Incredible superhuman strength, durability, and healing factor","He can engulf his entire body in flames, fly, absorb fire harmlessly into his own body, and control any nearby fire by sheer force of will",
                "Cursed With Knowledge","She also has Thor's same sense of physical strength and durability","He can manipulate all forms of magnetism, summon force fields and shoot electromagnetic pulses that can disable electronic devices","He is an exceptionally powerful telepath, who can read and control the minds of others","superhuman ability to move at great speeds",
                "telekinesis, energy manipulation, and some form of neuroelectric interfacing that allows her to both read thoughts and also give her targets waking nightmares","Will power-based constructs , Unarmed combat , Intellect , Healing , Attractive male , Telepathy , Flight , Stamina , Light projection , Super speed , Shape shifter , Heat generation , Divine powers , Invisibility and Super strength","Superhuman strength, speed, agility, stamina, and durability Regenerative healing factor Power-switching", "Superhuman strength, agility, endurance, ability to stick to and climb walls and other surfaces","flight, superhuman strength, x-ray vision, heat vision, cold breath, super-speed, enhanced hearing, and nigh-invulnerability",
                "superhuman strength, speed, agility, durability and immunity to most diseases","superhuman strength and reflexes, enhanced senses and tracking abilities, and a special healing power that also slows his aging"};

        String[] country = {"United States","Atlantis","American","Gotham","Gotham",
                "Wakanda","Soviet Union","Manhattan, New York City","United States","hell's kitchen",
                "Canada","Greek","Gotham","Massacre","Swedish",
                "Star City","ancient China","Waverly, Iowa","Dayton, Ohio","Glenville, New York",
                "New York","America","America","United States","Torquay, Australia",
                "Sokovia","India","Los Angeles","New York City", "Smallville , America",
                "Assgaurd","Alberta, Canada"};

        ArrayList<User> userArrayList = new ArrayList<>();

        for(int i = 0;i< imageId.length;i++){

            User user = new User(name[i],realname[i],type[i],powers[i],country[i],imageId[i]);
            userArrayList.add(user);

        }


        ListAdapter listAdapter = new ListAdapter(MainActivity.this,userArrayList);

        binding.listview.setAdapter(listAdapter);
        binding.listview.setClickable(true);
        binding.listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent i = new Intent(MainActivity.this,UserActivity.class);
                i.putExtra("Title",name[position]);
                i.putExtra("Powers",powers[position]);
                i.putExtra("Country",country[position]);
                i.putExtra("imageid",imageId[position]);
                startActivity(i);

            }
        });

    }
}