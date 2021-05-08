package Concrete;

import Abstract.GameService;
import Entites.Game;

public class GameManager implements GameService {

	@Override
	public void addGame(Game game) {
		System.out.println("Sisteme yeni bir oyun eklendi. Oyun adý : " + game.getName());
		
	}

	@Override
	public void updateGame(Game game) {
		System.out.println("Sistemde mevcut bir oyunun bilgileri güncellendi. Oyun adý : " + game.getName());
		
	}

	@Override
	public void deleteGame(Game game) {
		System.out.println("Sistemden bir oyun silindi. Oyun adý : " + game.getName());
		
	}

}
