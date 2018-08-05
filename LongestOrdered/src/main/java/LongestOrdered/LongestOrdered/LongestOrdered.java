package LongestOrdered.LongestOrdered;


import java.util.Arrays;

public class LongestOrdered {

	public static void main(String[] args) {
		String[] arrayToBeSorted = new String[3];
		arrayToBeSorted[0] = "aaa";
		arrayToBeSorted[1] = "aaa1212";
		arrayToBeSorted[2] = "aaaawqqwq";
		sortArrayByLongestOrderedv2 (arrayToBeSorted);
    
   
	}
	
	
	public static String[] sortByStringLength (String[]arrayToBeSorted) 
	{
		if(arrayToBeSorted == null)
			System.out.println("Array is a null, returning null");

		else if (Arrays.asList(arrayToBeSorted).contains(null)) {
			System.out.println("Array is  filled with null, returning unsorted array");
		} else
		{
	      for(int y = arrayToBeSorted.length-1 ; y >0; y--){
	         for(int x = 0 ; x<y ; x++){
	            if(arrayToBeSorted[x].length() > arrayToBeSorted[x+1].length()){
	               String temp = arrayToBeSorted[x];
	               arrayToBeSorted[x]=arrayToBeSorted[x+1];
	               arrayToBeSorted[x+1]=temp;
	            }
	         }
	      }
		}
		return arrayToBeSorted; // we assume that if Array will be null/empty we just skip ordering and return empty array (it wasn't in specification) 
	
	}
	
	public static String[] sortArrayByLongestOrderedv2 (String[]arrayToBeSorted) {
		String[] sortedArray= sortByStringLength(arrayToBeSorted);
		//In case Printing of the results is needed:
		// for (int i=0; i<arrayToBeSorted.length; i++)
    	//{  System.out.println(arrayToBeSorted[i]);
    	//	sortedArray[i]=arrayToBeSorted[i];
    	//}
		return sortedArray;
	}

	}


