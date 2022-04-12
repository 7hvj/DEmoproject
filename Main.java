package p1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Main {
    static JLabel label_plus = new JLabel("||");
    static JLabel label_result1 = new JLabel();
    static JLabel label_result2 = new JLabel();
    static JFrame frame = new JFrame("Blot calculator");
    static JTextField text_field_1 = new JTextField();
    static JTextField text_field_2 = new JTextField();
    static JButton button = new JButton("أحسب");

    public static void main(String[] args) {

        label_plus.setBounds(135, 40, 50, 30);
        label_result1.setBounds(100,150, 80, 50);
        label_result2.setBounds(150,150, 80, 50);
        text_field_1.setBounds(40, 40, 80, 30);
        text_field_2.setBounds(160, 40, 80, 30);
        button.setBounds(100,100, 80, 50);

        frame.add(label_plus);
        frame.add(label_result1);
        frame.add(label_result2);
        frame.add(text_field_1);
        frame.add(text_field_2);
        frame.add(button);

        frame.setSize(310, 540);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int sum1=0;
                int sum2=0;
                do {

                    Double value1= Double.valueOf(text_field_1.getText());
                    Double value2= Double.valueOf(text_field_2.getText());
                    sum1+=value1;
                    sum2+=value2;
                    if (sum1>=152&&sum2>=152){
                        int temp=sum1;
                        if (temp>sum2)
                        {
                            label_result1.setText("لنا: "+sum1);

                        }
                        else {
                            label_result2.setText("لهم: "+sum2);
                        }
                    }
                    else if (sum1>=152){
                        label_result1.setText("لنا: "+sum1);
                        break;
                    }
                    else if (sum2>=152){
                        label_result2.setText("لهم: "+sum2);
                        break;
                    }
                    else {
                        label_result1.setText("لنا: "+sum1);
                        label_result2.setText("لهم: "+sum2);
                    }

                }while (sum1<152&&sum2<152);



            }
        });
        /////////////////////////////////////////////////////////////////////
	  /*  int V1;
	    int V2 ;
        int sum1=0;
        int sum2=0;
        Scanner input=new Scanner(System.in);
        do {
            System.out.println("لنا: ");
            V1=input.nextInt();
            System.out.println("لهم: ");
            V2=input.nextInt();
            sum1+=V1;
            sum2+=V2;
            if (sum1>=152&&sum2>=152){
                int temp=sum1;
                if (temp>sum2)
                {
                    System.out.println("لنا: "+sum1);
                }
                else {
                    System.out.println("لهم: "+sum2);
                }
            }
            else if (sum1>=152){
                System.out.println("لنا: "+sum1);
                break;
            }
            else if (sum2>=152){
                System.out.println("لهم: "+sum2);
                break;
            }
            else {
                System.out.println("لنا: "+sum1);
                System.out.println("لهم: "+sum2);
            }

        }while (sum1<152&&sum2<152);*/
    }
}
