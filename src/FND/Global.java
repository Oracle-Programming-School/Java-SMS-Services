package FND;

import FND.Log.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Faisal
 */
public class Global {
    public static String CandeladbPath = "";
    public static String ShopID = "";
    public static String SMS_API_URL = "";
    public static String SMS_API_Number = "";
    public static String SMS_API_Password = "";
    
    //nvl
    public static String nvl(Object v) {
        if (v == null) {
            return "null";
        } else {
            return v.toString();
        }
    }
    
    
  public static boolean isDBConfigFileExits() {
        /*Get Configration File*/
        File fileSoucrce = new File(System.getenv("APPDATA") + "\\sapphire\\SMSConfigration.txt");
        Scanner myReader;
        //this.console("Configration file loaded to program.");
        try {
            String[] fileText = new String[10];
            int i = 0;
            myReader = new Scanner(fileSoucrce);
            while (myReader.hasNextLine()) {
                fileText[i++] = myReader.nextLine();
            }
            myReader.close();
            

             CandeladbPath= (fileText[0].toString());
             ShopID = fileText[1];
             SMS_API_URL = fileText[2];
             SMS_API_Number = fileText[3];
             SMS_API_Password = fileText[4];
             
             Console.show(CandeladbPath);
             Console.show(ShopID);
             Console.show(SMS_API_URL);
             
            // Configration Loaded
            return true;

        } catch (FileNotFoundException ex) {
            Console.show("Configration file not found at " + fileSoucrce.getAbsolutePath());
            return false;
        }
    } 
  
}



