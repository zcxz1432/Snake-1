import java.util.ArrayList;
import java.awt.Color;

public class DataOfSquare {

	
	//ArrayList that'll contain the colors
	ArrayList<Color> C =new ArrayList<Color>();
	int color; //4 energy, //3 rock, //2: snake , 1: food, 0:empty 
	SquarePanel square;
	public DataOfSquare(int col){
		
		//Lets add the color to the arrayList
		C.add(Color.lightGray);//0
		C.add(Color.YELLOW);    //1
		C.add(Color.BLACK); //2
		C.add(Color.RED); //3
		C.add(Color.BLUE); //4
		color=col;
		square = new SquarePanel(C.get(color));
	}
	public void lightMeUp(int c){
		square.ChangeColor(C.get(c));
		
	}
}
