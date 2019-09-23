package com.neuedu.demo3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MyDataSource {

    private List<Connection> connectionList = new ArrayList<>();
    
    public MyDataSource(String url,String username,String password){
        init(url,username,password);
    }

    private void init(String url, String username, String password) {
            try {
                for (int i = 0; i < 10; i++) {
                    connectionList.add(DriverManager.getConnection(url,username,password));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            new Thread(()->{
                try {
                    Thread.sleep(5000);
                    if (connectionList.size()<5) {
                        try {
                            for (int i = 0; i < 5; i++) {
                                connectionList.add(DriverManager.getConnection(url,username,password));
                            }
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
    }

    public Connection getConnection(){
        return connectionList.remove(0);
    }

}
