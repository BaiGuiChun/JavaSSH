package com.ssh.action.maintenance;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ssh.model.CustComm;
import org.springframework.stereotype.Controller;

/*
* 因为使用多个model,所以使用属性驱动
* */
@Controller("maiAction")
public class MaiAction extends ActionSupport implements ModelDriven<CustComm> {
    private CustComm custComm;
    @Override
    public CustComm getModel() {
        if (custComm==null) {
            return custComm = new CustComm();
        }
        return custComm;
    }


//    查询信息状态卡（跳转页面）
    public String maiJSP(){
        return "maiJSP";
    }

//    下单安排
    
//    维修派工

//    结算订单

}
