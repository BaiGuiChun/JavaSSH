package com.ssh.action.inventory;

import com.opensymphony.xwork2.ActionSupport;
import org.springframework.stereotype.Controller;

@Controller("invAction")
public class InvAction extends ActionSupport {
    public String jump(){
        System.out.println("jump ok");
        return "jump";
    }
}
