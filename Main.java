package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String name = sc.next();
	String rev = "";
	int nameLength = name.length();
	for(int i=nameLength-1; i>=0; --i){
	   rev = rev+name.charAt(i);
    }
	if(name.toLowerCase().equals(rev.toLowerCase())){
		System.out.println(name+" is a palindrome");
	}
	else{
		System.out.println(name+" is not a palindrome");
	}
    }
}
