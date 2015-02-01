package personalproj.chujiwu.mudapp;

import personalproj.chujiwu.env.EnvChecker;


public class StartUp {
	
	public static void main(String[] args) {
		System.out.println("start up");
		EnvChecker envChecker = EnvChecker.getInstance();
		
		while(envChecker.isEnvOK()){
			startGame();
		}
		
	}
	
	private static void startGame(){
		GameProcess gameProcess = new GameProcess();
	}

}
