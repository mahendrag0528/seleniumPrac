package OopsConcepts;

import java.io.IOException;

public class ExceptionsPractice {

	
	@SuppressWarnings("finally")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			int a=10;
			int b=0;
			System.out.println((a/b));
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally{
			throw new IOException("I am ioExcepton");
		}
	}

}
