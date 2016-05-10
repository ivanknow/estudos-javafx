package view;

import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LoginApp extends Application {

	private AnchorPane pane;
	private TextField txLogin;
	private PasswordField txSenha;
	private Button btEntrar;
	private Button btSair;
	private static Stage primaryStage;

	@Override
	public void start(Stage primaryStage) {
		
		 /*Parent root = FXMLLoader.load(getClass().getResource("com/srp/view/reconhecimento_placas.fxml"));
		 primaryStage.setTitle("FXML Welcome");
		 primaryStage.setScene(new Scene(root, 300, 275));
		 primaryStage.show();*/
	

		
		initComponents();
		initListeners();
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.setTitle("Login - GolFX");
		primaryStage.show();
		initLayout();
		LoginApp.primaryStage = primaryStage;

	}

	private void initComponents() {
		pane = new AnchorPane();
		pane.setPrefSize(400, 300);
		pane.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 100%, blue 0%, green 100%);");

		txLogin = new TextField();
		txSenha = new PasswordField();
		btEntrar = new Button("Entrar");
		btSair = new Button("Sair");

		txLogin.setPromptText("Digite seu login...");
		txSenha.setPromptText("Digite aqui sua senha");
		
		pane.getChildren().addAll(txLogin, txSenha, btEntrar, btSair);

		

		

	}

	private void initLayout() {
		
		txLogin.setLayoutX((pane.getWidth() - txLogin.getWidth()) / 2);
		txLogin.setLayoutY(50);
		txSenha.setLayoutX((pane.getWidth() - txSenha.getWidth()) / 2);
		txSenha.setLayoutY(100);
		btEntrar.setLayoutX((pane.getWidth() - btEntrar.getWidth()) / 2);
		btEntrar.setLayoutY(150);
		btSair.setLayoutX((pane.getWidth() - btSair.getWidth()) / 2);
		btSair.setLayoutY(200);
	}

	private void initListeners() {
		btSair.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				fecharAplicacao();
			}
		});
		btEntrar.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				logar();
			}
		});

	}

	private void logar() {
		if (txLogin.getText().equals("admin") && txSenha.getText().equals("123")) {
			new VitrineApp().start(new Stage());
			LoginApp.getStage().close();

		} else {
			JOptionPane.showMessageDialog(null, "Login e/ou senha inv�lidos", "Erro", JOptionPane.ERROR_MESSAGE);
		}
	}

	private void fecharAplicacao() {
		System.exit(0);
	}

	public static Stage getStage() {
		return primaryStage;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
