package Assisted;

public class Cat 
{
	
		String name;
		int age;
		String color;
		

		public String getName() {
			return name;
		}
		
		public int getAge() {
			return age;
		}

		public String getColor() {
			return color;
		}


		public Cat(String name, int age, String color) {
			super();
			this.name = name;
			this.age = age;
			this.color = color;
		}
	    @Override
	    public String toString() {
	        return("Hi my name is "+ this.getName()+ " , " +"\nMy age is " + this.getAge()+" ," + "\nMy color is " + this.getColor() + "."); 
	    }

		public static void main(String[] args) {
			Cat c = new Cat("Alex", 3 ,"White");
			System.out.println(c);
			

		}

	

}
