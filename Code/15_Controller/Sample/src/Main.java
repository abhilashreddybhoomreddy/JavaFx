import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.shape.Line;
import javafx.collections.ObservableList; 
import javafx.scene.Scene; 
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage stage) throws Exception { 
		
		System.out.println("Hi...This is Application start method");
		
		/*
		//Creating root node
		Group rootnode = FXMLLoader.load(getClass().getResource("view/Hello.fxml"));    
		
		//Creating Stage
	    //	Stage stage = new Stage(); 
		 stage.setTitle("Welcome"); 
		 
		 //Attaching Scene to Stage
		 stage.setScene(new Scene(rootnode)); 
		 stage.show(); 
	*/
	}
	
	/Creating root node
	Group rootnode = new Group();
	
	
	
	//Creating Header Text
	
	  Text text = new Text();
	  text.setFont(new Font(45));
	  text.setX(200); 
      text.setY(100);     
	  text.setText("Hi. Wanna Play!!"); 
	
	//Creating Line node
	    Line tl = new Line() ;
	    tl.setStartX(1);
	    tl.setStartY(50);
	    tl.setEndX(900);
	    tl.setEndY(500);
	    tl.setStroke(Color.RED);
	    
	    Line tr = new Line() ;
	    tr.setStartX(900);
	    tr.setStartY(50);
	    tr.setEndX(1);
	    tr.setEndY(500);
	    tr.setStroke(Color.rgb(14, 234, 50));
	    
	    //BottomLeft
	    Line tm = new Line() ;
	    tm.setStartX(450);
	    tm.setStartY(50);
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
	    list.addAll(text,tl,tr,tm,lm);
	    //list.add(text);
	    //list.add(tl);
	    //list.add(tr);
	    //list.add(tm);
	    //list.add(lm);
	    
	    
	    
	     
	    
	
	//Creating Scene Graph and attaching it to rootnode
	Scene scene = new Scene(rootnode, 900, 500);
	scene.setFill(Color.rgb(242,217,138));
	
	//Creating Stage
    //	Stage stage = new Stage();
	 stage.setTitle("Welcome to Tic Tac Toe"); 
	 
	 //Attaching Scene to Stage
	 stage.setScene(scene); 
	 stage.show();

	public static void main(String[] args) {
		
		System.out.println("Hi...This is main method");
        launch(args);
	}
	
	static
	{
		System.out.println("Hi...This is static method");
	}

}

