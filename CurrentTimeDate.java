/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package niic;

import java.text.SimpleDateFormat;
import java.util.Date;


public class CurrentTimeDate {

    static String date() {
        Date d1 = new Date();
SimpleDateFormat df = new SimpleDateFormat("MM/dd/YYYY");
String date = df.format(d1);
return date;
    }

    static String time() {
         Date d1 = new Date();
SimpleDateFormat df = new SimpleDateFormat("HH:mm a");
String time = df.format(d1);
return time;
    }
    	

}
//   Date d1 = new Date();
//SimpleDateFormat df = new SimpleDateFormat("MM/dd/YYYY HH:mm a");
//String date = df.format(d1);