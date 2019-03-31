package com.sample;

import com.sample.model.menu;

import java.util.ArrayList;

public class orders {

    /*LocalDateTime localDateTime = LocalDateTime.now();*/
    /*List orderList = new ArrayList();*/
    public String name;
    public int phone;
    public int orderid;

    ArrayList<menu> orderlist;

    public ArrayList<menu>getOrder()
    {
        return orderlist;
    }

    public menu createOrder(menu id)
    {
        orderlist.add(id);
        return id;
    }

    public String displayOrders()
    {
        double total=0;
        String display="";

        for (menu item: orderlist)
        {
            total = total + item.price;
            display = display + item.id + " " + item.productname + " " + item.price + "\n";
            //System.out.println(item);
        }
        display = display + "";
        return display;
    }

    public menu addProduct(menu orderId)
    {
        orderlist.add(orderId);
        return orderlist.get(orderid);
    }

    public menu subtractProduct(int orderId)
    {
        if(orderlist.contains(orderId))
        orderlist.remove(orderId);
        return orderlist.get(orderId);
    }




    /*
     * menulist
     * 1, "vesuvio", "tomatsovs, ost, skinke, oregano",57;
     * 2, "Amerikaner","tomatsovs, ost, oksefars, oregano",53;
     * 3, "Cacciatore","tomatsovs, ost, pepperoni",57;
     * 4, "Carbona","tomassovs, ost, kødsovs",63;
     * 5, "Dennis","tomatsovs, ost, skinke, oregano, cocktailpølser",65;
     *
     * */




}
