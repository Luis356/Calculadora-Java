import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
    private Historico historico;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        historico = new Historico();

        BorderPane root = new BorderPane();
        root.setPadding(new Insets(10));

        // Exibir o histórico
        TextArea historicoTextArea = new TextArea();
        historicoTextArea.setEditable(false);
        atualizarHistoricoTextArea(historicoTextArea);

        // Exibir a mensagem
        Label label = new Label("Digite uma expressão:");

        // Inserir a expressão
        TextArea expressaoTextArea = new TextArea();

        // Botão para processar a expressão
        Button calcularButton = new Button("Calcular");
        calcularButton.setOnAction(e -> {
            String expressao = expressaoTextArea.getText();
            new Recebe(expressao, historico);
            atualizarHistoricoTextArea(historicoTextArea);
            expressaoTextArea.clear();
        });

        // Layout para os componentes
        VBox vbox = new VBox(10, label, expressaoTextArea, calcularButton);
        HBox hbox = new HBox(10, vbox, historicoTextArea);
        root.setCenter(hbox);

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("Calculadora");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void atualizarHistoricoTextArea(TextArea historicoTextArea) {
        historicoTextArea.clear();
        for (String item : historico.getHistorico()) {
            historicoTextArea.appendText(item + "\n");
        }
    }
} 