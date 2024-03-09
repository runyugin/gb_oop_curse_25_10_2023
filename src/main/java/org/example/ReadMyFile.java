package org.example;

import java.io.*;

public class ReadMyFile {

    private File myFile;

    public ReadMyFile(String s) {
        this.myFile = new File(s);
    }

    public String readFile(){

            StringBuilder resultStringBuilder = new StringBuilder();
            try (FileInputStream inputStream = new FileInputStream(myFile);
                 BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
                String line;
                while ((line = br.readLine()) != null) {
                    resultStringBuilder.append(line).append("\n");
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        return resultStringBuilder.toString().replaceAll("\\R","").trim();


    }

}
