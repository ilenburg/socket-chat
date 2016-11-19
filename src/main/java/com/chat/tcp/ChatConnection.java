/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chat.tcp;

import java.net.*;
import java.io.*;
import javax.swing.JTextArea;

/**
 *
 * @author Ian
 */
public class ChatConnection extends Thread{
    
    private final String userName;
    private final Socket clientSocket;
    private final DataOutputStream out;
    private final DataInputStream in;
    private JTextArea textBox;
    
    public ChatConnection(String serverName, int port, String userName) throws IOException {
        clientSocket = new Socket(serverName, port);
        out = new DataOutputStream(clientSocket.getOutputStream());
        in = new DataInputStream(clientSocket.getInputStream());
        this.userName = userName;
    }
    
     public ChatConnection(Socket newSocket, String userName) throws IOException {
        clientSocket = newSocket;
        out = new DataOutputStream(clientSocket.getOutputStream());
        in = new DataInputStream(clientSocket.getInputStream());
        this.userName = userName;
    }
     
    public String read() throws IOException {
        return in.readUTF();
    }
    
    public void setBuffer(JTextArea textBox) {
        this.textBox = textBox;
    }
     
    public void run() {
        while (true) {
            try {
                textBox.append(read() + "\n");
            }
            catch(IOException e) {
                try {
                    disconnect();
                }
                catch(IOException ex)
                {
                }
                finally {
                    break;
                }
            }
        }
    }
    
    public void disconnect() throws IOException {
        clientSocket.close();
    }
    
    public String send(String msg) throws IOException {
        String output = userName + " diz: " + msg;
        out.writeUTF(output);
        return output;
    }

}
