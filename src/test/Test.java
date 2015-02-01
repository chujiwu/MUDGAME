package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import personalproj.chujiwu.gamedata.GameData;

public class Test {

	public static void main(String[] args) {
		String file = System.getProperty("user.dir") + File.separator + "data"
				+ File.separator + "savedata.dat";
		GameData gameData = null;
		try {
			gameData = new GameData();
			gameData.setTestData("data has been changed");
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(gameData);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Output Ok");
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			gameData = (GameData) ois.readObject();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (GameData.class.isInstance(gameData)) {
			System.out.println(gameData.getTestData());
		}
	}

}
