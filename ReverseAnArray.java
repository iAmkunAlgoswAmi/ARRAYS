/*

Input  : arr[] = {1, 2, 3}
Output : arr[] = {3, 2, 1}

Input :  arr[] = {4, 5, 1, 2}
Output : arr[] = {2, 1, 5, 4}

*/


class ReverseAnArray{
	public static void main(String... A){
		int arr[] = {1, 2, 3};
		for(int value : arr){
			System.out.print(value+", ");
		}
		reverseUsingRecursion(arr,0,2);
		System.out.println("Using Recursion");
		for(int value : arr){
			System.out.print(value+", ");
		}
		int[] reversedArray=reverse(arr);
		System.out.print("arr[] = {");
		for(int value : reversedArray){
			System.out.print(value+", ");
		}
		System.out.println("}");
	}
	public static int[] reverse(int[] arr){
		int length=arr.length;
		int i = 0;
		int j = length-1;
		while(i<=j){
			int change = arr[i];
			arr[i] = arr[j];
			arr[j] = change;
			i++;
			j--;
		}
		return arr;
	}
	public static void reverseUsingRecursion(int[] arr, int start, int end){
		if(start > end){
			return;
		}
		int temp = arr[start];	
		arr[start] = arr[end];
		arr[end] = temp;
		reverseUsingRecursion(arr, start+1, end-1);
	}
}
