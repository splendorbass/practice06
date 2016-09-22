package prob4;

public class MyStack implements Stack {
	
	private String[] str;
	private int top = 0;
	
	public MyStack( int a ){
		//str = new String[a];
		resize(a);
	}

	public void resize( int size ){
		String[] str2 = new String[size];
		for( int i = 0 ; i < top ; i++){
			str2[i] = str[i];
		}
		str = str2;
	}
	
	@Override
	public void push(String item) {
		if( top == str.length ){
			resize(str.length*3);
		}
		str[top++] = item;
	}
	
//	@Override
//	public void push(String item) {
//		if( str.length == top ){
//			String[] str2= new String[str.length*2];
//			for(int i = 0 ; i < str.length; i++){
//				str2[i] = str[i];
//			}
//			str = str2;
//			str[top] = item;
//			top++;
//		}else{
//			str[top] = item;
//			top++;
//		}
//	}

	@Override
	public String pop() throws MyStackException {
		if( top == 0){
			throw new MyStackException("stack is empty");
		}
		String s = str[top-1];
		top--;
		return s;
	}

	@Override
	public boolean isEmpty() {
		if( size() == 0 ){
			return true;
		}
		return false;
	}

	@Override
	public int size() {
		return top;
	}

	@Override
	public void showStack() {
		for(int i = 0 ; i< top ; i++){
			System.out.println(str[i]);
		}
	}

}
