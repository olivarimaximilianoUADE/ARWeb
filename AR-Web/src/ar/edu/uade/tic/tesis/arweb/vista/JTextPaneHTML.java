package ar.edu.uade.tic.tesis.arweb.vista;

import java.awt.Color;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

public class JTextPaneHTML extends JTextPane {

	private static final long serialVersionUID = 1L;

	public void agregarTexto(Color color, String texto) {
		StyleContext styleContext = StyleContext.getDefaultStyleContext();
		AttributeSet attributeSet = styleContext.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Foreground, color);
		Integer longitudDocumento = getDocument().getLength(); 
		this.setCaretPosition(longitudDocumento); 
		this.setCharacterAttributes(attributeSet, false);
		this.replaceSelection(texto); 
	}   

	public void agregarImagen(URL url) {
		this.insertIcon(new ImageIcon(url));
	}

}