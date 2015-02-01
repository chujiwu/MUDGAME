package personalproj.chujiwu.gamedata;

import java.io.Serializable;

public class GameData implements Serializable{
	
	private static GameData instance = new GameData();
	
	private PlayerData player = PlayerData.getInstance();
	
	private ProcessData process = ProcessData.getInstance();

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String testData = "has data";
	
	public static GameData getInstance() {
		// TODO Auto-generated method stub
		return instance;
	}
	
	public String getTestData() {
		return testData;
	}

	public void setTestData(String testData) {
		this.testData = testData;
	}


	public void updateGameData(Object obj) {
		GameData updateData = (GameData)obj;
		GameData.getInstance().setPlayerData(updateData.getPlayerData());
		GameData.getInstance().setProcessData(updateData.getProcessData());
	}

	public PlayerData getPlayerData() {
		return player;
	}

	public void setPlayerData(PlayerData player) {
		this.player = player;
	}

	public ProcessData getProcessData() {
		return process;
	}

	public void setProcessData(ProcessData process) {
		this.process = process;
	}
	
}
