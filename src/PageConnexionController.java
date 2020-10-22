import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class PageConnexionController implements Initializable{
	
	public Base b = new Base();
	public Connection conn;
	
	//Objet PreparedStatement
    PreparedStatement statement = null;
    //Objet ResultSet
    ResultSet resultat = null;
	PreparedStatement statement2 = null;
	
	ResultSet resultat2 = null;
	
	private TextField email = new TextField();
	private PasswordField pwd;
	
 
	
	public void handle(ActionEvent event) {
		
			System.out.println("okwsh");		
			//String login = email.getText();
	        //String password = pwd.getText();
	        
	        System.out.println(email.getText());
	        System.out.println(pwd.getText());
	        
//			try {
//				conn = b.ConnexionBD();
//			} catch (ClassNotFoundException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			} catch (SQLException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//			
//	 
//			//Manipulation
//			try {
//				//Création de la requête
//				statement = conn.prepareStatement("SELECT \"MDP\" FROM public.client WHERE mail ='"+login+"'");
//				statement2 = conn.prepareStatement("SELECT \"typeCompte\" FROM public.client WHERE mail ='"+login+"'");
//				resultat = statement.executeQuery();
//				
//				
//				resultat2 = statement2.executeQuery();
//				
//				
//				if(resultat.next()){
//					
//					String motDePasse = resultat.getString(1);
//					motDePasse = motDePasse.replaceAll(" ","");
//					
//					
//					
//					if(motDePasse.equals(password)){
//						
//						if (resultat2.next()) {
//							
//							String typeCompte = resultat2.getString(1);
//							typeCompte = typeCompte.replaceAll(" ", "");
//							
//							
//						
//						if(typeCompte.equals("Premium")) {
//							
//							
//							System.out.println("OK pour moi");
//								
//							
//						}
//						else if(typeCompte.equals("Intermédiaire")) {
//							
//						}
//						else {
//							
//						}
//		
//					}
//					}
//					else {
//						System.out.println("Mot de passe incorrect !");
//					}
//				}
//				else {
//					System.out.println("Login incorrect ! ");
//				}
//	 
//				//Récupération de la requête dans une variable
//				resultat = statement.executeQuery();
//	 
//				conn.close();
//				
//				
//			}
//			catch (SQLException e) {
//				System.out.println(e.getMessage()+"Marche pas !!!");
//				
//			}
		}



	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
		
    }


