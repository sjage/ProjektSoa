package um.si.feri.bank.glavno;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.WebParam;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@WebService

@SOAPBinding(style=Style.RPC, use=Use.ENCODED)
public interface IBank {
	@WebMethod
	boolean Placanje( @WebParam(name = "Unesi pin")int pin,@WebParam(name = "TRR primatelja") String TRR1,@WebParam(name = "TRR placatelja") String TRR2,@WebParam(name = "Iznos placanja") double iznos);

}