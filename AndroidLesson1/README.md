# Android Projects Structure

1. app/java

    Main folder that contains java source file, java files are mainly focused on logic purposes

2. app/java/res/layout/activity_main.xml

    Main activity layout file, Each activity will have one layout file associated with it. 
    The layout file defines how the UI looks like (if you are not familiar with xml file, 
    you can find basic concept in http://www.w3schools.com/xml/xml_whatis.asp )

3. app/java/com.yufengyuanx.androidlesson1/MainActiviy.java

    The Java class for your activity. When you build and run the app, 
    the Activity class starts the activity and loads the layout file to show UI

4. app/manifests/AndroidManifest.xml

    The manifest file describes the fundamental characteristics of the app and defines each of its 
    components. The manifest file provides essential information about your app to the Android 
    system, which the system must have before it can run any of the app's code.

5. app/build.gradle

    Build configuration file, Google uses gradle as their build tool. Some configuration artifacts, 
    compiledSdkVersion is the platform version against which you will compile your app.
    minSdkVersion is the earliest version of the Android SDK that your app supports.
    targetSdkVersion indicates the highest version of Android with which you have tested your application. 


6. drawable

    Directories for drawable objects (such as bitmaps) that are designed for various densities, 
    such as medium-density (mdpi) and high-density (hdpi) screens. Other drawable directories contain 
    assets designed for other screen densities. Here you'll find the ic_launcher.png that appears 
    when you run the default app.

7. values/

    Directory for other XML files that contain a collection of resources, such as string 
    and color definitions. Similar to drawable, values/ contains non-drawable resources, 
    such as strings, colors, etc. The strings.xml file defines the "Hello world!" string 
    that displays when you run the default app.





**ListView** is a view group that displays a list of scrollable items. The *list items* are *automatically* inserted to the list using an **Adapter** that pulls content from a source such as an *array* or *database query* and converts each item result into a view that's placed into the list.



