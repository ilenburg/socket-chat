package com.chat;

import com.chat.model.Config;
import com.chat.ui.ConfiguracaoUI;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChatApplication {

	public static void main(String[] args) {
            
            ConfiguracaoUI configuracaoUI = new ConfiguracaoUI();

            configuracaoUI.pack();
            configuracaoUI.setLocationRelativeTo(null);
            configuracaoUI.setVisible(true);

	}
}
