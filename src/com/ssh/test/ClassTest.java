package com.ssh.test;

import com.opensymphony.xwork2.ActionContext;

public class ClassTest {
    public static void main(String[] args) {
        ActionContext context = ActionContext.getContext();
        System.out.println(context);
    }
}
