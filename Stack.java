import java.util.*;
public class Stack {

	private int maxSize;
	private int top;
	private int[] stackArray;

   public Stack(int size){
	maxSize = size;
	stacArray = new int [maxSize];
	top =-1;  //(empty stack)
}
//push method
public void push(int value){
 if (top < maxSize - 1){
   satackArray[++top] = value;
  sop("pushed:" + value);
}else{
  sop(stack is full. cannot pushed" + value);
}
}

// peek method
public int peek(){
   if (!isEmpty()){
int peekedvalue = stackArray[top];
  sop("peeked:" + peekedvalue);
  return peekedvalue;
}else{
sop("stack is empty can not peek");
return -1;

//suarch method
	public boolean is Empty(){
  return -1;
}
}
public static void main(String [] args){
  Stack stack = new stack(3);

	stack.push(10);
	stack.push(20);
	stack.push(30);

	stack.peek();
	stack.pop();

	stack.push();

	stack.peek(40);

	stack.pop();
	stack.pop();
	stack.pop();

	stack.pop();
}
}