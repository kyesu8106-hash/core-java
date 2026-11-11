package com.arrays;

public class KthLargest {

	public static void main(String[] args) {
		int []a= {4,5,7,1,3};
		int k=3;
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		System.out.println(k+"rd largest element is:"+a[k-1]);

	}

}
