package time_ex;

import java.io.IOException;

public class MainClass03 {
	public static void main(String[] args) {

		ProcessBuilder pro = new ProcessBuilder();

		pro.command("calc");
		pro.command("notepad");

		try {
			pro.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
