
import java.awt.*;
import javax.swing.*;
import java.net.*;
import java.awt.event.*;
import java.awt.event.ActionListener;


public class Calculator  extends Frame implements ActionListener {

    Frame f = new Frame();
    TextField t1;


    Button b = new Button("AC");
    Button b1 = new Button("1");
    Button b2 = new Button("2");
    Button b3 = new Button("3");
    Button b4 = new Button("4");
    Button b5 = new Button("5");
    Button b6 = new Button("6");
    Button b7 = new Button("7");
    Button b8 = new Button("8");
    Button b9 = new Button("9");
    Button b13 = new Button("%");
    Button b0 = new Button("0");
    Button b11 = new Button("+");
    Button b12 = new Button("-");

    Button b14 = new Button("*");
    Button b15 = new Button(".");
    Button b16 = new Button("=");
    Button b17 = new Button("DEL");
    Button b18 = new Button("/");
    Button b19 = new Button("X!");

    Button b20 = new Button("EVEN/ODD");
    Button b21 = new Button("S NATU NO");
    Button b22 = new Button("^2");
    Button b23 = new Button("^3");
    Button b24 = new Button("S ODD N");
    Button b25 = new Button("Squ Root");
    Button b26 = new Button("Cub root");
    Button b27 = new Button("Sin");
    Button b28 = new Button("Cos");
    Button b29 = new Button("Tan");
    Button b34 = new Button("");

    Button b30 = new Button("Cosh");
    Button b31 = new Button("Tanh");
    Button b32 = new Button("Sinh");
    Button b33 = new Button("HS");
//        Label l = new Label("FIRST NO");
//        Label l1= new Label("SECOND NO");

    double x, y, check;
    double total;

    Calculator() {

        t1 = new TextField();

        t1.setBackground(Color.WHITE);
        t1.setFont(new Font("arial",Font.BOLD,20));
        t1.setBounds(120, 80, 275, 90);
//            l.setBounds(130, 90, 60, 20);
//            l1.setBounds(130, 130, 60, 20);

        b.setBounds(120, 190, 60, 30);
        b17.setBounds(190, 190, 60, 30);
        b19.setBounds(260, 190, 60, 30);
        b18.setBounds(330, 190, 60, 30);

        b1.setBounds(120, 230, 60, 30);
        b2.setBounds(190, 230, 60, 30);
        b3.setBounds(260, 230, 60, 30);
        b11.setBounds(330, 230, 60, 30);

        b4.setBounds(120, 270, 60, 30);
        b5.setBounds(190, 270, 60, 30);
        b6.setBounds(260, 270, 60, 30);
        b12.setBounds(330, 270, 60, 30);

        b7.setBounds(120, 310, 60, 30);
        b8.setBounds(190, 310, 60, 30);
        b9.setBounds(260, 310, 60, 30);
        b14.setBounds(330, 310, 60, 30);

        b13.setBounds(120, 360, 60, 30);
        b0.setBounds(190, 360, 60, 30);
        b15.setBounds(260, 360, 60, 30);
        b16.setBounds(330, 360, 60, 30);

        b20.setBounds(120, 400, 70, 30);
        b21.setBounds(200, 400, 70, 30);
        b22.setBounds(280, 400, 50, 30);
        b23.setBounds(340, 400, 50, 30);

        b24.setBounds(120, 440, 60, 30);
        b25.setBounds(190, 440, 60, 30);
        b26.setBounds(260, 440, 60, 30);
        b27.setBounds(330, 440, 60, 30);

        b28.setBounds(120, 480, 60, 30);
        b29.setBounds(190, 480, 60, 30);
        b30.setBounds(260, 480, 60, 30);
        b31.setBounds(330, 480, 60, 30);

        b32.setBounds(120, 520, 60, 30);
        b33.setBounds(190, 520, 60, 30);
        b34.setBounds(260, 520, 60, 30);


        b1.setBackground(Color.BLUE);
        b2.setBackground(Color.BLUE);
        b15.setBackground(Color.BLUE);
        b6.setBackground(Color.BLUE);
        b3.setBackground(Color.BLUE);
        b4.setBackground(Color.BLUE);
        b5.setBackground(Color.BLUE);
        b7.setBackground(Color.BLUE);
        b8.setBackground(Color.BLUE);
        b9.setBackground(Color.BLUE);
        b0.setBackground(Color.BLUE);


        b.setBackground(Color.YELLOW);
        b11.setBackground(Color.YELLOW);
        b12.setBackground(Color.YELLOW);
        b13.setBackground(Color.YELLOW);
        b14.setBackground(Color.YELLOW);
        b15.setBackground(Color.YELLOW);
        b16.setBackground(Color.YELLOW);
        b17.setBackground(Color.YELLOW);
        b18.setBackground(Color.YELLOW);
        b19.setBackground(Color.YELLOW);
        b20.setBackground(Color.YELLOW);
        b21.setBackground(Color.YELLOW);
        b22.setBackground(Color.YELLOW);
        b23.setBackground(Color.YELLOW);
        b24.setBackground(Color.YELLOW);
        b25.setBackground(Color.YELLOW);
        b28.setBackground(Color.YELLOW);
        b26.setBackground(Color.YELLOW);
        b27.setBackground(Color.YELLOW);
        b29.setBackground(Color.YELLOW);
        b30.setBackground(Color.YELLOW);
        b31.setBackground(Color.YELLOW);
        b32.setBackground(Color.YELLOW);
        b33.setBackground(Color.YELLOW);
        b34.setBackground(Color.YELLOW);


        f.add(t1);
        //f.add(l);
        //f.add(l1);

        f.add(b);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(b13);
        f.add(b0);
        f.add(b15);
        f.add(b11);
        f.add(b12);
        f.add(b14);
        f.add(b16);
        f.add(b17);
        f.add(b18);
        f.add(b19);
        f.add(b20);
        f.add(b21);
        f.add(b22);
        f.add(b23);
        f.add(b24);
        f.add(b25);
        f.add(b26);
        f.add(b27);
        f.add(b28);
        f.add(b29);
        f.add(b30);
        f.add(b31);
        f.add(b32);
        f.add(b33);
        f.add(b34);

        f.setBackground(Color.GREEN);
        f.setSize(600, 600);
        f.setLocation(160,40);
        f.setLayout(null);
        f.setTitle("GUI program");
        f.setVisible(true);
        b.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);
        b21.addActionListener(this);
        b22.addActionListener(this);
        b23.addActionListener(this);
        b24.addActionListener(this);
        b25.addActionListener(this);
        b26.addActionListener(this);
        b27.addActionListener(this);
        b28.addActionListener(this);
        b29.addActionListener(this);
        b30.addActionListener(this);
        b31.addActionListener(this);
        b32.addActionListener(this);
        b33.addActionListener(this);
        b34.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String z, zt;
        if (e.getSource() == b1) {
            zt = t1.getText();
            z = zt + "1";
            t1.setText(z);

        }
        if (e.getSource() == b2) {
            zt = t1.getText();
            z = zt + "2";
            t1.setText(z);

        }
        if (e.getSource() == b3) {
            zt = t1.getText();
            z = zt + "3";
            t1.setText(z);

        }
        if (e.getSource() == b4) {
            zt = t1.getText();
            z = zt + "4";
            t1.setText(z);

        }
        if (e.getSource() == b5) {
            zt = t1.getText();
            z = zt + "5";
            t1.setText(z);

        }
        if (e.getSource() == b6) {
            zt = t1.getText();
            z = zt + "6";
            t1.setText(z);

        }
        if (e.getSource() == b7) {
            zt = t1.getText();
            z = zt + "7";
            t1.setText(z);

        }
        if (e.getSource() == b8) {
            zt = t1.getText();
            z = zt + "8";
            t1.setText(z);

        }
        if (e.getSource() == b9) {
            zt = t1.getText();
            z = zt + "9";
            t1.setText(z);

        }
        if (e.getSource() == b0) {
            zt = t1.getText();
            z = zt + "0";
            t1.setText(z);

        }
        if (e.getSource() == b15) {
            zt = t1.getText();
            z = zt + ".";
            t1.setText(z);

        }

