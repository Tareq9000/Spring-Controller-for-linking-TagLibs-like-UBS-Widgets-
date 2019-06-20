package tags;

import java.io.IOException;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.TagSupport;

public class Smiley extends TagSupport {
	
	public Smiley() {
		// TODO Auto-generated constructor stub
	}
	
	public int doStartTag() throws JspException {
		try {
			pageContext.getOut().print( "(/^o^)/" );
		}
		catch( IOException ioe ) {
			throw new JspTagException( "Error in Smiley" );
		} 
		return SKIP_BODY;
	}
}
