package com;

class Animal2 {
	public Animal2(int i, String string, String string2) {
		// TODO Auto-generated constructor stub
	}

	class Animal {
		int legs;
		String name;
		String color;

		public Animal() {
			System.out.println("this is default constructor");
		}

		public Animal(String name) {
			this();
			this.name = name;

		}

		public Animal(String name, String color) {
			this(name);
			this.color = color;
		}

		public Animal(int legs, String name, String color) {
			this(name, color);
			this.legs = legs;
		}

		void display() {
			System.out.println("Animal2 description: ");
			System.out.println(color + " " + "color" + name + " " + "with" + " " + " " + " " + legs + " " + "legs");

		}

	}

	public class thisDemo {
		public static void main(String[] args) {
			Animal2 obj1 = new Animal2(4, "cat", "white");
			obj1.display();

		}
	}

	public void display() {
		// TODO Auto-generated method stub

	}

}
