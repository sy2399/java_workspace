package test;

import java.io.IOException;

import school.SchoolConsoleUI;

public class TestConsoleUI {
	public static void main(String[] args) {		
		try {
			new SchoolConsoleUI().execute();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}
}
