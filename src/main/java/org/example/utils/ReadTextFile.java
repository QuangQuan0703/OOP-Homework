package org.example.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadTextFile {
    static FileInputStream fileInputStream = null;
   static BufferedReader bufferedReader = null;

   // readFile dùng để đọc file từ bên ngoài vào như file text sử dụng BufferedReader
    public static String readFile(String fileName) {
        String document = "" ;
        try {
            fileInputStream = new FileInputStream(fileName.trim());
            bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            String checkLineNull = "";
            do {
                checkLineNull = bufferedReader.readLine();
                document += checkLineNull != null ? checkLineNull : "";
            }while (checkLineNull != null);
            return  document;
        } catch (IOException ex) {
            //Logger.getLogger(ReadFileWithBufferedReader.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                bufferedReader.close();
                fileInputStream.close();
            } catch (IOException ex) {
               // Logger.getLogger(ReadFileWithBufferedReader.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return document;
    }

    // filterCharacter dùng để lọc những kí tự đặc biệt khác chữ từ a-z
    public static ArrayList<String> filterCharacter ( String words ){
        String [] listWord = words.split(" ");
        for(int indexOfWord = 0; indexOfWord < listWord.length; indexOfWord++){
            listWord[indexOfWord] = listWord[indexOfWord].replaceAll("[^a-zA-Z]", "");
        }
        return new ArrayList<>(Arrays.asList(listWord));
    }
}
