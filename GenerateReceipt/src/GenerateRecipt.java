import java.awt.*;
import static java.awt.Font.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.border.Border;

public class GenerateRecipt {
 static long totalPrice=0;
    static int count=1;
    static int k=0;
    public static void main(String[] args) {
        JFrame frame = new JFrame("Electronics Items");
        ImageIcon icon = new ImageIcon("");  //give your own image path
        frame.setIconImage(icon.getImage());

        frame.setSize(1400,900);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //FONT
        Font font1 = new Font("Copperplate Gothic",BOLD,20);
        Font font2 = new Font("Footlight MT",ITALIC,30);

        //border
        Border border= BorderFactory.createLineBorder(Color.red);


        final JPanel panel1= new JPanel();
        panel1.setBounds(1050, 100, 800, 800);    //total panel
        panel1.setBorder(border);
         panel1.setBackground(Color.gray);

        panel1.setLayout(new FlowLayout());
        frame.add(panel1);

      final JTextArea ta = new JTextArea();
        ta.setBounds(300,100,500,600);
        ta.setFont(font2);
        ta.setBackground(Color.black);
        ta.setForeground(Color.cyan);
        ta.setEditable(false);
        panel1.add(ta);


         final JTextArea ta1 = new JTextArea();
        ta1.setBounds(300,1000,500,600);
        ta1.setFont(font2);
        ta1.setBackground(Color.black);
        ta1.setForeground(Color.cyan);
        ta1.setEditable(false);
        panel1.add(ta1);

        panel1.setVisible(false);

        JPanel panel2= new JPanel();   //order menu panel
        panel2.setBounds(150, 100, 800, 800);
        panel2.setBackground(Color.gray);
        panel2.setBorder(border);
        panel2.setLayout(null);
        frame.add(panel2);

        JLabel lbl1= new JLabel("<html><h1>Electronics Items<br></h1</html>");
        lbl1.setForeground(Color.red);    //oreder heading
        lbl1.setFont(font1);
        lbl1.setBounds(300,10,200,75);
        panel2.add(lbl1);


        final JCheckBox[] cb = new JCheckBox[12];
        final String item[] ={"Computer","A.C","TV","Fridge","Mouse","Printer","Plotter","Pen-Drive","Camera","Key-Board","Speaker","Phone"};
        final long price[] ={30000,44000,12000,40000,300,5000,1000,800,999,500,8000,18000};
        int x1=100,y1=150;




        for(int i=0; i<item.length; i++){
            cb[k] = new JCheckBox();
            cb[k].setText(item[i]+"  "+price[i]+" Rs");
            cb[k].setBounds(x1,y1,220, 50);  //items panel
            cb[k].setFont(font1);
            cb[k].setBackground(Color.black);
            cb[k].setForeground(Color.cyan);
            panel2.add(cb[i]);

            k++;
            y1+=50;
            if(i==5){
               x1=500;
               y1=150;
            }

        }

        final JButton rec = new JButton("Generate Reciept");
        rec.setBounds(330,550,160,70);
        panel2.add(rec);
        rec.setBorder(border);
        frame.setVisible(true);


        final List list = new ArrayList();

        rec.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(count%2==0){
                    System.exit(0);
                }

                if(cb[0].isSelected()){
                    totalPrice+=price[0];
                    list.add(item[0]+"  "+price[0]+"Rs");
                }
                if(cb[1].isSelected()){
                    totalPrice+=price[1];
                    list.add(item[1]+"  "+price[1]+"Rs");
                }
                if(cb[2].isSelected()){
                    totalPrice+=price[2];
                    list.add(item[2]+"  "+price[2]+"Rs");
                }
                if(cb[3].isSelected()){
                    list.add(item[3]+"  "+price[3]+"Rs");
                    totalPrice+=price[3];
                }
                if(cb[4].isSelected()){
                    totalPrice+=price[4];
                    list.add(item[4]+"  "+price[4]+"Rs");
                }
                if(cb[5].isSelected()){
                    totalPrice+=price[5];
                    list.add(item[5]+"  "+price[5]+"Rs");
                }
                if(cb[6].isSelected()){
                    totalPrice+=price[6];
                    list.add(item[6]+"  "+price[6]+"Rs");
                }
                if(cb[7].isSelected()){
                    totalPrice+=price[7];
                    list.add(item[7]+"  "+price[7]+"Rs");
                }
                if(cb[8].isSelected()){
                    totalPrice+=price[8];
                    list.add(item[8]+"  "+price[8]+"Rs");
                }
                if(cb[9].isSelected()){
                    totalPrice+=price[9];
                    list.add(item[9]+"  "+price[9]+"Rs");
                }
                rec.setText("Exit");

                int i=0;
                for(Object items : list){
                    i++;
                    ta.append("           ");
                    ta.append(i +".  "+items+"\n");
                }
                ta.append("       ---------------------------------\n");
                ta.append("            Total Price  :"+totalPrice+" Rs              \n  ");
                ta1.append("Thank You For Purchasing ");
                ta1.append("\nElectronic Items..!!");
                count++;

                panel1.setVisible(true);
            }
        });

    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
