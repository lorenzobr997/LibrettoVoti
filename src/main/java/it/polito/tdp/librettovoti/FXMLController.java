package it.polito.tdp.librettovoti;

import java.net.URL;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ResourceBundle;

import it.polito.tdp.librettovoti.model.Libretto;
import it.polito.tdp.librettovoti.model.Voto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {

	private Libretto model; 
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtVoto;

    //@FXML
    //private TextField txtData;
    
    @FXML
    private DatePicker dataPicker;

    @FXML
    private TextArea txtResult;

    @FXML
    void handleInserisci(ActionEvent event) {
    	//Leggi e controlla
    	String nomeE = txtNome.getText();
    	if(nomeE.length() == 0) {
    		txtResult.setText("ERRORE: nome esame vuoto");
    		return;
    	}
    	
    	String votoE = txtVoto.getText();
    	int votoInt = 0;
    	try{
    		votoInt = Integer.parseInt(votoE);
    	}catch(NumberFormatException ex){
    		txtResult.setText("ERRORE: Formato voto incorretto");
    		return;
    	}
    	if(votoInt < 18 || votoInt > 31) {
    		txtResult.setText("ERRORE: Il voto deve essere compreso tra 18 e 31");
    		return;
    	}
    	
    	/*String datatE = txtData.getText();
    	LocalDate data;
    	try{
    		data = LocalDate.parse(datatE);
    	} catch(DateTimeParseException e) {
    		txtResult.setText("ERRORE: Formato data incorretto");
    		return;
    	}*/
    	
    	LocalDate data = dataPicker.getValue();
    		if(data == null) {
    			txtResult.setText("ERRORE: Data mancante");
        		return;
    		}
    	
    	//TODO: verifica dati
    	
    	//Esegui
    	Voto voto = new Voto(nomeE, votoInt,data);
    	model.add(voto);
    	
    	//Aggiorna
    	txtResult.setText(model.toString());
    	txtNome.clear();
    	txtVoto.clear();
    	//txtData.clear();
    	dataPicker.setValue(null) ;

    }
    
    public void setModel(Libretto model) {
    	this.model = model;
    }

    @FXML
    void initialize() {
        assert txtNome != null : "fx:id=\"txtNome\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtVoto != null : "fx:id=\"txtVoto\" was not injected: check your FXML file 'Scene.fxml'.";
        //assert txtData != null : "fx:id=\"txtData\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert dataPicker != null : "fx:id=\"dataPicker\" was not injected: check your FXML file 'Scene.fxml'.";
        
    }
}
