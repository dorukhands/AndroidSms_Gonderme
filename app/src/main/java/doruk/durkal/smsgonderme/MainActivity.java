package doruk.durkal.smsgonderme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<model>list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListeDoldur();
        tanimla();
    }
    public void ListeDoldur(){
        list=new ArrayList<>();
    model m1=new model("Dorukhan","47851268977");
    model m2=new model("Şeyma","47812596015");
    model m3=new model("Yunus","15489762351");
    model m4=new model("Ali","15470290045");
    model m5=new model("Ayşe","02519687411");
    list.add(m1);
    list.add(m2);
    list.add(m3);
    list.add(m4);
    list.add(m5);
    }
    public void tanimla(){
        ListView listView=(ListView) findViewById(R.id.mesajList);
        adapter adp=new adapter(list,this,this);
        listView.setAdapter(adp);
    }
}
