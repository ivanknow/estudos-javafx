package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LoginApp extends Application {

	@Override
	public void start(Stage primaryStage) {
		AnchorPane pane = new AnchorPane();
		
		TextField txLogin = new TextField();
		txLogin.setPromptText("Digite aqui seu login");
		PasswordField txSenha = new PasswordField();
		txSenha.setPromptText("Digite aqui sua senha");
		Button btEntrar = new Button("Entrar");
		Button btSair = new Button("Sair");
		
		


		pane.setPrefSize(400, 300);
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		pane.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 100%, blue 0%, silver 100%);");
		primaryStage.show();

		pane.getChildren().addAll(txLogin, txSenha, btEntrar, btSair);
		txLogin.setLayoutX((pane.getWidth() - txLogin.getWidth()) / 2);
		txLogin.setLayoutY(50);
		txSenha.setLayoutX((pane.getWidth() - txSenha.getWidth()) / 2);
		txSenha.setLayoutY(100);
		btEntrar.setLayoutX(
		(pane.getWidth() - btEntrar.getWidth()) / 2);
		btEntrar.setLayoutY(150);
		btSair.setLayoutX((pane.getWidth() - btSair.getWidth()) / 2);
		btSair.setLayoutY(200);

	}

	public static void main(String[] args) {
		launch(args);
	}
}
