package practisequestions;
import java.util.List;
import java.util.ArrayList;
 
public class ABCD {
	
	public static void main(String[] args) {
	    ABC abc = new ABC();
	   
	    // Todo

	    
	    List<B>mylist=new ArrayList<B>();
	    
	    abc.test(mylist);
	}

    
	
	
}

class A { }

class B extends A { }

class C extends B { }

 class ABC {
    
void test(List<? extends B> data) {
       
		System.out.println("test data: " + data.getClass());
    }
}

