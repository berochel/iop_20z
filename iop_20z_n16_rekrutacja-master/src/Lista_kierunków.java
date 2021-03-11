
/**
 * 
 */

import java.util.HashSet;
import java.util.Set;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Jaroslaw
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Lista_kierunk�w {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Set<Kierunek> kierunek;

	/** 
	* @return the kierunek
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Set<Kierunek> getKierunek() {
		// begin-user-code
		if(kierunek == null)
			kierunek = new HashSet<Kierunek>();
		return kierunek;
		// end-user-code
	}

	/** 
	* @param kierunek the kierunek to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setKierunek(Set<Kierunek> kierunek) {
		// begin-user-code
		this.kierunek = kierunek;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Boolean edytujKierunek(String nazwa_kierunku_szukanego, int tryb) {
		// begin-user-code
		
		for (Kierunek one : kierunek) {
		    if (one.getNazwa_kierunku().equals(nazwa_kierunku_szukanego)) {
		    	if (tryb == 2 || tryb == 3)
		    	{
		    		one.edytujOpis();
		    		return true;
		    	}
		    	if (tryb == 1 || tryb == 3)
		    	{
		    		one.edytujLimit();
		    		return true;
		    	}
		    }
		  } 
		System.out.println("Nie ma takiego kierunku!");
		return false;
		// end-user-code
	}
}