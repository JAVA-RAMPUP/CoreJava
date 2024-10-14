package FileOP;

import java.io.*;
import java.text.SimpleDateFormat;

public class Main {


    public static void main(String[] args)  {

        try {
            File f= new File("Assests/example.txt");
            System.out.println( f.createNewFile());

            System.out.println(    f.lastModified());

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

            System.out.println( sdf.format(f.lastModified()) );

//f.setReadOnly();
            BufferedReader br =new BufferedReader( new FileReader(f) );

            while(br.ready()) {
                System.out.println(br.readLine());
            }


//            FileOutputStream fos = new FileOutputStream(f);
//
//            String contentToWrite ="Writing to file";
//            byte[] bytesArr = contentToWrite.getBytes();
//
//
//            fos.write(bytesArr);
//            fos.close();

FileWriter writer = new FileWriter(f,true);

BufferedWriter bw = new BufferedWriter(writer);
            String contentToAppend="appending to file";
bw.write(contentToAppend);
bw.close();






        }catch (IOException e){
            System.out.println(e.getMessage());
        }



    }
}
