package com.codegym.task.task18.task1809;

/* 
Reversing a file
Read 2 file names from the console: file1, file2.
Write all the bytes in file1 to file2, but in the reverse order.
Close the streams.


Requirements:
1. The program should read a file name twice from the console.
2. Use FileInputStream to read from a file, and use FileOutputStream to write to a file.
3. In the second file, you need to write all the bytes from the first file in the reverse order.
4. The FileInputStream and FileOutputStream must be closed.

*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {

        ArrayList<Integer> bytes = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        FileInputStream inputStream = new FileInputStream(file1);
        FileOutputStream outputStream = new FileOutputStream(file2);

        while(inputStream.available() > 0) {
            int data = inputStream.read();
            bytes.add(data);
        }
        inputStream.close();

        Collections.reverse(bytes);

        for (Integer bt : bytes) {
            outputStream.write(bt);
        }
        outputStream.close();

    }
}
