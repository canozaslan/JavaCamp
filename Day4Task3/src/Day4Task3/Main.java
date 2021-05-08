package Day4Task3;

import java.util.Date;

import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.MemberManager;
import Concrete.OrderManager;
import Entites.Campaign;
import Entites.Game;
import Entites.Member;
import Entites.Order;

public class Main {

	public static void main(String[] args) {
		
		Member member = new Member(1, "canozaslan", "12345", "Ahmet Can", "Özaslan", "33511168570", new Date(1996,1,3));
		Game crysis = new Game(1, "Crysis", 129.90, "EA Games");
		Game gof = new Game(2, "God Of War", 119.0, "Sony");
		Game ac = new Game(3, "Assasin's Creed", 269.0, "Ubisoft");
		
		Game[] games = {crysis, gof, ac};
		Game[] promotionalGames = {crysis, ac};
		
		Campaign campaign = new Campaign(1, "Yaz Ýndirimleri", promotionalGames, 0.20);
		
		MemberManager memberManager = new MemberManager(new MernisServiceAdapter());
		memberManager.addMember(member);
		
		GameManager gameManager = new GameManager();
		gameManager.addGame(ac);
		gameManager.deleteGame(gof);
		gameManager.updateGame(crysis);

		CampaignManager campaignManager = new CampaignManager();
		campaignManager.addCampaign(campaign);
		
		OrderManager orderManager = new OrderManager();
		
		orderManager.purchase(new Order(1, member, ac, campaign, 1));
		
		
	}

}
