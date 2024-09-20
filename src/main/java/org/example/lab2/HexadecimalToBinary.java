package org.example.lab2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HexadecimalToBinary {
    List<String> hexToBinary = new ArrayList<>();
    public HexadecimalToBinary() {
        testHexadecimalToBinary(new Scanner(System.in));
    }

    private void testHexadecimalToBinary(Scanner scanner) {
        System.out.println("Enter a hexadecimal string: ");
        String hexStr = scanner.nextLine().trim();
        String result = "";
        for (int indexHexStr = 0; indexHexStr < hexStr.length(); indexHexStr++ ) {
            hexToBinary.add(hexadecimalToBinary(Character.toString(hexStr.charAt(indexHexStr))));
            result += " " + hexToBinary.get(indexHexStr) + " ";
        }
        String caption = "The equivalent binary for hexadecimal " + hexStr + " is : " + result;
        System.out.println(caption);

    }

    String hexadecimalToBinary(String hexStr){
        String result = "";
        String showStringBinary = "";
        int decimal = new HexadecimalToDecimal(true).hexadecimalToDecimal(hexStr);
        while (decimal >0 ){
            result += String.valueOf((decimal % 2));
            decimal /= 2;
        }
        for (int charIdx = result.length() - 1; charIdx >= 0; charIdx --) {
            showStringBinary += result.charAt(charIdx);
        }
        return  showStringBinary;
    }
}
