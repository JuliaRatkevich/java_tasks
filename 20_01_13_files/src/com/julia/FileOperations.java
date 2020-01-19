package com.julia;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class FileOperations {

    public void intsToFile(List<Integer> ints, String filename) throws IOException {
        StringBuilder builder = new StringBuilder();
        for (Integer current : ints) {
            builder.append(current);
            builder.append(" ");
        }

        bytesToFile(builder.toString().getBytes(),filename);

    }

    private void bytesToFile(byte[] bytes, String filename) throws IOException {
        FileOutputStream fos = new FileOutputStream(filename, false);
        try {
            fos.write(bytes);
        } finally {
            fos.close();
        }
    }


    public List<Integer> fileToInts(String filename) throws IOException {
        byte[] bytes = fileToBytes(filename);
        List<Integer> integers = new ArrayList<Integer>();
        String fileContent = new String(bytes);
        String[] stringIntegers = fileContent.split(" ");
        for (String stringInt : stringIntegers) {
            Integer i = Integer.parseInt(stringInt);
            integers.add(i);
        }
        return integers;

    }

    private byte[] fileToBytes(String filename) throws IOException {
        FileInputStream fis = new FileInputStream(filename);
        int length = fis.available();
        byte[] bytes = new byte[length];
        try {
            fis.read(bytes);  //используя файл иипутстрим производим чтение из файла и записываем информацию в массив байтс
        } finally {
            fis.close(); //независимо от результата закрываем импутстрим
        }

        return bytes;
    }

}
