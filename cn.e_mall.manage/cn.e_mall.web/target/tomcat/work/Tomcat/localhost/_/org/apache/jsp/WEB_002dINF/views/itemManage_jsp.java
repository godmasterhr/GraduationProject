/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-05-23 10:06:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.text.*;

public final class itemManage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\n");
      out.write("<html>\n");
      out.write("<link href=\"staticFile/css/Style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<head>\n");
      out.write("<title>新世纪E_Mall电子商城</title>\n");
      out.write("<script type=\"text/javascript\" src=\"../staticFile/js/jquery-1.4.2.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t$(function(){\n");
      out.write("\t\t$(\"#seeItem\").click(function(){\n");
      out.write("\t\t\tvar type = $(\"#type\").val();\n");
      out.write("\t\t\twindow.location.href=\"/seeItem?type=\"+type+\"&page=1\";\n");
      out.write("\t\t})\n");
      out.write("\t\t$(\"#addItem\").click(function(){\n");
      out.write("\t\t\tvar type = $(\"#type\").val();\n");
      out.write("\t\t\twindow.location.href=\"/toaddItem\";\n");
      out.write("\t\t})\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t})\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<!-- 主页 body -->\n");
      out.write("<body>\n");
      out.write("<!-- 主页整体盒子 -->\n");
      out.write("<div class=\"main\">\n");
      out.write("\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "head.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("<!-- 除logo外整体盒子 -->\n");
      out.write("   <div class=\"boo\">\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "left.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("  <!--E_Mall 以及图片盒子 -->\n");
      out.write("      <div class=\"box\">\n");
      out.write("     \t <span id=\"\" class=\"sbutton\" style=\"margin-top:70px;margin-left:90px;\">\n");
      out.write("        \t\t<span style=\"font-family: '楷体';font-size:20px;font-weight: bold;color:green\">\n");
      out.write("        \t\t\t<select id=\"type\" name=\"type\" style=\"width:100px;\" size=\"1\">\n");
      out.write("        \t\t\t\t<option value=\"1\">手机数码</option>\n");
      out.write("        \t\t\t\t<option value=\"2\">电脑平板</option>\n");
      out.write("        \t\t\t\t<option value=\"3\">服装服饰</option>\n");
      out.write("        \t\t\t\t<option value=\"8\">运动鞋靴</option>\n");
      out.write("        \t\t\t\t<option value=\"4\">家用电器</option>\n");
      out.write("        \t\t\t\t<option value=\"5\">食品材料</option>\n");
      out.write("        \t\t\t\t<option value=\"6\">图书杂志</option>\n");
      out.write("        \t\t\t\t<option value=\"7\">医疗保健</option>\n");
      out.write("        \t\t\t</select>\n");
      out.write("        \t\t</span>\n");
      out.write("        \t</span>\n");
      out.write("      \t\t<span id=\"seeItem\" class=\"sbutton\" style=\"margin-top:70px;margin-left:30px;\">\n");
      out.write("        \t\t<span style=\"font-family: '楷体';font-size:20px;font-weight: bold;color:green\">\n");
      out.write("        \t\t\t查看商品\n");
      out.write("        \t\t</span>\n");
      out.write("        \t</span>\n");
      out.write("        \t\n");
      out.write("        \t<span id=\"addItem\" class=\"sbutton\" style=\"margin-top:70px;margin-left:30px;\">\n");
      out.write("        \t\t<span style=\"font-family: '楷体';font-size:20px;font-weight: bold;color:green\">\n");
      out.write("        \t\t\t添加商品\n");
      out.write("        \t\t</span>\n");
      out.write("        \t</span>\n");
      out.write("        \t\n");
      out.write("        \t<div style=\"margin-left:100px;margin-top:50px;background:pink;width:320px;height:250px;\n");
      out.write("        \t     font-size:20px;font-family: '楷体'\";>\n");
      out.write("        \t     <br>\n");
      out.write("        \t\t简介：<br>\n");
      out.write("        \t\t&nbsp;&nbsp;对商品进行操作，可以查看商品信息，添加商品，并可修改商品信息，删除商品!\n");
      out.write("        \t\n");
      out.write("        \t</div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- foot盒子 -->\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "foot.jsp", out, false);
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
}
