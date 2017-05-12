package Facade;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class FacadeEverydayDemo {

	public static void main(String args[]) throws Exception {

		URL url = new URL("http", "www.pluralsight.com", 80, "/author/bryan-hansen");

		BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

		String inputLine;

		while ((inputLine = in.readLine()) != null) {
			System.out.println(inputLine);
		}
	}
}