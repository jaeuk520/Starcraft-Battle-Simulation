package Starcraft;



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.util.Random;
//p1_units_name



public class GUIexample extends JFrame {
   
  ////////////////////////��ü ����///////////////////////////////
   static �׶� t=new �׶�();
   //�����ΰ�
   ���� marine=new ����(10, 10, 0);
   SCV scv=new SCV(30, 5, 0);
   �޵� medic=new �޵�(50, 2, 0);
   ���̾ firebat=new ���̾(15, 8, 0);
   //������
   ���� vulture=new ����(30, 5,0);
   ��ũ tank=new ��ũ(35, 20, 0);
   �񸮾� goliath=new �񸮾�(40, 20, 0);
   //���߱��
   ���̽� wraith=new ���̽�(10, 10, 0);
   ��Ű�� valkyrie=new ��Ű��(50, 20, 0);
   ��Ʋũ���� battlecruiser=new ��Ʋũ����(70, 50, 0);
   
  
 
 
   //���� ȭ�� ũ�� ����
   public static final int SCREEN_WIDTH = 1330;
   public static final int SCREEN_HEIGHT = 746;
   
   //�� ó�� ȭ��
  
   
   
   //���� ����ȭ��
   JFrame frame = new JFrame("Starcraft");
   //Player1�� ���,�ϴ� �� ��ü����
   private ImageIcon mainBackground = new ImageIcon(GUIexample.class.getResource("../images/mainBackground.jpg"));
   JLabel P1UpBar = new JLabel("\uBBF8\uB124\uB784: 50");
   JLabel P1DownUnitBar = new JLabel(mainBackground);
   JPanel P1DownTextBar = new JPanel();
   //P1 ����
   JProgressBar P1Hp = new JProgressBar(0,300);
   //������ ��ư�� ������ ������ư
   JButton P1ready = new JButton("P1 READY!");
   JButton P2ready = new JButton("P2 READY!");
   static int P1num=0;
   static int P2num=0;
   //���������Ӱ� ��ư
   JFrame Fframe = new JFrame("War!");
   JButton fight = new JButton("Fight!");
   //Player2d�� ���,�ϴ� �� ��ü����
   JLabel P2UpBar = new JLabel ("�̳׶�: "+t.p2_mineral);
   JLabel P2DownUnitBar = new JLabel(mainBackground);
   JPanel P2DownTextBar = new JPanel();
   //P1 ����
   JProgressBar P2Hp = new JProgressBar(0,300);
   //P1 ���� ��
   JLabel P1SCVNum = new JLabel("SCV:");
   JLabel P1����Num = new JLabel("����:");
   JLabel P1���̾Num = new JLabel("���̾:");
   JLabel P1�޵�Num = new JLabel("�޵�:");
   JLabel P1����Num = new JLabel("����:");
   JLabel P1��ũNum = new JLabel("��ũ:");
   JLabel P1�񸮾�Num = new JLabel("�񸮾�:");
   JLabel P1���̽�Num = new JLabel("���̽�:");
   JLabel P1��Ű��Num = new JLabel("��Ű��:");
   JLabel P1��Ʋũ����Num = new JLabel("��Ʋũ����:");
   //Player1�� �ʵ� �� ��ư ��ü ����
   JLabel P1panel1 = new JLabel(mainBackground); 
   JLabel P1panel2 = new JLabel(mainBackground);
   JLabel P1panel3 = new JLabel(mainBackground);
   private ImageIcon imgĿ������� = new ImageIcon(GUIexample.class.getResource("../images/Center.png"));
   JButton P1Ŀ������� = new JButton(imgĿ�������);
   private ImageIcon B = new ImageIcon(GUIexample.class.getResource("../images/B.png"));
   JButton P1�跰 = new JButton(B);
   private ImageIcon F = new ImageIcon(GUIexample.class.getResource("../images/F.png"));
   JButton P1���丮 = new JButton(F);
   private ImageIcon S = new ImageIcon(GUIexample.class.getResource("../images/S.png"));
   JButton P1��Ÿ��Ʈ = new JButton(S);
   private ImageIcon EB = new ImageIcon(GUIexample.class.getResource("../images/EB.jpg"));
   JButton P1�����Ͼ���� = new JButton(EB);
   private ImageIcon A = new ImageIcon(GUIexample.class.getResource("../images/A.jpg"));
   JButton P1�ƸӸ� = new JButton(A);
   
   //Player1�� ���� ��ư ��ü ����
   JButton P1SCV = new JButton("SCV");
   JButton P1���� = new JButton("����");
   JButton P1���̾ = new JButton("���̾");
   JButton P1�޵� = new JButton("�޵�");
   JButton P1���� = new JButton("����");
   JButton P1��ũ = new JButton("��ũ");
   JButton P1�񸮾� = new JButton("�񸮾�");
   JButton P1���̽� = new JButton("���̽�");
   JButton P1��Ű�� = new JButton("��Ű��");
   JButton P1��Ʋũ���� = new JButton("��Ʋũ����");
   //Player2�� �ʵ� �� ��ư ��ü ����
   JLabel P2panel1 = new JLabel(mainBackground); 
   JLabel P2panel2 = new JLabel(mainBackground);
   JLabel P2panel3 = new JLabel(mainBackground);
   
   private ImageIcon Center2 = new ImageIcon(GUIexample.class.getResource("../images/Center2.jpg"));
   JButton P2Ŀ������� = new JButton(Center2);
   private ImageIcon B2 = new ImageIcon(GUIexample.class.getResource("../images/B2.jpg"));
   JButton P2�跰 = new JButton(B2);
   private ImageIcon F2 = new ImageIcon(GUIexample.class.getResource("../images/F2.jpg"));
   JButton P2���丮 = new JButton(F2);
   private ImageIcon S2 = new ImageIcon(GUIexample.class.getResource("../images/S2.jpg"));
   JButton P2��Ÿ��Ʈ = new JButton(S2);
   private ImageIcon EB2 = new ImageIcon(GUIexample.class.getResource("../images/EB2.jpg"));
   JButton P2�����Ͼ���� = new JButton(EB2);
   private ImageIcon A2 = new ImageIcon(GUIexample.class.getResource("../images/A2.jpg"));
   JButton P2�ƸӸ� = new JButton(A2);
   //P1 ���� ��
   JLabel P2SCVNum = new JLabel("SCV:");
   JLabel P2����Num = new JLabel("����:");
   JLabel P2���̾Num = new JLabel("���̾:");
   JLabel P2�޵�Num = new JLabel("�޵�:");
   JLabel P2����Num = new JLabel("����:");
   JLabel P2��ũNum = new JLabel("��ũ:");
   JLabel P2�񸮾�Num = new JLabel("�񸮾�:");
   JLabel P2���̽�Num = new JLabel("���̽�:");
   JLabel P2��Ű��Num = new JLabel("��Ű��:");
   JLabel P2��Ʋũ����Num = new JLabel("��Ʋũ����:");
   //Player1�� ���� ��ư ��ü ����
   JButton P2SCV = new JButton("SCV");
   JButton P2���� = new JButton("����");
   JButton P2���̾ = new JButton("���̾");
   JButton P2�޵� = new JButton("�޵�");
   JButton P2���� = new JButton("����");
   JButton P2��ũ = new JButton("��ũ");
   JButton P2�񸮾� = new JButton("�񸮾�");
   JButton P2���̽� = new JButton("���̽�");
   JButton P2��Ű�� = new JButton("��Ű��");
   JButton P2��Ʋũ���� = new JButton("��Ʋũ����");
 //�ǹ��� ü���̶� ���ݷ� ��ư ����-����
   JButton P1�����Ͼ����ü�� = new JButton("ü�� +10");
   JButton P1�����Ͼ���̰��ݷ� = new JButton("���ݷ� +10");
   JButton P1�����Ͼ���̹��� = new JButton("����+5");
   JButton P2�����Ͼ����ü�� = new JButton("ü�� +10");
   JButton P2�����Ͼ���̰��ݷ�= new JButton("���ݷ�+10");
   JButton P2�����Ͼ���̹��� = new JButton("����+5");
   JButton P1�ƸӸ�ü�� = new JButton("ü�� +10");
   JButton P1�ƸӸ����ݷ� = new JButton("���ݷ� +10");
   JButton P1�ƸӸ����� = new JButton("����+5");
   JButton P2�ƸӸ�ü�� = new JButton("ü�� +10");
   JButton P2�ƸӸ����ݷ� = new JButton("���ݷ� +10");
   JButton P2�ƸӸ����� = new JButton("����+5");
   ///////////////////////////��ư ���� ��/////////////////////////////////////
   
   
   public GUIexample() {
      
      Starcraft star = new Starcraft();
      
       
      
      //����ȭ��� ��ư
      Fframe.setBounds(0,0,1200,750);
      Fframe.setVisible(false);
      Fframe.setDefaultCloseOperation(EXIT_ON_CLOSE);
      Fframe.getContentPane().setLayout(null);
      fight.setBounds(0,0,1200,750);
      Fframe.getContentPane().add(fight);
      
      //JFrame ����
      frame.setBounds(0,0,1200,750);
      frame.setVisible(false);
      frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);
      
