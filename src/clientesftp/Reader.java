package clientesftp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Reader implements Runnable{

    URL url;
    int i;
    public long responseTime;
    public Reader(URL url,int i){
        this.url = url;
        this.i = i;
    }

    @Override
    public void run(){
        long startTime = System.currentTimeMillis();
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(url.openStream()))) {
            
            String inputLine = null;
            long finalTime = System.currentTimeMillis();
            responseTime = finalTime - startTime;
            //while ((inputLine = reader.readLine()) != null) {
             //   System.out.println(inputLine);
            //}
        } catch (IOException x) {
            System.err.println(x);
        }
    }
}