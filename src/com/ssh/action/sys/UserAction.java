package com.ssh.action.sys;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ssh.model.User;
import com.ssh.service.sys.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller("userAction")
public class UserAction  extends ActionSupport implements ModelDriven<User> {
    //注入UserService
    @Autowired
    private UserService userService;

    private User user;

    //    接受页面数据
    @Override
    public User getModel() {
        if (user==null){
           user = new User();
        }
        return user;
    }

    public String jump(){
        return INPUT;
    }
    public String index(){
        return "index";
    }

//    public String login(){
//        System.out.println("login ok");
//        User dbUser = userService.login(user.getUsername());
//        if (dbUser==null){
//            message="没有此用户";
//            return "jump";
//        }else {
//            if (dbUser.getUsername().equals(dbUser.getPassword())){
//                return "login";
//            }else {
//                message="密码错误";
//                return "jump";
//            }
//        }
//    }
    public String login(){
        User user1 = userService.login(user);
        if (user1==null){
            this.addActionError("用户名称和密码错误！");
            return INPUT;
        }else {
            ActionContext.getContext().getSession().put("user",user1);
            return SUCCESS;
        }
    }

}
