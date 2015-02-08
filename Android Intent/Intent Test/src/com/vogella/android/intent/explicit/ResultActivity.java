package com.vogella.android.intent.explicit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.EditText;

public class ResultActivity extends Activity {

  @Override
  public void onCreate(Bundle bundle) {
    super.onCreate(bundle);
    setContentView(R.layout.activity_result);
    getValue();
  }
  
  private void getValue() {
	  String receive = getIntent().getExtras().getString("value");
	  TextView text = (TextView) findViewById(R.id.displayintentextra);
	  text.setText(receive);
	  
  }
  
  @Override
  public void finish() {
      
    // TODO 1 create new Intent 
    Intent intent = new Intent();
      
    // TODO 2 read the data of the EditText field
    // with the id returnValue
    EditText edittext = (EditText) findViewById(R.id.returnValue);
    
    // TODO 3 put the text from EditText
    // as String extra into the intent
    // use editText.getText().toString();
    String ret = edittext.getText().toString();
    intent.putExtra("return", ret);
    
    // TODO 4 use setResult(RESULT_OK, intent); 
    // to return the Intent to the application
    setResult(RESULT_OK, intent);
    
    super.finish();
  } 
  
} 