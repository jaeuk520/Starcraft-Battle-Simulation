package Starcraft;



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.util.Random;
//p1_units_name



public class GUIexample extends JFrame {
   
  ////////////////////////객체 생성///////////////////////////////
   static 테란 t=new 테란();
   //지상인간
   마린 marine=new 마린(10, 10, 0);
   SCV scv=new SCV(30, 5, 0);
   메딕 medic=new 메딕(50, 2, 0);
   파이어벳 firebat=new 파이어벳(15, 8, 0);
   //지상기계
   벌쳐 vulture=new 벌쳐(30, 5,0);
   탱크 tank=new 탱크(35, 20, 0);
   골리앗 goliath=new 골리앗(40, 20, 0);
   //공중기계
   레이스 wraith=new 레이스(10, 10, 0);
   발키리 valkyrie=new 발키리(50, 20, 0);
   배틀크루져 battlecruiser=new 배틀크루져(70, 50, 0);
   
  
 
 
   //시작 화면 크기 고정
   public static final int SCREEN_WIDTH = 1330;
   public static final int SCREEN_HEIGHT = 746;
   
   //맨 처음 화면
  
   
   
   //게임 진행화면
   JFrame frame = new JFrame("Starcraft");
   //Player1의 상단,하단 바 객체설정
   private ImageIcon mainBackground = new ImageIcon(GUIexample.class.getResource("../images/mainBackground.jpg"));
   JLabel P1UpBar = new JLabel("\uBBF8\uB124\uB784: 50");
   JLabel P1DownUnitBar = new JLabel(mainBackground);
   JPanel P1DownTextBar = new JPanel();
   //P1 피통
   JProgressBar P1Hp = new JProgressBar(0,300);
   //턴종료 버튼과 변수와 전투버튼
   JButton P1ready = new JButton("P1 READY!");
   JButton P2ready = new JButton("P2 READY!");
   static int P1num=0;
   static int P2num=0;
   //전투프레임과 버튼
   JFrame Fframe = new JFrame("War!");
   JButton fight = new JButton("Fight!");
   //Player2d의 상단,하단 바 객체설정
   JLabel P2UpBar = new JLabel ("미네랄: "+t.p2_mineral);
   JLabel P2DownUnitBar = new JLabel(mainBackground);
   JPanel P2DownTextBar = new JPanel();
   //P1 피통
   JProgressBar P2Hp = new JProgressBar(0,300);
   //P1 유닛 라벨
   JLabel P1SCVNum = new JLabel("SCV:");
   JLabel P1마린Num = new JLabel("마린:");
   JLabel P1파이어벳Num = new JLabel("파이어벳:");
   JLabel P1메딕Num = new JLabel("메딕:");
   JLabel P1벌쳐Num = new JLabel("벌쳐:");
   JLabel P1탱크Num = new JLabel("탱크:");
   JLabel P1골리앗Num = new JLabel("골리앗:");
   JLabel P1레이스Num = new JLabel("레이스:");
   JLabel P1발키리Num = new JLabel("발키리:");
   JLabel P1배틀크루저Num = new JLabel("배틀크루저:");
   //Player1의 필드 및 버튼 객체 설정
   JLabel P1panel1 = new JLabel(mainBackground); 
   JLabel P1panel2 = new JLabel(mainBackground);
   JLabel P1panel3 = new JLabel(mainBackground);
   private ImageIcon img커멘더센터 = new ImageIcon(GUIexample.class.getResource("../images/Center.png"));
   JButton P1커멘더센터 = new JButton(img커멘더센터);
   private ImageIcon B = new ImageIcon(GUIexample.class.getResource("../images/B.png"));
   JButton P1배럭 = new JButton(B);
   private ImageIcon F = new ImageIcon(GUIexample.class.getResource("../images/F.png"));
   JButton P1팩토리 = new JButton(F);
   private ImageIcon S = new ImageIcon(GUIexample.class.getResource("../images/S.png"));
   JButton P1스타포트 = new JButton(S);
   private ImageIcon EB = new ImageIcon(GUIexample.class.getResource("../images/EB.jpg"));
   JButton P1엔지니어링베이 = new JButton(EB);
   private ImageIcon A = new ImageIcon(GUIexample.class.getResource("../images/A.jpg"));
   JButton P1아머리 = new JButton(A);
   
   //Player1의 유닛 버튼 객체 설정
   JButton P1SCV = new JButton("SCV");
   JButton P1마린 = new JButton("마린");
   JButton P1파이어벳 = new JButton("파이어벳");
   JButton P1메딕 = new JButton("메딕");
   JButton P1벌쳐 = new JButton("벌쳐");
   JButton P1탱크 = new JButton("탱크");
   JButton P1골리앗 = new JButton("골리앗");
   JButton P1레이스 = new JButton("레이스");
   JButton P1발키리 = new JButton("발키리");
   JButton P1배틀크루저 = new JButton("배틀크루저");
   //Player2의 필드 및 버튼 객체 설정
   JLabel P2panel1 = new JLabel(mainBackground); 
   JLabel P2panel2 = new JLabel(mainBackground);
   JLabel P2panel3 = new JLabel(mainBackground);
   
   private ImageIcon Center2 = new ImageIcon(GUIexample.class.getResource("../images/Center2.jpg"));
   JButton P2커멘더센터 = new JButton(Center2);
   private ImageIcon B2 = new ImageIcon(GUIexample.class.getResource("../images/B2.jpg"));
   JButton P2배럭 = new JButton(B2);
   private ImageIcon F2 = new ImageIcon(GUIexample.class.getResource("../images/F2.jpg"));
   JButton P2팩토리 = new JButton(F2);
   private ImageIcon S2 = new ImageIcon(GUIexample.class.getResource("../images/S2.jpg"));
   JButton P2스타포트 = new JButton(S2);
   private ImageIcon EB2 = new ImageIcon(GUIexample.class.getResource("../images/EB2.jpg"));
   JButton P2엔지니어링베이 = new JButton(EB2);
   private ImageIcon A2 = new ImageIcon(GUIexample.class.getResource("../images/A2.jpg"));
   JButton P2아머리 = new JButton(A2);
   //P1 유닛 라벨
   JLabel P2SCVNum = new JLabel("SCV:");
   JLabel P2마린Num = new JLabel("마린:");
   JLabel P2파이어벳Num = new JLabel("파이어벳:");
   JLabel P2메딕Num = new JLabel("메딕:");
   JLabel P2벌쳐Num = new JLabel("벌쳐:");
   JLabel P2탱크Num = new JLabel("탱크:");
   JLabel P2골리앗Num = new JLabel("골리앗:");
   JLabel P2레이스Num = new JLabel("레이스:");
   JLabel P2발키리Num = new JLabel("발키리:");
   JLabel P2배틀크루저Num = new JLabel("배틀크루저:");
   //Player1의 유닛 버튼 객체 설정
   JButton P2SCV = new JButton("SCV");
   JButton P2마린 = new JButton("마린");
   JButton P2파이어벳 = new JButton("파이어벳");
   JButton P2메딕 = new JButton("메딕");
   JButton P2벌쳐 = new JButton("벌쳐");
   JButton P2탱크 = new JButton("탱크");
   JButton P2골리앗 = new JButton("골리앗");
   JButton P2레이스 = new JButton("레이스");
   JButton P2발키리 = new JButton("발키리");
   JButton P2배틀크루저 = new JButton("배틀크루저");
 //건물에 체력이랑 공격력 버튼 생성-지은
   JButton P1엔지니어링베이체력 = new JButton("체력 +10");
   JButton P1엔지니어링베이공격력 = new JButton("공격력 +10");
   JButton P1엔지니어링베이방어력 = new JButton("방어력+5");
   JButton P2엔지니어링베이체력 = new JButton("체력 +10");
   JButton P2엔지니어링베이공격력= new JButton("공격력+10");
   JButton P2엔지니어링베이방어력 = new JButton("방어력+5");
   JButton P1아머리체력 = new JButton("체력 +10");
   JButton P1아머리공격력 = new JButton("공격력 +10");
   JButton P1아머리방어력 = new JButton("방어력+5");
   JButton P2아머리체력 = new JButton("체력 +10");
   JButton P2아머리공격력 = new JButton("공격력 +10");
   JButton P2아머리방어력 = new JButton("방어력+5");
   ///////////////////////////버튼 생성 끝/////////////////////////////////////
   
   
   public GUIexample() {
      
      Starcraft star = new Starcraft();
      
       
      
      //전투화면과 버튼
      Fframe.setBounds(0,0,1200,750);
      Fframe.setVisible(false);
      Fframe.setDefaultCloseOperation(EXIT_ON_CLOSE);
      Fframe.getContentPane().setLayout(null);
      fight.setBounds(0,0,1200,750);
      Fframe.getContentPane().add(fight);
      
      //JFrame 설정
      frame.setBounds(0,0,1200,750);
      frame.setVisible(false);
      frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);
      
