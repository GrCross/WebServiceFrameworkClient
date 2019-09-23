/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientesftp;


import java.io.*;
import java.net.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
/**
 *
 * @author daniel
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static int poolSize = 5000;
    public static ExecutorService pool;
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        
        pool = Executors.newFixedThreadPool(poolSize);
        URL url = new URL(args[0]);
        Reader[] readers = new Reader[poolSize];
        for (int i = 0; i < poolSize; i++)  readers[i] = new Reader(url,i);
        for (int i = 0; i < poolSize; i++) {
            pool.execute(readers[i]);
        }
        pool.shutdown();
        pool.awaitTermination(5, TimeUnit.MINUTES);
        System.out.println(pool.isTerminated());
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
          new FileOutputStream("resultados.txt"), "utf-8"));
        int lose = 0;
        for (int i = 0; i < poolSize; i++) {
            if(readers[i].responseTime == 0)lose+=1;
            
        }
        writer.write(String.valueOf(lose));
            writer.newLine();
        writer.close();
       
    }
}
