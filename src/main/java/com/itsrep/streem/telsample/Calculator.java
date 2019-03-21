package com.itsrep.streem.telsample;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

public class Calculator {

    private double x;
    private double y;
    private Operathions operathions;

    public Calculator(){};

    public Calculator(double x, double y, Operathions operathion) {
        this.x = x;
        this.y = y;
        this.operathions = operathion;
    }


    public void adOperathionToFile(String file) {

        // FileWriterClass fwr = new FileWriterClass();
        // FileWriter fr= fwr.fileWriterobj("Operathion.txt");
        try {
            FileWriter fw = new FileWriter(file, true);
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
            double result = 0;


            switch (operathions) {
                case ADD:
                    result = (this.x + this.y);
                    break;
                case SUB:
                    result = (this.x - this.y);
                    break;
                case MULT:
                    result = (this.x * this.y);
                    break;

                case DIV:
                    result = (this.x / this.y);
                    break;
            }
            String line = ("date: " + dateFormat.format(new Date()) + " New operation   " + operathions.toString()
                    + "  arguments :" + this.x + ";" + this.y + "  result: " + result+":\n");
            fw.write(line);
            fw.close();

        } catch (IOException ex) {
            System.err.println("Input/Output error");
            ex.printStackTrace();
        }
    }

    public void readOperathionHistory(String file)  {

        try{
        FileReader fr= new  FileReader (file);
        BufferedReader br= new  BufferedReader (fr);
        String line= "";
        while ((line = br.readLine())!=null)

            System.out.println(line);

        } catch (IOException ex) {
            System.err.println("Input/Output error");
            ex.printStackTrace();
        }

        }

    public  String OperathionHistoryToString (String file)  {

        StringBuilder s= new StringBuilder(10000);



        try{
            FileReader fr= new  FileReader (file);
            BufferedReader br= new  BufferedReader (fr);
            String line= "";
            while ((line = br.readLine())!=null)
                s.append(line+":\n");


        } catch (IOException ex) {
            System.err.println("Input/Output error");
            ex.printStackTrace();
        }
return s.toString();
    }


    }


