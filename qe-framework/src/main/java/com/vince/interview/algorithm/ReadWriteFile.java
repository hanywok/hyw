package com.vince.interview.algorithm;

import java.io.*;
import java.net.URISyntaxException;

/**
 * Created by Vincent Han
 * on Date: 2017/12/9
 * on Time: 9:41
 **/
public class ReadWriteFile {

    public static void RWFile(){
        try {
            //way one
            File f=new File(Test.class.getClass().getClassLoader().getResource("ABC.PDF").toURI().getPath());
             FileReader fileReader=new FileReader(f);
            BufferedReader reader1=new BufferedReader(fileReader);
            //way two
            InputStream fileStream=Test.class.getResourceAsStream("abc");
            BufferedReader reader=new BufferedReader(new InputStreamReader(fileStream));
            String temp;
            while((temp=reader.readLine())!=null){

            }

            BufferedWriter writer=new BufferedWriter(new FileWriter(f));
            writer.write(temp);
            writer.close();
        } catch (URISyntaxException |IOException e) {
            e.printStackTrace();
        }

    }
}
