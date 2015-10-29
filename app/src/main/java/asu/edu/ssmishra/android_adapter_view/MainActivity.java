package asu.edu.ssmishra.android_adapter_view;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity {

    private List<Car> myCars = new ArrayList<Car>();


//Array of options -> Arrayadapter -> ListView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        populateCarList();
        populateListView();
    }


    private void populateCarList(){
        //Create a list of element
        myCars.add(new Car("Ford", 1940, R.drawable.camera3, "Needing Work"));
        myCars.add(new Car("Tesla", 1954, R.drawable.computer209, "Nice"));
        myCars.add(new Car("GM", 1943, R.drawable.iphone26, "Very good"));
        myCars.add(new Car("BMW", 1923, R.drawable.lightbulb58, "Lovable"));
        myCars.add(new Car("Toyota", 1987, R.drawable.paper6, "Beautiful"));
        myCars.add(new Car("RR", 1967, R.drawable.phone21, "Fast"));
        myCars.add(new Car("Jeep", 1945, R.drawable.shield20, "Awesome"));
        myCars.add(new Car("Moon Lander", 1999, R.drawable.servers1, "Out of this world"));
        myCars.add(new Car("Moon Lander", 1999, R.drawable.computer209, "Very Good"));
        myCars.add(new Car("Moon Lander", 1999, R.drawable.lightbulb58, "Nice"));
        myCars.add(new Car("Moon Lander", 1999, R.drawable.camera3, "Awesome"));
        myCars.add(new Car("Moon Lander", 1999, R.drawable.paper6, "Random Text"));

    }


    private void populateListView() {
        ArrayAdapter<Car> adapter = new MyListAdapter();
        ListView list = (ListView) findViewById(R.id.listViewMain);
        list.setAdapter(adapter);
    }


    private class MyListAdapter extends ArrayAdapter<Car>{
        public MyListAdapter(){

            super(MainActivity.this,
                    R.layout.ds_item,  //What view of the each list will have
                    myCars);           //What objects are to be displayed
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
           //Make sure we have a view to work with
            View itemView = convertView;

            if(itemView == null){
                itemView = getLayoutInflater().inflate(R.layout.ds_item,
                        parent,
                        false);          //
            }

            //Find the car to work with
            //Fill the view

            Car currentCar = myCars.get(position);

            //Fill the view
            ImageView imageView = (ImageView) itemView.findViewById(R.id.imageIcon);
            imageView.setImageResource(currentCar.getIconID());

            //Fill Make
            TextView makeText = (TextView) itemView.findViewById(R.id.textMake);
            makeText.setText(currentCar.getMake());

            //Fill Year
            TextView yearText = (TextView) itemView.findViewById(R.id.textYear);
            String yearstr = ""+currentCar.getYear();
            yearText.setText(yearstr);

            //Condition
            TextView conditionText = (TextView) itemView.findViewById(R.id.textCondition);
            conditionText.setText(currentCar.getCondition());

            return itemView;


           // return super.getView(position, convertView, parent);
        }
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
}