      //Player1의 JPanel 설정
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
      //Player1의 패널과 버튼 설정
      P1커멘더센터.setBounds(0,150,200,200);
      P1panel1.add(P1커멘더센터);
      P1배럭.setBounds(25,0,150,150);
      P1panel2.add(P1배럭);
      P1팩토리.setBounds(25,175,150,150);
      P1panel2.add(P1팩토리);
      P1스타포트.setBounds(25,350,150,150);
      P1panel2.add(P1스타포트);
      P1엔지니어링베이.setBounds(25,70,150,150);
      P1panel3.add(P1엔지니어링베이);
      P1아머리.setBounds(25,280,150,150);
      P1panel3.add(P1아머리);
      P1Hp.setValue(300);
      P1Hp.setBackground(Color.gray);
      P1Hp.setForeground(Color.RED);
      P1Hp.setBounds(0,100,200,30);
      P1panel1.add(P1Hp);
    //마우스이벤트-지은
      P1엔지니어링베이.addMouseListener(new MouseAdapter() {   
          public void mouseEntered(MouseEvent evt) {
             P1엔지니어링베이.setVisible(false);
             P1엔지니어링베이체력.setVisible(true);
             P1엔지니어링베이공격력.setVisible(true);
             P1엔지니어링베이방어력.setVisible(true);
             
    }
          public void mouseExited(MouseEvent evt) {   
             P1엔지니어링베이.setVisible(true);
             P1엔지니어링베이체력.setVisible(false);
             P1엔지니어링베이공격력.setVisible(false);
             P1엔지니어링베이방어력.setVisible(false);
          }
    });
      
      //P1 유닛 라벨 설정
      P1SCVNum.setBounds(0,0,200,30);
      P1DownTextBar.add(P1SCVNum);
      P1마린Num.setBounds(0,30,200,30);
      P1DownTextBar.add(P1마린Num);
      P1파이어벳Num.setBounds(0,60,200,30);
      P1DownTextBar.add(P1파이어벳Num);
      P1메딕Num.setBounds(0,90,200,30); 
      P1DownTextBar.add(P1메딕Num);
      P1벌쳐Num.setBounds(0,120,200,30); 
      P1DownTextBar.add(P1벌쳐Num);
      P1탱크Num.setBounds(200,0,200,30); 
      P1DownTextBar.add(P1탱크Num);
      P1골리앗Num.setBounds(200,30,200,30); 
      P1DownTextBar.add(P1골리앗Num);
      P1레이스Num.setBounds(200,60,200,30); 
      P1DownTextBar.add(P1레이스Num);
      P1발키리Num.setBounds(200,90,200,30); 
      P1DownTextBar.add(P1발키리Num);
      P1배틀크루저Num.setBounds(200,120,200,30); 
      P1DownTextBar.add(P1배틀크루저Num);
      P1SCV.setIcon(new ImageIcon("C:\\Users\\jaeuk\\Documents\\\uCE74\uCE74\uC624\uD1A1 \uBC1B\uC740 \uD30C\uC77C\\SCV.jpg"));
      
      //Player1의 유닛 버튼 설정
      P1SCV.setBounds(0,150,200,200);
      P1panel1.add(P1SCV);
      P1SCV.setVisible(false);
      P1마린.setIcon(new ImageIcon("C:\\Users\\jaeuk\\Documents\\\uCE74\uCE74\uC624\uD1A1 \uBC1B\uC740 \uD30C\uC77C\\\uB9C8\uB9B0.jpg"));
      P1마린.setHorizontalAlignment(SwingConstants.LEFT);
      P1마린.setBounds(25,0,150,75);
      P1panel2.add(P1마린);
      P1마린.setVisible(false);
      P1메딕.setIcon(new ImageIcon("C:\\Users\\jaeuk\\Documents\\\uCE74\uCE74\uC624\uD1A1 \uBC1B\uC740 \uD30C\uC77C\\\uBA54\uB515.jpg"));
      P1메딕.setBounds(25,75,75,75);
      P1panel2.add(P1메딕);
      P1메딕.setVisible(false);
      P1파이어벳.setIcon(new ImageIcon("C:\\Users\\jaeuk\\Documents\\\uCE74\uCE74\uC624\uD1A1 \uBC1B\uC740 \uD30C\uC77C\\\uD30C\uC774\uC5B4\uBCB3.jpg"));
      P1파이어벳.setBounds(100,75,75,75);
      P1panel2.add(P1파이어벳);
      P1파이어벳.setVisible(false);
      P1벌쳐.setIcon(new ImageIcon("C:\\Users\\jaeuk\\Documents\\\uCE74\uCE74\uC624\uD1A1 \uBC1B\uC740 \uD30C\uC77C\\\uBC8C\uCCD0.jpg"));
      P1벌쳐.setBounds(25,175,75,75);
      P1panel2.add(P1벌쳐);
      P1벌쳐.setVisible(false);
      P1탱크.setIcon(new ImageIcon("C:\\Users\\jaeuk\\Documents\\\uCE74\uCE74\uC624\uD1A1 \uBC1B\uC740 \uD30C\uC77C\\\uD0F1\uD06C.jpg"));
      P1탱크.setBounds(25,250,150,75);
      P1panel2.add(P1탱크);
      P1탱크.setVisible(false);
      P1골리앗.setIcon(new ImageIcon("C:\\Users\\jaeuk\\Documents\\\uCE74\uCE74\uC624\uD1A1 \uBC1B\uC740 \uD30C\uC77C\\\uACE8\uB9AC\uC557.jpg"));
      P1골리앗.setBounds(100,175,75,75);
      P1panel2.add(P1골리앗);
      P1골리앗.setVisible(false);
      P1레이스.setIcon(new ImageIcon("C:\\Users\\jaeuk\\Documents\\\uCE74\uCE74\uC624\uD1A1 \uBC1B\uC740 \uD30C\uC77C\\\uB808\uC774\uC2A4.png"));
      P1레이스.setBounds(25,350,75,75);
      P1panel2.add(P1레이스);
      P1레이스.setVisible(false);
      P1발키리.setIcon(new ImageIcon("C:\\Users\\jaeuk\\Documents\\\uCE74\uCE74\uC624\uD1A1 \uBC1B\uC740 \uD30C\uC77C\\\uBC1C\uD0A4\uB9AC.jpg"));
      P1발키리.setBounds(100,350,75,75);
      P1panel2.add(P1발키리);
      P1발키리.setVisible(false);
      P1배틀크루저.setIcon(new ImageIcon("C:\\Users\\jaeuk\\Documents\\\uCE74\uCE74\uC624\uD1A1 \uBC1B\uC740 \uD30C\uC77C\\\uBC30\uD2C0\uD06C\uB8E8\uC800.jpg"));
      P1배틀크루저.setBounds(25,425,150,75);
      P1panel2.add(P1배틀크루저);
      P1배틀크루저.setVisible(false);
      //P1체력공격력버튼-지은
      P1엔지니어링베이체력.setBounds(25, 70, 150, 75);
      P1panel3.add(P1엔지니어링베이체력);
      P1엔지니어링베이체력.setVisible(true);
      P1엔지니어링베이공격력.setBounds(25, 145, 75, 75);
      P1panel3.add(P1엔지니어링베이공격력);
      P1엔지니어링베이공격력.setVisible(true);
      P1엔지니어링베이방어력.setBounds(100, 145, 75, 75);
      P1panel3.add(P1엔지니어링베이방어력);
      P1엔지니어링베이방어력.setVisible(true);
      
