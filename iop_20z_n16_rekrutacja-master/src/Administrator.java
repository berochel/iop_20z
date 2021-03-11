/**
 * 
 */
import java.util.Set;
/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Jaroslaw
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Administrator extends Pracownikdziekanatu {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param nazwa_kierunku
	* @param limit_zakwalifikowanych
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Kierunek dodajKierunek(Rekrutacja rekr, String nazwa_kierunku, Integer limit_zakwalifikowanych) {
		// begin-user-code
		Lista_kierunk�w lista = new Lista_kierunk�w();
		
		lista = rekr.getLista_kierunkow();
		
		Set<Kierunek> kierunek_set = lista.getKierunek();
		
		Kierunek kierunek = new Kierunek();
		kierunek.setNazwa_kierunku(nazwa_kierunku);
		kierunek.setLimit_zakwalifikowanych(limit_zakwalifikowanych);
		lista.getKierunek().add(kierunek);
		
		return null;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param kierunek
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Boolean usu�Kierunek(Rekrutacja rekr, String nazwa_kierunek) {
		// begin-user-code
		Lista_kierunk�w lista = new Lista_kierunk�w();
		
		lista = rekr.getLista_kierunkow();
		
		Set<Kierunek> kierunek_set = lista.getKierunek();
		
		Kierunek kierunek = new Kierunek();
		
		for (Kierunek one : kierunek_set) {
		    if (one.getNazwa_kierunku().equals(nazwa_kierunek)) {
		    	kierunek = one;
		    }
		  } 
		
		kierunek_set.remove(kierunek);
		
		lista.setKierunek(kierunek_set);
		
		rekr.setLista_kierunkow(lista);
		
		return null;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param kierunek
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Boolean edytujKierunek(Rekrutacja rekr, String nazwa_kierunek) {
		// begin-user-code
		return rekr.edytujListeKierunkow(nazwa_kierunek);
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param nazwa
	* @param adres
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Wydzia� dodajWydzia�(String nazwa, String adres) {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param wydzia�
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Boolean usu�Wydzia�(Wydzia� wydzia�) {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Pracownikdziekanatu dodajPracownika() {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param pracownik
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Boolean usu�Pracownika(Pracownikdziekanatu pracownik) {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param pracownik
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Boolean edytujDanePracownika(Pracownikdziekanatu pracownik) {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param aplikacja
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Boolean edytujAplikacj�(Aplikacja aplikacja) {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param aplikacja
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Boolean usu�Aplikacj�(Aplikacja aplikacja) {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}
}