/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-07-19 12:01:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.task;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/views/task/../include/mainHeader.jsp", Long.valueOf(1468741387915L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fshiro_005fprincipal_0026_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fshiro_005fprincipal_0026_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fshiro_005fprincipal_0026_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--\r\n");
      out.write("This is a starter template page. Use this page to start your new project from\r\n");
      out.write("scratch. This page gets rid of all links and provides the needed markup only.\r\n");
      out.write("-->\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <title>CHENBIE-CRM | 待办事项</title>\r\n");
      out.write("    <!-- Tell the browser to be responsive to screen width -->\r\n");
      out.write("    <meta content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\" name=\"viewport\">\r\n");
      out.write("    <!-- Bootstrap 3.3.6 -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/static/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("    <!-- Font Awesome -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/static/plugins/fontawesome/css/font-awesome.min.css\">\r\n");
      out.write("    <!-- Theme style -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/static/dist/css/AdminLTE.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/static/dist/css/skins/skin-blue.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/static/plugins/datepicker/datepicker3.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/static/plugins/fullcalendar/fullcalendar.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/static/plugins/colorpicker/bootstrap-colorpicker.css\">\r\n");
      out.write("    <style>\r\n");
      out.write("        .todo-list>li .text {\r\n");
      out.write("            font-weight: normal;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"hold-transition skin-blue sidebar-mini\">\r\n");
      out.write("<div class=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Main Header -->\r\n");
      out.write("<header class=\"main-header\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Logo -->\r\n");
      out.write("    <a href=\"index2.html\" class=\"logo\">\r\n");
      out.write("        <!-- mini logo for sidebar mini 50x50 pixels -->\r\n");
      out.write("        <span class=\"logo-mini\">CRM</span>\r\n");
      out.write("        <!-- logo for regular state and mobile devices -->\r\n");
      out.write("        <span class=\"logo-lg\"><b>CHENBIE</b>CRM</span>\r\n");
      out.write("    </a>\r\n");
      out.write("\r\n");
      out.write("    <!-- Header Navbar -->\r\n");
      out.write("    <nav class=\"navbar navbar-static-top\" role=\"navigation\">\r\n");
      out.write("        <!-- Sidebar toggle button-->\r\n");
      out.write("        <a href=\"#\" class=\"sidebar-toggle\" data-toggle=\"offcanvas\" role=\"button\">\r\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("        </a>\r\n");
      out.write("        <!-- Navbar Right Menu -->\r\n");
      out.write("        <div class=\"navbar-custom-menu\">\r\n");
      out.write("            <ul class=\"nav navbar-nav\">\r\n");
      out.write("                <!-- Messages: style can be found in dropdown.less-->\r\n");
      out.write("                <li class=\"dropdown messages-menu\">\r\n");
      out.write("                    <!-- Menu toggle button -->\r\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                        <i class=\"fa fa-envelope-o\"></i>\r\n");
      out.write("                        <span class=\"label label-success\">4</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <ul class=\"dropdown-menu\">\r\n");
      out.write("                        <li class=\"header\">You have 4 messages</li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <!-- inner menu: contains the messages -->\r\n");
      out.write("                            <ul class=\"menu\">\r\n");
      out.write("                                <li><!-- start message -->\r\n");
      out.write("                                    <a href=\"#\">\r\n");
      out.write("                                        <div class=\"pull-left\">\r\n");
      out.write("                                            <!-- User Image -->\r\n");
      out.write("                                            <img src=\"/static/dist/img/user2-160x160.jpg\" class=\"img-circle\" alt=\"User Image\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <!-- Message title and timestamp -->\r\n");
      out.write("                                        <h4>\r\n");
      out.write("                                            Support Team\r\n");
      out.write("                                            <small><i class=\"fa fa-clock-o\"></i> 5 mins</small>\r\n");
      out.write("                                        </h4>\r\n");
      out.write("                                        <!-- The message -->\r\n");
      out.write("                                        <p>Why not buy a new awesome theme?</p>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <!-- end message -->\r\n");
      out.write("                            </ul>\r\n");
      out.write("                            <!-- /.menu -->\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"footer\"><a href=\"#\">See All Messages</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <!-- /.messages-menu -->\r\n");
      out.write("\r\n");
      out.write("                <!-- Notifications Menu -->\r\n");
      out.write("                <li class=\"dropdown notifications-menu\">\r\n");
      out.write("                    <!-- Menu toggle button -->\r\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                        <i class=\"fa fa-bell-o\"></i>\r\n");
      out.write("                        <span class=\"label label-warning\">10</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <ul class=\"dropdown-menu\">\r\n");
      out.write("                        <li class=\"header\">You have 10 notifications</li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <!-- Inner Menu: contains the notifications -->\r\n");
      out.write("                            <ul class=\"menu\">\r\n");
      out.write("                                <li><!-- start notification -->\r\n");
      out.write("                                    <a href=\"#\">\r\n");
      out.write("                                        <i class=\"fa fa-users text-aqua\"></i> 5 new members joined today\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <!-- end notification -->\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"footer\"><a href=\"#\">View all</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <!-- Tasks Menu -->\r\n");
      out.write("                <li class=\"dropdown tasks-menu\">\r\n");
      out.write("                    <!-- Menu Toggle Button -->\r\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                        <i class=\"fa fa-flag-o\"></i>\r\n");
      out.write("                        <span class=\"label label-danger\">9</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <ul class=\"dropdown-menu\">\r\n");
      out.write("                        <li class=\"header\">You have 9 tasks</li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <!-- Inner menu: contains the tasks -->\r\n");
      out.write("                            <ul class=\"menu\">\r\n");
      out.write("                                <li><!-- Task item -->\r\n");
      out.write("                                    <a href=\"#\">\r\n");
      out.write("                                        <!-- Task title and progress text -->\r\n");
      out.write("                                        <h3>\r\n");
      out.write("                                            Design some buttons\r\n");
      out.write("                                            <small class=\"pull-right\">20%</small>\r\n");
      out.write("                                        </h3>\r\n");
      out.write("                                        <!-- The progress bar -->\r\n");
      out.write("                                        <div class=\"progress xs\">\r\n");
      out.write("                                            <!-- Change the css width attribute to simulate progress -->\r\n");
      out.write("                                            <div class=\"progress-bar progress-bar-aqua\" style=\"width: 20%\" role=\"progressbar\" aria-valuenow=\"20\" aria-valuemin=\"0\" aria-valuemax=\"100\">\r\n");
      out.write("                                                <span class=\"sr-only\">20% Complete</span>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <!-- end task item -->\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"footer\">\r\n");
      out.write("                            <a href=\"#\">View all tasks</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <!-- User Account Menu -->\r\n");
      out.write("                <li class=\"dropdown\">\r\n");
      out.write("                    <!-- Menu Toggle Button -->\r\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                        <span class=\"hidden-xs\">");
      if (_jspx_meth_shiro_005fprincipal_005f0(_jspx_page_context))
        return;
      out.write("</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <ul class=\"dropdown-menu\">\r\n");
      out.write("                        <li><a href=\"/user/password\">修改密码</a></li>\r\n");
      out.write("                        <li><a href=\"/user/log\">登录日志</a></li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li><a href=\"/logout\">安全退出</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("</header>");
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../include/mainSide.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("menu", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("task", request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Content Wrapper. Contains page content -->\r\n");
      out.write("    <div class=\"content-wrapper\">\r\n");
      out.write("        <!-- Main content -->\r\n");
      out.write("        <section class=\"content\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-8\">\r\n");
      out.write("                    <div class=\"box box-solid\">\r\n");
      out.write("                        <div class=\"box-body\">\r\n");
      out.write("                            <div id=\"calendar\"></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-4\">\r\n");
      out.write("                    <div class=\"box box-danger\">\r\n");
      out.write("                        <div class=\"box-header with-border\">\r\n");
      out.write("                            <h3 class=\"box-title\">已经延期的事项</h3>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"box-body\">\r\n");
      out.write("                            <ul class=\"todo-list\">\r\n");
      out.write("                                ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </section>\r\n");
      out.write("        <!-- /.content -->\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- /.content-wrapper -->\r\n");
      out.write("</div>\r\n");
      out.write("<!-- ./wrapper -->\r\n");
      out.write("<div class=\"modal fade\" id=\"newModal\">\r\n");
      out.write("    <div class=\"modal-dialog\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("                <h4 class=\"modal-title\">新增待办事项</h4>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("                <form id=\"newForm\" action=\"/task/new\" method=\"post\">\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label>待办内容</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"title\" id=\"task_title\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label>开始日期</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"start\" id=\"start_time\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label>结束日期</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"end\" id=\"end_time\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label>提醒时间</label>\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <select name=\"hour\" style=\"width: 100px\">\r\n");
      out.write("                                <option value=\"\"></option>\r\n");
      out.write("                                <option value=\"0\">0</option>\r\n");
      out.write("                                <option value=\"1\">1</option>\r\n");
      out.write("                                <option value=\"2\">2</option>\r\n");
      out.write("                                <option value=\"3\">3</option>\r\n");
      out.write("                                <option value=\"4\">4</option>\r\n");
      out.write("                                <option value=\"5\">5</option>\r\n");
      out.write("                                <option value=\"6\">6</option>\r\n");
      out.write("                                <option value=\"7\">7</option>\r\n");
      out.write("                                <option value=\"8\">8</option>\r\n");
      out.write("                                <option value=\"9\">9</option>\r\n");
      out.write("                                <option value=\"10\">10</option>\r\n");
      out.write("                                <option value=\"11\">11</option>\r\n");
      out.write("                                <option value=\"12\">12</option>\r\n");
      out.write("                                <option value=\"13\">13</option>\r\n");
      out.write("                                <option value=\"14\">14</option>\r\n");
      out.write("                                <option value=\"15\">15</option>\r\n");
      out.write("                                <option value=\"16\">16</option>\r\n");
      out.write("                                <option value=\"17\">17</option>\r\n");
      out.write("                                <option value=\"18\">18</option>\r\n");
      out.write("                                <option value=\"19\">19</option>\r\n");
      out.write("                                <option value=\"20\">20</option>\r\n");
      out.write("                                <option value=\"21\">21</option>\r\n");
      out.write("                                <option value=\"22\">22</option>\r\n");
      out.write("                                <option value=\"23\">23</option>\r\n");
      out.write("                            </select>\r\n");
      out.write("                            :\r\n");
      out.write("                            <select name=\"min\" style=\"width: 100px\">\r\n");
      out.write("                                <option value=\"\"></option>\r\n");
      out.write("                                <option value=\"0\">0</option>\r\n");
      out.write("                                <option value=\"5\">5</option>\r\n");
      out.write("                                <option value=\"10\">10</option>\r\n");
      out.write("                                <option value=\"15\">15</option>\r\n");
      out.write("                                <option value=\"20\">20</option>\r\n");
      out.write("                                <option value=\"25\">25</option>\r\n");
      out.write("                                <option value=\"30\">30</option>\r\n");
      out.write("                                <option value=\"35\">35</option>\r\n");
      out.write("                                <option value=\"40\">40</option>\r\n");
      out.write("                                <option value=\"45\">45</option>\r\n");
      out.write("                                <option value=\"50\">50</option>\r\n");
      out.write("                                <option value=\"55\">55</option>\r\n");
      out.write("                            </select>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label>显示颜色</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"color\" id=\"color\" value=\"#61a5e8\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消</button>\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-primary\" id=\"saveBtn\">保存</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div><!-- /.modal-content -->\r\n");
      out.write("    </div><!-- /.modal-dialog -->\r\n");
      out.write("</div><!-- /.modal -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"modal fade\" id=\"eventModal\">\r\n");
      out.write("    <div class=\"modal-dialog\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("                <h4 class=\"modal-title\">查看待办事项</h4>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("                <form id=\"eventForm\">\r\n");
      out.write("                    <input type=\"hidden\" id=\"event_id\">\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label>待办内容</label>\r\n");
      out.write("                        <div id=\"event_title\"></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label>开始日期 ~ 结束时间</label>\r\n");
      out.write("                        <div><span id=\"event_start\"></span>  ~  <span id=\"event_end\"></span></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label>提醒时间</label>\r\n");
      out.write("                        <div id=\"event_remindtime\"></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消</button>\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-danger\" id=\"delBtn\"><i class=\"fa fa-trash\"></i> 删除</button>\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-primary\" id=\"doneBtn\"><i class=\"fa fa-check\"></i> 标记为已完成</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div><!-- /.modal-content -->\r\n");
      out.write("    </div><!-- /.modal-dialog -->\r\n");
      out.write("</div><!-- /.modal -->\r\n");
      out.write("\r\n");
      out.write("<!-- REQUIRED JS SCRIPTS -->\r\n");
      out.write("\r\n");
      out.write("<!-- jQuery 2.2.0 -->\r\n");
      out.write("<script src=\"/static/plugins/jQuery/jQuery-2.2.0.min.js\"></script>\r\n");
      out.write("<!-- Bootstrap 3.3.6 -->\r\n");
      out.write("<script src=\"/static/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("<!-- AdminLTE App -->\r\n");
      out.write("<script src=\"/static/dist/js/app.min.js\"></script>\r\n");
      out.write("<script src=\"/static/plugins/datepicker/bootstrap-datepicker.js\"></script>\r\n");
      out.write("<script src=\"/static/plugins/datepicker/locales/bootstrap-datepicker.zh-CN.js\"></script>\r\n");
      out.write("<script src=\"/static/plugins/moment/moment.min.js\"></script>\r\n");
      out.write("<script src=\"/static/plugins/fullcalendar/fullcalendar.min.js\"></script>\r\n");
      out.write("<script src=\"/static/plugins/colorpicker/bootstrap-colorpicker.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    $(function(){\r\n");
      out.write("        //日历\r\n");
      out.write("        var _event = null;\r\n");
      out.write("        var $calendar = $(\"#calendar\");\r\n");
      out.write("\r\n");
      out.write("        $calendar.fullCalendar({\r\n");
      out.write("            lang:'zh-CN',\r\n");
      out.write("            buttonText:{\r\n");
      out.write("                today:    '今天'\r\n");
      out.write("            },\r\n");
      out.write("            events:\"/task/load\",\r\n");
      out.write("            dayClick: function(date, jsEvent, view) {\r\n");
      out.write("                //alert('Clicked on: ' + date.format());\r\n");
      out.write("                $(\"#newForm\")[0].reset();\r\n");
      out.write("                $(\"#start_time\").val(date.format());\r\n");
      out.write("                $(\"#end_time\").val(date.format());\r\n");
      out.write("\r\n");
      out.write("                $(\"#newModal\").modal({\r\n");
      out.write("                    show:true,\r\n");
      out.write("                    backdrop:'static'\r\n");
      out.write("                });\r\n");
      out.write("            },\r\n");
      out.write("            eventClick:function(calEvent, jsEvent, view){\r\n");
      out.write("                //alert(calEvent.id + \" : \" + calEvent.title);\r\n");
      out.write("                _event = calEvent;\r\n");
      out.write("                $(\"#event_id\").val(calEvent.id);\r\n");
      out.write("                $(\"#event_title\").text(calEvent.title);\r\n");
      out.write("                $(\"#event_start\").text(moment(calEvent.start).format(\"YYYY-MM-DD\"));\r\n");
      out.write("                $(\"#event_end\").text(moment(calEvent.end).format(\"YYYY-MM-DD\"));\r\n");
      out.write("                if(calEvent.remindertime) {\r\n");
      out.write("                    $(\"#event_remindtime\").text(calEvent.remindertime);\r\n");
      out.write("                } else {\r\n");
      out.write("                    $(\"#event_remindtime\").text('无');\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                $(\"#eventModal\").modal({\r\n");
      out.write("                    show:true,\r\n");
      out.write("                    backdrop:'static'\r\n");
      out.write("                });\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        //新增\r\n");
      out.write("        $(\"#color\").colorpicker({\r\n");
      out.write("            color:'#61a5e8'\r\n");
      out.write("        });\r\n");
      out.write("        $(\"#start_time,#end_time\").datepicker({\r\n");
      out.write("            format: 'yyyy-mm-dd',\r\n");
      out.write("            autoclose:true,\r\n");
      out.write("            language:'zh-CN',\r\n");
      out.write("            todayHighlight:true\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        $(\"#saveBtn\").click(function(){\r\n");
      out.write("            if(!$(\"#task_title\").val()) {\r\n");
      out.write("                $(\"#task_title\").focus();\r\n");
      out.write("                return;\r\n");
      out.write("            }\r\n");
      out.write("            if(moment($(\"#start_time\").val()).isAfter(moment($(\"#end_time\").val()))) {\r\n");
      out.write("                alert(\"结束时间必须大于开始时间\");\r\n");
      out.write("                return;\r\n");
      out.write("            }\r\n");
      out.write("            $.post(\"/task/new\",$(\"#newForm\").serialize()).done(function(result){\r\n");
      out.write("                if(result.state == \"success\") {\r\n");
      out.write("                    //将返回的日程，渲染到日历控件上\r\n");
      out.write("                    $calendar.fullCalendar( 'renderEvent', result.data );\r\n");
      out.write("                    $(\"#newModal\").modal('hide');\r\n");
      out.write("                }\r\n");
      out.write("            }).fail(function(){\r\n");
      out.write("                alert(\"服务器异常\");\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        //删除日程\r\n");
      out.write("        $(\"#delBtn\").click(function(){\r\n");
      out.write("            var id = $(\"#event_id\").val();\r\n");
      out.write("\r\n");
      out.write("            if(confirm(\"确定要删除吗\")) {\r\n");
      out.write("                $.get(\"/task/del/\"+id).done(function(data){\r\n");
      out.write("                    if(\"success\" == data) {\r\n");
      out.write("                        $calendar.fullCalendar('removeEvents',id);\r\n");
      out.write("                        $(\"#eventModal\").modal('hide');\r\n");
      out.write("                    }\r\n");
      out.write("                }).fail(function(){\r\n");
      out.write("                    alert(\"服务器异常\");\r\n");
      out.write("                });\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        //将日程标记为已完成\r\n");
      out.write("        $(\"#doneBtn\").click(function(){\r\n");
      out.write("            var id = $(\"#event_id\").val();\r\n");
      out.write("            $.post(\"/task/\"+id+\"/done\").done(function(result){\r\n");
      out.write("                if(result.state == \"success\") {\r\n");
      out.write("                    _event.color = \"#cccccc\";\r\n");
      out.write("                    $calendar.fullCalendar('updateEvent',_event);\r\n");
      out.write("                    $(\"#eventModal\").modal('hide');\r\n");
      out.write("                }\r\n");
      out.write("            }).fail(function(){\r\n");
      out.write("                alert(\"服务器异常\");\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_shiro_005fprincipal_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  shiro:principal
    org.apache.shiro.web.tags.PrincipalTag _jspx_th_shiro_005fprincipal_005f0 = (org.apache.shiro.web.tags.PrincipalTag) _005fjspx_005ftagPool_005fshiro_005fprincipal_0026_005fproperty_005fnobody.get(org.apache.shiro.web.tags.PrincipalTag.class);
    _jspx_th_shiro_005fprincipal_005f0.setPageContext(_jspx_page_context);
    _jspx_th_shiro_005fprincipal_005f0.setParent(null);
    // /WEB-INF/views/task/../include/mainHeader.jsp(122,48) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_shiro_005fprincipal_005f0.setProperty("realname");
    int _jspx_eval_shiro_005fprincipal_005f0 = _jspx_th_shiro_005fprincipal_005f0.doStartTag();
    if (_jspx_th_shiro_005fprincipal_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fshiro_005fprincipal_0026_005fproperty_005fnobody.reuse(_jspx_th_shiro_005fprincipal_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fshiro_005fprincipal_0026_005fproperty_005fnobody.reuse(_jspx_th_shiro_005fprincipal_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/views/task/list.jsp(58,32) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/task/list.jsp(58,32) '${timeoutTaskList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${timeoutTaskList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/task/list.jsp(58,32) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("task");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                    <li>\r\n");
          out.write("                                        <input type=\"checkbox\">\r\n");
          out.write("                                        <span class=\"text\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${task.title}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</span>\r\n");
          out.write("                                        <div class=\"tools\">\r\n");
          out.write("                                            <i class=\"fa fa-trash-o\"></i>\r\n");
          out.write("                                        </div>\r\n");
          out.write("                                    </li>\r\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
