package rotatedArray;

public class SearchRotatedArray {
	/*public static void main(String[] args){
		int a[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
		int pivot=0;
		int key=5;
		for(int i = 0; i< a.length-1; i++){
			if(a[i] > a[i+1]){
				pivot = i+1;
				break;
			}
		}
		if(key == a[pivot]) {
			System.out.println(pivot);
		}else if(key < a[0]){
			System.out.println(binarySearch(key,pivot,a.length-1,a));
		}else if(key >= a[0]){
			System.out.println(binarySearch(key,0,pivot-1,a));
		}
	}

	public static int binarySearch(int key,int low,int high,int a[]){
		int mid = 0;
		if(high < low){
			return -1;
		}
		mid = (high + low) / 2;
		if(a[mid] == key){
			return mid;
		}else if(key > a[mid]){
			return binarySearch(key,mid+1,high,a);
		}
		return binarySearch(key,low,mid-1,a);

	}/*
	
	public static void main(String args[]) {
		int[] arr = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
		int key=1;
		int min=0;
		
		for(int i = 1; i < arr.length;i++) {
			if(arr[i-1] > arr[i] ) {
				min= i;
			}
		}
		
		if(key < arr[0]) {
			min = binarySearch(arr,min,arr.length-1,key);
		}else if(key > arr[0]){
			min = binarySearch(arr,0,min,key);
		}
		
		System.out.println(min);
	}
	
	public static int binarySearch(int arr[],int low,int high,int key) {
		int mid;
		if(high < low) {
			return -1;
		}
		mid = (high + low)/2;
		
		if(arr[mid] == key) {
			return mid;
		}else if(key > arr[mid]) {
			return binarySearch(arr, mid+1, high, key);
		}
		return binarySearch(arr,low,mid-1,key);
		
		
	}*/
	
	public static void main(String[] args){
		int[] a = {5,6,7,8,9,10,1,2,3,4};
		int key =1;
		System.out.println(search(a,0,a.length,key));
	}

	public static int search(int[] a,int l,int h,int key){
		if(h < l){
			return -1;
		}

		int mid = (h + l) / 2;
		if(a[mid] == key){
			return mid;
		}

		if(a[l] <= a[mid]){
			if(key <= a[mid] && key >= a[l]){
				return search(a,l,mid-1,key);
			}
			return search(a,mid+1,h,key);
		}

		if(key >= a[mid] && key <= a[h]){
			return search(a,mid+1,h,key);
		}
		return search(a,l,mid-1,key);
	}

}
