/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.55
 * Generated at: 2015-05-18 05:59:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.tag.webshared.analytics;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class analytics_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/tags/shared/analytics/googleAnalytics.tag", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/shared/analytics/implicit.tld", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/shared/analytics/jirafe.tag", Long.valueOf(1421901254000L));
  }

  private javax.servlet.jsp.JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public void setJspContext(javax.servlet.jsp.JspContext ctx) {
    super.setJspContext(ctx);
    java.util.ArrayList _jspx_nested = null;
    java.util.ArrayList _jspx_at_begin = null;
    java.util.ArrayList _jspx_at_end = null;
    this.jspContext = new org.apache.jasper.runtime.JspContextWrapper(ctx, _jspx_nested, _jspx_at_begin, _jspx_at_end, null);
  }

  public javax.servlet.jsp.JspContext getJspContext() {
    return this.jspContext;
  }

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  private void _jspInit(javax.servlet.ServletConfig config) {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(config.getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(config);
  }

  public void _jspDestroy() {
  }

  public void doTag() throws javax.servlet.jsp.JspException, java.io.IOException {
    javax.servlet.jsp.PageContext _jspx_page_context = (javax.servlet.jsp.PageContext)jspContext;
    javax.servlet.http.HttpServletRequest request = (javax.servlet.http.HttpServletRequest) _jspx_page_context.getRequest();
    javax.servlet.http.HttpServletResponse response = (javax.servlet.http.HttpServletResponse) _jspx_page_context.getResponse();
    javax.servlet.http.HttpSession session = _jspx_page_context.getSession();
    javax.servlet.ServletContext application = _jspx_page_context.getServletContext();
    javax.servlet.ServletConfig config = _jspx_page_context.getServletConfig();
    javax.servlet.jsp.JspWriter out = jspContext.getOut();
    _jspInit(config);
    jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,jspContext);

    try {
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sharedResourcePath}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null, false));
      out.write("/js/analyticsmediator.js\"></script>\r\n");
      if (_jspx_meth_analytics_005fgoogleAnalytics_005f0(_jspx_page_context))
        return;
      if (_jspx_meth_analytics_005fjirafe_005f0(_jspx_page_context))
        return;
    } catch( java.lang.Throwable t ) {
      if( t instanceof javax.servlet.jsp.SkipPageException )
          throw (javax.servlet.jsp.SkipPageException) t;
      if( t instanceof java.io.IOException )
          throw (java.io.IOException) t;
      if( t instanceof java.lang.IllegalStateException )
          throw (java.lang.IllegalStateException) t;
      if( t instanceof javax.servlet.jsp.JspException )
          throw (javax.servlet.jsp.JspException) t;
      throw new javax.servlet.jsp.JspException(t);
    } finally {
      jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,super.getJspContext());
      ((org.apache.jasper.runtime.JspContextWrapper) jspContext).syncEndTagFile();
    }
  }

  private boolean _jspx_meth_analytics_005fgoogleAnalytics_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  analytics:googleAnalytics
    org.apache.jsp.tag.webshared.analytics.googleAnalytics_tag _jspx_th_analytics_005fgoogleAnalytics_005f0 = (new org.apache.jsp.tag.webshared.analytics.googleAnalytics_tag());
    _jsp_instancemanager.newInstance(_jspx_th_analytics_005fgoogleAnalytics_005f0);
    _jspx_th_analytics_005fgoogleAnalytics_005f0.setJspContext(_jspx_page_context);
    _jspx_th_analytics_005fgoogleAnalytics_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    _jspx_th_analytics_005fgoogleAnalytics_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_analytics_005fgoogleAnalytics_005f0);
    return false;
  }

  private boolean _jspx_meth_analytics_005fjirafe_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  analytics:jirafe
    org.apache.jsp.tag.webshared.analytics.jirafe_tag _jspx_th_analytics_005fjirafe_005f0 = (new org.apache.jsp.tag.webshared.analytics.jirafe_tag());
    _jsp_instancemanager.newInstance(_jspx_th_analytics_005fjirafe_005f0);
    _jspx_th_analytics_005fjirafe_005f0.setJspContext(_jspx_page_context);
    _jspx_th_analytics_005fjirafe_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    _jspx_th_analytics_005fjirafe_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_analytics_005fjirafe_005f0);
    return false;
  }
}