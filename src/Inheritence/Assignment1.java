package Inheritence;

class Game
{
	Game()
	{
		System.out.println("Game has BoardGames!!");
	}
}
class BoardGame extends Game
{
	BoardGame()
	{
		System.out.println("Board Game has Chess!!");
	}
}
class Chess extends BoardGame
{
	Chess()
	{
		System.out.println("Chess has 2 players!!");
	}
}

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Chess c = new Chess();
		System.out.println(c);

	}

}
