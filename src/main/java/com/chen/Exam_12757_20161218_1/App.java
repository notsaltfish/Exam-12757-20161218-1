package com.chen.Exam_12757_20161218_1;

import java.awt.List;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int count=0;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
    	for(int i=101;i<=200;i++){
    		int j=2;
    		boolean isPrimeNumber = true ;
    		int s =(int) Math.sqrt(i);
    		j=2;
    		//使用平方根来求
    		//因为使用平方根的注释就会把效率提升很多，
    		//为什么老是提交不上去
    		//现在可以提交了,原来是要现在本地提交才可以远程提交
    		while(j<=s){
    			if(i%j==0){
    				isPrimeNumber=false;
    				break;
    			}
    			j++;
    		}
    		if(isPrimeNumber){
    			numbers.add(i);
    		}
    	}
    	
    	System.out.print("101-200间一共有"+numbers.size()+"素数，分别是：");
        for(int i:numbers){
        	System.out.print(i+",");
        }
    }
}
