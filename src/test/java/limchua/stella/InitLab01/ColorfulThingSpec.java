package limchua.stella.InitLab01;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Stella on 1/27/16.
 */
public class ColorfulThingSpec {
    @Test
    public void getColorTest(){
        ColorfulThing color = new ColorfulThing("blue");
        assertEquals("test color blue", "blue", color.getColor());
    }
}
