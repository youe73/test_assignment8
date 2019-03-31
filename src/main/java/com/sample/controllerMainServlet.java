package com.sample;

import com.sample.model.menu;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@WebServlet(name = "controllerMainServlet",urlPatterns = "/controllerMainServlet")
public class controllerMainServlet extends HttpServlet {

    List orderList = new ArrayList();
    List <menu> menuList= new ArrayList<menu>();

    @Override
    protected void doPost(
            HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        orders order = new orders();

        menu menupage = new menu(1, "vesuvio", "tomatsovs, ost, skinke, oregano", 57);
        menu menupage2 = new menu(2, "Amerikaner", "tomatsovs, ost, oksefars, oregano", 53);
        menu menupage3 = new menu(3, "Cacciatore", "tomatsovs, ost, pepperoni", 57);
        menu menupage4 = new menu(4, "Carbona", "tomassovs, ost, kødsovs", 63);
        menu menupage5 = new menu(5, "Dennis", "tomatsovs, ost, skinke, oregano, cocktailpølser", 65);


        menuList.add(menupage);
        menuList.add(menupage2);
        menuList.add(menupage3);
        menuList.add(menupage4);
        menuList.add(menupage5);

        String name = "Jane"; //create a string
        String name2 = "Gert";
        //int id_num = (int)menupage.id;
        Object id_num = menupage.id;

        StringBuilder sb=new StringBuilder(menupage.description);

        request.setAttribute("description",sb.toString());
        request.setAttribute("menuid",id_num.toString());

        request.setAttribute("menus",menuList);
        request.setAttribute("orderlist",orderList);

        request.getRequestDispatcher("index.jsp").forward(request,response); //forward it



    }


}
