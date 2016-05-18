package socket;

import java.awt.Color;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dell-pc
 */
public class Jserver extends javax.swing.JFrame {
    static String usersStr = "";
    //保存客户端连接
    private static java.util.List<Socket> userList = new ArrayList<>();

    /**
     * Creates new form JFlogin
     */
    public Jserver() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        btnserA = new javax.swing.JButton();
        btnserB = new javax.swing.JButton();
        btnserC = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
                jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
                jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("宋体", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("服务器监听客户端");

        btnserA.setBackground(new java.awt.Color(255, 0, 0));
        btnserA.setText("客户端A");
        btnserA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnserAActionPerformed(evt);
            }
        });

        btnserB.setBackground(new java.awt.Color(255, 0, 0));
        btnserB.setText("客户端B");
        btnserB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnserBActionPerformed(evt);
            }
        });

        btnserC.setBackground(new java.awt.Color(255, 0, 0));
        btnserC.setText("客户端C");
        btnserC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnserCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(174, 174, 174)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(btnserC)
                                                        .addComponent(btnserB)
                                                        .addComponent(btnserA)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(76, 76, 76)
                                                .addComponent(jLabel1)))
                                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel1)
                                .addGap(49, 49, 49)
                                .addComponent(btnserA)
                                .addGap(18, 18, 18)
                                .addComponent(btnserB)
                                .addGap(18, 18, 18)
                                .addComponent(btnserC)
                                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void btnserBActionPerformed(java.awt.event.ActionEvent evt) {

        // TODO add your handling code here:
    }

    private void btnserAActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnserCActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify
    private javax.swing.JButton btnserA;
    private javax.swing.JButton btnserB;
    private javax.swing.JButton btnserC;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration

    public JButton getbtnserA() {
        return btnserA;
    }

    public JButton getbtnserB() {
        return btnserB;
    }

    public JButton getbtnserC() {
        return btnserC;
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Jserver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jserver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jserver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jserver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        Jserver jserver = new Jserver();
        jserver.setVisible(true);
        ServerSocket s = null;

        try {
            s = new ServerSocket(8888);
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (true) {
            try {
                //阻塞态，等待客户端接入
                Socket s1 = s != null ? s.accept() : null;
                (new Thread(new Runner(s1, jserver))).start();

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    private static void sendToAll(){
//        System.out.println(userList);
        //遍历客户端，向所有用户发消息
        for (Socket s : userList) {
            try {
                PrintWriter w = new PrintWriter(s.getOutputStream(), true);
                //发送消息
                w.println(usersStr);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    /**
     * 内部内，方便操作
     */
    static class Runner implements Runnable {


        private Socket socket = null;
        private Jserver jserver;
        BufferedReader reader;
        String name = "";

        Runner(Socket socket, Jserver jserver) {
            this.socket = socket;
            this.jserver = jserver;

        }

        @Override
        public void run() {

            try {
                //输入流
                reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                //通过 name == X- ？ 判断是否在线
                boolean isOnline = !name.equals(name + "-");
                //用户在线时循环发送
                while(isOnline) {
                    //读取某一个用户名
                    name = reader.readLine();
                    //拼接后的所有用户
                    usersStr += name + ",";
                    //保存客户端用户
                    userList.add(socket);
                    //给所有用户发送消息
                    sendToAll();

                    //检测客户端上线下线状态
                    switch (name) {
                        case "A":
                            jserver.getbtnserA().setBackground(Color.green);
                            break;
                        case "B":
                            jserver.getbtnserB().setBackground(Color.green);
                            break;
                        case "C":
                            jserver.getbtnserC().setBackground(Color.green);
                            break;
                        case "A-":
                            jserver.getbtnserA().setBackground(Color.red);
                            break;
                        case "B-":
                            jserver.getbtnserB().setBackground(Color.red);
                            break;
                        case "C-":
                            jserver.getbtnserC().setBackground(Color.red);
                            break;
                    }
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

