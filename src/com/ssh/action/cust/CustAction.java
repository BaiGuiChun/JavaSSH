package com.ssh.action.cust;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ssh.model.Customer;
import com.ssh.service.cust.CustService;
import com.ssh.util.PageBean;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;

//客户信息
@Controller("custAction")
public class CustAction extends ActionSupport implements ModelDriven<Customer>{
    private Customer customer;
    @Autowired
    private CustService custService;

    @Override
    public Customer getModel() {
        if (customer==null){
            customer =  new Customer();
        }
        return customer;
    }

    private Integer currPage=1;
    public void setCurrPage(Integer currPage){this.currPage=currPage;}

//    分页查询
    public String findAll(){
        PageBean<Customer> pageBean = custService.findByPage(currPage);
        //把pageBean存入值栈
        ActionContext.getContext().getValueStack().push(pageBean);
        return "findAll";
    }


//    跳转新增页面
    public String saveJSP() {return "saveJSP";}

//    新增
    public String save(){
        custService.save(customer);
        return "save";
    }

//    编辑页面
//    public String editJSP(){
//        String rp = request.getParameter("type");
//        System.out.println(rp);
//
//        customer=custService.findById(customer.getCustId());
//
//        return "editJSP";
//    }
//    修改
    public String update(){
        custService.update(customer);
        return "update";
    }
//    删除
    public String delete(){
        customer=custService.findById(customer.getCustId());
        custService.delete(customer);
        return "delete";
    }

    public String findByIds(){
//        HttpServletRequest request=ServletActionContext.getRequest();
        customer=custService.findById(customer.getCustId());
//        String rq=request.getParameter("type");
//        if ("edit".equals(rq)){
            return "editJSP";
//        } else {
//            return "dataBack";
//        }
    }
}
