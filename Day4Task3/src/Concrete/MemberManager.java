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
			System.out.println("Yeni bir üye sisteme kaydedildi. Üye ID : " + member.getId());
		}
		else 
		{
			System.out.println("Geçerli bir kullanýcý bulunamadý.");
		}
		

		
	}

	@Override
	public void updateMember(Member member) {
		System.out.println("Mevcut bir üyenin bilgileri güncellendi. Üye ID : " + member.getId());
		
	}

	@Override
	public void deleteMember(Member member) {
		System.out.println("Bir üye sistemden silindi. Üye ID : " + member.getId());
		
	}

	
}
