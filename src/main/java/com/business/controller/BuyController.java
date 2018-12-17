package com.business.controller;

import com.business.model.Order;
import com.business.vo.OrderVO;
import com.common.util.WebUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by linan on 2018-12-08.
 * Description: 处理购买业务逻辑
 */


@Controller
@RequestMapping(value = "/order")
public class BuyController {

    /**
     * 下单订单操作
     * @param response
     * @param order
     */
    @RequestMapping(value = "/makeOrder")
    public void makeOrder(HttpServletResponse response, Order order){
        WebUtil.out(response,"order success");

    }


    /**
     * 撤销订单操作
     * @param response
     */
    @RequestMapping(value = "cancelOrder")
    public void cancelOrder(HttpServletResponse response){
        WebUtil.out(response,"cancel success");
    }

    /**
     * 查询订单操作
     * @param response
     * @param orderVO
     */
    @RequestMapping(value = "searchOrder")
    public void seacherOrder(HttpServletResponse response,OrderVO orderVO){
        WebUtil.out(response,"order data");
    }
}
