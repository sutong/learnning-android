package cn.st.android.learning.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnIntentImplicit;

    private Button btnIntentResult;

    private Button btnGoSimpleCamera;

    private Button btnLearnVedio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnIntentImplicit= (Button) findViewById(R.id.btn_intent_implicit);
        btnIntentImplicit.setOnClickListener(this);
        btnIntentResult= (Button) findViewById(R.id.btn_intent_result);
        btnIntentResult.setOnClickListener(this);
        btnGoSimpleCamera= (Button) findViewById(R.id.btn_go_simple_camera);
        btnGoSimpleCamera.setOnClickListener(this);
        btnGoSimpleCamera= (Button) findViewById(R.id.btn_learn_vedio);
        btnGoSimpleCamera.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_intent_implicit:{
                Intent intent=new Intent(this,ImplicitIntentActivity.class);
                startActivity(intent);
                break;
            }

            case R.id.btn_intent_result:{
                Intent intent=new Intent(this,IntentResultActivity.class);
                startActivity(intent);
                break;
            }

            case R.id.btn_go_simple_camera:{
                Intent intent=new Intent(this,SimpleCameraActivity.class);
                startActivity(intent);
                break;
            }

            case R.id.btn_learn_vedio:{
                Intent intent=new Intent(this,LearnVideoActivity.class);
                startActivity(intent);
                break;
            }
        }
    }

}
