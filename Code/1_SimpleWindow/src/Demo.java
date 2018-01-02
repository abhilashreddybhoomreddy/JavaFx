import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene; 
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Demo extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception { 
		
		System.out.println("Hi...This is Application start method");
	      /* 
	      Code for JavaFX application. 
	      (Stage, scene, scene graph) 
	      */    
		
		//Creating root node
		Group rootnode = new Group();
		
		//Creating Scene Graph and attaching rootnode
		Scene scene = new Scene(rootnode, 900, 500);
		scene.setFill(Color.rgb(242,217,138));
		
		//Creating Stage
		Stage stage = new Stage();
		 //Attaching Scene to Stage
		 stage.setScene(scene); 
		 stage.show();
		
	   }  
	

	public static void main(String[] args) {
		
		System.out.println("Hi...This is main method");
        launch(args);
	}
	
	static
	{
		System.out.println("Hi...This is static method");
	}

}
