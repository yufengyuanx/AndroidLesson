package com.yufengyuanx.androidlesson1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get ListView object from xml
        ListView eventListView = (ListView) findViewById(R.id.event_list);

        /**
         * public ArrayAdapter(Context context,
         *                     int resource,
         *                     int textViewResourceId,
         *                     T[] objects)
         *
         *      { throw new RuntimeException("Stub!");}
         */
        // Initialize an adapter
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
//                this,        // Context context
//                R.layout.event_item, // int resource
//                R.id.event_name,     // int textViewResourceId
//                getEventNames()      // T[] objects
//        );

        EventAdapter adapter = new EventAdapter(this);

        // Assign adapter to ListView
        eventListView.setAdapter(adapter);



        Log.e("Life cycle test", "We are at onCreate");
    }

//    /**
//     * A dummy function to get fake event names.
//     *
//     * @reurn an array of fake event names.
//     */
//
//    private String[] getEventNames() {
//        String[] names = {
//                "Event1", "Event2", "Event3",
//                "Event4", "Event5", "Event6",
//                "Event7", "Event8", "Event9",
//                "Event10", "Event11", "Event12"
//        };
//        return names;
//    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Life cycle test", "We are at onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Life cycle test", "We are at onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Life cycle test", "We are at onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Life cycle test", "We are at onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Life cycle test", "We are at onDestroy");
    }


    /**
     * start the app:
     *      onCreate() -> onStart() -> onResume()
     *
     * home button:
     *      onPause()  -> onStop()
     *
     * open app again:
     *      on Start() -> onResume()
     *
     * back button:
     *      onPause()   -> onStop()  -> onResume()
     *
     */

}
