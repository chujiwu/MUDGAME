package personalproj.chujiwu.mudapp;


public class GameProcess {
	
	private boolean initOk = false;
	
	private GameUIManager ui;
	private EventManager event;
	
	public GameProcess(){
		ui = new GameUIManager();
		event = new EventManager();
		init();
	}
	
	public void start() {
		//TODO
	}

	private void init() {
		if(ui.load() && event.load()){
			initOk = true;
		}
	}
	
	public boolean isInitOk(){
		return initOk;
	}
	
}
