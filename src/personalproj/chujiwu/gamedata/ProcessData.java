package personalproj.chujiwu.gamedata;

import java.io.Serializable;

public class ProcessData implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static ProcessData instance = new ProcessData();
	
	private ProcessData(){
		
	}
	
	public static ProcessData getInstance(){
		if(instance == null){
			instance = new ProcessData();
		}
		return instance;
	}
}
