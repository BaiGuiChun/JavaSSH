预 项目开发流程

一.基础数据表
 1.字典（sys_dictionaries）
 2.客户信息（customer）
 3.商品（commodity）
 4.用户（user）
 5.中间表（dict_cust）
 
二.业务流程
  维修中心（maintenance）：
  下单安排:（order）客户购物商品
  派工维修:（worker）工人对当前工作进行维修
  结算订单:（settlement）商品价格计算
  
  库存中心（inventory）：
  选购零件：（shopping）购物
  出售零件：（sell）卖给别人
  结算订单：（settlement）商品价格计算（支出和收入）
 
 
本来项目使用Struts2+Spring+Hibernate等技术完成的
