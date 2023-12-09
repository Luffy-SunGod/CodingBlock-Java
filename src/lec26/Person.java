package lec26;

import sun.tools.tree.ThisExpression;

public class Person {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
//	public void setAge(int age) throws Exception {
//		if(age<0) {
//			throw new  Exception("Age -ve ni hoga");//except genrate kia ha ye ****
//		}
//		this.age = age;
//	}
	public  void setAge(int age) {
		try {
			if(age<0) {
				throw new Exception("age -ve h");
			}
			this.age=age;
			System.out.println("hloooo");
		} 
		catch (Exception e) {
			//System.out.println(e);
			e.printStackTrace();
		}
		finally {
			System.out.println("****");
		}
		System.out.println("&&&&&&");
	}
	

}
