package ru.mirea.task15.opt1;

import java.io.*;
import java.util.Scanner;

public class TestClass151 {
    public void Input(String address, Scanner in){
           try(FileWriter writer = new FileWriter(address, true)){
            String line = in.nextLine();
            writer.write(line);
            writer.append('\n');
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void Output(String address){
        try {
            FileReader reader = new FileReader(address);
            BufferedReader reader1 = new BufferedReader(reader);
            String line = reader1.readLine();
            while (line != null){
                System.out.println(line);
                line = reader1.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void Rewriting(String address, Scanner in){
        try(FileWriter writer = new FileWriter(address, false)){
            String line = in.nextLine();
            writer.write(line);
            writer.append('\n');
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        String address = "C:\\Users\\OnliF\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task15\\opt1\\Text.txt";

        TestClass151 testClass151 = new TestClass151();
        testClass151.Input(address, in);
        testClass151.Input(address, in);
        testClass151.Output(address);
        testClass151.Rewriting(address, in);
        testClass151.Output(address);

    }
}
