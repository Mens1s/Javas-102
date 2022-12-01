package L_IODataFlows;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        //File dosya = new File("patika.txt");

        /* create file
        try {
            if(dosya.createNewFile())
                System.out.println(dosya.getName() + " File created!");
            else
                System.out.println("File cannot created! It has already in here!");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        */

        /* delete File
        if(dosya.delete())
            System.out.println("File deleted! ");
        else System.out.println("File cannot deleted!");,
         */

        /* read file
        try {
            //File dosya = new File("src/L_IODataFlows/MENS1S.txt");
            //FileInputStream input = new FileInputStream(dosya);
            FileInputStream input = new FileInputStream("src/L_IODataFlows/MENS1S.txt");
            int i = input.read();
            while(i != -1){
                System.out.print((char)i);
                i = input.read();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        */
        /* write file
        try {
            String text = "\nThis text will be added to output stream!\nOK?";
            FileOutputStream output = new FileOutputStream("src/L_IODataFlows/MENS1S.txt",true); // append varsayilan olarak false eger true yazmazsan siler icini
            output.write(text.getBytes());
            output.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        */
        /* bytearray input
        byte[] dizi = {1,2,3,54,66};
        ByteArrayInputStream input = new ByteArrayInputStream(dizi);

        int i = input.read();

        while(i!=-1){ // skip methodu available
            System.out.println(i);
            i = input.read();
        }

        try {
            input.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        */
        String data = "Java 102 dersleri ! ";
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        byte[] dataByteArray = data.getBytes();

        try {
            output.write(dataByteArray);
            System.out.println("EXIT FLOW : " + output);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
