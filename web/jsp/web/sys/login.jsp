<%--
  Created by IntelliJ IDEA.
  User: guichun
  Date: 2020/1/12
  Time: 12:55 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="/jsp/include/head.jsp"></jsp:include>
<%@ taglib prefix="s" uri="/struts-tags" %>

<body class="gray-bg">
<div class="middle-box text-center loginscreen  animated fadeInDown">
    <div>
        <div>

            <h1 class="logo-name">Hi</h1>

        </div>
        <h3>欢迎使用 H+</h3>
        <s:form action="sys_login.do" namespace="/" method="POST">
            <div class="form-group">
                <input type="text" class="form-control" placeholder="用户名" name="username" required="" maxlength="10">
            </div>
            <div class="form-group">
                <input type="password" class="form-control" placeholder="密码" name="password" required="" maxlength="10">
            </div>
            <button type="submit" class="btn btn-primary block full-width m-b">登 录</button>

            <p class="text-muted text-center"> <a><small>忘记密码了？</small></a> | <a>注册一个新账号</a>
            </p>
        </s:form>
    </div>
</div>
<jsp:include page="/jsp/include/footerScript.jsp"></jsp:include>
<script>if(window.top !== window.self){ window.top.location = window.location;}</script>
</body>
