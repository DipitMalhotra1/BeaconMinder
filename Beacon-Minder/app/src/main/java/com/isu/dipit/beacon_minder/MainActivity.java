package com.isu.dipit.beacon_minder;


        import android.app.Activity;
        import android.app.AlertDialog;
        import android.content.DialogInterface;
        import android.os.Bundle;
        import android.support.v4.widget.SimpleCursorAdapter.ViewBinder;
        import android.view.Menu;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;
        import android.widget.Switch;
        import android.widget.EditText;

public class MainActivity extends Activity implements View.OnClickListener, DialogInterface.OnClickListener{

    private Button b;
    private TextView t;
    public Switch simpleSwitch ;
    public EditText editText;
    public EditText editText1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b=(Button)findViewById(R.id.button2);
        b.setOnClickListener(this);

        t=(TextView)findViewById(R.id.textView1);

        Switch simpleSwitch = (Switch) findViewById(R.id.switch1);



// check current state of a Switch (true or false).
        Boolean switchState = simpleSwitch.isChecked();
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        AlertDialog ad = new AlertDialog.Builder(this)
                .setMessage("Do you want to delete the Beacon")
                .setPositiveButton("Yes", this)
                .setNegativeButton("No", this)
                .setNeutralButton("Cancel", this)
                .setCancelable(false)
                .create();

        ad.show();
    }

    @Override
    public void onClick(DialogInterface dialog, int which) {
        // TODO Auto-generated method stub
        switch(which){
            case DialogInterface.BUTTON_POSITIVE: // yes
                t.setText("You have successfully deleted the Beacon");
//                simpleSwitch.isChecked();
//                simpleSwitch.setChecked(false);
//                editText.getText().clear();
//                editText1.getText().clear();


                break;
            case DialogInterface.BUTTON_NEGATIVE: // no
                t.setText("The Beacon devise is still connected");
                break;
            default:
                // nothing
                break;
        }
    }
}

