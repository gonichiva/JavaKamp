package com.company;

import java.io.File;

public class Main {

    public static void main(String[] args) {

		LogManager logManager = new LogManager();
		logManager.log(2);

            CustomerManager customerManager = new CustomerManager();
            customerManager.add(new EmailLogger());

            DatabaseLogger databaseLogger= new DatabaseLogger();
            databaseLogger.log();

             FileLogger filelogger= new FileLogger();
             filelogger.log();

    }}