        if (e.getSource() == b17) {
            zt = t1.getText();
            try {
                z = zt.substring(0, zt.length() - 1);
            } catch (NumberFormatException f) {
                t1.setText("Invaled Formet");
                return;
            }
            t1.setText(z);
        }
        if (e.getSource() == b11) {

            try {
                x = Double.parseDouble(t1.getText());
            } catch (NumberFormatException f) {
                t1.setText("Invaled Formet");
                return;
            }
            z = "";
            t1.setText(z);
            check = 1;
        }

        if(e.getSource()==b12)
        {

            try
            {
                x=  Double . parseDouble(t1.getText());
            }
            catch(NumberFormatException f)
            {
                t1.setText("Invaled Formet");
                return ;
            }
            z = "";
            t1.setText(z);
            check = 2;
        }
        if(e.getSource()==b14)
        {

            try
            {
                x=  Double . parseDouble(t1.getText());
            }
            catch(NumberFormatException f)
            {
                t1.setText("Invaled Formet");
                return ;
            }
            z = "";
            t1.setText(z);
            check = 3;
        }
        if(e.getSource()==b18)
        {

            try
            {
                x=  Double . parseDouble(t1.getText());
            }
            catch(NumberFormatException f)
            {
                t1.setText("Invaled Formet");
                return ;
            }
            z = "";
            t1.setText(z);
            check = 4;
        }
        if(e.getSource()==b13)
        {

            try
            {
                x=  Double . parseDouble(t1.getText());
            }
            catch(NumberFormatException f)
            {
                t1.setText("Invaled Formet");
                return ;
            }
            z = "";
            t1.setText(z);
            check = 5;
        }
        if(e.getSource()==b19)
        {

            try {
                int n = Integer.parseInt(t1.getText());

                int k = 1;
                if (e.getSource().equals(b19)) {
                    for (int i = 1; i <= n; i++) {
                        k = k * i;
                    }
                    t1.setText(String.valueOf(k));
                }
            }
            catch(ArithmeticException f ) {
                t1.setText("Technical Error");
                return;
            }
        }
        if(e.getSource()==b20) {
            try {
                int n = Integer.parseInt(t1.getText());
                if (n % 2 == 0) {
                    t1.setText(String.valueOf(n + " IS EVEN "));
                } else {
                    t1.setText(String.valueOf(n + " IS ODD"));
                }
            }catch(ArithmeticException f)
            {
                t1.setText("Technical Error");
                return;
            }
        }

