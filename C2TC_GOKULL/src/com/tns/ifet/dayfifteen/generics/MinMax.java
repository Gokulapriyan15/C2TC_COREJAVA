//Program to demonstrate generic interface
package com.tns.ifet.dayfifteen.generics;

//Generic Interface
public interface MinMax<T extends Comparable<T>> {

	T min();

	T max();
}

