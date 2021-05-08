package Concrete;

import Abstract.MemberCheckService;
import Abstract.MemberService;
import Entites.Member;

public class MemberManager implements MemberService {

	private MemberCheckService memberCheckService;
	public MemberManager(MemberCheckService memberCheckService) {
		this.memberCheckService = memberCheckService;
	}

	@Override
	public void addMember(Member member) {

		if(memberCheckService.checkIfRealPerson(member)) {
			System.out.println("Yeni bir �ye sisteme kaydedildi. �ye ID : " + member.getId());
		}
		else 
		{
			System.out.println("Ge�erli bir kullan�c� bulunamad�.");
		}
		

		
	}

	@Override
	public void updateMember(Member member) {
		System.out.println("Mevcut bir �yenin bilgileri g�ncellendi. �ye ID : " + member.getId());
		
	}

	@Override
	public void deleteMember(Member member) {
		System.out.println("Bir �ye sistemden silindi. �ye ID : " + member.getId());
		
	}

	
}
