package um.si.feri.bank;
import javax.xml.bind.annotation.XmlElement;

public class StanjeResponse {

	private double stanjeracuna;

	public StanjeResponse(){ 
		
	}
public StanjeResponse(double stanjeracuna){ 
		this.stanjeracuna= stanjeracuna;
	}

public double getStanjeRacuna(){ 
	return stanjeracuna;
	
}
@XmlElement(name="Novo stanje racuna: ")
public void setStanjeRacuna(double stanjeracuna){ 
	this.stanjeracuna= stanjeracuna;
	
}

}
