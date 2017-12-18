package com.yufengyuanx.androidlesson1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yufengyuan on 12/17/17.
 */

public class DataService {

    /**
     * Fake all the event data for now.
     */

    public static List<Event> getEventData() {
        List<Event> eventData = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            eventData.add(
                    new Event("Event title",
                              "1111 dr, fake city, CA, 11111",
                               "This is description part")
            );
        }
        return eventData;
    }

}
