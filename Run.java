class shape123
{
	void draw()
	{
		System.out.println("drawing shape");
	}
	void erase()
	{
		System.out.println("erase shape");
	}
}

	class Circle extends shape123
	{
		void draw()
		{
			System.out.println("drawing circle");
		}
		void erase()
	   {
		System.out.println("erase circle");
	   }
	}
	   class Triangle extends shape123
	{
		void draw()
		{
			System.out.println("drawing triangle");
		}
		void erase()
	   {
		System.out.println("erase triangle");
	   }
	}
	      class Square extends shape123
	{
		void draw()
		{
			System.out.println("drawing Square");
		}
		void erase()
	   {
		System.out.println("erase Square");
	   }
	}
	   public class Run
	   {
		   public static void main(String args[])
		   {
			   shape123 c=new Circle();
			    shape123 t=new Triangle();
				 shape123 s=new Square();
				 c.draw();
				 c.erase();
				 t.draw();
				 t.erase();
				 s.draw();
				 s.erase();
		   }
	   }
