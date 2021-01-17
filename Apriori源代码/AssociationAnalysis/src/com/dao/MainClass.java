package com.dao;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;


public class MainClass {
	 public static void main(String[] args){		 
		    DataHand dh = new DataHand();
			ArrayList<String> list = dh.getDetail();  	
	        Apriori apriori=new Apriori();
	        apriori.setTransList(list);	        
	        Map<String,Integer> frequentCollectionMap=apriori.getFC();
	        System.out.println("-------------频繁集"+"----------------");
	        Set<String> fcKeySet=frequentCollectionMap.keySet();
	        for(String fcKey:fcKeySet){
	                 System.out.println(fcKey+"  :  "+frequentCollectionMap.get(fcKey));
	        }
	        
	        Map<String,Double> relationRulesMap=apriori.getRelationRules(frequentCollectionMap);
	        System.out.println("-----------关联规则"+"----------------");
	        Set<String> rrKeySet=relationRulesMap.keySet();
	        for(String rrKey:rrKeySet){
	                 System.out.println(rrKey+"  :  "+relationRulesMap.get(rrKey));
	        }
	    }
}
