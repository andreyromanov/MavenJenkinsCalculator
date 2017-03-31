/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.simpleconsolecalcmaven.Main;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Da-pro
 */
public class MainTest {

    @Ignore("Not running")
    @Test
    public void simpleCheck() {
       Main calculator = new Main(2, 2);
       int result = calculator.getResult();
       assertTrue("Результат(" + result + ") не равен 4", result == 4);
    }
@Ignore("Not running")
   @Test
public void MyTest2() {
Main calculator = new Main(10, 5);
int result = calculator.getMinus();
assertTrue("Результат(" + result + ") не равен 5", result == 5);

}     
    @Ignore("Not running")
    @Test
public void MyTest3() {
Main calculator = new Main(10, 1);
double result = calculator.Divnull();
assertTrue("Результат(" + result + ") не равен 5", result == 10);
}   


}

  