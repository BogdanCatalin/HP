package com.hope.assign1;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Bogdi on 3/21/2014.
 */
public class InternetConnection {

    public boolean testInternetConnection(){
        try {
            URL url = new URL("http://www.yahoo.com");
            URLConnection connection = url.openConnection();

            if(connection.getContentLength() == -1){
                System.out.println("Failed to verify connection. Please check your internet connection.");
                return false;
            }
        }
        catch (IOException e) {
            System.out.println("Failed to open a connection");
            e.printStackTrace();
            return false;
        }
        return true;
    }

}
