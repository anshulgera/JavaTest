package com.jda.test.logic;

public class Node<T>{
	T data;
	Node<T> next;
	Node(T t){
		data = t;
		next = null;
	}

}
