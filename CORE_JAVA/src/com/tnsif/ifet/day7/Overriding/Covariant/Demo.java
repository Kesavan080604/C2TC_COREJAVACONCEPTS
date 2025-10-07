package com.tnsif.ifet.day7.Overriding.Covariant;

public class Demo {
	public static void main(String arg[])
			throws CloneNotSupportedException
		{

			Student student1 = new Student(27, "AI&DS", "Kesavan");
			student1.printData();

			Student student2 = (Student) student1.clone();
			student2.printData();
		}

}
