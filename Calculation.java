package Page162;
	interface Shape {
		abstract double area(double number);
	}
	class Circle implements Shape{
		public double area(double number) {
			return number*3.1415926;
		}	
	}
	class Square implements Shape{
		public double area(double number) {
			return number*number;
		}
	}