      //Player1�� JPanel ����
      P1UpBar.setBounds(0, 0, 600, 50);        
      P1UpBar.setBackground(Color.GRAY);
      P1UpBar.setLayout(null);
      frame.getContentPane().add(P1UpBar);
      
      P1DownUnitBar.setBounds(0, 550, 200, 200);           
     
      P1DownUnitBar.setLayout(null);
      frame.getContentPane().add(P1DownUnitBar);
      
      P1DownTextBar.setBounds(200, 550, 400, 200);           
      P1DownTextBar.setBackground(Color.GRAY);
      P1DownTextBar.setLayout(null);
      frame.getContentPane().add(P1DownTextBar);
      
      P1panel1.setBounds(0, 50, 200, 500);           
     
      P1panel1.setLayout(null);
      frame.getContentPane().add(P1panel1);
      P1panel2.setBounds(200, 50, 200, 500);           
     
      P1panel2.setLayout(null);
      frame.getContentPane().add(P1panel2);
      P1panel3.setBounds(400, 50, 200, 500);           
   
      P1panel3.setLayout(null);
      frame.getContentPane().add(P1panel3);
      //Player1�� �гΰ� ��ư ����
      P1Ŀ�������.setBounds(0,150,200,200);
      P1panel1.add(P1Ŀ�������);
      P1�跰.setBounds(25,0,150,150);
      P1panel2.add(P1�跰);
      P1���丮.setBounds(25,175,150,150);
      P1panel2.add(P1���丮);
      P1��Ÿ��Ʈ.setBounds(25,350,150,150);
      P1panel2.add(P1��Ÿ��Ʈ);
      P1�����Ͼ����.setBounds(25,70,150,150);
      P1panel3.add(P1�����Ͼ����);
      P1�ƸӸ�.setBounds(25,280,150,150);
      P1panel3.add(P1�ƸӸ�);
      P1Hp.setValue(300);
      P1Hp.setBackground(Color.gray);
      P1Hp.setForeground(Color.RED);
      P1Hp.setBounds(0,100,200,30);
      P1panel1.add(P1Hp);
    //���콺�̺�Ʈ-����
      P1�����Ͼ����.addMouseListener(new MouseAdapter() {   
          public void mouseEntered(MouseEvent evt) {
             P1�����Ͼ����.setVisible(false);
             P1�����Ͼ����ü��.setVisible(true);
             P1�����Ͼ���̰��ݷ�.setVisible(true);
             P1�����Ͼ���̹���.setVisible(true);
             
    }
          public void mouseExited(MouseEvent evt) {   
             P1�����Ͼ����.setVisible(true);
             P1�����Ͼ����ü��.setVisible(false);
             P1�����Ͼ���̰��ݷ�.setVisible(false);
             P1�����Ͼ���̹���.setVisible(false);
          }
    });
      
      //P1 ���� �� ����
      P1SCVNum.setBounds(0,0,200,30);
      P1DownTextBar.add(P1SCVNum);
      P1����Num.setBounds(0,30,200,30);
      P1DownTextBar.add(P1����Num);
      P1���̾Num.setBounds(0,60,200,30);
      P1DownTextBar.add(P1���̾Num);
      P1�޵�Num.setBounds(0,90,200,30); 
      P1DownTextBar.add(P1�޵�Num);
      P1����Num.setBounds(0,120,200,30); 
      P1DownTextBar.add(P1����Num);
      P1��ũNum.setBounds(200,0,200,30); 
      P1DownTextBar.add(P1��ũNum);
      P1�񸮾�Num.setBounds(200,30,200,30); 
      P1DownTextBar.add(P1�񸮾�Num);
      P1���̽�Num.setBounds(200,60,200,30); 
      P1DownTextBar.add(P1���̽�Num);
      P1��Ű��Num.setBounds(200,90,200,30); 
      P1DownTextBar.add(P1��Ű��Num);
      P1��Ʋũ����Num.setBounds(200,120,200,30); 
      P1DownTextBar.add(P1��Ʋũ����Num);
      P1SCV.setIcon(new ImageIcon("C:\\Users\\jaeuk\\Documents\\\uCE74\uCE74\uC624\uD1A1 \uBC1B\uC740 \uD30C\uC77C\\SCV.jpg"));
      
      //Player1�� ���� ��ư ����
      P1SCV.setBounds(0,150,200,200);
      P1panel1.add(P1SCV);
      P1SCV.setVisible(false);
      P1����.setIcon(new ImageIcon("C:\\Users\\jaeuk\\Documents\\\uCE74\uCE74\uC624\uD1A1 \uBC1B\uC740 \uD30C\uC77C\\\uB9C8\uB9B0.jpg"));
      P1����.setHorizontalAlignment(SwingConstants.LEFT);
      P1����.setBounds(25,0,150,75);
      P1panel2.add(P1����);
      P1����.setVisible(false);
      P1�޵�.setIcon(new ImageIcon("C:\\Users\\jaeuk\\Documents\\\uCE74\uCE74\uC624\uD1A1 \uBC1B\uC740 \uD30C\uC77C\\\uBA54\uB515.jpg"));
      P1�޵�.setBounds(25,75,75,75);
      P1panel2.add(P1�޵�);
      P1�޵�.setVisible(false);
      P1���̾.setIcon(new ImageIcon("C:\\Users\\jaeuk\\Documents\\\uCE74\uCE74\uC624\uD1A1 \uBC1B\uC740 \uD30C\uC77C\\\uD30C\uC774\uC5B4\uBCB3.jpg"));
      P1���̾.setBounds(100,75,75,75);
      P1panel2.add(P1���̾);
      P1���̾.setVisible(false);
      P1����.setIcon(new ImageIcon("C:\\Users\\jaeuk\\Documents\\\uCE74\uCE74\uC624\uD1A1 \uBC1B\uC740 \uD30C\uC77C\\\uBC8C\uCCD0.jpg"));
      P1����.setBounds(25,175,75,75);
      P1panel2.add(P1����);
      P1����.setVisible(false);
      P1��ũ.setIcon(new ImageIcon("C:\\Users\\jaeuk\\Documents\\\uCE74\uCE74\uC624\uD1A1 \uBC1B\uC740 \uD30C\uC77C\\\uD0F1\uD06C.jpg"));
      P1��ũ.setBounds(25,250,150,75);
      P1panel2.add(P1��ũ);
      P1��ũ.setVisible(false);
      P1�񸮾�.setIcon(new ImageIcon("C:\\Users\\jaeuk\\Documents\\\uCE74\uCE74\uC624\uD1A1 \uBC1B\uC740 \uD30C\uC77C\\\uACE8\uB9AC\uC557.jpg"));
      P1�񸮾�.setBounds(100,175,75,75);
      P1panel2.add(P1�񸮾�);
      P1�񸮾�.setVisible(false);
      P1���̽�.setIcon(new ImageIcon("C:\\Users\\jaeuk\\Documents\\\uCE74\uCE74\uC624\uD1A1 \uBC1B\uC740 \uD30C\uC77C\\\uB808\uC774\uC2A4.png"));
      P1���̽�.setBounds(25,350,75,75);
      P1panel2.add(P1���̽�);
      P1���̽�.setVisible(false);
      P1��Ű��.setIcon(new ImageIcon("C:\\Users\\jaeuk\\Documents\\\uCE74\uCE74\uC624\uD1A1 \uBC1B\uC740 \uD30C\uC77C\\\uBC1C\uD0A4\uB9AC.jpg"));
      P1��Ű��.setBounds(100,350,75,75);
      P1panel2.add(P1��Ű��);
      P1��Ű��.setVisible(false);
      P1��Ʋũ����.setIcon(new ImageIcon("C:\\Users\\jaeuk\\Documents\\\uCE74\uCE74\uC624\uD1A1 \uBC1B\uC740 \uD30C\uC77C\\\uBC30\uD2C0\uD06C\uB8E8\uC800.jpg"));
      P1��Ʋũ����.setBounds(25,425,150,75);
      P1panel2.add(P1��Ʋũ����);
      P1��Ʋũ����.setVisible(false);
      //P1ü�°��ݷ¹�ư-����
      P1�����Ͼ����ü��.setBounds(25, 70, 150, 75);
      P1panel3.add(P1�����Ͼ����ü��);
      P1�����Ͼ����ü��.setVisible(true);
      P1�����Ͼ���̰��ݷ�.setBounds(25, 145, 75, 75);
      P1panel3.add(P1�����Ͼ���̰��ݷ�);
      P1�����Ͼ���̰��ݷ�.setVisible(true);
      P1�����Ͼ���̹���.setBounds(100, 145, 75, 75);
      P1panel3.add(P1�����Ͼ���̹���);
      P1�����Ͼ���̹���.setVisible(true);
      
