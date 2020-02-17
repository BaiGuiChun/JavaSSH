<%--
  Created by IntelliJ IDEA.
  User: guichun
  Date: 2020/1/25
  Time: 6:30 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<jsp:include page="../../include/head.jsp"></jsp:include>
<jsp:include page="../../include/footerScript.jsp"></jsp:include>
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

<div id="div_save" class="row">
    <div class="col-sm-12">
        <div class="ibox float-e-margins">
            <div class="ibox-title">
                <h5>客户数据</h5>
                <div class="ibox-tools">
                    <a class="collapse-link">
                        <i class="fa fa-chevron-up"></i>
                    </a>
                    <a class="dropdown-toggle" data-toggle="dropdown">
                        <i class="fa fa-wrench"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-user">
                    </ul>
                    <a class="close-link">
                        <i class="fa fa-times"></i>
                    </a>
                </div>
            </div>
            <div class="ibox-content">
                <s:form action=".do" namespace="/" method="POST" theme="simple">
                    <s:hidden name="dictId" value="%{model.dictId}"/>
                    <div class="col-md-4">
                        <div class="form-group">
                            <label class="col-sm-2 control-label">名称：</label>
                            <div class="col-sm-10">
                                <s:textfield name="cuname" value="%{model.cuname}"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">手机：</label>
                            <div class="col-sm-10">
                                <s:textfield name="phone" value="%{model.phone}" maxLength="11"/>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="form-group">
                            <label class="col-sm-2 control-label">身份证：</label>
                            <div class="col-sm-10">
                                <s:textfield name="cardid" value="%{model.cardid}" maxLength="18"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">地址：</label>
                            <div class="col-sm-10">
                                <s:textfield name="address" value="%{model.address}" maxLength="50"/>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="form-group">
                            <a class="btn btn-block btn-primary btn-sm" onclick="xz()">选择数据</a>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">性别：</label>
                            <div class="col-sm-10">
                                <s:radio name="gender" list="{'男','女'}" value="%{model.gender}"/>
                            </div>
                        </div>
                    </div>

                </s:form>
            </div>
        </div>
    </div>
</div>

<%--数据表格--%>
<div class="row">
    <div class="col-sm-12">
        <div class="ibox float-e-margins">
            <div class="ibox-title">
                <h5>商品数据表格</h5>
                <div class="ibox-tools">
                    <a class="collapse-link">
                        <i class="fa fa-chevron-up"></i>
                    </a>
                    <a class="dropdown-toggle" data-toggle="dropdown">
                        <i class="fa fa-wrench"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-user">
                        <li><a>选项1</a>
                        </li>
                        <li><a>选项2</a>
                        </li>
                    </ul>
                    <a class="close-link">
                        <i class="fa fa-times"></i>
                    </a>
                </div>
            </div>
            <div class="ibox-content">
                <div class="row">
                    <div class="col-sm-4">
                        <div class="input-group">
                            <input type="text" placeholder="请输入关键词" class="input-sm form-control"> <span class="input-group-btn">
                            <button type="button" class="btn btn-sm btn-primary"> 搜索</button> </span>
                        </div>
                    </div>

                    <div class="col-sm-4">
                        <a class="btn btn-block btn-primary btn-sm"
                           onclick="xzsp()"
                        >选择数据</a>
                    </div>
                    <div class="col-sm-4">
                        <a class="btn btn-block btn-danger btn-sm">
                            保存内容
                        </a>
                    </div>
                </div>
                <div class="table-responsive">
                    <table class="table table-hover" style="margin-bottom: 0;">
                        <thead>
                        <tr>
                            <th></th>
                            <th>#</th>
                            <th>名称</th>
                            <th>单位</th>
                            <th>产地</th>
                            <th>价格</th>
                            <th>修改操作</th>
                            <th>删除操作</th>
                        </tr>
                        </thead>
                        <tbody>
                        <s:iterator value="list" var="d">
                            <tr>
                                <td>
                                    <input type="checkbox" class="i-checks" name="cboxs" value="<s:property value="#d.commid"/>">
                                </td>
                                <td><s:property value="#d.commid"/> </td>
                                <td><s:property value="#d.coname"/> </td>
                                <td><s:property value="#d.company"/> </td>
                                <td><s:property value="#d.plaofo"/> </td>
                                <td><s:property value="#d.price"/> </td>
                                <td>
                                    <a href="<%=basePath%>/comm_editJSP.do?commid=<s:property value="#d.commid"/>" class="btn btn-info btn-xs"><i class="fa fa-edit"></i> 编辑</a>
                                </td>
                                <td>
                                    <a href="<%=basePath%>/comm_delete.do?commid=<s:property value="#d.commid"/>" class="btn btn-danger btn-xs"><i class="fa fa-edit"></i> 删除</a>
                                </td>
                            </tr>
                        </s:iterator>
                        </tbody>
                    </table>

                    <%-- 分页--%>
                    <div class="margin-top-30 text-align-right">
                        <div class="next">
                            <ul class="pagination">
                                <li><a href="<%=basePath%>/comm_findAll.do?currPage=1">首页</a></li>
                                <li><a href="<%=basePath%>/comm_findAll.do?currPage=<s:property value="currPage-1"/> ">上一页</a></li>
                                <li><a href="<%=basePath%>/comm_findAll.do?currPage=<s:property value="currPage + 1"/>">下一页</a></li>
                                <li><a href="<%=basePath%>/comm_findAll.do?currPage=<s:property value="totalCount"/>">尾页</a></li>
                                <li><spen>总记录数:<s:property value="totalCount"/> &nbsp;&nbsp;每页显示:<s:property value="pageSize"/> </spen></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<script>
    function c() {
        history.go(-1);
    }
    function xz() {
        //默认选择第二条数据
        openIframe.type02('选择客户数据','<%=basePath%>/cust_findAll.do',"<%=basePath%>/cust_findByIds.do?custId=2&type=dataBack");
    }
    function xzsp() {
        //默认选择第一条数据  --有bug
        openIframe.type02('选择商品数据','<%=basePath%>/comm_findAll.do?type=find',"<%=basePath%>/comm_findByIds.do?commid=1&type=dataBack");
    }


<%--获取复选框id--%>
    function cbox() {
        var checkbox = document.getElementsByName("cboxs");
        var id ="";
        for ( var i = 0; i < checkbox.length; i++) {
            if(checkbox[i].checked){
                id = id + checkbox[i].value+",";
            }
        }
        // return id;
    }

</script>
