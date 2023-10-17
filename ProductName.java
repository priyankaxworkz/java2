package com.xworkz.test.things;

public class ProductName {
	
	int index=0;
	
	String[] productList=new String [4];
	public void onSave(String productName) {
		//System.out.println("productName:"+productName);
		if(index<productList.length) {
		//	System.out.println("the length of each array:"+productList.length);
			productList[index]=productName;
			System.out.println("the length of each array:"+productList.length);//productList[0]=productName;
	index++;
	//System.out.println("the length of each array:"+productList);//index=index+1//0+1=1 //1+1=2;
		}else {
			System.out.println("product length is full");
		}
	}
	public void getElements() {
		for(int i=0;i<productList.length;i++) {
			System.out.println(productList[i]);
		}
		
	}

}
