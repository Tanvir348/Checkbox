package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

        private Button show_button;
        private CheckBox read_wine_checkbox,vodka_checkbox,riesling_checkbox;
        private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        read_wine_checkbox = (CheckBox) findViewById(R.id.checkbox_id1);
        vodka_checkbox = (CheckBox) findViewById(R.id.checkbox_id2);
        riesling_checkbox = (CheckBox) findViewById(R.id.checkbox_id3);
        result = (TextView) findViewById(R.id.show_text_id);
        show_button = (Button) findViewById(R.id.button_id);

      show_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
      StringBuilder stringBuilder = new StringBuilder();
      if(read_wine_checkbox.isChecked())
      {
          String value = read_wine_checkbox.getText().toString();
          stringBuilder.append(value + " is ordered"+"\n");
      }
      if(vodka_checkbox.isChecked())
      {
          String value = vodka_checkbox.getText().toString();
          stringBuilder.append(value + " is ordered"+"\n");
      }
      if(riesling_checkbox.isChecked())
      {
          String value = read_wine_checkbox.getText().toString();
          stringBuilder.append(value +" is ordered"+"\n");

      }
      result.setText(stringBuilder);
    }
}
