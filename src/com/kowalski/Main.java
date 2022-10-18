package com.kowalski;

public class Main {

    public static void main(String[] args) {
	SalesManager manager = new SalesManager(new int[] {250, 152, 244, 121, 165, 320, 333, 280});
        System.out.println(manager.max());
    }
}
