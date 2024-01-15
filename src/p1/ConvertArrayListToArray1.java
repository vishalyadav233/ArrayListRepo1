package p1;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayListToArray1 {
    public static void main(String args[]) {
      // Declaring and initializing ArrayList in one step
      ArrayList<String> browsers = new ArrayList<>();
      browsers.add("Google Chrome");
      browsers.add("Mozilla Firefox");
      browsers.add("Edge");
      browsers.add("Opera");

      //Converting ArrayList to String array using copyOf()
      String[] browsernames = Arrays.copyOf(browsers.toArray(), browsers.size(), String[].class);

      // Displaying elements using for-each loop
      for(String str : browsernames) {
        System.out.println(str);      
      }
    }
}
