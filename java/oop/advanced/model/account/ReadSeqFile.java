package oop.advanced.model.account;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class ReadSeqFile extends Frame implements ActionListener {
    private TextField account,name,balance;
    private  Button next, done;

    private DataInputStream input;   //필드에 입력된 account, name, balance 의 스트링객체를 담는 객체

    public ReadSeqFile(){
        super("Read Costomer Information");
       try{
            input = new DataInputStream(new FileInputStream("client.doc"));
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        setSize(250,150);
        setLayout(new GridLayout(4,2));
        account = new TextField();
        account.setEditable(false);
        add(account);
        add(new Label("name"));
        name = new TextField(20);
        name.setEditable(false);
        add(name);

        //balance Frame에 붙이기
        add(new Label("balance"));
        balance = new TextField(20);
        balance.setEditable(false);
        add(balance);

        next = new Button("output");
        next.addActionListener(this);
        add(next);

       done = new Button("cancel");
        done.addActionListener(this);
        add(done);

        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getSource() == next) readRecord();    // 데이터를 한 레코드씩 읽는 메서드
            else closeFile();

    }

    public void closeFile() {
        try{
            input.close();
            System.exit(0);
        }catch (IOException io){
            System.err.println(io.toString());
            System.exit(1);
        }
    }

    public void readRecord() {
        String accountNumber;
        String balance;
        String nameData;

        try{
           accountNumber =  input.readUTF();
           nameData = input.readUTF();
           balance = input.readUTF();

           this.account.setText(accountNumber);
           this.name.setText(nameData);
           this.balance.setText(balance);

        }catch (EOFException e1){
            closeFile();

        }catch (IOException e2){
            System.err.println(e2.toString());

        }

    }
    public static void main(String args[]){
        new ReadSeqFile();
    }
}
