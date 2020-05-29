package org.zrtech.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView);
        textView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("hello, world");
            }
        });
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        ImageView image = findViewById(R.id.imageView);

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.show:
                if (checked)
                    image.setVisibility(View.VISIBLE);
                break;
            case R.id.hide:
                if (checked)
                    image.setVisibility(View.INVISIBLE);
                break;
        }
    }

    public void onClick(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(((CheckBox) findViewById(R.id.checkBox)).isChecked() ? "复选框已选中" : "复选框未选中");
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}