      P1아머리체력.setBounds(25, 280, 150, 75);
      P1panel3.add(P1아머리체력);
      P1아머리체력.setVisible(true);
      P1아머리공격력.setBounds(25, 355, 75, 75);
      P1panel3.add(P1아머리공격력);
      P1아머리공격력.setVisible(true);
      P1아머리방어력.setBounds(100, 355, 75, 75);
      P1panel3.add(P1아머리방어력);
      P1아머리방어력.setVisible(true);
      
      
      
      //Player2의 버튼과 패널 설정
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
      
      //P2 유닛 라벨 설정
      P2SCVNum.setBounds(0,0,200,30);
      P2DownTextBar.add(P2SCVNum);
      P2마린Num.setBounds(0,30,200,30);
      P2DownTextBar.add(P2마린Num);
      P2파이어벳Num.setBounds(0,60,200,30);
      P2DownTextBar.add(P2파이어벳Num);
      P2메딕Num.setBounds(0,90,200,30); 
      P2DownTextBar.add(P2메딕Num);
      P2벌쳐Num.setBounds(0,120,200,30); 
      P2DownTextBar.add(P2벌쳐Num);
      P2탱크Num.setBounds(200,0,200,30); 
      P2DownTextBar.add(P2탱크Num);
      P2골리앗Num.setBounds(200,30,200,30); 
      P2DownTextBar.add(P2골리앗Num);
      P2레이스Num.setBounds(200,60,200,30); 
      P2DownTextBar.add(P2레이스Num);
      P2발키리Num.setBounds(200,90,200,30); 
      P2DownTextBar.add(P2발키리Num);
      P2배틀크루저Num.setBounds(200,120,200,30); 
      P2DownTextBar.add(P2배틀크루저Num);
      
      //Player2의 JButton 설정
      P2커멘더센터.setBounds(0,150,200,200);
      P2panel1.add(P2커멘더센터);
      P2배럭.setBounds(25,0,150,150);
      P2panel2.add(P2배럭);
      P2팩토리.setBounds(25,175,150,150);
      P2panel2.add(P2팩토리);
      P2스타포트.setBounds(25,350,150,150);
      P2panel2.add(P2스타포트);
      P2엔지니어링베이.setBounds(25,70,150,150);
      P2panel3.add(P2엔지니어링베이);
      P2아머리.setBounds(25,280,150,150);
      P2panel3.add(P2아머리);
      P2ready.setBounds(450,0,150,50);
      P2UpBar.add(P2ready);
      P2SCV.setIcon(new ImageIcon("C:\\Users\\jaeuk\\Documents\\\uCE74\uCE74\uC624\uD1A1 \uBC1B\uC740 \uD30C\uC77C\\SCV.jpg"));
      
      //Player2의 유닛 버튼 설정
      P2SCV.setBounds(0,150,200,200);
      P2panel1.add(P2SCV);
      P2SCV.setVisible(false);
      P2마린.setIcon(new ImageIcon("C:\\Users\\jaeuk\\Documents\\\uCE74\uCE74\uC624\uD1A1 \uBC1B\uC740 \uD30C\uC77C\\\uB9C8\uB9B0.jpg"));
      P2마린.setBounds(25,0,150,75);
      P2panel2.add(P2마린);
      P2마린.setVisible(false);
      P2메딕.setIcon(new ImageIcon("C:\\Users\\jaeuk\\Documents\\\uCE74\uCE74\uC624\uD1A1 \uBC1B\uC740 \uD30C\uC77C\\\uBA54\uB515.jpg"));
      P2메딕.setBounds(100,75,75,75);
      P2panel2.add(P2메딕);
      P2메딕.setVisible(false);
      P2파이어벳.setIcon(new ImageIcon("C:\\Users\\jaeuk\\Documents\\\uCE74\uCE74\uC624\uD1A1 \uBC1B\uC740 \uD30C\uC77C\\\uD30C\uC774\uC5B4\uBCB3.jpg"));
      P2파이어벳.setBounds(25,75,75,75);
      P2panel2.add(P2파이어벳);
      P2파이어벳.setVisible(false);
      P2벌쳐.setIcon(new ImageIcon("C:\\Users\\jaeuk\\Documents\\\uCE74\uCE74\uC624\uD1A1 \uBC1B\uC740 \uD30C\uC77C\\\uBC8C\uCCD0.jpg"));
      P2벌쳐.setBounds(100,175,75,75);
      P2panel2.add(P2벌쳐);
      P2벌쳐.setVisible(false);
      P2탱크.setIcon(new ImageIcon("C:\\Users\\jaeuk\\Documents\\\uCE74\uCE74\uC624\uD1A1 \uBC1B\uC740 \uD30C\uC77C\\\uD0F1\uD06C.jpg"));
      P2탱크.setBounds(25,250,150,75);
      P2panel2.add(P2탱크);
      P2탱크.setVisible(false);
      P2골리앗.setIcon(new ImageIcon("C:\\Users\\jaeuk\\Documents\\\uCE74\uCE74\uC624\uD1A1 \uBC1B\uC740 \uD30C\uC77C\\\uACE8\uB9AC\uC557.jpg"));
      P2골리앗.setBounds(25,175,75,75);
      P2panel2.add(P2골리앗);
      P2골리앗.setVisible(false);
      P2레이스.setIcon(new ImageIcon("C:\\Users\\jaeuk\\Documents\\\uCE74\uCE74\uC624\uD1A1 \uBC1B\uC740 \uD30C\uC77C\\\uB808\uC774\uC2A4.png"));
      P2레이스.setBounds(100,350,75,75);
      P2panel2.add(P2레이스);
      P2레이스.setVisible(false);
      P2발키리.setIcon(new ImageIcon("C:\\Users\\jaeuk\\Documents\\\uCE74\uCE74\uC624\uD1A1 \uBC1B\uC740 \uD30C\uC77C\\\uBC1C\uD0A4\uB9AC.jpg"));
      P2발키리.setBounds(25,350,75,75);
      P2panel2.add(P2발키리);
      P2발키리.setVisible(false);
      P2배틀크루저.setIcon(new ImageIcon("C:\\Users\\jaeuk\\Documents\\\uCE74\uCE74\uC624\uD1A1 \uBC1B\uC740 \uD30C\uC77C\\\uBC30\uD2C0\uD06C\uB8E8\uC800.jpg"));
      P2배틀크루저.setBounds(25,425,150,75);
      P2panel2.add(P2배틀크루저);
      P2배틀크루저.setVisible(false);
    //P2체력이랑 공격력 버튼-지은
      P2엔지니어링베이체력.setBounds(25, 75, 150, 75);
      P2panel3.add(P2엔지니어링베이체력);
      P2엔지니어링베이체력.setVisible(true);
      P2엔지니어링베이공격력.setBounds(25, 145, 75, 75);
      P2panel3.add(P2엔지니어링베이공격력);
      P2엔지니어링베이공격력.setVisible(true);
      P2엔지니어링베이방어력.setBounds(100, 145, 75, 75);
      P2panel3.add(P2엔지니어링베이방어력);
      P2엔지니어링베이방어력.setVisible(true);
      
