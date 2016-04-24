package um.si.feri.bank.glavno;


import javax.jws.WebService;
import um.si.feri.bank.imp.BankImp;
@WebService(endpointInterface="um.si.feri.bank.glavno.IBank")


public class Bank implements IBank {


BankImp implementacija = new BankImp();
	
	
	@Override
	public boolean Placanje(int pin, String TRR1, String TRR2, double iznos){
		
			return implementacija.Placanje(pin, TRR1, TRR2, iznos);
	}
	
}
