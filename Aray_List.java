

import java.util.Arrays;
public class Array_List1 {
	public int count=0;
	private Object[] array;
	private Object[] temp_array;
	private int arr_index=0;
	public Array_List1(){
		array=new Object[10];
	}
	
	public void addArr(Object element) {
		if(array.length-arr_index<=5) {
			increaseArr();
		}
		array[arr_index++]=element;
		
	}
	void increaseArr() {
		temp_array=new Object[2*array.length];
		for(int i=0;i<array.length;i++) {
			temp_array[i]=array[i];
		}
		array=temp_array;
	}
	
	int size() {
		return arr_index;
	}
	
	public Object getArr(int index){
        if(index < arr_index){
            return array[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
	
	 public Object removeArr(int index){
	        if(index < arr_index){
	            Object obj2 = array[index];
	            array[index] = null;
	            int tmp = index;
	            while(tmp < arr_index){
	                array[tmp] = array[tmp+1];
	                array[tmp+1] = null;
	                tmp++;
	            }
	            arr_index--;
	            return array;
	        } else {
	            throw new ArrayIndexOutOfBoundsException();
	        }
	         
	    }
	 private int length() {
		 do {
			 count=count+1;
		 }while(array[count]!=null);
		 
		 return count;
	 }
	 public void display() {
		 int len=length();
		 for(int i=0;i<len;i++) {
			 if(array[i]!=null) {
				 System.out.println(array[i]);
			 }
		 }
		 
	 }
	
	public static void main(String[] args){
		Array_List1 list = new Array_List1();
        
        list.addArr(Integer.valueOf(2));
        list.addArr(Integer.valueOf(3));
        list.addArr(Integer.valueOf(5));
        list.addArr(Integer.valueOf(4));
        list.addArr(Integer.valueOf(7));
        list.addArr(Integer.valueOf(2));
        list.addArr(Integer.valueOf(67));
        list.addArr(Integer.valueOf(17));
        
        
        System.out.println("The elements in the array are:");
        list.display();
       
        System.out.println("The size of the array is "+list.size());
        System.out.println("");
        
        list.addArr(Integer.valueOf(29));
        System.out.println("The elements in the array after addition of new element is:");
        list.display();
        
        System.out.println("");
        System.out.println("Element at Index 5:"+list.getArr(5));
        System.out.println("");
       
        
        list.removeArr(2);
        System.out.println("The elements in the array after removal of an element is:");
        list.display();
        System.out.println("");
    }


}

//Output
/*
The elements in the array are:
2
3
5
4
7
2
67
17
The size of the array is 8

The elements in the array after addition of new element is:
2
3
5
4
7
2
67
17
29

Element at Index 5:2

The elements in the array after removal of an element is:
2
3
4
7
2
67
17
29

*/
