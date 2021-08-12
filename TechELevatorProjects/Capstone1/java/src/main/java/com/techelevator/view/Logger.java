//package com.techelevator.view;

//import com.techelevator.VendingMachineCLI;
//
//import java.io.*;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//
//public class Logger {
//
//    File logFile = new File("log.txt");
//    boolean append = logFile.exists() ? true : false;
//
//    public void printLog (String log, VendingMachineCLI cli){
//        try(PrintWriter writer = new PrintWriter(new FileOutputStream(logFile, append)) ){
//
//            LocalDateTime dateTime = LocalDateTime.now();
//            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss");
//            writer.println(formatter.format(dateTime) + " "+  log +": $" + cli.register.displayUserBalance() + " $" + cli.register.displayVendingMachineBalance());;
//
//        }catch(FileNotFoundException ex){
//            System.out.println("Could not write to log" + ex.getMessage());
//        }
//
//    }





//}
//
//        private String fileName = "log.txt";
//        private File fileLog = new File(fileName);
//        public boolean noLog = !fileLog.exists();
//
//        try(PrintWriter writer = new PrintWriter(new FileOutputStream(fileName, append)) ){
//        LocalDateTime dateTime = LocalDateTime.now();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss");
//        writer.println(formatter.format(dateTime) + " Feed Money: $" + register.displayUserBalance() + " $" + register.displayVendingMachineBalance());;
//    }catch(FileNotFoundException ex){
//        System.out.println("Could not write to log" + ex.getMessage());
//    }
//
//
//        public void createNewFile(){
//        try {
//            fileLog.createNewFile();
//        } catch(IOException e){
//            System.out.println("A file error exists:" + e.getMessage());
//        }
//    }
//
//        public String logEvent(){
//        try (PrintWriter pw = new PrintWriter(fileLog){
//
//        } catch(FileNotFoundException e) {
//        }
//    }
//    }
