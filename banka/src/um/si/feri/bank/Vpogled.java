package um.si.feri.bank;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;

public class Vpogled {

	private String TRR;
	private Date datefrom;
	private Date dateto;
	private int pin;

	public Vpogled(){ 
		
	}
public Vpogled(String TRR, Date datefrom, Date dateto, int pin){ 
		this.TRR= TRR;
		this.datefrom= datefrom;
		this.dateto= dateto;
		this.pin= pin;
	}
@XmlElement(name="TRR: ")
public String getTRR(){ 
	return TRR;
	
}
public void setTRR(String TRR){ 
	this.TRR= TRR;
	
}
@XmlElement(name="Odaberi datum od: ")
public Date getDatefrom(){ 
	return datefrom;
}
public void setDatefrom( Date datefrom){ 
	this.datefrom = datefrom;
}
@XmlElement(name="Odaberi datum do:")
public Date getDateto(){ 
	return dateto;
	
}
public void setDateto(Date dateto){ 
	this.dateto= dateto;
}
@XmlElement(name="PIN: ")
public int getPin(){ 
	return pin;
}
public void setPin(int pin){ 
	this.pin= pin;
	
}
}