      P1�ƸӸ�ü��.setBounds(25, 280, 150, 75);
      P1panel3.add(P1�ƸӸ�ü��);
      P1�ƸӸ�ü��.setVisible(true);
      P1�ƸӸ����ݷ�.setBounds(25, 355, 75, 75);
      P1panel3.add(P1�ƸӸ����ݷ�);
      P1�ƸӸ����ݷ�.setVisible(true);
      P1�ƸӸ�����.setBounds(100, 355, 75, 75);
      P1panel3.add(P1�ƸӸ�����);
      P1�ƸӸ�����.setVisible(true);
      
      
      
      //Player2�� ��ư�� �г� ����
      P2UpBar.setBounds(600, 0, 600, 50);           
      P2UpBar.setBackground(Color.GRAY);
      P2UpBar.setLayout(null);
      frame.getContentPane().add(P2UpBar);
      
      P2DownUnitBar.setBounds(1000, 550, 200, 200);           
  
      P2DownUnitBar.setLayout(null);
      frame.getContentPane().add(P2DownUnitBar);
      
      P2DownTextBar.setBounds(600, 550, 400, 200);           
      P2DownTextBar.setBackground(Color.GRAY);
      P2DownTextBar.setLayout(null);
      frame.getContentPane().add(P2DownTextBar);
      
      P2panel1.setBounds(1000, 50, 200, 500);           
     
      P2panel1.setLayout(null);
      frame.getContentPane().add(P2panel1);
      P2panel2.setBounds(800, 50, 200, 500);           
     
      P2panel2.setLayout(null);
      frame.getContentPane().add(P2panel2);
      P2panel3.setBounds(600, 50, 200, 500);           
     
      P2panel3.setLayout(null);
      frame.getContentPane().add(P2panel3);
      P2Hp.setValue(300);
      P2Hp.setBackground(Color.gray);
      P2Hp.setForeground(Color.RED);
      P2Hp.setBounds(0,100,200,30);
      P2panel1.add(P2Hp);
      
      //P2 ���� �� ����
      P2SCVNum.setBounds(0,0,200,30);
      P2DownTextBar.add(P2SCVNum);
      P2����Num.setBounds(0,30,200,30);
      P2DownTextBar.add(P2����Num);
      P2���̾Num.setBounds(0,60,200,30);
      P2DownTextBar.add(P2���̾Num);
      P2�޵�Num.setBounds(0,90,200,30); 
      P2DownTextBar.add(P2�޵�Num);
      P2����Num.setBounds(0,120,200,30); 
      P2DownTextBar.add(P2����Num);
      P2��ũNum.setBounds(200,0,200,30); 
      P2DownTextBar.add(P2��ũNum);
      P2�񸮾�Num.setBounds(200,30,200,30); 
      P2DownTextBar.add(P2�񸮾�Num);
      P2���̽�Num.setBounds(200,60,200,30); 
      P2DownTextBar.add(P2���̽�Num);
      P2��Ű��Num.setBounds(200,90,200,30); 
      P2DownTextBar.add(P2��Ű��Num);
      P2��Ʋũ����Num.setBounds(200,120,200,30); 
      P2DownTextBar.add(P2��Ʋũ����Num);
      
      //Player2�� JButton ����
      P2Ŀ�������.setBounds(0,150,200,200);
      P2panel1.add(P2Ŀ�������);
      P2�跰.setBounds(25,0,150,150);
      P2panel2.add(P2�跰);
      P2���丮.setBounds(25,175,150,150);
      P2panel2.add(P2���丮);
      P2��Ÿ��Ʈ.setBounds(25,350,150,150);
      P2panel2.add(P2��Ÿ��Ʈ);
      P2�����Ͼ����.setBounds(25,70,150,150);
      P2panel3.add(P2�����Ͼ����);
      P2�ƸӸ�.setBounds(25,280,150,150);
      P2panel3.add(P2�ƸӸ�);
      P2ready.setBounds(450,0,150,50);
      P2UpBar.add(P2ready);
      P2SCV.setIcon(new ImageIcon("C:\\Users\\jaeuk\\Documents\\\uCE74\uCE74\uC624\uD1A1 \uBC1B\uC740 \uD30C\uC77C\\SCV.jpg"));
      
      //Player2�� ���� ��ư ����
      P2SCV.setBounds(0,150,200,200);
      P2panel1.add(P2SCV);
      P2SCV.setVisible(false);
      P2����.setIcon(new ImageIcon("C:\\Users\\jaeuk\\Documents\\\uCE74\uCE74\uC624\uD1A1 \uBC1B\uC740 \uD30C\uC77C\\\uB9C8\uB9B0.jpg"));
      P2����.setBounds(25,0,150,75);
      P2panel2.add(P2����);
      P2����.setVisible(false);
      P2�޵�.setIcon(new ImageIcon("C:\\Users\\jaeuk\\Documents\\\uCE74\uCE74\uC624\uD1A1 \uBC1B\uC740 \uD30C\uC77C\\\uBA54\uB515.jpg"));
      P2�޵�.setBounds(100,75,75,75);
      P2panel2.add(P2�޵�);
      P2�޵�.setVisible(false);
      P2���̾.setIcon(new ImageIcon("C:\\Users\\jaeuk\\Documents\\\uCE74\uCE74\uC624\uD1A1 \uBC1B\uC740 \uD30C\uC77C\\\uD30C\uC774\uC5B4\uBCB3.jpg"));
      P2���̾.setBounds(25,75,75,75);
      P2panel2.add(P2���̾);
      P2���̾.setVisible(false);
      P2����.setIcon(new ImageIcon("C:\\Users\\jaeuk\\Documents\\\uCE74\uCE74\uC624\uD1A1 \uBC1B\uC740 \uD30C\uC77C\\\uBC8C\uCCD0.jpg"));
      P2����.setBounds(100,175,75,75);
      P2panel2.add(P2����);
      P2����.setVisible(false);
      P2��ũ.setIcon(new ImageIcon("C:\\Users\\jaeuk\\Documents\\\uCE74\uCE74\uC624\uD1A1 \uBC1B\uC740 \uD30C\uC77C\\\uD0F1\uD06C.jpg"));
      P2��ũ.setBounds(25,250,150,75);
      P2panel2.add(P2��ũ);
      P2��ũ.setVisible(false);
      P2�񸮾�.setIcon(new ImageIcon("C:\\Users\\jaeuk\\Documents\\\uCE74\uCE74\uC624\uD1A1 \uBC1B\uC740 \uD30C\uC77C\\\uACE8\uB9AC\uC557.jpg"));
      P2�񸮾�.setBounds(25,175,75,75);
      P2panel2.add(P2�񸮾�);
      P2�񸮾�.setVisible(false);
      P2���̽�.setIcon(new ImageIcon("C:\\Users\\jaeuk\\Documents\\\uCE74\uCE74\uC624\uD1A1 \uBC1B\uC740 \uD30C\uC77C\\\uB808\uC774\uC2A4.png"));
      P2���̽�.setBounds(100,350,75,75);
      P2panel2.add(P2���̽�);
      P2���̽�.setVisible(false);
      P2��Ű��.setIcon(new ImageIcon("C:\\Users\\jaeuk\\Documents\\\uCE74\uCE74\uC624\uD1A1 \uBC1B\uC740 \uD30C\uC77C\\\uBC1C\uD0A4\uB9AC.jpg"));
      P2��Ű��.setBounds(25,350,75,75);
      P2panel2.add(P2��Ű��);
      P2��Ű��.setVisible(false);
      P2��Ʋũ����.setIcon(new ImageIcon("C:\\Users\\jaeuk\\Documents\\\uCE74\uCE74\uC624\uD1A1 \uBC1B\uC740 \uD30C\uC77C\\\uBC30\uD2C0\uD06C\uB8E8\uC800.jpg"));
      P2��Ʋũ����.setBounds(25,425,150,75);
      P2panel2.add(P2��Ʋũ����);
      P2��Ʋũ����.setVisible(false);
    //P2ü���̶� ���ݷ� ��ư-����
      P2�����Ͼ����ü��.setBounds(25, 75, 150, 75);
      P2panel3.add(P2�����Ͼ����ü��);
      P2�����Ͼ����ü��.setVisible(true);
      P2�����Ͼ���̰��ݷ�.setBounds(25, 145, 75, 75);
      P2panel3.add(P2�����Ͼ���̰��ݷ�);
      P2�����Ͼ���̰��ݷ�.setVisible(true);
      P2�����Ͼ���̹���.setBounds(100, 145, 75, 75);
      P2panel3.add(P2�����Ͼ���̹���);
      P2�����Ͼ���̹���.setVisible(true);
      
