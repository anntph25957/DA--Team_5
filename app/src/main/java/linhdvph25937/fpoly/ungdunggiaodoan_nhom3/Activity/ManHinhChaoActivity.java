package linhdvph25937.fpoly.ungdunggiaodoan_nhom3.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import linhdvph25937.fpoly.ungdunggiaodoan_nhom3.R;

public class ManHinhChaoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(linhdvph25937.fpoly.ungdunggiaodoan_nhom3.R.layout.activity_man_hinh_chao);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(ManHinhChaoActivity.this, ManHinhDangNhapActivity.class));
                finish();
            }
        },2000);
    }
}