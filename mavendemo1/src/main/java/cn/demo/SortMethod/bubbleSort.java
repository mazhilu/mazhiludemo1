package cn.demo.SortMethod;

public class bubbleSort {
    public int[] bubbleSort(int[] number){
    	int i,j,temp;
    	int size=number.length;
    	for(i=0;i<size;i++){
    		for(j=i+1;j<size;j++){
    			if(number[i]>number[j]){
    				temp=number[i];
    				number[i]=number[j];
    				number[j]=temp;
    				
    			}
    		}
    	}
		return number;
    	
    }


	public static void bubbleSorttoString(int[] number){
		int size=number.length;
		boolean ok=false;
			   System.out.print("[");
	   for(int i=0;i<size;i++){
		System.out.print(" "+number[i]);
		   }
	   System.out.println(" ]");
	   }
	
	   
	}
       


