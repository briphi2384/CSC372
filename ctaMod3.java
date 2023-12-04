import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import java.time.LocalDateTime;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class ctaMod3 extends Application {
	
	@Override
	public void start (Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("Menu");
		//create menu items
		MenuItem item1 = new MenuItem("Option 1");
		MenuItem item2 = new MenuItem("Option 2");
		MenuItem item3 = new MenuItem("Option 3");
		MenuItem item4 = new MenuItem("Option 4");
		TextArea textArea = new TextArea();
		//tell menu items what to do
		
		MenuButton menuButton = new MenuButton("Options", null, item1, item2, item3, item4);
		HBox hbox = new HBox(menuButton);
		hbox.setSpacing(10);
		//hbox.setHgrow(textArea, javafx.scene.layout.Priority.ALWAYS);
		Scene scene = new Scene(hbox, 200, 100);
		
	
		//When user clicks option 1, current date and time are printed
		item1.setOnAction(event -> {
			System.out.println(LocalDateTime.now());
		});
		
		//option 2 : text box contents written to file
		item2.setOnAction(event -> {
		String content = textArea.getText();
		try {
			writeToFile(content);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		});
		
		//option 3: sets random color to the background
		item3.setOnAction(event -> {
			setBackgroundColor(scene);
		});
		
		//option 4: exits program
		item4.setOnAction(event -> {
			System.exit(0);
		});
			
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}//end of start
	
	public void writeToFile (String content) throws IOException{
		PrintWriter writer = new PrintWriter(new FileWriter("log.txt", true));
		writer.println(content);
		
	}//end writeToFile
	
	public void setBackgroundColor(Scene scene) {
		
		Random rand = new Random();
		double hue = rand.nextDouble() *120;
		scene.setFill(javafx.scene.paint.Color.hsb(hue,1.0,1.0));
		
	}//end background color
	
	public static void main (String[] args) {
		Application.launch(args);
		
	}//end main
	
}//end of class
