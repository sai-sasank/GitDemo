import org.testng.annotations.Test;

public class PS1 extends PS{
 @Test
 public void testRun()
 {
	 int a = 3;
	 doThis();
	 PS2 ps2 = new PS2(3);
	System.out.println( ps2.increment());
	System.out.println(ps2.decrement());
 }
}
