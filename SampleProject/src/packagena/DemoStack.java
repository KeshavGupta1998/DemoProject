package packagena;
import java.util.Stack;
public class DemoStack {
	
	public static void main(String args[])
	{
		Stack<String> stack = new Stack<>();
		
		stack.push("America");
		stack.push("China");
		stack.push("India");
		
		System.out.println(stack);
		
		String a = stack.pop();
		System.out.println(a);
		
		String b = stack.peek();
		System.out.println(b);
		
		System.out.println("Remove"+stack.remove(0));//we can remove the element by using remove(index)
		System.out.println(stack);
	}
}
