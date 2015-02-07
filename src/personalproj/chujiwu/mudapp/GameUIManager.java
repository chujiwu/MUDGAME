package personalproj.chujiwu.mudapp;

import java.awt.Color;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class GameUIManager extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int WIDTH = 600;
	private static final int HEIGHT = 600;
	
	private boolean isWindowClosed = false;
	
	public boolean load() {
		setTitle("MUDGAME");
		setUILayout();
		addWindowListener(new WindowListener(){

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				isWindowClosed = false;
			}

			@Override
			public void windowClosing(WindowEvent e) {
				isWindowClosed = true;
			}

			@Override
			public void windowClosed(WindowEvent e) {
				dispose();
				
				
			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		return false;
	}
	
	private void setUILayout(){
		this.setSize(WIDTH, HEIGHT);
//		this.setResizable(false);
		addComponent();
		this.setLayout(null);
	}
	
	private void addComponent(){
		JPanel eventPanel = new JPanel();
		eventPanel.setBounds(10, 10, 580, 270);
		eventPanel.setBackground(Color.BLUE);
		add(eventPanel);
		
		JPanel commandPanel = new JPanel();
		commandPanel.setBounds(10, 300, 580, 270);
		commandPanel.setBackground(Color.GREEN);
		add(commandPanel);
		
		addTextArea(eventPanel, false);
		addTextArea(commandPanel, true);
	}
	
	private void addTextArea(JPanel panel, boolean isInputable) {
		JTextArea textArea = new JTextArea();
		panel.setLayout(null);
		textArea.setBounds(0, 0, panel.getWidth(), panel.getHeight());
		if(!isInputable){
			textArea.setFocusable(false);
			textArea.setBackground(Color.LIGHT_GRAY);
		}
		panel.add(textArea);
	}

	public void showIt(){
		this.setVisible(true);
	}
	
	public boolean isWindowClosed(){
		return isWindowClosed;
	}
	
	public static void main(String args[]){
		GameUIManager ui = new GameUIManager();
		ui.load();
		ui.showIt();
		while(ui.isWindowClosed()){
			System.exit(0);
		}
	}
	
}
