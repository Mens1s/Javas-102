package L_IODataFlows;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

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
        /* BYTE ARRAY output
        String data = "Java 102 dersleri ! ";

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        byte[] dataByteArray = data.getBytes();

        try {
            output.write(dataByteArray);
            System.out.println("EXIT FLOW : " + output);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        */
        /*  serialization
        Car c1 = new Car("BMW", "M4");

        try{
            FileOutputStream outputFile = new FileOutputStream("src/L_IODataFlows/outputFile.txt");
            ObjectOutputStream output = new ObjectOutputStream(outputFile);
            output.writeObject(c1);
            output.close();

        }catch (Exception e){
            e.printStackTrace();
        }

        try{
            FileInputStream inputFile = new FileInputStream("src/L_IODataFlows/outputFile.txt");
            ObjectInputStream input = new ObjectInputStream(inputFile);

            Car newCar = (Car) input.readObject();

            System.out.println(newCar.getBrand() + "- : - : -" + newCar.getModel());

        }catch (Exception e){
            e.printStackTrace();
        }
        */
        /* bufferStream
        try{
            FileInputStream fileInput = new FileInputStream("src/L_IODataFlows/MENS1S.txt");
            BufferedInputStream buffInput = new BufferedInputStream(fileInput);

            int i = buffInput.read();
            while(i != -1){
                System.out.print((char)i);
                i = buffInput.read();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        try{
            FileOutputStream fileOutput = new FileOutputStream("src/L_IODataFlows/MENS1S.txt");
            BufferedOutputStream buffOutput = new BufferedOutputStream(fileOutput);

            String data = "This text will be added to output stream!\nOK?";
            byte[] byteData = data.getBytes();

            buffOutput.write(byteData);
            buffOutput.close();
            fileOutput.close();
        }catch (Exception e){
            e.printStackTrace();
        }
         */
        /* printStream
        try{
            PrintStream output = new PrintStream("src/L_IODataFlows/outputStream.txt");
            output.print(124567);
            output.close();
        }catch (Exception e){
            e.printStackTrace();
        }
         */
        /* utf8
        try{

            FileInputStream fileInput = new FileInputStream("src/L_IODataFlows/MENS1S.txt");

            InputStreamReader inputReader = new InputStreamReader(fileInput, StandardCharsets.UTF_8);
            System.out.println(inputReader.getEncoding());

            int i = inputReader.read();
            while(i != -1){
                System.out.print((char) i );
                i = inputReader.read();
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        */
        /* output utf8
        try{
            String data = "ĞÜŞİ";
            FileOutputStream fileOutputStream = new FileOutputStream("src/L_IODataFlows/MENS1S.txt");

            OutputStreamWriter fileWriter = new OutputStreamWriter(fileOutputStream, Charset.forName("UTF8"));
            fileWriter.write(data); // fileOutputStream.write(data.getBytes());

            fileWriter.close();
            fileOutputStream.close();

        }catch (Exception e){
            e.printStackTrace();
        }
        */
        /* fileReader
        try{
            FileReader readFile = new FileReader("src/L_IODataFlows/MENS1S.txt", StandardCharsets.UTF_8);
            int i = readFile.read();

            while(i != -1){
                System.out.print((char) i);
                i = readFile.read();
            }

            readFile.close();
        }catch (Exception e){
            e.printStackTrace();
        }

        try{
            FileWriter writeFile = new FileWriter("src/L_IODataFlows/MENS1S.txt", StandardCharsets.UTF_8);

            writeFile.write("İNCE DENÖDEÜ");
            writeFile.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        */

        /*
        try {
            FileReader readFile = new FileReader("src/L_IODataFlows/MENS1S.txt", StandardCharsets.UTF_8);
            BufferedReader buffRead = new BufferedReader(readFile);

            String line = buffRead.readLine();
            while(line != null){
                System.out.println(line);
                line = buffRead.readLine();
            }
            readFile.close();
            buffRead.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            File f = new File("src/L_IODataFlows/MENS1S.txt");
            FileWriter writeFile = new FileWriter(f);
            BufferedWriter buffWrite = new BufferedWriter(writeFile);

            String data = "İASDASD1O23İĞÜ";

            buffWrite.write(data);

            buffWrite.close();
            writeFile.close();



        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        */

        String data = "JAVA 102 ";
        try{
            PrintWriter writer = new PrintWriter("src/L_IODataFlows/MENS1S.txt");
            writer.write(data);
            writer.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
