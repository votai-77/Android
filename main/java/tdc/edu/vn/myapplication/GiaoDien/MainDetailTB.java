package tdc.edu.vn.myapplication.GiaoDien;


import android.os.Bundle;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import tdc.edu.vn.myapplication.DataBase.DBThietBi;
import tdc.edu.vn.myapplication.Model.ThietBi;
import tdc.edu.vn.myapplication.R;

public class MainDetailTB extends AppCompatActivity {
    EditText txtMa, txtHoten;
    ArrayList<ThietBi> data = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_detail);
        //quay lai
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        setControl();
        setEvent();

    }

    private void setEvent() {
        String matb = getIntent().getExtras().getString("ma");

        DBThietBi dbThietBi  =new DBThietBi(this);
        data =dbThietBi.LayDL(matb);
        txtMa.setText(data.get(0).getMaLoai());
        txtHoten.setText(data.get(0).getTenLoai());
    }

    private void setControl() {

        txtMa = findViewById(R.id.txtMa);
        txtHoten = findViewById(R.id.txtTen);

    }
    //function quay xe
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