      P2�ƸӸ�ü��.setBounds(25, 280, 150, 75);
      P2panel3.add(P2�ƸӸ�ü��);
      P2�ƸӸ�ü��.setVisible(true);
      P2�ƸӸ����ݷ�.setBounds(25, 355, 75, 75);
      P2panel3.add(P2�ƸӸ����ݷ�);
      P2�ƸӸ����ݷ�.setVisible(true);
      P2�ƸӸ�����.setBounds(100, 355, 75, 75);
      P2panel3.add(P2�ƸӸ�����);
      frame.getContentPane().add(P1ready);
      P1ready.setBounds(150,0,150,50);
      
      //������ �� ������ư �̺�Ʈ
      P1ready.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            P1num++;
            P1ready.setVisible(false);
            if((P1num!=0&&P2num!=0)&&P1num==P2num)
            {
               Fframe.setVisible(true);
               frame.setVisible(false);
               System.out.println("------------------------------------");

            }
          
         }
      });
      P2�ƸӸ�����.setVisible(true);
      
      //��ó�� SCV �׸��� ����
      for(int i=0; i<4; i++) 
      {
         t.p1_units[0][i]=scv.p1_setHp();
          t.p1_units[1][i]=scv.p1_setSt();
          t.p1_units[2][i]=scv.p1_setDf();
          t.p1_units_name[i] = "scv";
          
          t.p2_units[0][i]=scv.p2_setHp();
          t.p2_units[1][i]=scv.p2_setSt();
          t.p2_units[2][i]=scv.p2_setDf();
          t.p2_units_name[i] = "scv";
      }
      
      
      //â �Ѿ�� ���콺 �̺�Ʈ�� Ű �̺�Ʈ
      if(star.getn() == 0) {
         
         star.setVisible(false);
         frame.setVisible(true);
      }

         
         
         
         
      //���̴ֻ� ��ư ���콺 �̺�Ʈ
      P1Ŀ�������.addMouseListener(new MouseAdapter() {   
            public void mouseEntered(MouseEvent evt) {
               P1Ŀ�������.setVisible(false);
               P1SCV.setVisible(true);
               
      }
            public void mouseExited(MouseEvent evt) {   
               P1Ŀ�������.setVisible(true);
               P1SCV.setVisible(false);
            }
      });
      
      P1SCV.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent evt) {
            P1Ŀ�������.setVisible(false);
            P1SCV.setVisible(true);
         }
         public void mouseExited(MouseEvent evt) {
            P1Ŀ�������.setVisible(true);
            P1SCV.setVisible(false);
         }
      });
      P1SCV.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
   
              if(t.p1_mineral < 50) {         	  
            	 JOptionPane.showMessageDialog(null, "�̳׶��� �����մϴ�!");
                 System.out.println("�̳׶��� �����մϴ�!"); }
              else {
              t.p1_mineral -= 50;
              P1UpBar.setText("�̳׶�: "+t.p1_mineral);
              scv.set_unit(t.p1_unit);
              t.p1_units[0][t.p1_unit]=scv.p1_setHp();
              t.p1_units[1][t.p1_unit]=scv.p1_setSt();
              t.p1_units[2][t.p1_unit]=scv.p1_setDf();
              t.p1_units_name[t.p1_unit] = "scv";
              System.out.println("p1�� ����"+t.p1_unit);
              t.p1_unit=scv.get_unit();
              t.p1SCVnum+=1;
              P1SCVNum.setText("SCV: "+t.p1SCVnum);
            
              }
          }});
      
      P1�跰.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent evt) {
            P1�跰.setVisible(false);
            P1����.setVisible(true);
            P1�޵�.setVisible(true);
            P1���̾.setVisible(true);
            
         }
         public void mouseExited(MouseEvent evt) {   
            P1�跰.setVisible(true);
            P1����.setVisible(false);
            P1�޵�.setVisible(true);
            P1���̾.setVisible(true);
         }
      });
            
      P1����.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent evt) {
            P1�跰.setVisible(false);
            P1����.setVisible(true);
            P1�޵�.setVisible(true);
            P1���̾.setVisible(true);
         }
         public void mouseExited(MouseEvent evt) {
            P1�跰.setVisible(true);
            P1����.setVisible(false);
            P1�޵�.setVisible(false);
            P1���̾.setVisible(false);
         }
      });
      
      P1����.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
             if (t.p1_mineral < 60) {
                JOptionPane.showMessageDialog(null, "�̳׶��� �����մϴ�!");
                System.out.println("�̳׶��� �����մϴ�!");
             }
             else {
                t.p1_mineral -= 60;
                P1UpBar.setText("�̳׶�: "+t.p1_mineral);
                marine.set_unit(t.p1_unit);
                t.p1_units[0][t.p1_unit]=marine.p1_setHp();
                t.p1_units[1][t.p1_unit]=marine.p1_setSt();
                t.p1_units[2][t.p1_unit]=marine.p1_setDf();
                t.p1_units_name[t.p1_unit] = "marine";
                System.out.println("p1�� ����"+t.p1_unit);
                t.p1_unit=marine.get_unit();
                t.p1����num+=1;
                P1����Num.setText("����: "+t.p1����num);
                }
          }});
      
      P1�޵�.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent evt) {
            P1�跰.setVisible(false);
            P1����.setVisible(true);
            P1�޵�.setVisible(true);
            P1���̾.setVisible(true);
            
         }
         public void mouseExited(MouseEvent evt) {   
            P1�跰.setVisible(true);
            P1����.setVisible(false);
            P1�޵�.setVisible(false);
            P1���̾.setVisible(false);
         }
      });
      
      P1�޵�.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            if (t.p1_mineral < 60) {
               JOptionPane.showMessageDialog(null, "�̳׶��� �����մϴ�!");
               System.out.println("�̳׶��� �����մϴ�!"); }
            else {
               t.p1_mineral -= 60;
               P1UpBar.setText("�̳׶�: "+t.p1_mineral);
               medic.set_unit(t.p1_unit);
               t.p1_units[0][t.p1_unit]=medic.p1_setHp();
                t.p1_units[1][t.p1_unit]=medic.p1_setSt();
                t.p1_units[2][t.p1_unit]=medic.p1_setDf();
                t.p1_units_name[t.p1_unit] = "medic";
                System.out.println("p1�� ����"+t.p1_unit);
                t.p1_unit=medic.get_unit();
                t.p1�޵�num+=1;
                P1�޵�Num.setText("�޵�: "+t.p1�޵�num);
               }
         }});
      
      P1���̾.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent evt) {
            P1�跰.setVisible(false);
            P1����.setVisible(true);
            P1�޵�.setVisible(true);
            P1���̾.setVisible(true);
            
         }
         public void mouseExited(MouseEvent evt) {   
            P1�跰.setVisible(true);
            P1����.setVisible(false);
            P1�޵�.setVisible(false);
            P1���̾.setVisible(false);
         }
      });
      
      P1���̾.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
             if (t.p1_mineral < 65) {
            	 JOptionPane.showMessageDialog(null, "�̳׶��� �����մϴ�!");
                System.out.println("�̳׶��� �����մϴ�!");
             }
             else {
                t.p1_mineral -= 65;
                P1UpBar.setText("�̳׶�: "+t.p1_mineral);
                 firebat.set_unit(t.p1_unit);
                 t.p1_units[0][t.p1_unit]=firebat.p1_setHp();
                 t.p1_units[1][t.p1_unit]=firebat.p1_setSt();
                 t.p1_units[2][t.p1_unit]=firebat.p1_setDf();
                 t.p1_units_name[t.p1_unit] = "firebat";
                 System.out.println("p1�� ����"+t.p1_unit);
                 t.p1_unit=firebat.get_unit();
                 t.p1���̾num+=1;
                 P1���̾Num.setText("���̾: "+t.p1���̾num);
                }
          }});
      
      P1���丮.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent evt) {
            P1���丮.setVisible(false);
            P1����.setVisible(true);
            P1��ũ.setVisible(true);
            P1�񸮾�.setVisible(true);
            
         }
         public void mouseExited(MouseEvent evt) {   
            P1���丮.setVisible(true);
            P1����.setVisible(false);
            P1��ũ.setVisible(true);
            P1�񸮾�.setVisible(true);
         }
      });
            
      P1����.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent evt) {
            P1���丮.setVisible(false);
            P1����.setVisible(true);
            P1��ũ.setVisible(true);
            P1�񸮾�.setVisible(true);
         }
         public void mouseExited(MouseEvent evt) {
            P1���丮.setVisible(true);
            P1����.setVisible(false);
            P1��ũ.setVisible(false);
            P1�񸮾�.setVisible(false);
         }
      });
      
      P1����.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
              if (t.p1_mineral < 75) {
            	  JOptionPane.showMessageDialog(null, "�̳׶��� �����մϴ�!");
                 System.out.println("�̳׶��� �����մϴ�!");
              }
              else {
                 t.p1_mineral -= 75;
                 P1UpBar.setText("�̳׶�: "+t.p1_mineral);
                 vulture.set_unit(t.p1_unit);
                t.p1_units[0][t.p1_unit]=vulture.p1_setHp();
                t.p1_units[1][t.p1_unit]=vulture.p1_setSt();
                t.p1_units[2][t.p1_unit]=vulture.p1_setDf();
                t.p1_units_name[t.p1_unit] = "vuiture";
                System.out.println("p1�� ����"+t.p1_unit);
                t.p1_unit=vulture.get_unit();
                t.p1����num+=1;
                P1����Num.setText("����: "+t.p1����num);
              }
           }});
      
      P1��ũ.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent evt) {
            P1���丮.setVisible(false);
            P1����.setVisible(true);
            P1��ũ.setVisible(true);
            P1�񸮾�.setVisible(true); 
         }
         public void mouseExited(MouseEvent evt) {   
            P1���丮.setVisible(true);
            P1����.setVisible(false);
            P1��ũ.setVisible(false);
            P1�񸮾�.setVisible(false);
         }
      });
      
      P1��ũ.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
              if (t.p1_mineral < 85) {
            	  JOptionPane.showMessageDialog(null, "�̳׶��� �����մϴ�!");
                 System.out.println("�̳׶��� �����մϴ�!");
              }
              else {
                 t.p1_mineral -= 85;
                 P1UpBar.setText("�̳׶�: "+t.p1_mineral);
                 tank.set_unit(t.p1_unit);
                 t.p1_units[0][t.p1_unit]=tank.p1_setHp();
                 t.p1_units[1][t.p1_unit]=tank.p1_setSt();
                 t.p1_units[2][t.p1_unit]=tank.p1_setDf();
                 t.p1_units_name[t.p1_unit] = "tank";
                 System.out.println("p1�� ����"+t.p1_unit);
                 t.p1_unit=tank.get_unit();
                 t.p1��ũnum+=1;
                 P1��ũNum.setText("��ũ: "+t.p1��ũnum);
              }
           }});
      
      P1�񸮾�.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent evt) {
            P1���丮.setVisible(false);
            P1����.setVisible(true);
            P1��ũ.setVisible(true);
            P1�񸮾�.setVisible(true);
         }
         public void mouseExited(MouseEvent evt) {   
            P1���丮.setVisible(true);
            P1����.setVisible(false);
            P1��ũ.setVisible(false);
            P1�񸮾�.setVisible(false);
         }
      });
      
      P1�񸮾�.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
             if (t.p1_mineral < 80) {
            	 JOptionPane.showMessageDialog(null, "�̳׶��� �����մϴ�!");
                System.out.println("�̳׶��� �����մϴ�!");
             }
             else {
                t.p1_mineral -= 80;
                P1UpBar.setText("�̳׶�: "+t.p1_mineral);
                 goliath.set_unit(t.p1_unit);
                 t.p1_units[0][t.p1_unit]=goliath.p1_setHp();
                 t.p1_units[1][t.p1_unit]=goliath.p1_setSt();
                 t.p1_units[2][t.p1_unit]=goliath.p1_setDf();
                 t.p1_units_name[t.p1_unit] = "goliath";
                 System.out.println("p1�� ����"+t.p1_unit);
                 t.p1_unit=goliath.get_unit();
                 t.p1�񸮾�num+=1;
                 P1�񸮾�Num.setText("�񸮾�: "+t.p1�񸮾�num);
                 }
          }});
      
      P1��Ÿ��Ʈ.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent evt) {
            P1��Ÿ��Ʈ.setVisible(false);
            P1���̽�.setVisible(true);
            P1��Ű��.setVisible(true);
            P1��Ʋũ����.setVisible(true);
            
         }
         public void mouseExited(MouseEvent evt) {   
            P1��Ÿ��Ʈ.setVisible(true);
            P1���̽�.setVisible(false);
            P1��Ű��.setVisible(true);
            P1��Ʋũ����.setVisible(true);
         }
      });
            
      P1���̽�.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent evt) {
            P1��Ÿ��Ʈ.setVisible(false);
            P1���̽�.setVisible(true);
            P1��Ű��.setVisible(true);
            P1��Ʋũ����.setVisible(true);
         }
         public void mouseExited(MouseEvent evt) {
            P1��Ÿ��Ʈ.setVisible(true);
            P1���̽�.setVisible(false);
            P1��Ű��.setVisible(false);
            P1��Ʋũ����.setVisible(false);
         }
      });
      
      P1���̽�.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
             if (t.p1_mineral < 70) {
            	 JOptionPane.showMessageDialog(null, "�̳׶��� �����մϴ�!");
                System.out.println("�̳׶��� �����մϴ�!"); }
             else {
                t.p1_mineral -= 70;
                P1UpBar.setText("�̳׶�: "+t.p1_mineral);
                 wraith.set_unit(t.p1_unit);
                 t.p1_units[0][t.p1_unit]=wraith.p1_setHp();
                 t.p1_units[1][t.p1_unit]=wraith.p1_setSt();
                 t.p1_units[2][t.p1_unit]=wraith.p1_setDf();
                 t.p1_units_name[t.p1_unit] = "wraith";
                 System.out.println("p1�� ����"+t.p1_unit);
                 t.p1_unit=wraith.get_unit();
                 t.p1���̽�num+=1;
                 P1���̽�Num.setText("���̽�: "+t.p1���̽�num);
                 }
          }});
      
      P1��Ű��.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent evt) {
            P1��Ÿ��Ʈ.setVisible(false);
            P1���̽�.setVisible(true);
            P1��Ű��.setVisible(true);
            P1��Ʋũ����.setVisible(true);
            
         }
         public void mouseExited(MouseEvent evt) {   
            P1��Ÿ��Ʈ.setVisible(true);
            P1���̽�.setVisible(false);
            P1��Ű��.setVisible(false);
            P1��Ʋũ����.setVisible(false);
         }
      });
      
      P1��Ű��.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
             if (t.p1_mineral < 75) {
            	 JOptionPane.showMessageDialog(null, "�̳׶��� �����մϴ�!");
                System.out.println("�̳׶��� �����մϴ�!"); }
             else {
             t.p1_mineral -= 75;
             P1UpBar.setText("�̳׶�: "+t.p1_mineral);
             medic.set_unit(t.p1_unit);
             t.p1_units[0][t.p1_unit]=valkyrie.p1_setHp();
             t.p1_units[1][t.p1_unit]=valkyrie.p1_setSt();
             t.p1_units[2][t.p1_unit]=valkyrie.p1_setDf();
             t.p1_units_name[t.p1_unit] = "valkyrie";
             System.out.println("p1�� ����"+t.p1_unit);
             t.p1_unit=valkyrie.get_unit();
             t.p1��Ű��num+=1;
             P1��Ű��Num.setText("��Ű��: "+t.p1��Ű��num);
             }
          }});
      
      P1��Ʋũ����.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent evt) {
            P1��Ÿ��Ʈ.setVisible(false);
            P1���̽�.setVisible(true);
            P1��Ű��.setVisible(true);
            P1��Ʋũ����.setVisible(true);
         }
         public void mouseExited(MouseEvent evt) {   
            P1��Ÿ��Ʈ.setVisible(true);
            P1���̽�.setVisible(false);
            P1��ũ.setVisible(false);
            P1�񸮾�.setVisible(false);
         }
      });
      
      P1��Ʋũ����.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
             if (t.p1_mineral < 100) {
            	 JOptionPane.showMessageDialog(null, "�̳׶��� �����մϴ�!");
                System.out.println("�̳׶��� �����մϴ�!");
             }
             else {
                t.p1_mineral -= 100;
                P1UpBar.setText("�̳׶�: "+t.p1_mineral);
             battlecruiser.set_unit(t.p1_unit);
              t.p1_units[0][t.p1_unit]=battlecruiser.p1_setHp();
              t.p1_units[1][t.p1_unit]=battlecruiser.p1_setSt();
              t.p1_units[2][t.p1_unit]=battlecruiser.p1_setDf();
              t.p1_units_name[t.p1_unit] = "battlecruiser";
              System.out.println("p1�� ����"+t.p1_unit);
              t.p1_unit=battlecruiser.get_unit();
              t.p1��Ʋũ����num+=1;
              P1��Ʋũ����Num.setText("��Ʋũ����: "+t.p1��Ʋũ����num);
             }
          }});
      
      P2Ŀ�������.addMouseListener(new MouseAdapter() {   
         public void mouseEntered(MouseEvent evt) {
            P2Ŀ�������.setVisible(false);
            P2SCV.setVisible(true);
            
         }
         public void mouseExited(MouseEvent evt) {   
            P2Ŀ�������.setVisible(true);
            P2SCV.setVisible(false);
         }
      });
      
      P2SCV.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent evt) {
            P2Ŀ�������.setVisible(false);
            P2SCV.setVisible(true);
         }
         public void mouseExited(MouseEvent evt) {
            P2Ŀ�������.setVisible(true);
            P2SCV.setVisible(false);
         } 
      });
      
      P2SCV.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
              if (t.p2_mineral < 50) {
            	  JOptionPane.showMessageDialog(null, "�̳׶��� �����մϴ�!");
                 System.out.println("�̳׶��� �����մϴ�!");
              }
              else {
                 t.p2_mineral -= 50;
                 P2UpBar.setText("�̳׶�: "+t.p2_mineral);
              scv.set_unit(t.p2_unit);
               t.p2_units[0][t.p2_unit]=scv.p2_setHp();
               t.p2_units[1][t.p2_unit]=scv.p2_setSt();
               t.p2_units[2][t.p2_unit]=scv.p2_setDf();
               t.p2_units_name[t.p2_unit] = "scv";
               System.out.println("p2�� ����"+t.p2_unit);
               t.p2_unit=scv.get_unit();
               t.p2SCVnum+=1;
               P2SCVNum.setText("SCV: "+t.p2SCVnum);
              }
           }});
      
      P2�跰.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent evt) {
            P2�跰.setVisible(false);
            P2����.setVisible(true);
            P2�޵�.setVisible(true);
            P2���̾.setVisible(true);
            
         }
         public void mouseExited(MouseEvent evt) {   
            P2�跰.setVisible(true);
            P2����.setVisible(false);
            P2�޵�.setVisible(true);
            P2���̾.setVisible(true);
         }
      });
            
      P2����.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent evt) {
            P2�跰.setVisible(false);
            P2����.setVisible(true);
            P2�޵�.setVisible(true);
            P2���̾.setVisible(true);
            
         }
         public void mouseExited(MouseEvent evt) {
            P2�跰.setVisible(true);
            P2����.setVisible(false);
            P2�޵�.setVisible(false);
            P2���̾.setVisible(false);
         }
      });
      
      P2����.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            if (t.p2_mineral < 60) {
            	 JOptionPane.showMessageDialog(null, "�̳׶��� �����մϴ�!");
               System.out.println("�̳׶��� �����մϴ�!");
            }
            else {
               t.p2_mineral -= 60;
               P2UpBar.setText("�̳׶�: "+t.p2_mineral);
            marine.set_unit(t.p2_unit);
             t.p2_units[0][t.p2_unit]=marine.p2_setHp();
             t.p2_units[1][t.p2_unit]=marine.p2_setSt();
             t.p2_units[2][t.p2_unit]=marine.p2_setDf();
             t.p2_units_name[t.p2_unit] = "marine";
             System.out.println("p2�� ����"+t.p2_unit);
             t.p2_unit=marine.get_unit();
             t.p2����num+=1;
             P2����Num.setText("����: "+t.p2����num);
            }
         }});

      
      P2�޵�.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent evt) {
            P2�跰.setVisible(false);
            P2����.setVisible(true);
            P2�޵�.setVisible(true);
            P2���̾.setVisible(true);
         }
         public void mouseExited(MouseEvent evt) {   
            P2�跰.setVisible(true);
            P2����.setVisible(false);
            P2�޵�.setVisible(false);
            P2���̾.setVisible(false);
         }
      });
      
      P2�޵�.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            if (t.p2_mineral < 60) {
            	 JOptionPane.showMessageDialog(null, "�̳׶��� �����մϴ�!");
               System.out.println("�̳׶��� �����մϴ�!");
            }
            else {
               t.p2_mineral -= 60;
               P2UpBar.setText("�̳׶�: "+t.p2_mineral);
            medic.set_unit(t.p2_unit);
             t.p2_units[0][t.p2_unit]=medic.p2_setHp();
             t.p2_units[1][t.p2_unit]=medic.p2_setSt();
             t.p2_units[2][t.p2_unit]=medic.p2_setDf();
             t.p2_units_name[t.p2_unit] = "medic";
             System.out.println("p2�� ����"+t.p2_unit);
             t.p2_unit=medic.get_unit();
             t.p2�޵�num+=1;
             P2�޵�Num.setText("�޵�: "+t.p2�޵�num);
            }
         }});

      
      P2���̾.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent evt) {
            P2�跰.setVisible(false);
            P2����.setVisible(true);
            P2�޵�.setVisible(true);
            P2���̾.setVisible(true);
            
         }
         public void mouseExited(MouseEvent evt) {   
            P2�跰.setVisible(true);
            P2����.setVisible(false);
            P2�޵�.setVisible(false);
            P2���̾.setVisible(false);
         }
      });
      
      P2���̾.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            if (t.p2_mineral < 65) {
            	 JOptionPane.showMessageDialog(null, "�̳׶��� �����մϴ�!");
               System.out.println("�̳׶��� �����մϴ�!");
            }
            else {
               t.p2_mineral -= 60;
               P2UpBar.setText("�̳׶�: "+t.p2_mineral);
            firebat.set_unit(t.p2_unit);
             t.p2_units[0][t.p2_unit]=firebat.p2_setHp();
             t.p2_units[1][t.p2_unit]=firebat.p2_setSt();
             t.p2_units[2][t.p2_unit]=firebat.p2_setDf();
             t.p2_units_name[t.p2_unit] = "firebat";
             System.out.println("p2�� ����"+t.p2_unit);
             t.p2_unit=firebat.get_unit();
             t.p2���̾num+=1;
             P2���̾Num.setText("���̾: "+t.p2���̾num);
            }
         }});
      
      P2���丮.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent evt) {
            P2���丮.setVisible(false);
            P2����.setVisible(true);
            P2��ũ.setVisible(true);
            P2�񸮾�.setVisible(true);
            
         }
         public void mouseExited(MouseEvent evt) {   
            P2���丮.setVisible(true);
            P2����.setVisible(false);
            P2��ũ.setVisible(true);
            P2�񸮾�.setVisible(true);
         }
      });
            
      P2����.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent evt) {
            P2���丮.setVisible(false);
            P2����.setVisible(true);
            P2��ũ.setVisible(true);
            P2�񸮾�.setVisible(true);
         }
         public void mouseExited(MouseEvent evt) {
            P2���丮.setVisible(true);
            P2����.setVisible(false);
            P2��ũ.setVisible(false);
            P2�񸮾�.setVisible(false);
         }
      });
      
      P2����.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (t.p2_mineral < 75) {
                	 JOptionPane.showMessageDialog(null, "�̳׶��� �����մϴ�!");
                   System.out.println("�̳׶��� �����մϴ�!");
                }
                else {
                   t.p2_mineral -= 75;
                   P2UpBar.setText("�̳׶�: "+t.p2_mineral);
               vulture.set_unit(t.p2_unit);
                t.p2_units[0][t.p2_unit]=vulture.p2_setHp();
                t.p2_units[1][t.p2_unit]=vulture.p2_setSt();
                t.p2_units[2][t.p2_unit]=vulture.p2_setDf();
                t.p2_units_name[t.p2_unit] = "vulture";
                System.out.println("p2�� ����"+t.p2_unit);
                t.p2_unit=vulture.get_unit();
                t.p2����num+=1;
                P2����Num.setText("��ó: "+t.p2����num);
                }
            }});
  
      P2��ũ.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent evt) {
            P2���丮.setVisible(false);
            P2����.setVisible(true);
            P2��ũ.setVisible(true);
            P2�񸮾�.setVisible(true);
            
         }
         public void mouseExited(MouseEvent evt) {   
            P2���丮.setVisible(true);
            P2����.setVisible(false);
            P2��ũ.setVisible(false);
            P2�񸮾�.setVisible(false);
         }
      });
      
      P2��ũ.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (t.p2_mineral < 85) {
                	 JOptionPane.showMessageDialog(null, "�̳׶��� �����մϴ�!");
                   System.out.println("�̳׶��� �����մϴ�!");
                }
                else {
                   t.p2_mineral -= 85;
                   P2UpBar.setText("�̳׶�: "+t.p2_mineral);
               tank.set_unit(t.p2_unit);
                t.p2_units[0][t.p2_unit]=tank.p2_setHp();
                t.p2_units[1][t.p2_unit]=tank.p2_setSt();
                t.p2_units[2][t.p2_unit]=tank.p2_setDf();
                t.p2_units_name[t.p2_unit] = "tank";
                System.out.println("p2�� ����"+t.p2_unit);
                t.p2_unit=tank.get_unit();
                t.p2��ũnum+=1;
                P2��ũNum.setText("��ũ: "+t.p2��ũnum);
                }
            }});
      
      P2�񸮾�.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent evt) {
            P2���丮.setVisible(false);
            P2����.setVisible(true);
            P2��ũ.setVisible(true);
            P2�񸮾�.setVisible(true);
            
         }
         public void mouseExited(MouseEvent evt) {   
            P2���丮.setVisible(true);
            P2����.setVisible(false);
            P2��ũ.setVisible(false);
            P2�񸮾�.setVisible(false);
         }
      });
      
      P2�񸮾�.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (t.p2_mineral < 80) {
                	 JOptionPane.showMessageDialog(null, "�̳׶��� �����մϴ�!");
                   System.out.println("�̳׶��� �����մϴ�!");
                }
                else {
                   t.p2_mineral -= 80;
                   P2UpBar.setText("�̳׶�: "+t.p2_mineral);
               goliath.set_unit(t.p2_unit);
                t.p2_units[0][t.p2_unit]=goliath.p2_setHp();
                t.p2_units[1][t.p2_unit]=goliath.p2_setSt();
                t.p2_units[2][t.p2_unit]=goliath.p2_setDf();
                t.p2_units_name[t.p2_unit] = "goliath";
                System.out.println("p2�� ����"+t.p2_unit);
                t.p2_unit=goliath.get_unit();
                t.p2�񸮾�num+=1;
                P2�񸮾�Num.setText("�񸮾�: "+t.p2�񸮾�num);
                }
            }});
      
      P2��Ÿ��Ʈ.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent evt) {
            P2��Ÿ��Ʈ.setVisible(false);
            P2���̽�.setVisible(true);
            P2��Ű��.setVisible(true);
            P2��Ʋũ����.setVisible(true);
            
         }
         public void mouseExited(MouseEvent evt) {   
            P2��Ÿ��Ʈ.setVisible(true);
            P2���̽�.setVisible(false);
            P2��Ű��.setVisible(true);
            P2��Ʋũ����.setVisible(true);
         }
      });
            
      P2���̽�.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent evt) {
            P2��Ÿ��Ʈ.setVisible(false);
            P2���̽�.setVisible(true);
            P2��Ű��.setVisible(true);
            P2��Ʋũ����.setVisible(true);
         }
         public void mouseExited(MouseEvent evt) {
            P2��Ÿ��Ʈ.setVisible(true);
            P2���̽�.setVisible(false);
            P2��Ű��.setVisible(false);
            P2��Ʋũ����.setVisible(false);
         }   
      });
      
      P2���̽�.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
              if (t.p2_mineral < 70) {
            	  JOptionPane.showMessageDialog(null, "�̳׶��� �����մϴ�!");
                 System.out.println("�̳׶��� �����մϴ�!");
              }
              else {
                 t.p2_mineral -= 70;
                 P2UpBar.setText("�̳׶�: "+t.p2_mineral);
              wraith.set_unit(t.p2_unit);
               t.p2_units[0][t.p2_unit]=wraith.p2_setHp();
               t.p2_units[1][t.p2_unit]=wraith.p2_setSt();
               t.p2_units[2][t.p2_unit]=wraith.p2_setDf();
               t.p2_units_name[t.p2_unit] = "wraith";
               System.out.println("p2�� ����"+t.p2_unit);
               t.p2_unit=wraith.get_unit();
               t.p2���̽�num+=1;
               P2���̽�Num.setText("���̽�: "+t.p2���̽�num);
              }
           }});
      
      P2��Ű��.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent evt) {
            P2��Ÿ��Ʈ.setVisible(false);
            P2���̽�.setVisible(true);
            P2��Ű��.setVisible(true);
            P2��Ʋũ����.setVisible(true);
            
         }
         public void mouseExited(MouseEvent evt) {   
            P2��Ÿ��Ʈ.setVisible(true);
            P2���̽�.setVisible(false);
            P2��Ű��.setVisible(false);
            P2��Ʋũ����.setVisible(false);
         }
      });
      
      P2��Ű��.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
              if (t.p2_mineral < 75) {
            	  JOptionPane.showMessageDialog(null, "�̳׶��� �����մϴ�!");
                 System.out.println("�̳׶��� �����մϴ�!");
              }
              else {
                 t.p2_mineral -= 75;
                 P2UpBar.setText("�̳׶�: "+t.p2_mineral);
              valkyrie.set_unit(t.p2_unit);
               t.p2_units[0][t.p2_unit]=valkyrie.p2_setHp();
               t.p2_units[1][t.p2_unit]=valkyrie.p2_setSt();
               t.p2_units[2][t.p2_unit]=valkyrie.p2_setDf();
               t.p2_units_name[t.p2_unit] = "valkyrie";
               System.out.println("p2�� ����"+t.p2_unit);
               t.p2_unit=valkyrie.get_unit();
               t.p2��Ű��num+=1;
               P2��Ű��Num.setText("��Ű��: "+t.p2��Ű��num);
              }
           }});
      
      P2��Ʋũ����.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent evt) {
            P2��Ÿ��Ʈ.setVisible(false);
            P2���̽�.setVisible(true);
            P2��Ű��.setVisible(true);
            P2��Ʋũ����.setVisible(true);
            
         }
         public void mouseExited(MouseEvent evt) {   
            P2��Ÿ��Ʈ.setVisible(true);
            P2���̽�.setVisible(false);
            P2��ũ.setVisible(false);
            P2�񸮾�.setVisible(false);
         }
      });
      
      P2��Ʋũ����.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
              if (t.p2_mineral < 100) {
            	  JOptionPane.showMessageDialog(null, "�̳׶��� �����մϴ�!");
                 System.out.println("�̳׶��� �����մϴ�!");
              }
              else {
                 t.p2_mineral -= 100;
                 P2UpBar.setText("�̳׶�: "+t.p2_mineral);
              battlecruiser.set_unit(t.p2_unit);
               t.p2_units[0][t.p2_unit]=battlecruiser.p2_setHp();
               t.p2_units[1][t.p2_unit]=battlecruiser.p2_setSt();
               t.p2_units[2][t.p2_unit]=battlecruiser.p2_setDf();
               t.p2_units_name[t.p2_unit] = "battlecruiser";
               System.out.println("p2�� ����"+t.p2_unit);
               t.p2_unit=battlecruiser.get_unit();
               t.p2��Ʋũ����num+=1;
               P2��Ʋũ����Num.setText("��Ʋũ����: "+t.p2��Ʋũ����num);
              }
           }});
      
      P2ready.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            P2num++;
            P2ready.setVisible(false);
            if((P1num!=0&&P2num!=0)&&P1num==P2num)
            {
               Fframe.setVisible(true);
               frame.setVisible(false);
               System.out.println("------------------------------------");
          
            }
         }
      });
      
      fight.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            mine_Mineral();
            fight();
            Fframe.setVisible(false);
            frame.setVisible(true);
            P1ready.setVisible(true);
            P2ready.setVisible(true);
            
            
            }
         });
       }
   
  public void mine_Mineral() {
     t.p1_mineral += (30)*t.p1SCVnum;//*p1 scv ����
     t.p2_mineral += (30)*t.p2SCVnum;//*p2 scv ����
     P1UpBar.setText("�̳׶�: "+t.p1_mineral);
     P2UpBar.setText("�̳׶�: "+t.p2_mineral);
  }
   
  public void fight() 
   {
     
     
      Random r = new Random();
      //k�� ���� ���� �������� turn�� �����ϴ� �÷��̾� ���ֹ迭�� �ε���
      int k,p1,p2,turn=0;

      while(true)
      {
         k = r.nextInt(2);
         
       
         //��������
         if(t.p1_units[0][turn]==0 && t.p2_units[0][turn]==0)
         {
            System.out.printf("Player1�� ���� ü�� %d!!! \n",P1Hp.getValue());
            System.out.printf("Player2�� ���� ü�� %d!!! \n",P2Hp.getValue());
            
            System.out.printf("Player1�� �̳׶� : %d \n", t.p1_mineral);
            System.out.printf("Player2�� �̳׶� : %d \n", t.p2_mineral);
            
            break;  
         }
         switch(k) 
         {
             
               case 0 :
               {
                  if(t.p2_units[0][0]!=0 && t.p1_units[0][turn]!=0)
                  {
                     //���ݹ��� ���
                        p2 = r.nextInt(t.p2_unit);
                   //p1�� ����
                        
                     t.p2_units[0][p2] -= (t.p1_units[1][turn] - t.p2_units[2][p2]);
                   
                     if(t.p2_units[0][p2]<=0) 
                     {
                        t.p2_units[0][p2]=0;
                        t.p2_units[1][p2]=0;
                        t.p2_units[2][p2]=0;
                        System.out.printf("P2�� %d��  %s ���! \n",p2, t.p2_units_name[p2]);
                        t.p2_unit--;
                        
                        //���ֱ��
                        if(t.p2_units_name[p2].equals("scv")) {
                           t.p2SCVnum-=1;
                           P2SCVNum.setText("SCV: "+ t.p2SCVnum);
                        } else if(t.p2_units_name[p2].equals("marine")) {
                           t.p2����num-=1;
                           P2����Num.setText("����: "+ t.p2����num);
                        } else if(t.p2_units_name[p2].equals("medic")) {
                           t.p2�޵�num-=1;
                           P2�޵�Num.setText("�޵�: "+ t.p2�޵�num);
                        } else if(t.p2_units_name[p2].equals("firebat")) {
                           t.p2���̾num-=1;
                           P2���̾Num.setText("���̾: "+ t.p2���̾num);
                        } else if(t.p2_units_name[p2].equals(" vulture")) {
                           t.p2����num-=1;
                           P2����Num.setText("����: "+ t.p2����num);
                        } else if(t.p2_units_name[p2].equals("tank")) {
                           t.p2��ũnum-=1;
                           P2��ũNum.setText("��ũ: "+ t.p2��ũnum);
                        } else if(t.p2_units_name[p2].equals("wraith")) {
                           t.p2���̽�num-=1;
                           P2���̽�Num.setText("���̽�: "+ t.p2���̽�num);
                        } else if(t.p2_units_name[p2].equals("valkyrie")) {
                           t.p2��Ű��num-=1;
                           P2��Ű��Num.setText("��Ű��: "+ t.p2��Ű��num);
                        } else if(t.p2_units_name[p2].equals("battlecruiser")) {
                           t.p2��Ʋũ����num-=1;
                           P2��Ʋũ����Num.setText("��Ʋũ����: "+ t.p2��Ʋũ����num);
                        } 
                        
                        
                        //��������, �̸����ĵ� �߰�
                        for(int i=p2; i<t.p2_unit; i++)
                        {
                           t.p2_units[0][i]=t.p2_units[0][i+1];
                           t.p2_units[1][i]=t.p2_units[1][i+1];
                           t.p2_units[2][i]=t.p2_units[2][i+1];
                           t.p2_units_name[i]=t.p2_units_name[i+1];
                        }
                        
                        //���ֹ迭�� �ʱ�ȭ�ȵ� ������ĭ �ʱ�ȭ
                        t.p2_units[0][t.p2_unit]=0;
                        t.p2_units[1][t.p2_unit]=0;
                        t.p2_units[2][t.p2_unit]=0;
                        t.p2_units_name[t.p2_unit]=null;
                     }
                  }
                  else 
                  {
                     P2Hp.setValue(P2Hp.getValue()-t.p1_units[1][turn]);
                     
                     if(P2Hp.getValue()<=0)
                     {
                        JOptionPane.showMessageDialog(null, "������ �����մϴ�.");
                        System.exit(0);
                     }
                  }
                  
               break;
               }
               
            case 1 :
            {
               if(t.p1_units[0][0]!=0 && t.p2_units[0][turn]!=0)
               {
                  //���ݹ��� ���
                  p1 = r.nextInt(t.p1_unit);
                
                  //p2�� ����
                  t.p1_units[0][p1] -= (t.p2_units[1][turn] - t.p1_units[2][p1]);
                  if(t.p1_units[0][p1]<=0) 
                  {
                     t.p1_units[0][p1]=0;
                     t.p1_units[1][p1]=0;
                     t.p1_units[2][p1]=0;
                    
                     System.out.println(t.p1_units_name[p1]);
                     System.out.printf("p1�� %d��  %s ���! \n",p1, t.p1_units_name[p1]);
                     t.p1_unit--;
                     
                     if(t.p1_units_name[p1].equals("scv")) {
                        t.p1SCVnum-=1;
                        P1SCVNum.setText("SCV: "+ t.p1SCVnum);
                     } else if(t.p1_units_name[p1].equals("marine")) {
                        t.p1����num-=1;
                        P1����Num.setText("����: "+ t.p1����num);
                     } else if(t.p1_units_name[p1].equals("medic")) {
                        t.p1�޵�num-=1;
                        P1�޵�Num.setText("�޵�: "+ t.p1�޵�num);
                     } else if(t.p1_units_name[p1].equals("firebat")) {
                        t.p1���̾num-=1;
                        P1���̾Num.setText("���̾: "+ t.p1���̾num);
                     } else if(t.p1_units_name[p1].equals(" vulture")) {
                        t.p1����num-=1;
                        P1����Num.setText("����: "+ t.p1����num);
                     } else if(t.p1_units_name[p1].equals("tank")) {
                        t.p1��ũnum-=1;
                        P1��ũNum.setText("��ũ: "+ t.p1��ũnum);
                     } else if(t.p1_units_name[p1].equals("wraith")) {
                        t.p1���̽�num-=1;
                        P1���̽�Num.setText("���̽�: "+ t.p1���̽�num);
                     } else if(t.p1_units_name[p1].equals("valkyrie")) {
                        t.p1��Ű��num-=1;
                        P1��Ű��Num.setText("��Ű��: "+ t.p1��Ű��num);
                     } else if(t.p1_units_name[p1].equals("battlecruiser")) {
                        t.p1��Ʋũ����num-=1;
                        P1��Ʋũ����Num.setText("��Ʋũ����: "+ t.p1��Ʋũ����num);
                     } 
                     
                     
                     
                     
                     
                  //��������
                  for(int i=p1; i<t.p1_unit; i++)
                  {
                     t.p1_units[0][i]=t.p1_units[0][i+1];
                     t.p1_units[1][i]=t.p1_units[1][i+1];
                     t.p1_units[2][i]=t.p1_units[2][i+1];
                     t.p1_units_name[i]=t.p1_units_name[i+1];
                     
                  }
                  //���ֹ迭�� �ʱ�ȭ�ȵ� ������ĭ �ʱ�ȭ
                  t.p1_units[0][t.p1_unit]=0;
                  t.p1_units[1][t.p1_unit]=0;
                  t.p1_units[2][t.p1_unit]=0;
                  t.p1_units_name[t.p1_unit]=null;
                  
                  }
               }
                else
                  {
                  //p1Ŀ������� ������
                     P1Hp.setValue(P1Hp.getValue()-t.p2_units[1][turn]);
                     
                        if(P1Hp.getValue()<=0)
                        {
                           
                           System.exit(0);
                        }
                  }
              
               break;
               
          
            }
         }
         
         
        
         turn++;
      }
   }


      
   
   
   
   public static void main(String[] args) {
      
      new GUIexample();
      
      
     
   }
}