/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.55
 * Generated at: 2015-05-18 06:21:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.tag.webdesktop.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(8);
    _jspx_dependants.put("/WEB-INF/tags/desktop/template/implicit.tld", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/formElement/implicit.tld", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/common/tld/ycommercetags.tld", Long.valueOf(1421901252000L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/formElement/formPasswordBox.tag", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/shared/theme/implicit.tld", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/formElement/formInputBox.tag", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/formElement/formSelectBox.tag", Long.valueOf(1421901254000L));
    _jspx_dependants.put("/WEB-INF/tags/desktop/template/errorSpanField.tag", Long.valueOf(1421901254000L));
  }

  private javax.servlet.jsp.JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName_005faction;

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
  private java.lang.String actionNameKey;
  private java.lang.String action;

  public java.lang.String getActionNameKey() {
    return this.actionNameKey;
  }

  public void setActionNameKey(java.lang.String actionNameKey) {
    this.actionNameKey = actionNameKey;
    jspContext.setAttribute("actionNameKey", actionNameKey);
  }

  public java.lang.String getAction() {
    return this.action;
  }

  public void setAction(java.lang.String action) {
    this.action = action;
    jspContext.setAttribute("action", action);
  }

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  private void _jspInit(javax.servlet.ServletConfig config) {
    _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(config.getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(config);
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName_005faction.release();
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
    if( getActionNameKey() != null ) 
      _jspx_page_context.setAttribute("actionNameKey", getActionNameKey());
    if( getAction() != null ) 
      _jspx_page_context.setAttribute("action", getAction());

    try {
      out.write("<div class=\"userRegister\">\n");
      out.write("\t<div class=\"headline\">");
      if (_jspx_meth_spring_005ftheme_005f0(_jspx_page_context))
        return;
      out.write("</div>\n");
      out.write("\t<div class=\"required right\">");
      if (_jspx_meth_spring_005ftheme_005f1(_jspx_page_context))
        return;
      out.write("</div>\n");
      out.write("\t<div class=\"description\">");
      if (_jspx_meth_spring_005ftheme_005f2(_jspx_page_context))
        return;
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t");
      if (_jspx_meth_form_005fform_005f0(_jspx_page_context))
        return;
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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

  private boolean _jspx_meth_spring_005ftheme_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:theme
    org.springframework.web.servlet.tags.ThemeTag _jspx_th_spring_005ftheme_005f0 = (org.springframework.web.servlet.tags.ThemeTag) _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody.get(org.springframework.web.servlet.tags.ThemeTag.class);
    _jspx_th_spring_005ftheme_005f0.setPageContext(_jspx_page_context);
    _jspx_th_spring_005ftheme_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/desktop/user/register.tag(12,23) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005ftheme_005f0.setCode("register.new.customer");
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
      _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody.reuse(_jspx_th_spring_005ftheme_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005ftheme_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:theme
    org.springframework.web.servlet.tags.ThemeTag _jspx_th_spring_005ftheme_005f1 = (org.springframework.web.servlet.tags.ThemeTag) _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody.get(org.springframework.web.servlet.tags.ThemeTag.class);
    _jspx_th_spring_005ftheme_005f1.setPageContext(_jspx_page_context);
    _jspx_th_spring_005ftheme_005f1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/desktop/user/register.tag(13,29) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005ftheme_005f1.setCode("form.required");
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
      _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody.reuse(_jspx_th_spring_005ftheme_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005ftheme_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:theme
    org.springframework.web.servlet.tags.ThemeTag _jspx_th_spring_005ftheme_005f2 = (org.springframework.web.servlet.tags.ThemeTag) _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody.get(org.springframework.web.servlet.tags.ThemeTag.class);
    _jspx_th_spring_005ftheme_005f2.setPageContext(_jspx_page_context);
    _jspx_th_spring_005ftheme_005f2.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/desktop/user/register.tag(14,26) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005ftheme_005f2.setCode("register.description");
    int[] _jspx_push_body_count_spring_005ftheme_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005ftheme_005f2 = _jspx_th_spring_005ftheme_005f2.doStartTag();
      if (_jspx_th_spring_005ftheme_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new javax.servlet.jsp.SkipPageException();
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005ftheme_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005ftheme_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005ftheme_005f2.doFinally();
      _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody.reuse(_jspx_th_spring_005ftheme_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fform_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fform_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/desktop/user/register.tag(17,1) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setMethod("post");
    // /WEB-INF/tags/desktop/user/register.tag(17,1) name = commandName type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setCommandName("registerForm");
    // /WEB-INF/tags/desktop/user/register.tag(17,1) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setAction((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${action}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null, false));
    int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
      if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("<div class=\"form_field-elements js-recaptcha-captchaaddon\">\n");
          out.write("\t\t\t");
          if (_jspx_meth_formElement_005fformSelectBox_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
            return true;
          if (_jspx_meth_formElement_005fformInputBox_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
            return true;
          if (_jspx_meth_formElement_005fformInputBox_005f1(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
            return true;
          if (_jspx_meth_formElement_005fformInputBox_005f2(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
            return true;
          if (_jspx_meth_formElement_005fformPasswordBox_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
            return true;
          if (_jspx_meth_formElement_005fformPasswordBox_005f1(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
            return true;
          out.write("<input type=\"hidden\" id=\"recaptchaChallangeAnswered\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.recaptchaChallangeAnswered}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null, false));
          out.write("\"/>\n");
          out.write("\n");
          out.write("\t\t</div>\n");
          out.write("\t\t<div class=\"form-actions clearfix\">\n");
          out.write("\t\t\t");
          if (_jspx_meth_ycommerce_005ftestId_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
            return true;
          out.write("</div>\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_form_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new javax.servlet.jsp.SkipPageException();
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fform_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fform_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fform_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName_005faction.reuse(_jspx_th_form_005fform_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_formElement_005fformSelectBox_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  formElement:formSelectBox
    org.apache.jsp.tag.webdesktop.formElement.formSelectBox_tag _jspx_th_formElement_005fformSelectBox_005f0 = (new org.apache.jsp.tag.webdesktop.formElement.formSelectBox_tag());
    _jsp_instancemanager.newInstance(_jspx_th_formElement_005fformSelectBox_005f0);
    _jspx_th_formElement_005fformSelectBox_005f0.setJspContext(_jspx_page_context);
    _jspx_th_formElement_005fformSelectBox_005f0.setParent(_jspx_th_form_005fform_005f0);
    // /WEB-INF/tags/desktop/user/register.tag(19,3) name = idKey type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_formElement_005fformSelectBox_005f0.setIdKey("register.title");
    // /WEB-INF/tags/desktop/user/register.tag(19,3) name = labelKey type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_formElement_005fformSelectBox_005f0.setLabelKey("register.title");
    // /WEB-INF/tags/desktop/user/register.tag(19,3) name = path type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_formElement_005fformSelectBox_005f0.setPath("titleCode");
    // /WEB-INF/tags/desktop/user/register.tag(19,3) name = mandatory type = java.lang.Boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_formElement_005fformSelectBox_005f0.setMandatory(new java.lang.Boolean(true));
    // /WEB-INF/tags/desktop/user/register.tag(19,3) name = skipBlank type = java.lang.Boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_formElement_005fformSelectBox_005f0.setSkipBlank(new java.lang.Boolean(false));
    // /WEB-INF/tags/desktop/user/register.tag(19,3) name = skipBlankMessageKey type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_formElement_005fformSelectBox_005f0.setSkipBlankMessageKey("form.select.empty");
    // /WEB-INF/tags/desktop/user/register.tag(19,3) name = items type = java.util.Collection reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_formElement_005fformSelectBox_005f0.setItems((java.util.Collection) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${titles}", java.util.Collection.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null, false));
    _jspx_th_formElement_005fformSelectBox_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_formElement_005fformSelectBox_005f0);
    return false;
  }

  private boolean _jspx_meth_formElement_005fformInputBox_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  formElement:formInputBox
    org.apache.jsp.tag.webdesktop.formElement.formInputBox_tag _jspx_th_formElement_005fformInputBox_005f0 = (new org.apache.jsp.tag.webdesktop.formElement.formInputBox_tag());
    _jsp_instancemanager.newInstance(_jspx_th_formElement_005fformInputBox_005f0);
    _jspx_th_formElement_005fformInputBox_005f0.setJspContext(_jspx_page_context);
    _jspx_th_formElement_005fformInputBox_005f0.setParent(_jspx_th_form_005fform_005f0);
    // /WEB-INF/tags/desktop/user/register.tag(20,3) name = idKey type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_formElement_005fformInputBox_005f0.setIdKey("register.firstName");
    // /WEB-INF/tags/desktop/user/register.tag(20,3) name = labelKey type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_formElement_005fformInputBox_005f0.setLabelKey("register.firstName");
    // /WEB-INF/tags/desktop/user/register.tag(20,3) name = path type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_formElement_005fformInputBox_005f0.setPath("firstName");
    // /WEB-INF/tags/desktop/user/register.tag(20,3) name = inputCSS type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_formElement_005fformInputBox_005f0.setInputCSS("text");
    // /WEB-INF/tags/desktop/user/register.tag(20,3) name = mandatory type = java.lang.Boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_formElement_005fformInputBox_005f0.setMandatory(new java.lang.Boolean(true));
    _jspx_th_formElement_005fformInputBox_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_formElement_005fformInputBox_005f0);
    return false;
  }

  private boolean _jspx_meth_formElement_005fformInputBox_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  formElement:formInputBox
    org.apache.jsp.tag.webdesktop.formElement.formInputBox_tag _jspx_th_formElement_005fformInputBox_005f1 = (new org.apache.jsp.tag.webdesktop.formElement.formInputBox_tag());
    _jsp_instancemanager.newInstance(_jspx_th_formElement_005fformInputBox_005f1);
    _jspx_th_formElement_005fformInputBox_005f1.setJspContext(_jspx_page_context);
    _jspx_th_formElement_005fformInputBox_005f1.setParent(_jspx_th_form_005fform_005f0);
    // /WEB-INF/tags/desktop/user/register.tag(21,3) name = idKey type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_formElement_005fformInputBox_005f1.setIdKey("register.lastName");
    // /WEB-INF/tags/desktop/user/register.tag(21,3) name = labelKey type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_formElement_005fformInputBox_005f1.setLabelKey("register.lastName");
    // /WEB-INF/tags/desktop/user/register.tag(21,3) name = path type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_formElement_005fformInputBox_005f1.setPath("lastName");
    // /WEB-INF/tags/desktop/user/register.tag(21,3) name = inputCSS type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_formElement_005fformInputBox_005f1.setInputCSS("text");
    // /WEB-INF/tags/desktop/user/register.tag(21,3) name = mandatory type = java.lang.Boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_formElement_005fformInputBox_005f1.setMandatory(new java.lang.Boolean(true));
    _jspx_th_formElement_005fformInputBox_005f1.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_formElement_005fformInputBox_005f1);
    return false;
  }

  private boolean _jspx_meth_formElement_005fformInputBox_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  formElement:formInputBox
    org.apache.jsp.tag.webdesktop.formElement.formInputBox_tag _jspx_th_formElement_005fformInputBox_005f2 = (new org.apache.jsp.tag.webdesktop.formElement.formInputBox_tag());
    _jsp_instancemanager.newInstance(_jspx_th_formElement_005fformInputBox_005f2);
    _jspx_th_formElement_005fformInputBox_005f2.setJspContext(_jspx_page_context);
    _jspx_th_formElement_005fformInputBox_005f2.setParent(_jspx_th_form_005fform_005f0);
    // /WEB-INF/tags/desktop/user/register.tag(22,3) name = idKey type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_formElement_005fformInputBox_005f2.setIdKey("register.email");
    // /WEB-INF/tags/desktop/user/register.tag(22,3) name = labelKey type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_formElement_005fformInputBox_005f2.setLabelKey("register.email");
    // /WEB-INF/tags/desktop/user/register.tag(22,3) name = path type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_formElement_005fformInputBox_005f2.setPath("email");
    // /WEB-INF/tags/desktop/user/register.tag(22,3) name = inputCSS type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_formElement_005fformInputBox_005f2.setInputCSS("text");
    // /WEB-INF/tags/desktop/user/register.tag(22,3) name = mandatory type = java.lang.Boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_formElement_005fformInputBox_005f2.setMandatory(new java.lang.Boolean(true));
    _jspx_th_formElement_005fformInputBox_005f2.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_formElement_005fformInputBox_005f2);
    return false;
  }

  private boolean _jspx_meth_formElement_005fformPasswordBox_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  formElement:formPasswordBox
    org.apache.jsp.tag.webdesktop.formElement.formPasswordBox_tag _jspx_th_formElement_005fformPasswordBox_005f0 = (new org.apache.jsp.tag.webdesktop.formElement.formPasswordBox_tag());
    _jsp_instancemanager.newInstance(_jspx_th_formElement_005fformPasswordBox_005f0);
    _jspx_th_formElement_005fformPasswordBox_005f0.setJspContext(_jspx_page_context);
    _jspx_th_formElement_005fformPasswordBox_005f0.setParent(_jspx_th_form_005fform_005f0);
    // /WEB-INF/tags/desktop/user/register.tag(23,3) name = idKey type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_formElement_005fformPasswordBox_005f0.setIdKey("password");
    // /WEB-INF/tags/desktop/user/register.tag(23,3) name = labelKey type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_formElement_005fformPasswordBox_005f0.setLabelKey("register.pwd");
    // /WEB-INF/tags/desktop/user/register.tag(23,3) name = path type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_formElement_005fformPasswordBox_005f0.setPath("pwd");
    // /WEB-INF/tags/desktop/user/register.tag(23,3) name = inputCSS type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_formElement_005fformPasswordBox_005f0.setInputCSS("text password strength");
    // /WEB-INF/tags/desktop/user/register.tag(23,3) name = mandatory type = java.lang.Boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_formElement_005fformPasswordBox_005f0.setMandatory(new java.lang.Boolean(true));
    _jspx_th_formElement_005fformPasswordBox_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_formElement_005fformPasswordBox_005f0);
    return false;
  }

  private boolean _jspx_meth_formElement_005fformPasswordBox_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  formElement:formPasswordBox
    org.apache.jsp.tag.webdesktop.formElement.formPasswordBox_tag _jspx_th_formElement_005fformPasswordBox_005f1 = (new org.apache.jsp.tag.webdesktop.formElement.formPasswordBox_tag());
    _jsp_instancemanager.newInstance(_jspx_th_formElement_005fformPasswordBox_005f1);
    _jspx_th_formElement_005fformPasswordBox_005f1.setJspContext(_jspx_page_context);
    _jspx_th_formElement_005fformPasswordBox_005f1.setParent(_jspx_th_form_005fform_005f0);
    // /WEB-INF/tags/desktop/user/register.tag(24,3) name = idKey type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_formElement_005fformPasswordBox_005f1.setIdKey("register.checkPwd");
    // /WEB-INF/tags/desktop/user/register.tag(24,3) name = labelKey type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_formElement_005fformPasswordBox_005f1.setLabelKey("register.checkPwd");
    // /WEB-INF/tags/desktop/user/register.tag(24,3) name = path type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_formElement_005fformPasswordBox_005f1.setPath("checkPwd");
    // /WEB-INF/tags/desktop/user/register.tag(24,3) name = inputCSS type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_formElement_005fformPasswordBox_005f1.setInputCSS("text password");
    // /WEB-INF/tags/desktop/user/register.tag(24,3) name = mandatory type = java.lang.Boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_formElement_005fformPasswordBox_005f1.setMandatory(new java.lang.Boolean(true));
    _jspx_th_formElement_005fformPasswordBox_005f1.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_formElement_005fformPasswordBox_005f1);
    return false;
  }

  private boolean _jspx_meth_ycommerce_005ftestId_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ycommerce:testId
    de.hybris.merchandise.storefront.tags.TestIdTag _jspx_th_ycommerce_005ftestId_005f0 = (new de.hybris.merchandise.storefront.tags.TestIdTag());
    _jsp_instancemanager.newInstance(_jspx_th_ycommerce_005ftestId_005f0);
    _jspx_th_ycommerce_005ftestId_005f0.setJspContext(_jspx_page_context);
    _jspx_th_ycommerce_005ftestId_005f0.setParent(_jspx_th_form_005fform_005f0);
    // /WEB-INF/tags/desktop/user/register.tag(29,3) name = code type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ycommerce_005ftestId_005f0.setCode("register_Register_button");
    _jspx_th_ycommerce_005ftestId_005f0.setJspBody(new Helper( 0, _jspx_page_context, _jspx_th_ycommerce_005ftestId_005f0, _jspx_push_body_count_form_005fform_005f0));
    _jspx_th_ycommerce_005ftestId_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_ycommerce_005ftestId_005f0);
    return false;
  }

  private boolean _jspx_meth_spring_005ftheme_005f3(javax.servlet.jsp.tagext.JspTag _jspx_parent, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:theme
    org.springframework.web.servlet.tags.ThemeTag _jspx_th_spring_005ftheme_005f3 = (org.springframework.web.servlet.tags.ThemeTag) _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody.get(org.springframework.web.servlet.tags.ThemeTag.class);
    _jspx_th_spring_005ftheme_005f3.setPageContext(_jspx_page_context);
    _jspx_th_spring_005ftheme_005f3.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    // /WEB-INF/tags/desktop/user/register.tag(30,43) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005ftheme_005f3.setCode((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${actionNameKey}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null, false));
    int[] _jspx_push_body_count_spring_005ftheme_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005ftheme_005f3 = _jspx_th_spring_005ftheme_005f3.doStartTag();
      if (_jspx_th_spring_005ftheme_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new javax.servlet.jsp.SkipPageException();
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005ftheme_005f3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005ftheme_005f3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005ftheme_005f3.doFinally();
      _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody.reuse(_jspx_th_spring_005ftheme_005f3);
    }
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
      out.write("<button type=\"submit\" class=\"positive\">");
      if (_jspx_meth_spring_005ftheme_005f3(_jspx_parent, _jspx_page_context, _jspx_push_body_count))
        return true;
      out.write("</button>\n");
      out.write("\t\t\t");
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
