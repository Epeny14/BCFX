import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;


public class VeilleController implements Initializable{
	@FXML
	private TreeView<String> treeView;
	
	
	
	
	@Override
	public void initialize(URL url1, ResourceBundle rb) {
		
		
		
		 
		
		
		
		TreeItem<String> root = new TreeItem<>("Root Node");
		
		TreeItem<String> node1 = new TreeItem<>("Marchés Financiers et Infrastructures");
		root.getChildren().add(node1);
		node1.getChildren().add(new TreeItem<>("DICI / PRIIPS"));
		node1.getChildren().add(new TreeItem<>("Produits dérivés : EMIR"));
		node1.getChildren().add(new TreeItem<>("MIFID 2"));
		node1.getChildren().add(new TreeItem<>("AIFM"));
		node1.getChildren().add(new TreeItem<>("Loi de séparation des activités bancaires"));
		
		TreeItem<String> node2 = new TreeItem<>("Marchés Assurances");
		root.getChildren().add(node2);
		
		node2.getChildren().add(new TreeItem<>("DDA"));
		
		TreeItem<String> node3 = new TreeItem<>("Marchés BDDF : Paiement et Cash Management");
		
		root.getChildren().add(node3);
		node3.getChildren().add(new TreeItem<>("SEPA"));
		node3.getChildren().add(new TreeItem<>("Instant Payment"));
		node3.getChildren().add(new TreeItem<>("Cryptomonnaies"));
		node3.getChildren().add(new TreeItem<>("PSD 2"));
		
		TreeItem<String> node4 = new TreeItem<>("Reporting aux autorités");
		
		root.getChildren().add(node4);
		
		node4.getChildren().add(new TreeItem<>("COREP"));
		node4.getChildren().add(new TreeItem<>("FINREP"));
		node4.getChildren().add(new TreeItem<>("SURFI"));
		node4.getChildren().add(new TreeItem<>("CRS & FATCA"));
		node4.getChildren().add(new TreeItem<>("IFU 1 DEFE"));
		
		TreeItem<String> node5 = new TreeItem<>("Risques");
		
		root.getChildren().add(node5);
		
		node5.getChildren().add(new TreeItem<>("Assurances : Solvency"));
		node5.getChildren().add(new TreeItem<>("Banque BALE"));
		node5.getChildren().add(new TreeItem<>("Risque de contrepartie marché dérivés EMIR"));
		node5.getChildren().add(new TreeItem<>("Cartographie des risques"));
		
		TreeItem<String>node6 = new TreeItem<>("Fiscalité");
		
		root.getChildren().add(node6);
		
		node6.getChildren().add(new TreeItem<>("FATCA"));
		node6.getChildren().add(new TreeItem<>("Loi des fiances"));
		
		TreeItem<String>node7 = new TreeItem<>("Consolidation comptable");
		
		root.getChildren().add(node7);
		
		node7.getChildren().add(new TreeItem<>("IFRS 39"));
		node7.getChildren().add(new TreeItem<>("IFRS 13"));
		node7.getChildren().add(new TreeItem<>("IFRS 9"));
		node7.getChildren().add(new TreeItem<>("IFRS 17"));
		node7.getChildren().add(new TreeItem<>("IFRS 7"));
		
		TreeItem<String>node8 = new TreeItem<>("Sécurité Financière");
		
		root.getChildren().add(node8);
		
		node8.getChildren().add(new TreeItem<>("Directive LCB FT"));
		node8.getChildren().add(new TreeItem<>("Loi Sapin"));
		node8.getChildren().add(new TreeItem<>("OFAC"));
		
		TreeItem<String>node9 = new TreeItem<>("KYC");
		
		root.getChildren().add(node9);
		
		node9.getChildren().add(new TreeItem<>("FATCA/QI/Regime 871m"));
		node9.getChildren().add(new TreeItem<>("AML/LCB-FT"));
		
		TreeItem<String>node10 = new TreeItem<>("Gestion des données");
		
		root.getChildren().add(node10);
		
		node10.getChildren().add(new TreeItem<>("RGPD"));
		node10.getChildren().add(new TreeItem<>("Big Data"));
		
		TreeItem<String>node11 = new TreeItem<>("OHADA : Droit Africain des affaires ");
		
		root.getChildren().add(node11);
		
		node11.getChildren().add(new TreeItem<>("Droit des sociétés et au statut juridique des commerçants"));
		node11.getChildren().add(new TreeItem<>("Recouvrement des créances"));
		node11.getChildren().add(new TreeItem<>("Sureté et aux voies d'exécution"));
		node11.getChildren().add(new TreeItem<>("Régime du redressement des entreprises et de la liquidation judiciare"));
		node11.getChildren().add(new TreeItem<>("Droit de l'arbitrage"));
		node11.getChildren().add(new TreeItem<>("Droit du travail"));
		node11.getChildren().add(new TreeItem<>("Droit comptable"));
		node11.getChildren().add(new TreeItem<>("Droit de la vente et des transports"));
		
		
		
		
		
	
		
		treeView.setShowRoot(false);
		
		treeView.setRoot(root);
		
	}
	

}
