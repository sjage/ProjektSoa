
package um.si.feri.bank;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="PlacanjeResponse")

public class PlacanjeResponse {

	private boolean stanjePlacanja;

	public PlacanjeResponse(){ 
		
	}
public PlacanjeResponse(boolean stanjePlacanja){ 
		this.stanjePlacanja=stanjePlacanja;
		
	}


public boolean getStanjePlacanja(){
	return stanjePlacanja; }

@XmlElement(name="StanjePlacanja")
public void setStanjePlacanja(boolean stanjePlacanja) {
	this.stanjePlacanja=stanjePlacanja;
}


}
