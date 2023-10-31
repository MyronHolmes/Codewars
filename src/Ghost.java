import java.util.Random;

public class Ghost {

//    Create a class Ghost
//
//Ghost objects are instantiated without any arguments.
//
//    Ghost objects are given a random color attribute of "white" or "yellow" or "purple" or "red" when instantiated
//


    private String[] colorCodes = new String[]{"white" , "yellow" , "purple" , "red"};
    private String color = "";

    public Ghost(){
        color = colorCodes[new Random().nextInt(colorCodes.length)];
    }

    public String getColor(){
        return color;
    }
}