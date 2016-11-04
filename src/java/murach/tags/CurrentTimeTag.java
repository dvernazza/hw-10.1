/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package murach.tags;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author Dominic
 */
public class CurrentTimeTag extends TagSupport {

 @Override
  public int doStartTag() throws JspException {
    Date currentTime = new Date();
    DateFormat shortDate = DateFormat.getTimeInstance(DateFormat.LONG);
    String currentDateFormatted = shortDate.format(currentTime);

    try {
      JspWriter out = pageContext.getOut();
      out.print(currentDateFormatted);
    } catch (IOException ioe) {
      System.out.println(ioe);
    }
    return SKIP_BODY;
  }
}