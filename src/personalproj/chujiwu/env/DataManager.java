package personalproj.chujiwu.env;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import personalproj.chujiwu.common.CommonUtil;
import personalproj.chujiwu.gamedata.GameData;

public class DataManager {

	private static DataManager instance = new DataManager();

	private GameData gameData = GameData.getInstance();
	
	private DataManager() {

	}

	public static DataManager getInstance() {
		if (instance == null) {
			instance = new DataManager();
		}
		return instance;
	}
	/**
	 * 检查存档数据
	 * @return true: 数据情况正常 false: 数据情况有问题
	 */
	@SuppressWarnings({ "resource", "finally" })
	public boolean checkSaveData() {
		boolean result = false;;
		try{
		FileInputStream fis = new FileInputStream(EnvConstant.SAVEDATAPATH);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj = ois.readObject();
		if(CommonUtil.checkClass(obj, GameData.class)){
			gameData.updateGameData(obj);
		}
		result = true;
		}catch(FileNotFoundException e){
			result = false; 
			e.printStackTrace();
			//TODO create new exception
		}catch(IOException e){
			result = false;
			e.printStackTrace();
			//TODO create new exception
		} catch (ClassNotFoundException e) {
			result = false;
			e.printStackTrace();
			//TODO create new exception
		}finally{
			return result;
		}
		
	}
}