      P2아머리체력.setBounds(25, 280, 150, 75);
      P2panel3.add(P2아머리체력);
      P2아머리체력.setVisible(true);
      P2아머리공격력.setBounds(25, 355, 75, 75);
      P2panel3.add(P2아머리공격력);
      P2아머리공격력.setVisible(true);
      P2아머리방어력.setBounds(100, 355, 75, 75);
      P2panel3.add(P2아머리방어력);
      frame.getContentPane().add(P1ready);
      P1ready.setBounds(150,0,150,50);
      
      //턴종료 및 전투버튼 이벤트
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
      P2아머리방어력.setVisible(true);
      
      //맨처음 SCV 네마리 설정
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
      
      
      //창 넘어가는 마우스 이벤트와 키 이벤트
      if(star.getn() == 0) {
         
         star.setVisible(false);
         frame.setVisible(true);
      }

         
         
         
         
      //유닛뽑는 버튼 마우스 이벤트
      P1커멘더센터.addMouseListener(new MouseAdapter() {   
            public void mouseEntered(MouseEvent evt) {
               P1커멘더센터.setVisible(false);
               P1SCV.setVisible(true);
               
      }
            public void mouseExited(MouseEvent evt) {   
               P1커멘더센터.setVisible(true);
               P1SCV.setVisible(false);
            }
      });
      
