package personalproj.chujiwu.env;

import personalproj.chujiwu.common.CommonUtil;
import personalproj.chujiwu.env.EnvConstant.ConfigFile;

public class EnvChecker {
	
	private boolean isEnvOK;
	
	private static EnvChecker instance = new EnvChecker();
	
	private EnvChecker(){
		if(checkConfig() && checkData()){
			setEnvCondition(true);
		}else{
			setEnvCondition(false);
		}
	}
	
	public static EnvChecker getInstance() {
		if(instance == null){
			instance = new EnvChecker();
		}
		return instance;
	}

	private boolean checkConfig() {
		if(checkConfigFiles()){
			System.out.println("config check ok");
			return true;
		}
		
		return false;
	}
	/**
	 * 检查配置文件是否是否正确
	 * @return true: 结果正确 false: 结果有问题
	 */
	private boolean checkConfigFiles() {
		boolean result = true;
		for(ConfigFile file : ConfigFile.values()){
			if(!CommonUtil.isFileExist(EnvConstant.CONFFILEPATH + file.getFileName())){

				result = false;
			}else{
				if(!ParamChecker.checkFileParam()){
					result = false;
				}
			}
		}
		return result;
	}
	/**
	 *  检查数据
	 * @return true: 数据情况正常 false: 数据情况有问题
	 */
	private boolean checkData() {
		DataManager dataManager = DataManager.getInstance();
		if(dataManager.checkSaveData()){
			System.out.println("dara check ok");
			return true;
		}
		return false;
	}
	/**
	 * 设置环境情况
	 * @param isEnvOK 环境情况
	 */
	private void setEnvCondition(boolean isEnvOK){
		this.isEnvOK = isEnvOK;
	}
	/**
	 * 取得环境情况
	 * @return true: 环境无问题 false: 环境有问题
	 */
	public boolean isEnvOK() {
		return isEnvOK;
	}

}
