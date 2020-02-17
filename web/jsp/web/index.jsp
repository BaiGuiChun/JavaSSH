<%--
  Created by IntelliJ IDEA.
  User: guichun
  Date: 2020/1/12
  Time: 12:04 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--head开始--%>
<jsp:include page="/jsp/include/head.jsp"></jsp:include>
<%--head结束--%>
<body class="fixed-sidebar full-height-layout gray-bg" style="overflow:hidden">
<div id="wrapper">
    <%--左开始--%>
    <jsp:include page="/jsp/include/leftNav.jsp"></jsp:include>


    <%--    右开始--%>
    <jsp:include page="/jsp/include/rightNav.jsp"></jsp:include>
</div>
<%--fooder开始--%>
<jsp:include page="/jsp/include/footerScript.jsp"></jsp:include>
<%--fooder结束--%>
