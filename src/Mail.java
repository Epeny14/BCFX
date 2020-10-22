import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;


public class Mail{
	
	private String user;
	private String password;
	private String to;
	private String objet;
	private String texte;
	
	
	

	public Mail(String user,String password,String to,String objet,String texte){
		 
		  
		  this.user=user;
		  this.password=password;
		  this.to=to;
		  this.objet=objet;
		  this.texte=texte;
		
		
		  String host="smtp.gmail.com";
		 // final String user="sebou.sabri@gmail.com";//change accordingly
		 // final String password="11681168";//change accordingly
		  
		 // String to="yvon.gatsono@valauris-consulting.fr";//change accordingly
		  //Get the session object
		  
		  
		  
		   Properties props = new Properties();
		   props.put("mail.smtp.host",host);
		   props.put("mail.smtp.auth", "true");
		   props.put("mail.smtp.port", 587);
		   props.put("mail.smtp.auth", true);
		   props.put("mail.smtp.socketFactory.port", 465);
		   props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		   props.put("mail.smtp.socketFactory.fallback", "false");
		   props.put("mail.smtp.starttls.enable", "true");
		   Session session = Session.getDefaultInstance(props,
		   new javax.mail.Authenticator() {
		      protected PasswordAuthentication getPasswordAuthentication() {
			return new PasswordAuthentication(user,password);
		      }
		    });
		    //Compose the message
		    try {
		     MimeMessage message = new MimeMessage(session);
		     message.setFrom(new InternetAddress(user));
		     message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
		     message.setSubject(objet);
		     message.setText(texte);
		     //send the message
		     Transport.send(message);

		     System.out.println("message sent successfully...");
		 
		     } catch (MessagingException e) {e.printStackTrace();}
		 }
		 
		 
		 
		
	
	
	
	public String getObjet() {
		return objet;
	}







	public void setObjet(String objet) {
		this.objet = objet;
	}







	public String getTexte() {
		return texte;
	}







	public void setTexte(String texte) {
		this.texte = texte;
	}







	public String getUser() {
		return user;
	}







	public void setUser(String user) {
		this.user = user;
	}







	public String getPassword() {
		return password;
	}







	public void setPassword(String password) {
		this.password = password;
	}







	public String getTo() {
		return to;
	}







	public void setTo(String to) {
		this.to = to;
	}







	public static void main(String[] args) {
		
		new Mail("sebou.sabri@gmail.com","11681168","sebousabri@eisti.eu","Hello","Word");
		
	}
	
	
}