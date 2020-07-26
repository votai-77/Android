package tdc.edu.vn.myapplication.GiaoDien;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import tdc.edu.vn.myapplication.R;


public class MainActivity extends AppCompatActivity {
Button btnTB, btnLoaiTB, btnPhongHoc, btnChiTietSD, btnThoat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setControl();
        setEvent();
    }

    private void setEvent() {
        btnLoaiTB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, MainLoaiTB.class);
                startActivity(intent);
            }
        });
        btnTB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, MainTB.class);
                startActivity(intent);
            }
        });
        btnChiTietSD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, MainChiTietSuDung.class);
                startActivity(intent);
            }
        });
        btnPhongHoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, MainPhongHoc.class);
                startActivity(intent);
            }
        });
        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Thông báo");
                builder.setMessage("Bạn có muốn thoát?");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });
    }

    private void setControl() {
        btnTB = findViewById(R.id.btnTB);
        btnLoaiTB = findViewById(R.id.btnLoaiTB);
        btnPhongHoc = findViewById(R.id.btnPhongHoc);
        btnChiTietSD = findViewById(R.id.btnChiTietSD);
        btnThoat = findViewById(R.id.btnThoat);
    }
}