import java.util.Scanner;
import java.util.Set;


public class Main 
{
	static Scanner myInput = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		Rekrutacja rekr_class = new Rekrutacja();
		
		
			
				int input = 0;
				Administrator adm_temp = new Administrator();
				
				adm_temp.dodajKierunek(rekr_class, "nazwa1", 1);
				adm_temp.dodajKierunek(rekr_class, "nazwa2", 2);
				adm_temp.dodajKierunek(rekr_class, "nazwa3", 3);
				
				while(true) 
				{
				
					
					
					Lista_kierunk�w lista = new Lista_kierunk�w();
					
					lista = rekr_class.getLista_kierunkow();
					
					Set<Kierunek> kierunek_set = lista.getKierunek();
					
					Kierunek kierunek = new Kierunek();
					System.out.println("Obecnie zawarte w rekrutacji Kierunki:");
					
					for (Kierunek one : kierunek_set) {
						System.out.println(one.getNazwa_kierunku() + " " + one.getLimit_zakwalifikowanych());
					  } 
					
					System.out.println("\nSymulacja dzia�ania przypadku u�yca UC29 - Edycja danej tury rekrutacyjnej.\n"
							+ "Prosz� wpisa� liczb�:\n1 - Edytuj wybrany kierunek.\n2 - Dodaj kierunek\n3 - Usu� wyb"
							+ "rany kierunek.\n4 - Wyjdz z programu.");
				
					if (myInput.hasNextInt()) 
					{
						input = myInput.nextInt();
						System.out.println("Wpisano: " + input);
						
						if(input == 1)
						{
							
							String nazwa_kierunku = "";
							
							System.out.println("Wpisz nazw� kierunku.");
							myInput.nextLine();
							nazwa_kierunku = myInput.nextLine();
							
							adm_temp.edytujKierunek(rekr_class, nazwa_kierunku);
							
						}
						else if (input == 2)
						{
							
							String nazwa_kierunku = "";
							Integer limit = 0;
							
							System.out.println("Wpisz nazw� kierunku.");
							myInput.nextLine();
							nazwa_kierunku = myInput.nextLine();
							System.out.println("Wpisz limit kierunkowy.");
							limit = myInput.nextInt();
							
							adm_temp.dodajKierunek(rekr_class, nazwa_kierunku, limit);
						}
						else if (input == 3)
						{
							
							String nazwa_kierunku = "";
							
							System.out.println("Wpisz nazw� kierunku.");
							myInput.nextLine();
							nazwa_kierunku = myInput.nextLine();
							
							adm_temp.usu�Kierunek(rekr_class, nazwa_kierunku);
						}
						else if (input == 4)
						{
							System.err.println("Ko�czenie dzia�ania programu. Terminating...");
							System.exit(1);
						}
						else 
						{
							myInput.nextLine();
							System.out.println("Wybrano nieistniej�c� opcj�. Prosz� wpisa� ponownie.");
						}
					} 
					else if (myInput.hasNext()) 
					{
				  
						System.out.println("Prosz� wpisa� poprawn� liczb�.\n");
						myInput.next();
			    
					} 
					else 
					{
				  
						System.err.println("No more input. Terminating...");
						myInput.close();
						System.exit(1);
			    
				}
			}
			
		}
}
