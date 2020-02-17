<%--
  Created by IntelliJ IDEA.
  User: guichun
  Date: 2020/1/18
  Time: 10:09 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<div class="margin-top-30 text-align-right">
    <div class="next">
        <ul class="pagination">
            <spen>总记录数:<s:property value="totalCount"/> &nbsp;&nbsp;每页显示:<s:property value="pageSize"/> </spen>
            <s:if test="currPage !=1">
            <li><a href="<%=basePath%>/dict_findAll.do?currPage=1">首页</a></li>
            <li class="disabled"><a>上一页</a></li>
            <li><a href="<%=basePath%>/dict_findAll.do?currPage=<s:property value="currPage-1"/> ">上一页</a></li>
            </s:if>

            <s:if test="currPage != totalCount">
            <li class="disabled"><a>下一页</a></li>
            <li><a href="<%=basePath%>/dict_findAll.do?currPage=<s:property value="currPage+1"/>">下一页</a></li>
            <li><a href="<%=basePath%>/dict_findAll.do?currPage=<s:property value="totalCount"/>">尾页</a></li>
            </s:if>
        </ul>
    </div>
</div>