        if(e.getSource()==b21)
        {
            try {
                int n = Integer.parseInt(t1.getText());
                int m = n * (n + 1) / 2;
                t1.setText(String.valueOf(m));
            }
            catch(ArithmeticException f)
            {
                t1.setText("Technical Error");
                return;
            }
        }
        if(e.getSource()==b33)
        {
            try {
                int n = Integer.parseInt(t1.getText());
                int m = n * (n - 1) / 2;
                t1.setText(String.valueOf(m));
            }
            catch(ArithmeticException f)
            {
                t1.setText("Technical Error");
                return;
            }
        }

        if(e.getSource()==b22)
        {
            try {
                int n = Integer.parseInt(t1.getText());
                int c = n*n;
                t1.setText(String.valueOf(c));
            }
            catch(ArithmeticException f)
            {
                t1.setText("Technical Error");
                return;
            }
        }
        if(e.getSource()==b24)
        {
            try {
                int n = Integer.parseInt(t1.getText());
                int c = n*n;
                t1.setText(String.valueOf(c));
            }
            catch(ArithmeticException f)
            {
                t1.setText("Technical Error");
                return;
            }
        }
        if(e.getSource()==b25)
        {
            try {
                int n = Integer.parseInt(t1.getText());

                t1.setText(String.valueOf(Math.sqrt(n)));

            }
            catch(ArithmeticException f)
            {
                t1.setText("only positive Integer");
                return;
            }
        }
        if(e.getSource()==b26)
        {
            try {
                int n = Integer.parseInt(t1.getText());

                t1.setText(String.valueOf(Math.cbrt(n)));

            }
            catch(ArithmeticException f)
            {
                t1.setText("only positive Integer");
                return;
            }
        }
        if(e.getSource()==b27)
        {
            try {
                int n = Integer.parseInt(t1.getText());
                double b = Math.toRadians(n);

                t1.setText(String.valueOf(Math.sin(b)));

            }
            catch(ArithmeticException f)
            {
                t1.setText("only positive Integer");
                return;
            }
        }
        if(e.getSource()==b28)
        {
            try {
                int n = Integer.parseInt(t1.getText());
                double b = Math.toRadians(n);

                t1.setText(String.valueOf(Math.cos(b)));

            }
            catch(ArithmeticException f)
            {
                t1.setText("only positive Integer");
                return;
            }
        }  if(e.getSource()==b29)
        {
            try {
                int n = Integer.parseInt(t1.getText());
                double b = Math.toRadians(n);

                t1.setText(String.valueOf(Math.tan(b)));

            }
            catch(ArithmeticException f)
            {
                t1.setText("only positive Integer");
                return;
            }
        }  if(e.getSource()==b32)
        {
            try {
                int n = Integer.parseInt(t1.getText());
                double b = Math.toRadians(n);

                t1.setText(String.valueOf(Math.sinh(b)));

            }
            catch(ArithmeticException f)
            {
                t1.setText("only positive Integer");
                return;
            }
        }  if(e.getSource()==b30)
        {
            try {
                int n = Integer.parseInt(t1.getText());
                double b = Math.toRadians(n);

                t1.setText(String.valueOf(Math.cosh(b)));

            }
            catch(ArithmeticException f)
            {
                t1.setText("only positive Integer");
                return;
            }
        }
        if(e.getSource()==b31)
        {
            try {
                int n = Integer.parseInt(t1.getText());
                double b = Math.toRadians(n);

                t1.setText(String.valueOf(Math.tanh(b)));

            }
            catch(ArithmeticException f)
            {
                t1.setText("only positive Integer");
                return;
            }
        }


        if(e.getSource()==b23)
        {
            try {
                int v = Integer.parseInt(t1.getText());
                int c = v*v*v;
                t1.setText(String.valueOf(c));
            }
            catch(ArithmeticException f)
            {
                t1.setText("Technical Error");
                return;
            }
        }

        if (e.getSource() == b16) {

            try {
                y = Double.parseDouble(t1.getText());
            } catch (Exception f) {
                t1.setText("ENTER NUMBER SECOND");
                return;
            }
            if (check == 1)
                total = x + y;
            if (check == 2)
                total = x - y;
            if (check == 3)
                total = x * y;
            if (check == 4)
                total = x / y;
            if (check == 5)
                total = x % y;

            t1.setText(String.valueOf(total));

        }
        if (e.getSource() == b) {
            x = 0;
            y = 0;
            check = 0;
            total = 0;
            z = "";
            t1.setText(z);
        }

    }
    public static void main(String  args[])
    {

        Calculator ab = new Calculator();
    }
}



