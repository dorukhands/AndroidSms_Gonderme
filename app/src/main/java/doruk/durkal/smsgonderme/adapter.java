package doruk.durkal.smsgonderme;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

public class adapter extends BaseAdapter {
    List<model>list;
    Context context;
    Activity activity;

    public adapter(List<model> list, Context context,Activity activity) {
        this.list = list;
        this.context = context;
        this.activity=activity;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView= LayoutInflater.from(context).inflate(R.layout.mesajlayout,parent,false);

        final EditText editText=(EditText) convertView.findViewById(R.id.mesajIcerik);
        Button button=(Button)convertView.findViewById(R.id.buton);
        final TextView tel=(TextView)convertView.findViewById(R.id.tel);
        TextView isim=(TextView)convertView.findViewById(R.id.isim);

        tel.setText(list.get(position).getTel());
       final String telNo=list.get(position).getTel();
        isim.setText(list.get(position).getIsim());
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mesajIcerik=editText.getText().toString();
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("sms: "+telNo));
                intent.putExtra("sms_body",mesajIcerik);
                activity.startActivity(intent);
            }
        });

        return convertView;
    }
}
