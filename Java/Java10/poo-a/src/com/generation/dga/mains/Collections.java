package com.generation.dga.mains;

import java.util.*;

public class Collections {

	public static void main(String[] args) {
		ArrayList <String> collection = new ArrayList<String>();
		collection.add("Collection");
		collection.add("cohorte");
		
		/*
		collection.add(13);
		collection.add(15.15);
		collection.add('a');
		*/
		for (int i = 0; i < collection.size(); i++) {
			System.out.println(collection.get(i));
		}
		
	}
}
