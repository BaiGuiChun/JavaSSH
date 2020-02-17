package com.ssh.action.comm;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ssh.model.Commodity;
import com.ssh.service.comm.CommService;
import com.ssh.util.PageBean;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;

//商品信息
@Controller("commAction")
public class CommAction extends ActionSupport implements ModelDriven<Commodity> {
    private Commodity commodity;
    @Autowired
    private CommService commService;

    @Override
    public Commodity getModel() {
        if (commodity==null){
            commodity = new Commodity();
        }
        return commodity;
    }

    private Integer currPage = 1;
    public void setCurrPage(Integer currPage){this.currPage=currPage;}

    public String findAll(){
        /*
        * HttpServletRequest request=ServletActionContext.getRequest();
        PageBean<Commodity> pageBean = commService.findByPage(currPage);
        ActionContext.getContext().getValueStack().push(pageBean);
        String rq=request.getParameter("type");
        if ("find".equals(rq)){
            return "findAll";
        }else{
            return "dataBack";
        }
        * */
        PageBean<Commodity> pageBean = commService.findByPage(currPage);
        ActionContext.getContext().getValueStack().push(pageBean);
            return "findAll";
    }
//    跳转新增页面
    public String saveJSP(){return "saveJSP";}

//    新增
    public String save(){
        commService.save(commodity);
        return "save";
    }
//   编辑
//    public String editJSP(){
//        commodity=commService.findById(commodity.getCommid());
//        return "editJSP";
//    }

    public String update(){
        commService.update(commodity);
        return "update";
    }

    public String delete(){
        commService.delete(commodity);
        return "delete";
    }
    public String findByIds(){
//        HttpServletRequest request= ServletActionContext.getRequest();
        commodity=commService.findById(commodity.getCommid());
//        String rq=request.getParameter("type");
//        if ("edit".equals(rq)){
            return "editJSP";
//        }else{
//            return "dataBack";
//        }
    }

}
