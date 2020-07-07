import java.util.Arrays;

public class Array_List {
	private Object[] obj;
	private int arr_pos=0;
	public Array_List(){
		obj=new Object[10];
	}
	
	public void addArr(Object obj1) {
		if(obj.length-arr_pos<=5) {
			increaseArr();
		}
		obj[arr_pos++]=obj1;
		
	}
	void increaseArr() {
		obj=Arrays.copyOf(obj,obj.length*2);
	}
	int size() {
		return arr_pos;
	}
	public Object getArr(int index){
        if(index < arr_pos){
            return obj[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
	
	 public Object removeArr(int index){
	        if(index < arr_pos){
	            Object obj2 = obj[index];
	            obj[index] = null;
	            int tmp = index;
	            while(tmp < arr_pos){
	                obj[tmp] = obj[tmp+1];
	                obj[tmp+1] = null;
	                tmp++;
	            }
	            arr_pos--;
	            return obj;
	        } else {
	            throw new ArrayIndexOutOfBoundsException();
	        }
	}
	
	public static void main(String[] args){
	
        Array_List al = new Array_List();
        al.addArr(Integer.valueOf(2));
        al.addArr(Integer.valueOf(3));
        al.addArr(Integer.valueOf(5));
        al.addArr(Integer.valueOf(4));
        al.addArr(Integer.valueOf(7));
        al.addArr(Integer.valueOf(2));
        al.addArr(Integer.valueOf(7));
        System.out.println("");
        for(int i=0;i<al.size();i++){
            System.out.print(al.getArr(i)+" ");
        }
        System.out.println("");
        al.addArr(Integer.valueOf(29));
        System.out.println("Element at Index 5:"+al.getArr(5));
        System.out.println("");
        for(int i=0;i<al.size();i++){
            System.out.print(al.getArr(i)+" ");
        }
        System.out.println("");
        al.removeArr(2);
        for(int i=0;i<al.size();i++){
            System.out.print(al.getArr(i)+" ");
        }
        System.out.println("");
    }
}


//Output
/*
2 3 5 4 7 2 7                      //Displaying the array
Element at Index 5:2               //Fetching element from position

2 3 5 4 7 2 7 29                   //Addition of new Element
2 3 4 7 2 7 29                     //Removing element

*/
