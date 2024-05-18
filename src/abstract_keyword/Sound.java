package abstract_keyword;

abstract class Instruments
{
//	Instruments()
//	{
//		System.out.println("There are 3 Instruments Piano, Flute and Guitar");
//	}
	public abstract void play();
}
class Piano extends Instruments
{
	public void play()
	{
		System.out.println("Tan tan tan");
	}
}
class Flute extends Instruments
{
	public void play()
	{
		System.out.println("toot toot toot toot");
	}
}
class Guitar extends Instruments
{
   public void play()
	{
		System.out.println("tin tin tin tin");
	}
}

public class Sound {
	public static void main(String[]args)
	{
		 Instruments arr[]=new Instruments[10];
		 
         arr[0]= new Piano();
         arr[1]= new Flute();
         arr[2]= new Guitar();
         arr[3]= new Piano();
         arr[4]= new Flute();
         arr[5]= new Piano();
         arr[6]= new Guitar();
         arr[7]= new Piano();
         arr[8]= new Flute();
         arr[9]= new Guitar();
		 
		 //String arr[]={"piano","Flute","Guitar"};
		 for(int i=0;i<arr.length;i++)
		 {
			 //System.out.println(arr[i]);
			 if(arr[i] instanceof Piano)
			 {
				 arr[i].play();
				 
			 }
			 if(arr[i] instanceof Flute)
			 {
				 arr[i].play();
			 }
			 if(arr[i] instanceof Guitar)
			 {
				 arr[i].play();
			 }
			 
		 }
	}

}
