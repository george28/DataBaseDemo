package hargis.databasedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import java.util.List;


public class MainActivity extends AppCompatActivity {


    private static final String TAG = "MainActivity";
    EditText inputEditText;
    DbHandler dbHandler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        inputEditText = (EditText)findViewById(R.id.inputEditText);

        dbHandler = new DbHandler(this, null,null,1);
        printDatabase();

    }

    public void addClick(View view){
        Products products = new Products(inputEditText.getText().toString());
        dbHandler.addProduct(products);
    }

    public void deleteClick(View view){

        String inputText = inputEditText.getText().toString();
        dbHandler.deleteProduct(inputText);
        printDatabase();
    }

        public void printDatabase(){
            List<Products> dbString = dbHandler.databaseToString();
            String log="";
            for(Products pn : dbString){
                log += "id:" + pn.get_id() + " name:" + pn.get_productname()+ "\n";
            }

            Log.i(TAG, log);
            inputEditText.setText("");
        }

}
