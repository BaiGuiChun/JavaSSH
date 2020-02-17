<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: guichun
  Date: 2020/1/12
  Time: 12:02 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!--左侧导航开始-->
<nav class="navbar-default navbar-static-side" role="navigation">
    <div class="nav-close"><i class="fa fa-times-circle"></i>
    </div>
    <div class="sidebar-collapse">
        <ul class="nav" id="side-menu">
            <li class="nav-header">
                <div class="dropdown profile-element">
                    <span><img alt="image" class="img-circle" src="<%=basePath%>/H+/img/profile_small.jpg"/></span>
                    <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                                <span class="clear">
                               <span class="block m-t-xs"><strong class="font-bold"><s:property value="#User.username"></s:property></strong></span>
                                <span class="text-muted text-xs block">超级管理员<b class="caret"></b></span>
                                </span>
                    </a>
                    <ul class="dropdown-menu animated fadeInRight m-t-xs">
                        <li><a class="J_menuItem" href="profile.html">个人资料</a>
                        </li>
                        <li class="divider"></li>
                        <li><a href="login.html">安全退出</a>
                        </li>
                    </ul>
                </div>
                <div class="logo-element">H+
                </div>
            </li>
            <li>
                <a href="#">
                    <i class="fa fa fa-bar-chart-o"></i>
                    <span class="nav-label">维修中心</span>
                    <span class="fa arrow"></span>
                </a>
                <ul class="nav nav-second-level">
                    <li>
                        <a class="J_menuItem" href="<%=basePath%>/comm_findAll.do?type=dataBack">下单安排</a>
                        <a class="J_menuItem" href="<%=basePath%>/mai_maiJSP.do">派工维修</a>
                        <a class="J_menuItem" href="<%=basePath%>/mai_maiJSP.do">结算订单</a>
                    </li>
                </ul>
            </li>


            <li>
                <a href="#"><i class="fa fa-desktop"></i>
                    <span class="nav-label">库存中心</span>
                    <span class="fa arrow"></span>
                </a>
                <ul class="nav nav-second-level">
                    <li>
                        <a class="J_menuItem" href="<%=basePath%>/inv_jump.do">库存订单</a>
                    </li>
                </ul>
            </li>

            <li>
                <a href="#"><i class="fa fa-cutlery"></i> <span class="nav-label">基础数据</span><span
                        class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li><a class="J_menuItem" href="<%=basePath%>/dict_findAll.do">字典基础数据</a></li>
                    <li><a class="J_menuItem" href="<%=basePath%>/cust_findAll.do">客户基础数据</a></li>
                    <li><a class="J_menuItem" href="<%=basePath%>/comm_findAll.do?type=find">商品基础数据</a></li>
                </ul>
            </li>
        </ul>
    </div>
</nav>