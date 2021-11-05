package testapp;

import java.sql.*;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] arg) {
		String driver = "org.hsqldb.jdbc.JDBCDriver";

		try {
			Class.forName(driver);
			System.out.println("Success");
		} catch (Exception e) {
			System.out.println("Failed");
		}

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
	}

}