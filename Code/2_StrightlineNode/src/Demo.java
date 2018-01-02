import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.shape.Line;
import javafx.collections.ObservableList; 
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
		
		//Creating Line node
		    Line tl = new Line() ;
		    tl.setStartX(1);
		    tl.setStartY(1);
		    tl.setEndX(900);
		    tl.setEndY(500);
		    tl.setStroke(Color.RED);
		    
		    Line tr = new Line() ;
		    tr.setStartX(900);
		    tr.setStartY(1);
		    tr.setEndX(1);
		    tr.setEndY(500);
		    tr.setStroke(Color.rgb(14, 234, 50));
		    
		    //BottomLeft
		    Line tm = new Line() ;
		    tm.setStartX(450);
		    tm.setStartY(1);
		    tm.setEndX(450);
		    tm.setEndY(500);
		    tm.setStroke(Color.rgb(14, 39, 234));
		    
		    
		    Line lm = new Line() ;
		    lm.setStartX(1);
		    lm.setStartY(250);
		    lm.setEndX(900);
		    lm.setEndY(250);
		    lm.setStroke(Color.rgb(14, 234, 230));
		    
		    
	   //Adding line node to rootnode
		    ObservableList list = rootnode.getChildren();
		    list.add(tl);
		    list.add(tr);
		    list.add(tm);
		    list.add(lm);
		    
		    
		    
		     
		    
		
		//Creating Scene Graph and attaching it to rootnode
		Scene scene = new Scene(rootnode, 900, 500);
		scene.setFill(Color.rgb(242,217,138));
		
		//Creating Stage
		Stage stage = new Stage();
		 stage.setTitle("Welcome to Tic Tac Toe"); 
		 
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

