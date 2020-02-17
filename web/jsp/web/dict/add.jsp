<%--
  Created by IntelliJ IDEA.
  User: guichun
  Date: 2020/1/19
  Time: 8:09 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<jsp:include page="../../include/head.jsp"></jsp:include>
<jsp:include page="../../include/footerScript.jsp"></jsp:include>

<%--新增--%>
<style>
    label{
        display: inline-block;
        width: 100px;
        text-align: right;
    }
</style>

<div id="div_save" class="row">
    <div class="col-sm-12">
        <div class="ibox float-e-margins">
            <div class="ibox-title">
                <h5>新增商品数据</h5>
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
                <s:form action="dict_save.do" namespace="/" method="POST">
                <div class="col-md-12">
                    <div class="form-group">
                        <label class="col-sm-2 control-label">名称：</label>
                        <div class="col-sm-10">
                            <input type="text" name="name" class="form-control" placeholder="请输入文本" maxlength="10" > <span class="help-block m-b-none">输入长度:10</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">备注：</label>
                        <div class="col-sm-10">
                            <input type="text" name="bz" class="form-control" placeholder="请输入文本" maxlength="50" > <span class="help-block m-b-none">输入长度:50</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-12 col-sm-offset-3">
                            <button class="btn btn-primary" type="submit">保存内容</button>
                            <button onclick="c()" class="btn btn-white">取消</button>
                        </div>
                    </div>
                </div>
                </s:form>
            </div>
        </div>
    </div>
</div>
<script>
    function c() {
        history.go(-1);
    }
</script>