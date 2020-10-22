import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
// connection a la base de données avec postpresql sur windows 
	class Base {

//Variable pour la connexion	
		public Connection conn;

		public Connection ConnexionBD() throws SQLException, ClassNotFoundException
		{
			//CTRL + SHIFT + O pour générer les imports
			    
			    
			      Class.forName("org.postgresql.Driver");
			      System.out.println("Driver O.K.");

			      String url = "jdbc:postgresql://localhost:5432/BeComplianceDataBase";
			      String user = "postgres";
			      String passwd = "0000";

			      Connection conn = DriverManager.getConnection(url, user, passwd);
			      System.out.println("Connexion effective !");  
			      return conn;
			         
		}
		

		public Connection getConnect()
		{
			return conn;
		}

		public void DeconnexionBD()
		{
			try {
				conn.close();
			}
			catch(Exception ex) {
				System.out.print("Déconnexion impossible");
			}
		}
	}
