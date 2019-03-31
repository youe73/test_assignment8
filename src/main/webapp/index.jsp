<%@ page import ="java.util.*" %>
<%@ page import="com.sample.controllerMainServlet"%>
<%@ page import="com.sample.model.menu"%>
<%@ page import="com.sample.orders"%>
<%@ page import = "java.lang.*"%>

<html>
 <title>Marios Pizzabar</title>
<body>
<h2>Welcome to Marios Pizza</h2>

<%

List<menu> menulist = new ArrayList<menu>();

        menu menupage = new menu(1, "vesuvio", "tomatsovs, ost, skinke, oregano", 57);
        menu menupage2 = new menu(2, "Amerikaner", "tomatsovs, ost, oksefars, oregano", 53);
        menu menupage3 = new menu(3, "Cacciatore", "tomatsovs, ost, pepperoni", 57);
        menu menupage4 = new menu(4, "Carbona", "tomassovs, ost, koedsovs", 63);
        menu menupage5 = new menu(5, "Dennis", "tomatsovs, ost, skinke, oregano, cocktailpoelser", 65);

       menulist.add(menupage);
        menulist.add(menupage2);
        menulist.add(menupage3);
        menulist.add(menupage4);
        menulist.add(menupage5);



//List<Integer> orderList = new ArrayList<Integer>();
List orderList = new ArrayList();
orders order = new orders();
     /*   order.addProduct(menupage.id,orderList);
        order.addProduct(menupage2.id,orderList);
        order.addProduct(menupage3.id,orderList);
        order.addProduct(menupage4.id,orderList);
        order.addProduct(menupage5.id,orderList);
        */

       // out.println(menupage2.id);

%>



<form method="get" action="index.jsp">
<%


if(request.getAttribute("description")!=null && request.getAttribute("menuid")!=null)
{
Object menu_description =request.getAttribute("description");
Object menu_id =request.getAttribute("menuid");
out.print("Welcome, " + menu_id + " " + menu_description );
}
/*
if(request.getAttribute("menus")!=null)
{
List menu_iters =(List)request.getAttribute("menus");
Iterator<menu> menudisplay = menu_iters.iterator();

while (menudisplay.hasNext()) {
			out.println(menudisplay.next() + "advanced iterator");
		}
}
*/
/*
for(menu i:menudisplay)
    {
       //out.println(i.id+"" + i.id + " " + i.productname + " " + i.description + " " + i.price + "Kr" + "</br>");
       out.println(i.toString() + "</br>");

    }
*/


/*
List order_iter =(List)request.getAttribute("orderlist");

ListIterator<menu> it=order_iter.listIterator();
//Iterator it = order_iter.iterator();


out.println("<br>Marios Pizza have <br>");
while(it.hasNext()){
        out.println(it.next()+"<br>");
        }
  }
*/
 %>
</form>


<form method="get" action="index.jsp">

<select name='selectedorder'>
<option value=0>Select your pizza</option>
    <% for(menu i:menulist)
    {
       out.println("<option value=" +i.id+">" + i.id + " " + i.productname + " " + i.description + " " + i.price + "Kr" + "</option>");
        //out.println("<option value=" +i+">" + i + "</option>");
    }
    %>
    </select>
    <input type="submit" name="adding" value="ADD">
      </form>

<%
if(request.getParameter("adding")!=null)
{
    String sValue = request.getParameter("selectedorder");
    //int val = Integer.parseInt(sValue);
    orderList.add(sValue+=1);

    //order.addProduct(val, orderList);
    }
 %>
 <div>Your Orders
     <%
      for(Object o:orderList)
      {
       out.println(o + "<br>");
      }
      //sValue
       %>
    </div>



<% out.println(" "); %>
<form method="post" action="controllerMainServlet">
<input type="text" name="customerName" placeholder="Name"><br>
<input type="text" name="phone" placeholder="phone"><br>

<input type="submit" value="Submit final order">


</form>
</body>
</html>
