import java.util.Scanner;

/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Jaroslaw
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Kierunek {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Lista_kierunk�w lista_kierunkow;
	static Scanner myInput = new Scanner(System.in);
	/** 
	* @return the lista_kierunkow
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Lista_kierunk�w getLista_kierunkow() {
		// begin-user-code
		return lista_kierunkow;
		// end-user-code
	}

	/** 
	* @param lista_kierunkow the lista_kierunkow to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setLista_kierunkow(Lista_kierunk�w lista_kierunkow) {
		// begin-user-code
		this.lista_kierunkow = lista_kierunkow;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Wymagania_kierunkowe[] wymagania = null;

	/** 
	* @return the wymagania
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Wymagania_kierunkowe[] getWymagania() {
		// begin-user-code
		return wymagania;
		// end-user-code
	}

	/** 
	* @param wymagania the wymagania to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setWymagania(Wymagania_kierunkowe[] wymagania) {
		// begin-user-code
		this.wymagania = wymagania;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private String nazwa_kierunku;

	/** 
	* @return the nazwa_kierunku
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public String getNazwa_kierunku() {
		// begin-user-code
		return nazwa_kierunku;
		// end-user-code
	}

	/** 
	* @param nazwa_kierunku the nazwa_kierunku to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setNazwa_kierunku(String nazwa_kierunku) {
		// begin-user-code
		this.nazwa_kierunku = nazwa_kierunku;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Integer limit_zakwalifikowanych;

	/** 
	* @return the limit_zakwalifikowanych
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Integer getLimit_zakwalifikowanych() {
		// begin-user-code
		return limit_zakwalifikowanych;
		// end-user-code
	}

	/** 
	* @param limit_zakwalifikowanych the limit_zakwalifikowanych to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setLimit_zakwalifikowanych(Integer limit_zakwalifikowanych) {
		// begin-user-code
		this.limit_zakwalifikowanych = limit_zakwalifikowanych;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void edytujOpis() {
		// begin-user-code
		// TODO Auto-generated method stub
		
		System.out.println("Edycja opisu.");
		
		System.out.println("Wpisz now� nazw� kierunku.");
		String nazwa = "";
		if(myInput.hasNextLine())
			nazwa = myInput.nextLine();
		
		this.setNazwa_kierunku(nazwa);
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void edytujLimit() {
		// begin-user-code
		
		System.out.println("Edycja limitu.");

		System.out.println("Wpisz nowy limit kierunku.");
		Integer limit = 0;
		if(myInput.hasNextInt())
			limit = myInput.nextInt();
		
		this.setLimit_zakwalifikowanych(limit);
		// end-user-code
	}
}