
/**
 * 
 */

import java.util.Set;
import java.util.GregorianCalendar;
import java.util.Scanner;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Jaroslaw
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Rekrutacja {
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
		if(lista_kierunkow == null)
			lista_kierunkow = new Lista_kierunk�w();
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
	private Set<Tura_rekrutacji> tura_rekrutacji;

	/** 
	* @return the tura_rekrutacji
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Set<Tura_rekrutacji> getTura_rekrutacji() {
		// begin-user-code
		return tura_rekrutacji;
		// end-user-code
	}

	/** 
	* @param tura_rekrutacji the tura_rekrutacji to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setTura_rekrutacji(Set<Tura_rekrutacji> tura_rekrutacji) {
		// begin-user-code
		this.tura_rekrutacji = tura_rekrutacji;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <p>Typ atrybutu Date wybrany z powodu braku mo�liwo�ci wyszukania w obecnej instalacji RSAD typu GregorianCalendar.</p>
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private GregorianCalendar data_rozpocz�cia;

	/** 
	* @return the data_rozpocz�cia
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public GregorianCalendar getData_rozpocz�cia() {
		// begin-user-code
		return data_rozpocz�cia;
		// end-user-code
	}

	/** 
	* @param data_rozpocz�cia the data_rozpocz�cia to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setData_rozpocz�cia(GregorianCalendar data_rozpocz�cia) {
		// begin-user-code
		this.data_rozpocz�cia = data_rozpocz�cia;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <p>Typ atrybutu Date wybrany z powodu braku mo�liwo�ci wyszukania w obecnej instalacji RSAD typu GregorianCalendar.</p>
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private GregorianCalendar data_zako�czenia;

	/** 
	* @return the data_zako�czenia
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public GregorianCalendar getData_zako�czenia() {
		// begin-user-code
		return data_zako�czenia;
		// end-user-code
	}

	/** 
	* @param data_zako�czenia the data_zako�czenia to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setData_zako�czenia(GregorianCalendar data_zako�czenia) {
		// begin-user-code
		this.data_zako�czenia = data_zako�czenia;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param data_rozpoczecia
	* @param data_zakonczenia
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Tura_rekrutacji uruchomRekrutacj�(GregorianCalendar data_rozpoczecia, GregorianCalendar data_zakonczenia) {
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
	public Boolean edytujListeKierunkow(String nazwa_kierunek) {
		// begin-user-code
		int input = 0;
			System.out.println("Prosz� wpisa� poprawny tryb edycji danych o kierunku.\n1 - Edycja limitu.\n2- Edycja opisu."
					+ "\n3 - Edycja opisu kierunku i limitu.");
			
			while(true)
			{
				if (myInput.hasNextInt()) 
				{
					input = myInput.nextInt();
					System.out.println("Wpisano:" + input);
					if(input >= 1 && input <= 3)
					{
						break;
					}
					else
						myInput.nextLine();
						System.out.println("Wybrano nieistniej�c� opcj�. Prosz� wpisa� ponownie.\n");
				} 
				else if (myInput.hasNext()) 
				{
			  
					System.out.println("Prosz� wpisa� poprawn� liczb�.\n");
					myInput.nextLine();
		    
				} 
				else 
				{
			  
					System.err.println("No more input. Terminating...");
					return false;
		    
				}
			}
		
		
		this.lista_kierunkow.edytujKierunek(nazwa_kierunek, input);
		return true;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param tura_do_usuniecia
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Boolean zakonczTure(Tura_rekrutacji tura_do_usuniecia) {
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
	public Tura_rekrutacji utworzTure() {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void zwr��DaneRekrutacji() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}
}