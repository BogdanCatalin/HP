package com.hope.assign1;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by Bogdi on 3/21/2014.
 */
public class Main {

    public static void main(String[] args) throws UnknownHostException {

        String ip = "173.194.39.177";
        String siteName="www.google.com";
        Address address = new Address();
        InternetConnection internetConnection = new InternetConnection();

        //ip = args[0];
        //siteName = args[1];
        boolean x = false;
        boolean y = false;

        y = internetConnection.testInternetConnection();
        if (y == true){
            x = address.getAddress(ip, siteName);

            if (x == true){
                System.out.println("True");
            }
            else {
                System.out.println("False");
            }
        }
    }

}
