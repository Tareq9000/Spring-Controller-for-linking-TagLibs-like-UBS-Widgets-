package tags;

import java.io.IOException;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.TagSupport;

public class FehlerMeldung extends TagSupport {
	
	public FehlerMeldung() {
		// TODO Auto-generated constructor stub
	}
	
	public int doStartTag() throws JspException {
		try {
			pageContext.getOut().print( "Sie haben einen schwerwiegenden Fehler gemacht. Bitte begeben Sie sich umgehenst zum nächstgelegenen Knast. Wir Danken Ihnen für Ihr Verständniss!" );
		}
		catch( IOException ioe ) {
			throw new JspTagException( "Error in Fehler Meldung" );
		} 
		return SKIP_BODY;
	}

}
