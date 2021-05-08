package Concrete;

import Abstract.CampaignService;
import Entites.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println("Yeni bir kampanya baþlatýldý. Kampanya adý : " + campaign.getName());
		
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println("Mevcut kampanya güncellendi. Kampanya adý : " + campaign.getName());
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println("Devam eden bir kampanya silindi. Kampanya adý : " + campaign.getName());
		
	}
	
}
