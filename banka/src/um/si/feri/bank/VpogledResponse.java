package um.si.feri.bank;
import javax.xml.bind.annotation.XmlElement;

public class VpogledResponse {

	private double ispis;

	public VpogledResponse(){ 
		
	}
public VpogledResponse(double ispis){ 
		this.ispis= ispis;
	}
public double getIspis(){ 
	return ispis;
	
}
@XmlElement(name="Ispis: ")
public void setTRR(double ispis){ 
	this.ispis= ispis;
	
}
}
