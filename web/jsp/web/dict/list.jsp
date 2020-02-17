<%--
  Created by IntelliJ IDEA.
  User: guichun
  Date: 2020/1/13
  Time: 2:30 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%--字典基础数据--%>
<jsp:include page="../../include/head.jsp"></jsp:include>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<style>
    label{
        display: inline-block;
        width: 100px;
        text-align: right;
    }
</style>

<div class="row">
    <div class="col-sm-12">
        <div class="ibox float-e-margins">
            <div class="ibox-title">
                <h5>字典数据表格</h5>
                <div class="ibox-tools">
                    <a class="collapse-link">
                        <i class="fa fa-chevron-up"></i>
                    </a>
                    <a class="dropdown-toggle" data-toggle="dropdown">
                        <i class="fa fa-wrench"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-user">
                        <li><a href="table_basic.html#">选项1</a>
                        </li>
                        <li><a href="table_basic.html#">选项2</a>
                        </li>
                    </ul>
                    <a class="close-link">
                        <i class="fa fa-times"></i>
                    </a>
                </div>
            </div>
            <div class="ibox-content">
                <div class="row">
                    <div class="col-sm-3">
                        <div class="input-group">
                            <input type="text" placeholder="请输入关键词" class="input-sm form-control"> <span class="input-group-btn">
                            <button type="button" class="btn btn-sm btn-primary"> 搜索</button> </span>
                        </div>
                    </div>

                    <div class="col-sm-9 m-b-xs">
                        <a class="btn btn-block btn-primary btn-sm"
                        href="<%=basePath%>/dict_saveJSP.do"
                        >新增数据</a>
                    </div>
                </div>
                <div class="table-responsive">
                    <table class="table table-hover" style="margin-bottom: 0;">
                        <thead>
                        <tr>
                            <th></th>
                            <th>#</th>
                            <th>名称</th>
                            <th>备注</th>
                            <th>修改操作</th>
                            <th>删除操作</th>
                        </tr>
                        </thead>
                        <tbody>
                        <s:iterator value="list" var="d">
                        <tr>
                            <td>
                                <input type="checkbox" class="i-checks" name="cboxs" value="<s:property value="#d.dictId"/>">
                            </td>
                            <td><s:property value="#d.dictId"/> </td>
                            <td><s:property value="#d.name"/> </td>
                            <td><s:property value="#d.bz"/> </td>
                            <td>
                                <a href="<%=basePath%>/dict_editJSP.do?dictId=<s:property value="#d.dictId"/>" class="btn btn-info btn-xs"><i class="fa fa-edit"></i> 编辑</a>
                            </td>
                            <td>
                                <a href="<%=basePath%>/dict_delete.do?dictId=<s:property value="#d.dictId"/>" class="btn btn-danger btn-xs"><i class="fa fa-edit"></i> 删除</a>
                            </td>
                        </tr>
                        </s:iterator>
                        </tbody>
                    </table>

                    <%-- 分页--%>
                    <div class="margin-top-30 text-align-right">
                        <div class="next">
                            <ul class="pagination">
                                <li><a href="<%=basePath%>/dict_findAll.do?currPage=1">首页</a></li>
                                <li><a href="<%=basePath%>/dict_findAll.do?currPage=<s:property value="currPage-1"/> ">上一页</a></li>
                                <li><a href="<%=basePath%>/dict_findAll.do?currPage=<s:property value="currPage + 1"/>">下一页</a></li>
                                <li><a href="<%=basePath%>/dict_findAll.do?currPage=<s:property value="totalCount"/>">尾页</a></li>
                                <li><spen>总记录数:<s:property value="totalCount"/> &nbsp;&nbsp;每页显示:<s:property value="pageSize"/> </spen></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<jsp:include page="../../include/footerScript.jsp"></jsp:include>