package com.hope.assign1;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by Bogdi on 3/21/2014.
 */
public class Address {

    public boolean getAddress(String ip, String siteName) throws UnknownHostException {

        String x;
        String[] y = new String[]{""};

        InetAddress[] inetAddresses = InetAddress.getAllByName(siteName);
        for (InetAddress i : inetAddresses){

            x = i.toString();
            y = x.split("/");

            if(ip.equals(y[1])){
                return true;
            }
        }
        return false;
    }

}
