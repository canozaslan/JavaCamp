package Concrete;

import Abstract.CampaignService;
import Entites.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println("Yeni bir kampanya ba�lat�ld�. Kampanya ad� : " + campaign.getName());
		
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println("Mevcut kampanya g�ncellendi. Kampanya ad� : " + campaign.getName());
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println("Devam eden bir kampanya silindi. Kampanya ad� : " + campaign.getName());
		
	}
	
}
