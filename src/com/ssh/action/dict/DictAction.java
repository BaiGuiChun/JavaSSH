package com.ssh.action.dict;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ssh.model.SysDictionaries;
import com.ssh.service.dict.DictService;
import com.ssh.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

//字典基础数据

@Controller("dictAction")
public class DictAction extends ActionSupport implements ModelDriven<SysDictionaries> {
    private SysDictionaries sysDictionaries;
    @Autowired
    private DictService dictService;
    @Override
    public SysDictionaries getModel() {
        if (sysDictionaries==null){
            sysDictionaries=new SysDictionaries();
        }
        return sysDictionaries;
    }


//    当前页面为1
    private Integer currPage = 1;
    public void setCurrPage(Integer currPage) {
        this.currPage = currPage;
    }

    //    分页查询
    public String findAll(){
        PageBean<SysDictionaries> pageBean = dictService.findByPage(currPage);
//        把pageBean存入值栈
        ActionContext.getContext().getValueStack().push(pageBean);
        return "findAll";
    }

//    跳转新增页面
    public String saveJSP(){return "saveJSP";}

//    新增
    public String save(){
        dictService.save(sysDictionaries);
        return "save";
    }

//    编辑页面
    public String editJSP(){
        sysDictionaries = dictService.findById(sysDictionaries.getDictId());
        return "editJSP";
    }

//    修改
    public String update(){
        dictService.update(sysDictionaries);
        return "update";
    }

//    删除
    public String delete(){
        sysDictionaries = dictService.findById(sysDictionaries.getDictId());
        dictService.delete(sysDictionaries);
        return "delete";
    }

}
