package Starcraft;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;


public class Starcraft extends JFrame{

	public int n=1;
	
	private Image screenImage;
	private Graphics screenGraphic;
	
	private ImageIcon startButtonBasicImage = new ImageIcon(GUIexample.class.getResource("../images/startButtonBasic.jpg"));
	private ImageIcon quitButtonBasicImage = new ImageIcon(GUIexample.class.getResource("../images/quitButtonBasic.jpg"));
	
	
	private Image background;
	
	private JButton startButton = new JButton(startButtonBasicImage);
	private JButton quitButton = new JButton(quitButtonBasicImage);
	
	private int mouseX, mouseY;
	
	public Starcraft() {
		
		
		setTitle("Starcraft");
		setSize(GUIexample.SCREEN_WIDTH, GUIexample.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		setLayout(null);
		
		
		startButton.setBounds(382, 640, 400, 100);
		startButton.setBorderPainted(false);
		startButton.setContentAreaFilled(false);
		startButton.setFocusPainted(false);
		startButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				startButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				startButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				
				startButton.setVisible(false);
				quitButton.setVisible(false);
				setn(0);
			System.out.println(n);
			}
			});
		
		
		add(startButton);
		
		
		quitButton.setBounds(550 ,640, 400, 100);
		quitButton.setBorderPainted(false);
		quitButton.setContentAreaFilled(false);
		quitButton.setFocusPainted(false);
		quitButton.setContentAreaFilled(false);
		quitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				quitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				quitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				System.exit(0);
			}
			});
		add(quitButton);
		
		background = new ImageIcon(GUIexample.class.getResource("../images/introBackground.jpg")).getImage();
		
		Music introMusic = new Music("introMusic.mp3",true);
		introMusic.start();
	}
	
	public int getn() {
		//System.out.println(n);
		return n;
	}
	
	public void setn(int n) {
		this.n = n;
	}
	
	public void paint(Graphics g) {
		screenImage = createImage(GUIexample.SCREEN_WIDTH, GUIexample.SCREEN_HEIGHT);
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(screenImage, 0, 0, null);
		
		
		
	}
	
	public void screenDraw(Graphics g) {
		g.drawImage(background, 0, 0, null);
		
		this.repaint();
	}

}
