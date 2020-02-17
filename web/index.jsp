<%--
  Created by IntelliJ IDEA.
  User: guichun
  Date: 2020/1/9
  Time: 7:24 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<jsp:include page="jsp/include/head.jsp"></jsp:include>

<div class="row m-t-lg">
  <div class="col-sm-6">
    <div>
      <table class="table">
        <tbody>
        <tr>
          <td>
            <button type="button" class="btn btn-danger m-r-sm">12</button>
            消息
          </td>
          <td>
            <button type="button" class="btn btn-primary m-r-sm">28</button>
            文章
          </td>
          <td>
            <button type="button" class="btn btn-info m-r-sm">15</button>
            评论
          </td>
        </tr>
        <tr>
          <td>
            <button type="button" class="btn btn-info m-r-sm">20</button>
            新闻
          </td>
          <td>
            <button type="button" class="btn btn-success m-r-sm">40</button>
            赞
          </td>
          <td>
            <button type="button" class="btn btn-danger m-r-sm">30</button>
            通知
          </td>
        </tr>
        <tr>
          <td>
            <button type="button" class="btn btn-warning m-r-sm">20</button>
            专辑
          </td>
          <td>
            <button type="button" class="btn btn-default m-r-sm">40</button>
            群组
          </td>
          <td>
            <button type="button" class="btn btn-warning m-r-sm">30</button>
            权限
          </td>
        </tr>
        </tbody>
      </table>
    </div>
    <div>
    </div>
  </div>
</div>
