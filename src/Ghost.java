import java.util.Random;

public class Ghost {

//    Create a class Ghost
//
//Ghost objects are instantiated without any arguments.
//
//    Ghost objects are given a random color attribute of "white" or "yellow" or "purple" or "red" when instantiated
//


    private String[] m_colorCodes = new String[]{"white" , "yellow" , "purple" , "red"};
    private String m_color = "";

    public Ghost(){
        m_color = m_colorCodes[new Random().nextInt(m_colorCodes.length)];
    }

    public String getColor(){
        return m_color;
    }
}