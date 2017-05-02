package com.sportreader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.security.cert.X509Certificate;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.net.URL;
import java.io.*;
import javax.net.ssl.HttpsURLConnection;

public class TestSSL
{
public static String Rd (String url) throws Exception
{
TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
            @Override
            public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                return null;
            }
            @Override
            public void checkClientTrusted(X509Certificate[] certs, String authType) {
            }
            @Override
            public void checkServerTrusted(X509Certificate[] certs, String authType) {
            }
        } };
        // Install the all-trusting trust manager
        final SSLContext sc = SSLContext.getInstance("SSL");
        sc.init(null, trustAllCerts, new java.security.SecureRandom());
        HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
        // Create all-trusting host name verifier
        HostnameVerifier allHostsValid = new HostnameVerifier() {
            @Override
            public boolean verify(String hostname, SSLSession session) {
                return true;
            }
        };

        // Install the all-trusting host verifier
        HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
    
String httpsURL = url;
URL myurl = new URL(httpsURL);
HttpsURLConnection con = (HttpsURLConnection)myurl.openConnection();
InputStream ins = con.getInputStream();
InputStreamReader isr = new InputStreamReader(ins);
String inputLine;
    try (BufferedReader in = new BufferedReader(isr)) {
        ClipBoardListener.content = " ";
        while ((inputLine = in.readLine()) != null) {
            //System.out.println(inputLine);
            ClipBoardListener.content += ClipBoardListener.content + inputLine;
        } 
//ClipBoardListener.content.trim();
    }
if (con.getResponseCode() != 200) {
    System.out.println("No internet");
}
return inputLine;
}
 
}

