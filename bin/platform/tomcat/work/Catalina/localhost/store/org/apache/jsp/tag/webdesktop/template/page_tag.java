/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.55
 * Generated at: 2015-05-18 05:59:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.tag.webdesktop.template;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class page_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(33);
    _jspx_dependants.put("/WEB-INF/tags/desktop/template/javaScriptVariables.tag", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/template/implicit.tld", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/common/footer/footer.tag", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/shared/debug/implicit.tld", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/template/master.tag", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/shared/theme/implicit.tld", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/template/compressible/css.tag", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/shared/analytics/implicit.tld", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/template/cms/previewCSS.tag", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/template/cms/previewJS.tag", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/cart/implicit.tld", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/common/header/header.tag", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/common/tld/accelerator_granule.tld", Long.valueOf(1421901252000L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/nav/topNavigation.tag", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/common/header/implicit.tld", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/shared/debug/debugFooter.tag", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/nav/implicit.tld", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/template/styleSheets.tag", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/shared/analytics/googleAnalytics.tag", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/template/compressible/js.tag", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/shared/analytics/analytics.tag", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/template/compressible/implicit.tld", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/common/tld/htmlmeta.tld", Long.valueOf(1421901252000L));
    _jspx_dependants.put("/WEB-INF/tags/shared/analytics/jirafe.tag", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/common/header/addonScripts.tag", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/template/javaScriptAddOnsVariables.tag", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/cart/cartRestoration.tag", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/template/cms/implicit.tld", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/common/tld/cmstags.tld", Long.valueOf(1421901252000L));
    _jspx_dependants.put("/WEB-INF/common/tld/ycommercetags.tld", Long.valueOf(1421901252000L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/template/javaScript.tag", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/common/footer/implicit.tld", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/common/header/bottomHeader.tag", Long.valueOf(1421901254000L));
  }

  private javax.servlet.jsp.JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fvar_005fcode_005fnobody;

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
  private java.lang.String pageTitle;
  private javax.servlet.jsp.tagext.JspFragment pageCss;
  private javax.servlet.jsp.tagext.JspFragment pageScripts;
  private java.lang.String hideHeaderLinks;

  public java.lang.String getPageTitle() {
    return this.pageTitle;
  }

  public void setPageTitle(java.lang.String pageTitle) {
    this.pageTitle = pageTitle;
    jspContext.setAttribute("pageTitle", pageTitle);
  }

  public javax.servlet.jsp.tagext.JspFragment getPageCss() {
    return this.pageCss;
  }

  public void setPageCss(javax.servlet.jsp.tagext.JspFragment pageCss) {
    this.pageCss = pageCss;
    jspContext.setAttribute("pageCss", pageCss);
  }

  public javax.servlet.jsp.tagext.JspFragment getPageScripts() {
    return this.pageScripts;
  }

  public void setPageScripts(javax.servlet.jsp.tagext.JspFragment pageScripts) {
    this.pageScripts = pageScripts;
    jspContext.setAttribute("pageScripts", pageScripts);
  }

  public java.lang.String getHideHeaderLinks() {
    return this.hideHeaderLinks;
  }

  public void setHideHeaderLinks(java.lang.String hideHeaderLinks) {
    this.hideHeaderLinks = hideHeaderLinks;
    jspContext.setAttribute("hideHeaderLinks", hideHeaderLinks);
  }

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  private void _jspInit(javax.servlet.ServletConfig config) {
    _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fvar_005fcode_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(config.getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(config);
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fvar_005fcode_005fnobody.release();
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
    if( getPageTitle() != null ) 
      _jspx_page_context.setAttribute("pageTitle", getPageTitle());
    if( getPageCss() != null ) 
      _jspx_page_context.setAttribute("pageCss", getPageCss());
    if( getPageScripts() != null ) 
      _jspx_page_context.setAttribute("pageScripts", getPageScripts());
    if( getHideHeaderLinks() != null ) 
      _jspx_page_context.setAttribute("hideHeaderLinks", getHideHeaderLinks());

    try {
      if (_jspx_meth_template_005fmaster_005f0(_jspx_page_context))
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
      _jspDestroy();
    }
  }

  private boolean _jspx_meth_template_005fmaster_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  template:master
    org.apache.jsp.tag.webdesktop.template.master_tag _jspx_th_template_005fmaster_005f0 = (new org.apache.jsp.tag.webdesktop.template.master_tag());
    _jsp_instancemanager.newInstance(_jspx_th_template_005fmaster_005f0);
    _jspx_th_template_005fmaster_005f0.setJspContext(_jspx_page_context);
    _jspx_th_template_005fmaster_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/desktop/template/page.tag(13,0) name = pageTitle type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_template_005fmaster_005f0.setPageTitle((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageTitle}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null, false));
    javax.servlet.jsp.tagext.JspFragment _jspx_temp0 = new Helper( 0, _jspx_page_context, _jspx_th_template_005fmaster_005f0, null);
    // /WEB-INF/tags/desktop/template/page.tag(13,0) null
    _jspx_th_template_005fmaster_005f0.setPageCss(_jspx_temp0);
    javax.servlet.jsp.tagext.JspFragment _jspx_temp1 = new Helper( 1, _jspx_page_context, _jspx_th_template_005fmaster_005f0, null);
    // /WEB-INF/tags/desktop/template/page.tag(13,0) null
    _jspx_th_template_005fmaster_005f0.setPageScripts(_jspx_temp1);
    _jspx_th_template_005fmaster_005f0.setJspBody(new Helper( 2, _jspx_page_context, _jspx_th_template_005fmaster_005f0, null));
    _jspx_th_template_005fmaster_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_template_005fmaster_005f0);
    return false;
  }

  private boolean _jspx_meth_spring_005ftheme_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:theme
    org.springframework.web.servlet.tags.ThemeTag _jspx_th_spring_005ftheme_005f0 = (org.springframework.web.servlet.tags.ThemeTag) _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fvar_005fcode_005fnobody.get(org.springframework.web.servlet.tags.ThemeTag.class);
    _jspx_th_spring_005ftheme_005f0.setPageContext(_jspx_page_context);
    _jspx_th_spring_005ftheme_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    // /WEB-INF/tags/desktop/template/page.tag(26,3) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005ftheme_005f0.setCode("text.skipToContent");
    // /WEB-INF/tags/desktop/template/page.tag(26,3) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005ftheme_005f0.setVar("skipToContent");
    int[] _jspx_push_body_count_spring_005ftheme_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005ftheme_005f0 = _jspx_th_spring_005ftheme_005f0.doStartTag();
      if (_jspx_th_spring_005ftheme_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new javax.servlet.jsp.SkipPageException();
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005ftheme_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005ftheme_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005ftheme_005f0.doFinally();
      _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fvar_005fcode_005fnobody.reuse(_jspx_th_spring_005ftheme_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005ftheme_005f1(javax.servlet.jsp.tagext.JspTag _jspx_parent, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:theme
    org.springframework.web.servlet.tags.ThemeTag _jspx_th_spring_005ftheme_005f1 = (org.springframework.web.servlet.tags.ThemeTag) _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fvar_005fcode_005fnobody.get(org.springframework.web.servlet.tags.ThemeTag.class);
    _jspx_th_spring_005ftheme_005f1.setPageContext(_jspx_page_context);
    _jspx_th_spring_005ftheme_005f1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    // /WEB-INF/tags/desktop/template/page.tag(28,3) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005ftheme_005f1.setCode("text.skipToNavigation");
    // /WEB-INF/tags/desktop/template/page.tag(28,3) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005ftheme_005f1.setVar("skipToNavigation");
    int[] _jspx_push_body_count_spring_005ftheme_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005ftheme_005f1 = _jspx_th_spring_005ftheme_005f1.doStartTag();
      if (_jspx_th_spring_005ftheme_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new javax.servlet.jsp.SkipPageException();
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005ftheme_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005ftheme_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005ftheme_005f1.doFinally();
      _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fvar_005fcode_005fnobody.reuse(_jspx_th_spring_005ftheme_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_header_005fheader_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  header:header
    org.apache.jsp.tag.webdesktop.common.header.header_tag _jspx_th_header_005fheader_005f0 = (new org.apache.jsp.tag.webdesktop.common.header.header_tag());
    _jsp_instancemanager.newInstance(_jspx_th_header_005fheader_005f0);
    _jspx_th_header_005fheader_005f0.setJspContext(_jspx_page_context);
    _jspx_th_header_005fheader_005f0.setParent(_jspx_parent);
    // /WEB-INF/tags/desktop/template/page.tag(30,3) name = hideHeaderLinks type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_header_005fheader_005f0.setHideHeaderLinks((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hideHeaderLinks}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null, false));
    _jspx_th_header_005fheader_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_header_005fheader_005f0);
    return false;
  }

  private boolean _jspx_meth_nav_005ftopNavigation_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  nav:topNavigation
    org.apache.jsp.tag.webdesktop.nav.topNavigation_tag _jspx_th_nav_005ftopNavigation_005f0 = (new org.apache.jsp.tag.webdesktop.nav.topNavigation_tag());
    _jsp_instancemanager.newInstance(_jspx_th_nav_005ftopNavigation_005f0);
    _jspx_th_nav_005ftopNavigation_005f0.setJspContext(_jspx_page_context);
    _jspx_th_nav_005ftopNavigation_005f0.setParent(_jspx_parent);
    _jspx_th_nav_005ftopNavigation_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_nav_005ftopNavigation_005f0);
    return false;
  }

  private boolean _jspx_meth_header_005fbottomHeader_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  header:bottomHeader
    org.apache.jsp.tag.webdesktop.common.header.bottomHeader_tag _jspx_th_header_005fbottomHeader_005f0 = (new org.apache.jsp.tag.webdesktop.common.header.bottomHeader_tag());
    _jsp_instancemanager.newInstance(_jspx_th_header_005fbottomHeader_005f0);
    _jspx_th_header_005fbottomHeader_005f0.setJspContext(_jspx_page_context);
    _jspx_th_header_005fbottomHeader_005f0.setParent(_jspx_parent);
    _jspx_th_header_005fbottomHeader_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_header_005fbottomHeader_005f0);
    return false;
  }

  private boolean _jspx_meth_cart_005fcartRestoration_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  cart:cartRestoration
    org.apache.jsp.tag.webdesktop.cart.cartRestoration_tag _jspx_th_cart_005fcartRestoration_005f0 = (new org.apache.jsp.tag.webdesktop.cart.cartRestoration_tag());
    _jsp_instancemanager.newInstance(_jspx_th_cart_005fcartRestoration_005f0);
    _jspx_th_cart_005fcartRestoration_005f0.setJspContext(_jspx_page_context);
    _jspx_th_cart_005fcartRestoration_005f0.setParent(_jspx_parent);
    _jspx_th_cart_005fcartRestoration_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_cart_005fcartRestoration_005f0);
    return false;
  }

  private boolean _jspx_meth_footer_005ffooter_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  footer:footer
    org.apache.jsp.tag.webdesktop.common.footer.footer_tag _jspx_th_footer_005ffooter_005f0 = (new org.apache.jsp.tag.webdesktop.common.footer.footer_tag());
    _jsp_instancemanager.newInstance(_jspx_th_footer_005ffooter_005f0);
    _jspx_th_footer_005ffooter_005f0.setJspContext(_jspx_page_context);
    _jspx_th_footer_005ffooter_005f0.setParent(_jspx_parent);
    _jspx_th_footer_005ffooter_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_footer_005ffooter_005f0);
    return false;
  }

  private class Helper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public Helper( int discriminator, javax.servlet.jsp.JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( javax.servlet.jsp.JspWriter out ) 
      throws java.lang.Throwable
    {
      ((org.apache.jasper.runtime.JspContextWrapper) this.jspContext).syncBeforeInvoke();
      _jspx_sout = null;
      if (getPageCss() != null) {
        getPageCss().invoke(_jspx_sout);
      }
      return false;
    }
    public boolean invoke1( javax.servlet.jsp.JspWriter out ) 
      throws java.lang.Throwable
    {
      ((org.apache.jasper.runtime.JspContextWrapper) this.jspContext).syncBeforeInvoke();
      _jspx_sout = null;
      if (getPageScripts() != null) {
        getPageScripts().invoke(_jspx_sout);
      }
      return false;
    }
    public boolean invoke2( javax.servlet.jsp.JspWriter out ) 
      throws java.lang.Throwable
    {
      out.write("<div id=\"page\" data-currency-iso-code=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${currentCurrency.isocode}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null, false));
      out.write("\">\n");
      out.write("\t\t\t");
      if (_jspx_meth_spring_005ftheme_005f0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("<a href=\"#skip-to-content\" class=\"skiptocontent\" data-role=\"none\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${skipToContent}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null, false));
      out.write("</a>\n");
      out.write("\t\t\t");
      if (_jspx_meth_spring_005ftheme_005f1(_jspx_parent, _jspx_page_context))
        return true;
      out.write("<a href=\"#skiptonavigation\" class=\"skiptonavigation\" data-role=\"none\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${skipToNavigation}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null, false));
      out.write("</a>\n");
      out.write("\t\t\t");
      if (_jspx_meth_header_005fheader_005f0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("<a id=\"skiptonavigation\"></a>\n");
      out.write("\t\t\t");
      if (_jspx_meth_nav_005ftopNavigation_005f0(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_header_005fbottomHeader_005f0(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_cart_005fcartRestoration_005f0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("<div id=\"content\" class=\"clearfix\">\n");
      out.write("\t\t\t<a id=\"skip-to-content\"></a>\n");
      out.write("\t\t\t\t");
      ((org.apache.jasper.runtime.JspContextWrapper) this.jspContext).syncBeforeInvoke();
      _jspx_sout = null;
      if (getJspBody() != null)
        getJspBody().invoke(_jspx_sout);
      jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,getJspContext());
      out.write("</div>\n");
      out.write("\t\t\t");
      if (_jspx_meth_footer_005ffooter_005f0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("</div>\n");
      out.write("\n");
      out.write("\t");
      return false;
    }
    public void invoke( java.io.Writer writer )
      throws javax.servlet.jsp.JspException
    {
      javax.servlet.jsp.JspWriter out = null;
      if( writer != null ) {
        out = this.jspContext.pushBody(writer);
      } else {
        out = this.jspContext.getOut();
      }
      try {
        Object _jspx_saved_JspContext = this.jspContext.getELContext().getContext(javax.servlet.jsp.JspContext.class);
        this.jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,this.jspContext);
        switch( this.discriminator ) {
          case 0:
            invoke0( out );
            break;
          case 1:
            invoke1( out );
            break;
          case 2:
            invoke2( out );
            break;
        }
        jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,_jspx_saved_JspContext);
      }
      catch( java.lang.Throwable e ) {
        if (e instanceof javax.servlet.jsp.SkipPageException)
            throw (javax.servlet.jsp.SkipPageException) e;
        throw new javax.servlet.jsp.JspException( e );
      }
      finally {
        if( writer != null ) {
          this.jspContext.popBody();
        }
      }
    }
  }
}