      P1SCV.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent evt) {
            P1커멘더센터.setVisible(false);
            P1SCV.setVisible(true);
         }
         public void mouseExited(MouseEvent evt) {
            P1커멘더센터.setVisible(true);
            P1SCV.setVisible(false);
         }
      });
      P1SCV.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
   
              if(t.p1_mineral < 50) {         	  
            	 JOptionPane.showMessageDialog(null, "미네랄이 부족합니다!");
                 System.out.println("미네랄이 부족합니다!"); }
              else {
              t.p1_mineral -= 50;
              P1UpBar.setText("미네랄: "+t.p1_mineral);
              scv.set_unit(t.p1_unit);
              t.p1_units[0][t.p1_unit]=scv.p1_setHp();
              t.p1_units[1][t.p1_unit]=scv.p1_setSt();
              t.p1_units[2][t.p1_unit]=scv.p1_setDf();
              t.p1_units_name[t.p1_unit] = "scv";
              System.out.println("p1의 유닛"+t.p1_unit);
              t.p1_unit=scv.get_unit();
              t.p1SCVnum+=1;
              P1SCVNum.setText("SCV: "+t.p1SCVnum);
            
              }
          }});
      
      P1배럭.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent evt) {
            P1배럭.setVisible(false);
            P1마린.setVisible(true);
            P1메딕.setVisible(true);
            P1파이어벳.setVisible(true);
            
         }
         public void mouseExited(MouseEvent evt) {   
            P1배럭.setVisible(true);
            P1마린.setVisible(false);
            P1메딕.setVisible(true);
            P1파이어벳.setVisible(true);
         }
      });
            
      P1마린.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent evt) {
            P1배럭.setVisible(false);
            P1마린.setVisible(true);
            P1메딕.setVisible(true);
            P1파이어벳.setVisible(true);
         }
         public void mouseExited(MouseEvent evt) {
            P1배럭.setVisible(true);
            P1마린.setVisible(false);
            P1메딕.setVisible(false);
            P1파이어벳.setVisible(false);
         }
      });
      
      P1마린.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
             if (t.p1_mineral < 60) {
                JOptionPane.showMessageDialog(null, "미네랄이 부족합니다!");
                System.out.println("미네랄이 부족합니다!");
             }
             else {
                t.p1_mineral -= 60;
                P1UpBar.setText("미네랄: "+t.p1_mineral);
                marine.set_unit(t.p1_unit);
                t.p1_units[0][t.p1_unit]=marine.p1_setHp();
                t.p1_units[1][t.p1_unit]=marine.p1_setSt();
                t.p1_units[2][t.p1_unit]=marine.p1_setDf();
                t.p1_units_name[t.p1_unit] = "marine";
                System.out.println("p1의 유닛"+t.p1_unit);
                t.p1_unit=marine.get_unit();
                t.p1마린num+=1;
                P1마린Num.setText("마린: "+t.p1마린num);
                }
          }});
      
      P1메딕.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent evt) {
            P1배럭.setVisible(false);
            P1마린.setVisible(true);
            P1메딕.setVisible(true);
            P1파이어벳.setVisible(true);
            
         }
         public void mouseExited(MouseEvent evt) {   
            P1배럭.setVisible(true);
            P1마린.setVisible(false);
            P1메딕.setVisible(false);
            P1파이어벳.setVisible(false);
         }
      });
      
      P1메딕.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            if (t.p1_mineral < 60) {
               JOptionPane.showMessageDialog(null, "미네랄이 부족합니다!");
               System.out.println("미네랄이 부족합니다!"); }
            else {
               t.p1_mineral -= 60;
               P1UpBar.setText("미네랄: "+t.p1_mineral);
               medic.set_unit(t.p1_unit);
               t.p1_units[0][t.p1_unit]=medic.p1_setHp();
                t.p1_units[1][t.p1_unit]=medic.p1_setSt();
                t.p1_units[2][t.p1_unit]=medic.p1_setDf();
                t.p1_units_name[t.p1_unit] = "medic";
                System.out.println("p1의 유닛"+t.p1_unit);
                t.p1_unit=medic.get_unit();
                t.p1메딕num+=1;
                P1메딕Num.setText("메딕: "+t.p1메딕num);
               }
         }});
      
      P1파이어벳.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent evt) {
            P1배럭.setVisible(false);
            P1마린.setVisible(true);
            P1메딕.setVisible(true);
            P1파이어벳.setVisible(true);
            
         }
         public void mouseExited(MouseEvent evt) {   
            P1배럭.setVisible(true);
            P1마린.setVisible(false);
            P1메딕.setVisible(false);
            P1파이어벳.setVisible(false);
         }
      });
      
      P1파이어벳.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
             if (t.p1_mineral < 65) {
            	 JOptionPane.showMessageDialog(null, "미네랄이 부족합니다!");
                System.out.println("미네랄이 부족합니다!");
             }
             else {
                t.p1_mineral -= 65;
                P1UpBar.setText("미네랄: "+t.p1_mineral);
                 firebat.set_unit(t.p1_unit);
                 t.p1_units[0][t.p1_unit]=firebat.p1_setHp();
                 t.p1_units[1][t.p1_unit]=firebat.p1_setSt();
                 t.p1_units[2][t.p1_unit]=firebat.p1_setDf();
                 t.p1_units_name[t.p1_unit] = "firebat";
                 System.out.println("p1의 유닛"+t.p1_unit);
                 t.p1_unit=firebat.get_unit();
                 t.p1파이어벳num+=1;
                 P1파이어벳Num.setText("파이어벳: "+t.p1파이어벳num);
                }
          }});
      
      P1팩토리.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent evt) {
            P1팩토리.setVisible(false);
            P1벌쳐.setVisible(true);
            P1탱크.setVisible(true);
            P1골리앗.setVisible(true);
            
         }
         public void mouseExited(MouseEvent evt) {   
            P1팩토리.setVisible(true);
            P1벌쳐.setVisible(false);
            P1탱크.setVisible(true);
            P1골리앗.setVisible(true);
         }
      });
            
      P1벌쳐.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent evt) {
            P1팩토리.setVisible(false);
            P1벌쳐.setVisible(true);
            P1탱크.setVisible(true);
            P1골리앗.setVisible(true);
         }
         public void mouseExited(MouseEvent evt) {
            P1팩토리.setVisible(true);
            P1벌쳐.setVisible(false);
            P1탱크.setVisible(false);
            P1골리앗.setVisible(false);
         }
      });
      
      P1벌쳐.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
              if (t.p1_mineral < 75) {
            	  JOptionPane.showMessageDialog(null, "미네랄이 부족합니다!");
                 System.out.println("미네랄이 부족합니다!");
              }
              else {
                 t.p1_mineral -= 75;
                 P1UpBar.setText("미네랄: "+t.p1_mineral);
                 vulture.set_unit(t.p1_unit);
                t.p1_units[0][t.p1_unit]=vulture.p1_setHp();
                t.p1_units[1][t.p1_unit]=vulture.p1_setSt();
                t.p1_units[2][t.p1_unit]=vulture.p1_setDf();
                t.p1_units_name[t.p1_unit] = "vuiture";
                System.out.println("p1의 유닛"+t.p1_unit);
                t.p1_unit=vulture.get_unit();
                t.p1벌쳐num+=1;
                P1벌쳐Num.setText("벌쳐: "+t.p1벌쳐num);
              }
           }});
      
      P1탱크.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent evt) {
            P1팩토리.setVisible(false);
            P1벌쳐.setVisible(true);
            P1탱크.setVisible(true);
            P1골리앗.setVisible(true); 
         }
         public void mouseExited(MouseEvent evt) {   
            P1팩토리.setVisible(true);
            P1벌쳐.setVisible(false);
            P1탱크.setVisible(false);
            P1골리앗.setVisible(false);
         }
      });
      
      P1탱크.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
              if (t.p1_mineral < 85) {
            	  JOptionPane.showMessageDialog(null, "미네랄이 부족합니다!");
                 System.out.println("미네랄이 부족합니다!");
              }
              else {
                 t.p1_mineral -= 85;
                 P1UpBar.setText("미네랄: "+t.p1_mineral);
                 tank.set_unit(t.p1_unit);
                 t.p1_units[0][t.p1_unit]=tank.p1_setHp();
                 t.p1_units[1][t.p1_unit]=tank.p1_setSt();
                 t.p1_units[2][t.p1_unit]=tank.p1_setDf();
                 t.p1_units_name[t.p1_unit] = "tank";
                 System.out.println("p1의 유닛"+t.p1_unit);
                 t.p1_unit=tank.get_unit();
                 t.p1탱크num+=1;
                 P1탱크Num.setText("탱크: "+t.p1탱크num);
              }
           }});
      
      P1골리앗.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent evt) {
            P1팩토리.setVisible(false);
            P1벌쳐.setVisible(true);
            P1탱크.setVisible(true);
            P1골리앗.setVisible(true);
         }
         public void mouseExited(MouseEvent evt) {   
            P1팩토리.setVisible(true);
            P1벌쳐.setVisible(false);
            P1탱크.setVisible(false);
            P1골리앗.setVisible(false);
         }
      });
      
      P1골리앗.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
             if (t.p1_mineral < 80) {
            	 JOptionPane.showMessageDialog(null, "미네랄이 부족합니다!");
                System.out.println("미네랄이 부족합니다!");
             }
             else {
                t.p1_mineral -= 80;
                P1UpBar.setText("미네랄: "+t.p1_mineral);
                 goliath.set_unit(t.p1_unit);
                 t.p1_units[0][t.p1_unit]=goliath.p1_setHp();
                 t.p1_units[1][t.p1_unit]=goliath.p1_setSt();
                 t.p1_units[2][t.p1_unit]=goliath.p1_setDf();
                 t.p1_units_name[t.p1_unit] = "goliath";
                 System.out.println("p1의 유닛"+t.p1_unit);
                 t.p1_unit=goliath.get_unit();
                 t.p1골리앗num+=1;
                 P1골리앗Num.setText("골리앗: "+t.p1골리앗num);
                 }
          }});
      
      P1스타포트.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent evt) {
            P1스타포트.setVisible(false);
            P1레이스.setVisible(true);
            P1발키리.setVisible(true);
            P1배틀크루저.setVisible(true);
            
         }
         public void mouseExited(MouseEvent evt) {   
            P1스타포트.setVisible(true);
            P1레이스.setVisible(false);
            P1발키리.setVisible(true);
            P1배틀크루저.setVisible(true);
         }
      });
            
      P1레이스.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent evt) {
            P1스타포트.setVisible(false);
            P1레이스.setVisible(true);
            P1발키리.setVisible(true);
            P1배틀크루저.setVisible(true);
         }
         public void mouseExited(MouseEvent evt) {
            P1스타포트.setVisible(true);
            P1레이스.setVisible(false);
            P1발키리.setVisible(false);
            P1배틀크루저.setVisible(false);
         }
      });
      
      P1레이스.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
             if (t.p1_mineral < 70) {
            	 JOptionPane.showMessageDialog(null, "미네랄이 부족합니다!");
                System.out.println("미네랄이 부족합니다!"); }
             else {
                t.p1_mineral -= 70;
                P1UpBar.setText("미네랄: "+t.p1_mineral);
                 wraith.set_unit(t.p1_unit);
                 t.p1_units[0][t.p1_unit]=wraith.p1_setHp();
                 t.p1_units[1][t.p1_unit]=wraith.p1_setSt();
                 t.p1_units[2][t.p1_unit]=wraith.p1_setDf();
                 t.p1_units_name[t.p1_unit] = "wraith";
                 System.out.println("p1의 유닛"+t.p1_unit);
                 t.p1_unit=wraith.get_unit();
                 t.p1레이스num+=1;
                 P1레이스Num.setText("레이스: "+t.p1레이스num);
                 }
          }});
      
      P1발키리.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent evt) {
            P1스타포트.setVisible(false);
            P1레이스.setVisible(true);
            P1발키리.setVisible(true);
            P1배틀크루저.setVisible(true);
            
         }
         public void mouseExited(MouseEvent evt) {   
            P1스타포트.setVisible(true);
            P1레이스.setVisible(false);
            P1발키리.setVisible(false);
            P1배틀크루저.setVisible(false);
         }
      });
      
      P1발키리.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
             if (t.p1_mineral < 75) {
            	 JOptionPane.showMessageDialog(null, "미네랄이 부족합니다!");
                System.out.println("미네랄이 부족합니다!"); }
             else {
             t.p1_mineral -= 75;
             P1UpBar.setText("미네랄: "+t.p1_mineral);
             medic.set_unit(t.p1_unit);
             t.p1_units[0][t.p1_unit]=valkyrie.p1_setHp();
             t.p1_units[1][t.p1_unit]=valkyrie.p1_setSt();
             t.p1_units[2][t.p1_unit]=valkyrie.p1_setDf();
             t.p1_units_name[t.p1_unit] = "valkyrie";
             System.out.println("p1의 유닛"+t.p1_unit);
             t.p1_unit=valkyrie.get_unit();
             t.p1발키리num+=1;
             P1발키리Num.setText("발키리: "+t.p1발키리num);
             }
          }});
      
      P1배틀크루저.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent evt) {
            P1스타포트.setVisible(false);
            P1레이스.setVisible(true);
            P1발키리.setVisible(true);
            P1배틀크루저.setVisible(true);
         }
         public void mouseExited(MouseEvent evt) {   
            P1스타포트.setVisible(true);
            P1레이스.setVisible(false);
            P1탱크.setVisible(false);
            P1골리앗.setVisible(false);
         }
      });
      
      P1배틀크루저.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
             if (t.p1_mineral < 100) {
            	 JOptionPane.showMessageDialog(null, "미네랄이 부족합니다!");
                System.out.println("미네랄이 부족합니다!");
             }
             else {
                t.p1_mineral -= 100;
                P1UpBar.setText("미네랄: "+t.p1_mineral);
             battlecruiser.set_unit(t.p1_unit);
              t.p1_units[0][t.p1_unit]=battlecruiser.p1_setHp();
              t.p1_units[1][t.p1_unit]=battlecruiser.p1_setSt();
              t.p1_units[2][t.p1_unit]=battlecruiser.p1_setDf();
              t.p1_units_name[t.p1_unit] = "battlecruiser";
              System.out.println("p1의 유닛"+t.p1_unit);
              t.p1_unit=battlecruiser.get_unit();
              t.p1배틀크루저num+=1;
              P1배틀크루저Num.setText("배틀크루저: "+t.p1배틀크루저num);
             }
          }});
      
      P2커멘더센터.addMouseListener(new MouseAdapter() {   
         public void mouseEntered(MouseEvent evt) {
            P2커멘더센터.setVisible(false);
            P2SCV.setVisible(true);
            
         }
         public void mouseExited(MouseEvent evt) {   
            P2커멘더센터.setVisible(true);
            P2SCV.setVisible(false);
         }
      });
      
      P2SCV.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent evt) {
            P2커멘더센터.setVisible(false);
            P2SCV.setVisible(true);
         }
         public void mouseExited(MouseEvent evt) {
            P2커멘더센터.setVisible(true);
            P2SCV.setVisible(false);
         } 
      });
      
      P2SCV.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
              if (t.p2_mineral < 50) {
            	  JOptionPane.showMessageDialog(null, "미네랄이 부족합니다!");
                 System.out.println("미네랄이 부족합니다!");
              }
              else {
                 t.p2_mineral -= 50;
                 P2UpBar.setText("미네랄: "+t.p2_mineral);
              scv.set_unit(t.p2_unit);
               t.p2_units[0][t.p2_unit]=scv.p2_setHp();
               t.p2_units[1][t.p2_unit]=scv.p2_setSt();
               t.p2_units[2][t.p2_unit]=scv.p2_setDf();
               t.p2_units_name[t.p2_unit] = "scv";
               System.out.println("p2의 유닛"+t.p2_unit);
               t.p2_unit=scv.get_unit();
               t.p2SCVnum+=1;
               P2SCVNum.setText("SCV: "+t.p2SCVnum);
              }
           }});
      
      P2배럭.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent evt) {
            P2배럭.setVisible(false);
            P2마린.setVisible(true);
            P2메딕.setVisible(true);
            P2파이어벳.setVisible(true);
            
         }
         public void mouseExited(MouseEvent evt) {   
            P2배럭.setVisible(true);
            P2마린.setVisible(false);
            P2메딕.setVisible(true);
            P2파이어벳.setVisible(true);
         }
      });
            
      P2마린.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent evt) {
            P2배럭.setVisible(false);
            P2마린.setVisible(true);
            P2메딕.setVisible(true);
            P2파이어벳.setVisible(true);
            
         }
         public void mouseExited(MouseEvent evt) {
            P2배럭.setVisible(true);
            P2마린.setVisible(false);
            P2메딕.setVisible(false);
            P2파이어벳.setVisible(false);
         }
      });
      
      P2마린.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            if (t.p2_mineral < 60) {
            	 JOptionPane.showMessageDialog(null, "미네랄이 부족합니다!");
               System.out.println("미네랄이 부족합니다!");
            }
            else {
               t.p2_mineral -= 60;
               P2UpBar.setText("미네랄: "+t.p2_mineral);
            marine.set_unit(t.p2_unit);
             t.p2_units[0][t.p2_unit]=marine.p2_setHp();
             t.p2_units[1][t.p2_unit]=marine.p2_setSt();
             t.p2_units[2][t.p2_unit]=marine.p2_setDf();
             t.p2_units_name[t.p2_unit] = "marine";
             System.out.println("p2의 유닛"+t.p2_unit);
             t.p2_unit=marine.get_unit();
             t.p2마린num+=1;
             P2마린Num.setText("마린: "+t.p2마린num);
            }
         }});

      
      P2메딕.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent evt) {
            P2배럭.setVisible(false);
            P2마린.setVisible(true);
            P2메딕.setVisible(true);
            P2파이어벳.setVisible(true);
         }
         public void mouseExited(MouseEvent evt) {   
            P2배럭.setVisible(true);
            P2마린.setVisible(false);
            P2메딕.setVisible(false);
            P2파이어벳.setVisible(false);
         }
      });
      
      P2메딕.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            if (t.p2_mineral < 60) {
            	 JOptionPane.showMessageDialog(null, "미네랄이 부족합니다!");
               System.out.println("미네랄이 부족합니다!");
            }
            else {
               t.p2_mineral -= 60;
               P2UpBar.setText("미네랄: "+t.p2_mineral);
            medic.set_unit(t.p2_unit);
             t.p2_units[0][t.p2_unit]=medic.p2_setHp();
             t.p2_units[1][t.p2_unit]=medic.p2_setSt();
             t.p2_units[2][t.p2_unit]=medic.p2_setDf();
             t.p2_units_name[t.p2_unit] = "medic";
             System.out.println("p2의 유닛"+t.p2_unit);
             t.p2_unit=medic.get_unit();
             t.p2메딕num+=1;
             P2메딕Num.setText("메딕: "+t.p2메딕num);
            }
         }});

      
      P2파이어벳.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent evt) {
            P2배럭.setVisible(false);
            P2마린.setVisible(true);
            P2메딕.setVisible(true);
            P2파이어벳.setVisible(true);
            
         }
         public void mouseExited(MouseEvent evt) {   
            P2배럭.setVisible(true);
            P2마린.setVisible(false);
            P2메딕.setVisible(false);
            P2파이어벳.setVisible(false);
         }
      });
      
      P2파이어벳.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            if (t.p2_mineral < 65) {
            	 JOptionPane.showMessageDialog(null, "미네랄이 부족합니다!");
               System.out.println("미네랄이 부족합니다!");
            }
            else {
               t.p2_mineral -= 60;
               P2UpBar.setText("미네랄: "+t.p2_mineral);
            firebat.set_unit(t.p2_unit);
             t.p2_units[0][t.p2_unit]=firebat.p2_setHp();
             t.p2_units[1][t.p2_unit]=firebat.p2_setSt();
             t.p2_units[2][t.p2_unit]=firebat.p2_setDf();
             t.p2_units_name[t.p2_unit] = "firebat";
             System.out.println("p2의 유닛"+t.p2_unit);
             t.p2_unit=firebat.get_unit();
             t.p2파이어벳num+=1;
             P2파이어벳Num.setText("파이어벳: "+t.p2파이어벳num);
            }
         }});
      
      P2팩토리.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent evt) {
            P2팩토리.setVisible(false);
            P2벌쳐.setVisible(true);
            P2탱크.setVisible(true);
            P2골리앗.setVisible(true);
            
         }
         public void mouseExited(MouseEvent evt) {   
            P2팩토리.setVisible(true);
            P2벌쳐.setVisible(false);
            P2탱크.setVisible(true);
            P2골리앗.setVisible(true);
         }
      });
            
      P2벌쳐.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent evt) {
            P2팩토리.setVisible(false);
            P2벌쳐.setVisible(true);
            P2탱크.setVisible(true);
            P2골리앗.setVisible(true);
         }
         public void mouseExited(MouseEvent evt) {
            P2팩토리.setVisible(true);
            P2벌쳐.setVisible(false);
            P2탱크.setVisible(false);
            P2골리앗.setVisible(false);
         }
      });
      
      P2벌쳐.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (t.p2_mineral < 75) {
                	 JOptionPane.showMessageDialog(null, "미네랄이 부족합니다!");
                   System.out.println("미네랄이 부족합니다!");
                }
                else {
                   t.p2_mineral -= 75;
                   P2UpBar.setText("미네랄: "+t.p2_mineral);
               vulture.set_unit(t.p2_unit);
                t.p2_units[0][t.p2_unit]=vulture.p2_setHp();
                t.p2_units[1][t.p2_unit]=vulture.p2_setSt();
                t.p2_units[2][t.p2_unit]=vulture.p2_setDf();
                t.p2_units_name[t.p2_unit] = "vulture";
                System.out.println("p2의 유닛"+t.p2_unit);
                t.p2_unit=vulture.get_unit();
                t.p2벌쳐num+=1;
                P2벌쳐Num.setText("벌처: "+t.p2벌쳐num);
                }
            }});
  
      P2탱크.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent evt) {
            P2팩토리.setVisible(false);
            P2벌쳐.setVisible(true);
            P2탱크.setVisible(true);
            P2골리앗.setVisible(true);
            
         }
         public void mouseExited(MouseEvent evt) {   
            P2팩토리.setVisible(true);
            P2벌쳐.setVisible(false);
            P2탱크.setVisible(false);
            P2골리앗.setVisible(false);
         }
      });
      
      P2탱크.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (t.p2_mineral < 85) {
                	 JOptionPane.showMessageDialog(null, "미네랄이 부족합니다!");
                   System.out.println("미네랄이 부족합니다!");
                }
                else {
                   t.p2_mineral -= 85;
                   P2UpBar.setText("미네랄: "+t.p2_mineral);
               tank.set_unit(t.p2_unit);
                t.p2_units[0][t.p2_unit]=tank.p2_setHp();
                t.p2_units[1][t.p2_unit]=tank.p2_setSt();
                t.p2_units[2][t.p2_unit]=tank.p2_setDf();
                t.p2_units_name[t.p2_unit] = "tank";
                System.out.println("p2의 유닛"+t.p2_unit);
                t.p2_unit=tank.get_unit();
                t.p2탱크num+=1;
                P2탱크Num.setText("탱크: "+t.p2탱크num);
                }
            }});
      
      P2골리앗.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent evt) {
            P2팩토리.setVisible(false);
            P2벌쳐.setVisible(true);
            P2탱크.setVisible(true);
            P2골리앗.setVisible(true);
            
         }
         public void mouseExited(MouseEvent evt) {   
            P2팩토리.setVisible(true);
            P2벌쳐.setVisible(false);
            P2탱크.setVisible(false);
            P2골리앗.setVisible(false);
         }
      });
      
      P2골리앗.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (t.p2_mineral < 80) {
                	 JOptionPane.showMessageDialog(null, "미네랄이 부족합니다!");
                   System.out.println("미네랄이 부족합니다!");
                }
                else {
                   t.p2_mineral -= 80;
                   P2UpBar.setText("미네랄: "+t.p2_mineral);
               goliath.set_unit(t.p2_unit);
                t.p2_units[0][t.p2_unit]=goliath.p2_setHp();
                t.p2_units[1][t.p2_unit]=goliath.p2_setSt();
                t.p2_units[2][t.p2_unit]=goliath.p2_setDf();
                t.p2_units_name[t.p2_unit] = "goliath";
                System.out.println("p2의 유닛"+t.p2_unit);
                t.p2_unit=goliath.get_unit();
                t.p2골리앗num+=1;
                P2골리앗Num.setText("골리앗: "+t.p2골리앗num);
                }
            }});
      
      P2스타포트.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent evt) {
            P2스타포트.setVisible(false);
            P2레이스.setVisible(true);
            P2발키리.setVisible(true);
            P2배틀크루저.setVisible(true);
            
         }
         public void mouseExited(MouseEvent evt) {   
            P2스타포트.setVisible(true);
            P2레이스.setVisible(false);
            P2발키리.setVisible(true);
            P2배틀크루저.setVisible(true);
         }
      });
            
      P2레이스.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent evt) {
            P2스타포트.setVisible(false);
            P2레이스.setVisible(true);
            P2발키리.setVisible(true);
            P2배틀크루저.setVisible(true);
         }
         public void mouseExited(MouseEvent evt) {
            P2스타포트.setVisible(true);
            P2레이스.setVisible(false);
            P2발키리.setVisible(false);
            P2배틀크루저.setVisible(false);
         }   
      });
      
      P2레이스.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
              if (t.p2_mineral < 70) {
            	  JOptionPane.showMessageDialog(null, "미네랄이 부족합니다!");
                 System.out.println("미네랄이 부족합니다!");
              }
              else {
                 t.p2_mineral -= 70;
                 P2UpBar.setText("미네랄: "+t.p2_mineral);
              wraith.set_unit(t.p2_unit);
               t.p2_units[0][t.p2_unit]=wraith.p2_setHp();
               t.p2_units[1][t.p2_unit]=wraith.p2_setSt();
               t.p2_units[2][t.p2_unit]=wraith.p2_setDf();
               t.p2_units_name[t.p2_unit] = "wraith";
               System.out.println("p2의 유닛"+t.p2_unit);
               t.p2_unit=wraith.get_unit();
               t.p2레이스num+=1;
               P2레이스Num.setText("레이스: "+t.p2레이스num);
              }
           }});
      
      P2발키리.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent evt) {
            P2스타포트.setVisible(false);
            P2레이스.setVisible(true);
            P2발키리.setVisible(true);
            P2배틀크루저.setVisible(true);
            
         }
         public void mouseExited(MouseEvent evt) {   
            P2스타포트.setVisible(true);
            P2레이스.setVisible(false);
            P2발키리.setVisible(false);
            P2배틀크루저.setVisible(false);
         }
      });
      
      P2발키리.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
              if (t.p2_mineral < 75) {
            	  JOptionPane.showMessageDialog(null, "미네랄이 부족합니다!");
                 System.out.println("미네랄이 부족합니다!");
              }
              else {
                 t.p2_mineral -= 75;
                 P2UpBar.setText("미네랄: "+t.p2_mineral);
              valkyrie.set_unit(t.p2_unit);
               t.p2_units[0][t.p2_unit]=valkyrie.p2_setHp();
               t.p2_units[1][t.p2_unit]=valkyrie.p2_setSt();
               t.p2_units[2][t.p2_unit]=valkyrie.p2_setDf();
               t.p2_units_name[t.p2_unit] = "valkyrie";
               System.out.println("p2의 유닛"+t.p2_unit);
               t.p2_unit=valkyrie.get_unit();
               t.p2발키리num+=1;
               P2발키리Num.setText("발키리: "+t.p2발키리num);
              }
           }});
      
      P2배틀크루저.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent evt) {
            P2스타포트.setVisible(false);
            P2레이스.setVisible(true);
            P2발키리.setVisible(true);
            P2배틀크루저.setVisible(true);
            
         }
         public void mouseExited(MouseEvent evt) {   
            P2스타포트.setVisible(true);
            P2레이스.setVisible(false);
            P2탱크.setVisible(false);
            P2골리앗.setVisible(false);
         }
      });
      
      P2배틀크루저.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
              if (t.p2_mineral < 100) {
            	  JOptionPane.showMessageDialog(null, "미네랄이 부족합니다!");
                 System.out.println("미네랄이 부족합니다!");
              }
              else {
                 t.p2_mineral -= 100;
                 P2UpBar.setText("미네랄: "+t.p2_mineral);
              battlecruiser.set_unit(t.p2_unit);
               t.p2_units[0][t.p2_unit]=battlecruiser.p2_setHp();
               t.p2_units[1][t.p2_unit]=battlecruiser.p2_setSt();
               t.p2_units[2][t.p2_unit]=battlecruiser.p2_setDf();
               t.p2_units_name[t.p2_unit] = "battlecruiser";
               System.out.println("p2의 유닛"+t.p2_unit);
               t.p2_unit=battlecruiser.get_unit();
               t.p2배틀크루저num+=1;
               P2배틀크루저Num.setText("배틀크루저: "+t.p2배틀크루저num);
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
     t.p1_mineral += (30)*t.p1SCVnum;//*p1 scv 개수
     t.p2_mineral += (30)*t.p2SCVnum;//*p2 scv 개수
     P1UpBar.setText("미네랄: "+t.p1_mineral);
     P2UpBar.setText("미네랄: "+t.p2_mineral);
  }
   
  public void fight() 
   {
     
     
      Random r = new Random();
      //k는 누가 먼저 공격할지 turn은 공격하는 플레이어 유닛배열의 인덱스
      int k,p1,p2,turn=0;

      while(true)
      {
         k = r.nextInt(2);
         
       
         //전투종료
         if(t.p1_units[0][turn]==0 && t.p2_units[0][turn]==0)
         {
            System.out.printf("Player1의 현재 체력 %d!!! \n",P1Hp.getValue());
            System.out.printf("Player2의 현재 체력 %d!!! \n",P2Hp.getValue());
            
            System.out.printf("Player1의 미네랄 : %d \n", t.p1_mineral);
            System.out.printf("Player2의 미네랄 : %d \n", t.p2_mineral);
            
            break;  
         }
         switch(k) 
         {
             
               case 0 :
               {
                  if(t.p2_units[0][0]!=0 && t.p1_units[0][turn]!=0)
                  {
                     //공격받을 대상
                        p2 = r.nextInt(t.p2_unit);
                   //p1이 공격
                        
                     t.p2_units[0][p2] -= (t.p1_units[1][turn] - t.p2_units[2][p2]);
                   
                     if(t.p2_units[0][p2]<=0) 
                     {
                        t.p2_units[0][p2]=0;
                        t.p2_units[1][p2]=0;
                        t.p2_units[2][p2]=0;
                        System.out.printf("P2의 %d번  %s 사망! \n",p2, t.p2_units_name[p2]);
                        t.p2_unit--;
                        
                        //유닛까기
                        if(t.p2_units_name[p2].equals("scv")) {
                           t.p2SCVnum-=1;
                           P2SCVNum.setText("SCV: "+ t.p2SCVnum);
                        } else if(t.p2_units_name[p2].equals("marine")) {
                           t.p2마린num-=1;
                           P2마린Num.setText("마린: "+ t.p2마린num);
                        } else if(t.p2_units_name[p2].equals("medic")) {
                           t.p2메딕num-=1;
                           P2메딕Num.setText("메딕: "+ t.p2메딕num);
                        } else if(t.p2_units_name[p2].equals("firebat")) {
                           t.p2파이어벳num-=1;
                           P2파이어벳Num.setText("파이어벳: "+ t.p2파이어벳num);
                        } else if(t.p2_units_name[p2].equals(" vulture")) {
                           t.p2벌쳐num-=1;
                           P2벌쳐Num.setText("벌쳐: "+ t.p2벌쳐num);
                        } else if(t.p2_units_name[p2].equals("tank")) {
                           t.p2탱크num-=1;
                           P2탱크Num.setText("탱크: "+ t.p2탱크num);
                        } else if(t.p2_units_name[p2].equals("wraith")) {
                           t.p2레이스num-=1;
                           P2레이스Num.setText("레이스: "+ t.p2레이스num);
                        } else if(t.p2_units_name[p2].equals("valkyrie")) {
                           t.p2발키리num-=1;
                           P2발키리Num.setText("발키리: "+ t.p2발키리num);
                        } else if(t.p2_units_name[p2].equals("battlecruiser")) {
                           t.p2배틀크루저num-=1;
                           P2배틀크루저Num.setText("배틀크루저: "+ t.p2배틀크루저num);
                        } 
                        
                        
                        //유닛정렬, 이름정렬도 추가
                        for(int i=p2; i<t.p2_unit; i++)
                        {
                           t.p2_units[0][i]=t.p2_units[0][i+1];
                           t.p2_units[1][i]=t.p2_units[1][i+1];
                           t.p2_units[2][i]=t.p2_units[2][i+1];
                           t.p2_units_name[i]=t.p2_units_name[i+1];
                        }
                        
                        //유닛배열의 초기화안된 마지막칸 초기화
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
                        JOptionPane.showMessageDialog(null, "게임을 종료합니다.");
                        System.exit(0);
                     }
                  }
                  
               break;
               }
               
            case 1 :
            {
               if(t.p1_units[0][0]!=0 && t.p2_units[0][turn]!=0)
               {
                  //공격받을 대상
                  p1 = r.nextInt(t.p1_unit);
                
                  //p2가 공격
                  t.p1_units[0][p1] -= (t.p2_units[1][turn] - t.p1_units[2][p1]);
                  if(t.p1_units[0][p1]<=0) 
                  {
                     t.p1_units[0][p1]=0;
                     t.p1_units[1][p1]=0;
                     t.p1_units[2][p1]=0;
                    
                     System.out.println(t.p1_units_name[p1]);
                     System.out.printf("p1의 %d번  %s 사망! \n",p1, t.p1_units_name[p1]);
                     t.p1_unit--;
                     
                     if(t.p1_units_name[p1].equals("scv")) {
                        t.p1SCVnum-=1;
                        P1SCVNum.setText("SCV: "+ t.p1SCVnum);
                     } else if(t.p1_units_name[p1].equals("marine")) {
                        t.p1마린num-=1;
                        P1마린Num.setText("마린: "+ t.p1마린num);
                     } else if(t.p1_units_name[p1].equals("medic")) {
                        t.p1메딕num-=1;
                        P1메딕Num.setText("메딕: "+ t.p1메딕num);
                     } else if(t.p1_units_name[p1].equals("firebat")) {
                        t.p1파이어벳num-=1;
                        P1파이어벳Num.setText("파이어벳: "+ t.p1파이어벳num);
                     } else if(t.p1_units_name[p1].equals(" vulture")) {
                        t.p1벌쳐num-=1;
                        P1벌쳐Num.setText("벌쳐: "+ t.p1벌쳐num);
                     } else if(t.p1_units_name[p1].equals("tank")) {
                        t.p1탱크num-=1;
                        P1탱크Num.setText("탱크: "+ t.p1탱크num);
                     } else if(t.p1_units_name[p1].equals("wraith")) {
                        t.p1레이스num-=1;
                        P1레이스Num.setText("레이스: "+ t.p1레이스num);
                     } else if(t.p1_units_name[p1].equals("valkyrie")) {
                        t.p1발키리num-=1;
                        P1발키리Num.setText("발키리: "+ t.p1발키리num);
                     } else if(t.p1_units_name[p1].equals("battlecruiser")) {
                        t.p1배틀크루저num-=1;
                        P1배틀크루저Num.setText("배틀크루저: "+ t.p1배틀크루저num);
                     } 
                     
                     
                     
                     
                     
                  //유닛정렬
                  for(int i=p1; i<t.p1_unit; i++)
                  {
                     t.p1_units[0][i]=t.p1_units[0][i+1];
                     t.p1_units[1][i]=t.p1_units[1][i+1];
                     t.p1_units[2][i]=t.p1_units[2][i+1];
                     t.p1_units_name[i]=t.p1_units_name[i+1];
                     
                  }
                  //유닛배열의 초기화안된 마지막칸 초기화
                  t.p1_units[0][t.p1_unit]=0;
                  t.p1_units[1][t.p1_unit]=0;
                  t.p1_units[2][t.p1_unit]=0;
                  t.p1_units_name[t.p1_unit]=null;
                  
                  }
               }
                else
                  {
                  //p1커멘더센터 피통까기
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