/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-05-09 02:39:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>E_Mall用户个人信息</title>\r\n");
      out.write("\t<meta http-equiv=\"Content-type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"../staticFile/css/regist.css\"/>\r\n");
      out.write("\t<script type=\"text/javascript\r\n");
      out.write("\t\" src=\"../staticFile/js/jquery-1.4.2.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tfunction checkForm(){\r\n");
      out.write("\t\t\tvar flag = true;\r\n");
      out.write("\t\t\t//非空校验\r\n");
      out.write("\t\t\tflag = checkNull(\"userName\", \"用户名不能为空\") && flag;\r\n");
      out.write("\t\t\tflag = checkNull(\"passWord\", \"密码不能为空\") && flag;\r\n");
      out.write("\t\t\tflag = checkNull(\"passWord2\", \"确认密码不能为空\") && flag;\r\n");
      out.write("\t\t\tflag = checkNull(\"name\", \"姓名不能为空\") && flag;\r\n");
      out.write("\t\t\tflag = checkNull(\"phone\", \"手机号不能为空\") && flag;\r\n");
      out.write("\t\t\tflag = checkNull(\"email\", \"邮箱不能为空\") && flag;\r\n");
      out.write("\t\t\tflag = checkNull(\"address\", \"收货地址不能为空\") && flag;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//两次密码是否一致\r\n");
      out.write("\t\t\tflag = checkpassWord(\"passWord\", \"两次密码不一致\") && flag;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//邮箱格式\r\n");
      out.write("\t\t\tflag = checkEmail(\"email\", \"邮箱格式不正确\") && flag;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\treturn flag;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//校验邮箱格式\r\n");
      out.write("\t\tfunction checkEmail(name, msg){\r\n");
      out.write("\t\t\tvar email = document.getElementsByName(name)[0].value;\r\n");
      out.write("\t\t\tsetMsg(name, \"\");\r\n");
      out.write("\t\t\tcheckNull(\"email\", \"邮箱不能为空\");\r\n");
      out.write("\t\t\tvar reg = /^\\w+@\\w+(\\.\\w+)+$/;\r\n");
      out.write("\t\t\tif(email != \"\" && !reg.test(email)){\r\n");
      out.write("\t\t\t\tsetMsg(name, msg);\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//校验两次密码是否一致\r\n");
      out.write("\t\tfunction checkpassWord(name, msg){\r\n");
      out.write("\t\t\tvar psw1 = document.getElementsByName(name)[0].value;\r\n");
      out.write("\t\t\tvar psw2 = document.getElementsByName(name+\"2\")[0].value;\r\n");
      out.write("\t\t\tsetMsg(name+\"2\", \"\");\r\n");
      out.write("\t\t\tcheckNull(\"passWord2\", \"确认密码不能为空\");\r\n");
      out.write("\t\t\tif(psw1 != \"\" && psw2 != \"\" && psw1 != psw2){\r\n");
      out.write("\t\t\t\tsetMsg(name+\"2\", msg);\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//校验输入框是否为空\r\n");
      out.write("\t\tfunction checkNull(name, msg){\r\n");
      out.write("\t\t\tvar obj = document.getElementsByName(name)[0];\r\n");
      out.write("\t\t\tvar value = obj.value;\r\n");
      out.write("\t\t\tsetMsg(name, \"\");\r\n");
      out.write("\t\t\tif(value == \"\"){\r\n");
      out.write("\t\t\t\tsetMsg(name, msg);\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//提示消息\r\n");
      out.write("\t\tfunction setMsg(name, msg){\r\n");
      out.write("\t\t\t//alert(msg);\r\n");
      out.write("\t\t\tdocument.getElementById(name+\"_msg\").innerHTML = \"<font style='color: red;font-size: 14px;'>\"+ msg +\"</font>\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(function(){\r\n");
      out.write("\t\t\tvar flag= \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${flag}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("\t\t\tif(flag==\"true\"){\r\n");
      out.write("\t\t\t\talert(\"恭喜你，修改成功！\");\r\n");
      out.write("\t\t\t\twindow.location.href=\"/index\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t \t$(\"#userName\").blur(function(){\r\n");
      out.write("\t\t \t\tvar userName = $(\"#userName\").val();\r\n");
      out.write("\t\t \t\tif(!checkNull(\"userName\", \"用户名不能为空\")){\r\n");
      out.write("\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t$(\"#checkuserName\").load(\"/checkUserName\",{\"userName\":userName});\r\n");
      out.write("\t\t\t}); \r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t<h1>&nbsp;&nbsp;用户个人信息</h1>\r\n");
      out.write("\t<form action=\"/updateUser\" method=\"POST\" onsubmit=\"return checkForm()\">\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t<div id=\"s\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t<td class=\"tds\" id=\"checkuserName\" colspan=\"2\" style=\"font-size: 15px; color: red;text-align: center;\">\r\n");
      out.write("\t\t\t\t");
      out.print( request.getAttribute("msg") == null ? "" : request.getAttribute("msg"));
      out.write("\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"tds\">用户名：</td>\r\n");
      out.write("\t\t\t\t<td><input id=\"userName\" type=\"text\" name=\"userName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.userName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"  disabled=\"disabled\" onblur=\"ajaxCheckuserName(this)\">\r\n");
      out.write("\t\t\t\t\t<span id=\"userName_msg\"></span>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"tds\">密码：</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"passWord\" name=\"passWord\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.passWord}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" onblur=\"checkNull('passWord','密码不能为空')\">\r\n");
      out.write("\t\t\t\t\t<span id=\"passWord_msg\"></span>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"tds\">确认密码：</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"passWord\" name=\"passWord2\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.passWord}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" onblur=\"checkpassWord('passWord','两次密码不一致')\">\r\n");
      out.write("\t\t\t\t\t<span id=\"passWord2_msg\"></span>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"tds\">姓名：</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"name\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"  onblur=\"checkNull('name','姓名不能为空')\">\r\n");
      out.write("\t\t\t\t\t<span id=\"name_msg\"></span>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"tds\" >手机：</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"phone\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.phone}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" onblur=\"checkNull('phone','手机号不能为空')\">\r\n");
      out.write("\t\t\t\t\t<span id=\"phone_msg\"></span>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"tds\" >邮箱：</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"email\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" onblur=\"checkEmail('email','邮箱格式不正确')\">\r\n");
      out.write("\t\t\t\t\t<span id=\"email_msg\"></span>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"tds\" >收货地址：</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"address\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.address}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" onblur=\"checkNull('address','收货地址不能为空')\">\r\n");
      out.write("\t\t\t\t\t<span id=\"address_msg\"></span>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\t\t\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"修改信息\"/>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t<input type=\"text\" name=\"userId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.userId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" style=\"visibility:hidden\">\r\n");
      out.write("\t</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /WEB-INF/views/userInfo.jsp(99,1) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setScope("page");
    // /WEB-INF/views/userInfo.jsp(99,1) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("user");
    // /WEB-INF/views/userInfo.jsp(99,1) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/userInfo.jsp(99,1) '${sessionScope.user}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${sessionScope.user}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }
}
