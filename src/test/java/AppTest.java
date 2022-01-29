
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AppTest {
 
    private String choice1 = "You enter the cave and see the dragon. The dragon tells you to come closer and take some of his treasure. "
                            +
            "'I have too much as it is'. You chose wisely and got the treasure. ";

    @Test
    void choose() {
        assertEquals(choice1,  App.choose(1));
    }
    
}
