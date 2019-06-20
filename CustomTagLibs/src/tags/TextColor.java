package tags;

import java.io.IOException;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.TagSupport;

public class TextColor extends TagSupport {
	
	private String color;
	private String backgroundColor;
	
	public TextColor() {
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public String getBackgroundColor() {
		return backgroundColor;
	}
	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
	}
	
	
	public int doStartTag() throws JspException {
		try {
			pageContext.getOut().print( "<div class=\"color\" style=\" color:"+ color +"; background-color:"+ backgroundColor +"; display: inline-block;\" >" );
		}
		catch( IOException ioe ) {
			throw new JspTagException( "Error in Color" );
		} 
		return EVAL_BODY_INCLUDE;
	}

	public int doAfterBody() throws JspException{
		try {
			pageContext.getOut().print( "</div>" );
		}
		catch( IOException ioe ) {
			throw new JspTagException( "Error in Color" );
		} 
	
		return SKIP_BODY;
	}

	
}
