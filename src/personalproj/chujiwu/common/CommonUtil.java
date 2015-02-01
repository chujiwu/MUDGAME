package personalproj.chujiwu.common;

import java.io.File;

public class CommonUtil {
	/**
	 * 判断文件是否存在
	 * @param fileName 文件名称（包含路径名）
	 * @return true:文件存在 false:文件不存在
	 */
	public static boolean isFileExist(String fileName) {
		File f = new File(fileName);
		if(f.exists() && f.toString().endsWith(".conf")){
			return true;
		}
		return false;
	}
	/**
	 * 判断当前对象是否为类的实例
	 * @param obj 被判断对象
	 * @param clazz 类
	 * @return true: 对象为类的实例 false: 对象非类的实例
	 */
	public static boolean checkClass(Object obj, Class<?> clazz) {
		if(clazz.isInstance(obj)){
			return true;
		}
		return false;
	}

}
