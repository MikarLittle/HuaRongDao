package com.example.huarongdao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.List;

public class Level4Activity extends AppCompatActivity {
    private Klotski mKlotskiView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level4);
        List<Block> blocks = KlotskiMapParser.parse("2,0,0,10,1,0,1,3,0,1,3,1,6,0,2,7,2,2,8,0,3,9,2,3,1,0,4,1,3,4");
        mKlotskiView = (Klotski) findViewById(R.id.main_klotski);
        mKlotskiView.setlevel(4);
        mKlotskiView.setBlocks(blocks);
    }
    public void back(View view) {
        finish();
    }

    public void next(View view) {
        Toast.makeText(getApplicationContext(),"妹有新的辽！",Toast.LENGTH_LONG).show();
    }
}
