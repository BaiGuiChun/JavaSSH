var openIframe={
    type02:function (title,htmlContent,ajaxUrl) {
        layer.open({
            type: 2,
            title: title,
            shadeClose: true,
            area: ['60%', '70%'],
            content: htmlContent,
            btn:['确定','关闭'],
            yes:function () {
            //获取选中的ID，并返回
                window.location.href=ajaxUrl;
            },
            btn2:function () {
                // var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
                // parent.layer.close(index); //再执行关闭
            }
        });
    }
}