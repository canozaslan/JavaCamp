package Adapters;

import java.rmi.RemoteException;

import Abstract.MemberCheckService;
import Entites.Member;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements MemberCheckService {

	@Override
	public boolean checkIfRealPerson(Member member) {
		KPSPublicSoapProxy kpsSoapProxy = new KPSPublicSoapProxy();
		boolean result;
		try {
			result = kpsSoapProxy.TCKimlikNoDogrula(Long.parseLong(member.getNationalityId()), 
					member.getFirstName(), member.getLastName(), member.getDateOfBirth().getYear());
		} catch (NumberFormatException e) {
			e.printStackTrace();
			result = false;
		} catch (RemoteException e) {
			e.printStackTrace();
			result = false;
		}
		return result;
	}

}
