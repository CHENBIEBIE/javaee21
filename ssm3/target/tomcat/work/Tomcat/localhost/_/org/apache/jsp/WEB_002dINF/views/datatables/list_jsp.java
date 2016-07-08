/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-07-07 12:13:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.datatables;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Document</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/static/css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/static/js/datatables/css/dataTables.bootstrap.min.css\">\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"page-header\">\r\n");
      out.write("            <h3>DataTables 演示</h3>\r\n");
      out.write("        </div>\r\n");
      out.write("        <a href=\"javascript:;\" id=\"newBookBtn\" class=\"btn btn-primary\"  style=\"margin-bottom: 20px\">添加新书籍</a>\r\n");
      out.write("\r\n");
      out.write("        <table id=\"dataTable\" class=\"table\">\r\n");
      out.write("            <thead>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th>ID</th>\r\n");
      out.write("                <th>名称</th>\r\n");
      out.write("                <th>作者</th>\r\n");
      out.write("                <th>价格</th>\r\n");
      out.write("                <th>数量</th>\r\n");
      out.write("                <th>出版社</th>\r\n");
      out.write("                <th>分类</th>\r\n");
      out.write("                <th>#</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            <tbody>\r\n");
      out.write("\r\n");
      out.write("            </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"modal fade\" id=\"newBookModal\">\r\n");
      out.write("        <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("            <div class=\"modal-content\">\r\n");
      out.write("                <div class=\"modal-header\">\r\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("                    <h4 class=\"modal-title\" id=\"myModalLabel\">添加新书籍</h4>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-body\">\r\n");
      out.write("\r\n");
      out.write("                    <form id=\"saveForm\">\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label>书籍名称</label>\r\n");
      out.write("                            <input type=\"text\" name=\"bookname\" class=\"form-control\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label>书籍作者</label>\r\n");
      out.write("                            <input type=\"text\" name=\"bookauthor\" class=\"form-control\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label>书籍价格</label>\r\n");
      out.write("                            <input type=\"text\" name=\"bookprice\" class=\"form-control\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label>书籍数量</label>\r\n");
      out.write("                            <input type=\"text\" name=\"booknum\" class=\"form-control\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label>分类</label>\r\n");
      out.write("                            <select class=\"form-control\" name=\"typeid\">\r\n");
      out.write("                                ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            </select>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label>出版社</label>\r\n");
      out.write("                            <select class=\"form-control\" name=\"pubid\">\r\n");
      out.write("                                ");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            </select>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </form>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-footer text-danger\">\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消</button>\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-primary\" id=\"saveBtn\">保存</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("<script src=\"http://cdn.bootcss.com/jquery/2.2.2/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"/static/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"/static/js/datatables/js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("<script src=\"/static/js/datatables/js/dataTables.bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"/static/js/jquery.validate.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    $(function(){\r\n");
      out.write("\r\n");
      out.write("        var dataTables= $(\"#dataTable\").DataTable({\r\n");
      out.write("            \"lengthMenu\": [ 5,10, 25, 50, 75, 100 ], //定义每页显示的数量列表\r\n");
      out.write("            \"serverSide\": true, //表示所有的操作都在服务端进行\r\n");
      out.write("            \"ajax\" : \"/datatable/data.json\", //服务端URL地址\r\n");
      out.write("            \"order\" : [0,'desc'],//增加书籍时改默认排序方式\r\n");
      out.write("            \"columns\" : [ //配置返回的JSON中data属性数据key和表格列的对应关系\r\n");
      out.write("                {\"data\":\"id\",\"name\":\"id\"},\r\n");
      out.write("                {\"data\":\"bookname\"},\r\n");
      out.write("                {\"data\":\"bookauthor\"},\r\n");
      out.write("                {\"data\":\"bookprice\",\"name\":\"bookprice\"},\r\n");
      out.write("                {\"data\":\"booknum\",\"name\":\"booknum\"},\r\n");
      out.write("                {\"data\":\"publisher.pubname\"},\r\n");
      out.write("                {\"data\":\"bookType.booktype\",\"name\":\"typeid\"},\r\n");
      out.write("                {\"data\":function(row){\r\n");
      out.write("                    //row就是获取的json对象中的一个book对象\r\n");
      out.write("                    return \"<a href='javascript:;' class='delLink' rel='\"+row.id+\"'>删除</a>\";\r\n");
      out.write("                }}\r\n");
      out.write("            ],\r\n");
      out.write("            \"columnDefs\":[ //定义列的特征\r\n");
      out.write("                {targets: [0], visible: false},\r\n");
      out.write("                {targets:[1,2,5,7],orderable:false}\r\n");
      out.write("            ],\r\n");
      out.write("            \"language\":{ //定义中文\r\n");
      out.write("                \"search\": \"请输入书籍名称:\",\r\n");
      out.write("                \"zeroRecords\":    \"没有匹配的数据\",\r\n");
      out.write("                \"lengthMenu\":     \"显示 _MENU_ 条数据\",\r\n");
      out.write("                \"info\":           \"显示从 _START_ 到 _END_ 条数据 共 _TOTAL_ 条数据\",\r\n");
      out.write("                \"infoFiltered\":   \"(从 _MAX_ 条数据中过滤得来)\",\r\n");
      out.write("                \"loadingRecords\": \"加载中...\",\r\n");
      out.write("                \"processing\":     \"处理中...\",\r\n");
      out.write("                \"paginate\": {\r\n");
      out.write("                    \"first\":      \"首页\",\r\n");
      out.write("                    \"last\":       \"末页\",\r\n");
      out.write("                    \"next\":       \"下一页\",\r\n");
      out.write("                    \"previous\":   \"上一页\"\r\n");
      out.write("                },\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        //添加新书籍\r\n");
      out.write("        $(\"#saveForm\").validate({\r\n");
      out.write("\r\n");
      out.write("            errorElement:\"span\",\r\n");
      out.write("            errorClass:\"text-danger\",\r\n");
      out.write("            rules:{\r\n");
      out.write("                bookname:{\r\n");
      out.write("                    required:true\r\n");
      out.write("                },\r\n");
      out.write("                bookauthor:{\r\n");
      out.write("                    required:true\r\n");
      out.write("                },\r\n");
      out.write("                bookprice:{\r\n");
      out.write("                    required:true,\r\n");
      out.write("                    number:true\r\n");
      out.write("                },\r\n");
      out.write("                booknum:{\r\n");
      out.write("                    required:true,\r\n");
      out.write("                    digits:true\r\n");
      out.write("                }\r\n");
      out.write("            },\r\n");
      out.write("            messages:{\r\n");
      out.write("                bookname:{\r\n");
      out.write("                    required:\"请输入书籍名称\"\r\n");
      out.write("                },\r\n");
      out.write("                bookauthor:{\r\n");
      out.write("                    required:\"请输入作者\"\r\n");
      out.write("                },\r\n");
      out.write("                bookprice:{\r\n");
      out.write("                    required:\"请输入价格\",\r\n");
      out.write("                    number:\"请输入正确的价格\"\r\n");
      out.write("                },\r\n");
      out.write("                booknum:{\r\n");
      out.write("                    required:\"请输入数量\",\r\n");
      out.write("                    digits:\"请输入正确的数量\"\r\n");
      out.write("                }\r\n");
      out.write("            },\r\n");
      out.write("\r\n");
      out.write("            submitHandler:function(form){\r\n");
      out.write("                $.post(\"/datatable/new\",$(form).serialize())\r\n");
      out.write("                        .done(function(data){\r\n");
      out.write("                            if (data==\"success\"){\r\n");
      out.write("\r\n");
      out.write("                                //添加成功是下拉框自动隐藏\r\n");
      out.write("                                $(\"#newBookModal\").modal('hide');\r\n");
      out.write("                                //自动刷新吧添加的书籍显示最上方\r\n");
      out.write("                                dataTables.ajax.reload();\r\n");
      out.write("                            }\r\n");
      out.write("                        })\r\n");
      out.write("                        .fail(function(){\r\n");
      out.write("                            alert(\"请求服务器错误\");\r\n");
      out.write("                        });\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        $(\"#newBookBtn\").click(function(){\r\n");
      out.write("\r\n");
      out.write("            //添加书籍成功后表单重置，还有一种就是添加成功后重置\r\n");
      out.write("            $(\"#saveForm\")[0].reset();\r\n");
      out.write("            $(\"#newBookModal\").modal({\r\n");
      out.write("\r\n");
      out.write("                show : true,\r\n");
      out.write("                backdrop : 'static',//点击其它地方下拉框不会取消\r\n");
      out.write("                keyboard : false //点击esc下拉框也不会取消\r\n");
      out.write("            });\r\n");
      out.write("        })\r\n");
      out.write("\r\n");
      out.write("        //表单提交加验证\r\n");
      out.write("        $(\"#saveBtn\").click(function(){\r\n");
      out.write("\r\n");
      out.write("            $(\"#saveForm\").submit();\r\n");
      out.write("        })\r\n");
      out.write("\r\n");
      out.write("        //删除书籍（事件委托机制）\r\n");
      out.write("        //下面方法执行不了删除，因为异步执行网页是超链接有可能没被绑定上\r\n");
      out.write("        /*$(\".delLink\").click(function(){\r\n");
      out.write("            alert(\"xxx\");\r\n");
      out.write("        })*/\r\n");
      out.write("\r\n");
      out.write("        $(document).delegate(\".delLink\",\"click\",function(){\r\n");
      out.write("            var id = $(this).attr(\"rel\");\r\n");
      out.write("            $.get(\"datatable/\"+id+\"/del\")\r\n");
      out.write("                    .done(function(data){\r\n");
      out.write("\r\n");
      out.write("                    }).fail(function(){\r\n");
      out.write("\r\n");
      out.write("                        alert(\"请求服务器异常\");\r\n");
      out.write("\r\n");
      out.write("                    })\r\n");
      out.write("        })\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/views/datatables/list.jsp(67,32) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/datatables/list.jsp(67,32) '${types}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${types}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/datatables/list.jsp(67,32) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("type");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                    <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${type.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${type.booktype}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent(null);
    // /WEB-INF/views/datatables/list.jsp(75,32) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/datatables/list.jsp(75,32) '${pubs}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${pubs}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/datatables/list.jsp(75,32) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("pub");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                    <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pub.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pub.pubname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }
}
