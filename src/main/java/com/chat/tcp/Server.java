/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chat.tcp;

import java.net.*;
import java.io.*;

/**
 *
 * @author Ian
 */
public class Server{
    
   private ServerSocket serverSocket;
   
   public Server(int port) throws IOException {
      serverSocket = new ServerSocket(port);
      serverSocket.setSoTimeout(20000);
   }
   
   public Socket listen() throws IOException{
       Socket clientSocket = serverSocket.accept();
       close();
       return clientSocket;
   }
   
   public void close() throws IOException{
       serverSocket.close();
   }
}
