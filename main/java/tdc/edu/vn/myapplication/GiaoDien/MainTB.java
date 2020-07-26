package tdc.edu.vn.myapplication.GiaoDien;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import tdc.edu.vn.myapplication.R;


public class MainTB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_t_b);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_actionbar, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mnLuu: {
                Log.d("test", "Lưu");
                break;

            }
            case R.id.mnDoc:
                Log.d("test", "Đọc");

                break;
            case R.id.mnThoat:
                Log.d("test", "Thoát");
                AlertDialog.Builder builder = new AlertDialog.Builder(MainTB.this);
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
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
