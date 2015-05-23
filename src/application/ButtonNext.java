package application;

import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ButtonNext extends Button{
	public ButtonNext(String string, Stage stage, Scene scene){
		super(string);
		this.setOnAction((ActionEvent e)->{
			stage.setScene(scene);
			stage.sizeToScene();
		});
		this.setDefaultButton(true);
	}
}
