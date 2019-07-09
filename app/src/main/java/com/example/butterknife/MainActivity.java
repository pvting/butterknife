package com.example.butterknife;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.tv1)
    TextView tv1;
    @BindView(R.id.bt1)
    Button bt1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.tv1, R.id.bt1})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv1:
                tv1.setText("我被点了");
                break;
            case R.id.bt1:
                tv1.setText("我被别人点了");
                break;
        }
    }
}
