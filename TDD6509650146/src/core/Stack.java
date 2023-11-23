package core;

public class Stack implements IStack{
	Object stack[];
	int top, maxTop, size;
	
	Stack(int size){
		this.size = size;
		stack = new Object[size];
		top = -1;
		maxTop = size-1;
	}
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return top == -1;
	}
	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return top == maxTop;
	}
	@Override
	public void push(Object elm) throws Exception{
		// TODO Auto-generated method stub
		if(isEmpty()) {
			stack[++top] = elm;
		}
		else {
			if(isFull()) {
				throw new Exception("Stack is full");
			}
			else {
				if (elm.getClass() != stack[0].getClass()) {
		            throw new Exception("All elements in the stack must be of the same type.");
		        }
				else stack[++top] = elm;
			}
		}

	}
	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("Error: the stack is empty");
			return -1;
		}
		else return stack[top--];
	}
	@Override
	public Object top() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("Error: the stack is empty");
			return -1;
		}
		else return stack[top];
	}
	
	public Object topC() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("Error: the stack is empty");
			return -1;
		}
		else return stack[top].getClass();
	}

}
