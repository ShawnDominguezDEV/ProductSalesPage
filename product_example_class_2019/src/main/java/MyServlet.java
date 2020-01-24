import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

@WebServlet(name = "MyServlet")
public class MyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String url = "/index.jsp";

        ArrayList<Product> productArrayList = new ArrayList<Product>();

        String action = request.getParameter("fromProd");


        if (action.equals("prod1")) {

            double price = Double.parseDouble(request.getParameter("defPrice"));
            int quantity = Integer.parseInt(request.getParameter("defQuant"));
            String id = request.getParameter("defId");
            Product product = new Product(id,price,quantity);
            for (int i = 0; i < productArrayList.size(); i++) {

                if (productArrayList.size() == 0) {
                    productArrayList.add(product);
                    Cookie cookie = new Cookie("product1", product.toString());
                    response.addCookie(cookie);

                }

                else if (productArrayList.get(i).getProductId().equals(product.getProductId())) {
                    productArrayList.get(i).setProductQuant(product.getProductQuant() + 1);

                } else {
                    productArrayList.add(product);
                    Cookie cookie = new Cookie("product1", product.toString() );

                    response.addCookie(cookie);
                }

            }
        }
        if (action.equals("prod2")) {

            double price = Double.parseDouble(request.getParameter("defPrice"));
            int quantity = Integer.parseInt(request.getParameter("defQuant"));
            String id = request.getParameter("defId");
            Product product = new Product(id,price,quantity);
            for (int i = 0; i < productArrayList.size(); i++) {

                if (productArrayList.size() == 0) {
                    productArrayList.add(product);
                    Cookie cookie = new Cookie("product2", product.toString());
                    response.addCookie(cookie);

                }

                else if (productArrayList.get(i).getProductId().equals(product.getProductId())) {
                    productArrayList.get(i).setProductQuant(product.getProductQuant() + 1);

                } else {
                    productArrayList.add(product);
                    Cookie cookie = new Cookie("product2", product.toString() );

                    response.addCookie(cookie);
                }

            }
        }
        if (action.equals("prod3")) {

            double price = Double.parseDouble(request.getParameter("defPrice"));
            int quantity = Integer.parseInt(request.getParameter("defQuant"));
            String id = request.getParameter("defId");
            Product product = new Product(id,price,quantity);
            for (int i = 0; i < productArrayList.size(); i++) {

                if (productArrayList.size() == 0) {
                    productArrayList.add(product);
                    Cookie cookie = new Cookie("product3", product.toString());
                    response.addCookie(cookie);

                }

                else if (productArrayList.get(i).getProductId().equals(product.getProductId())) {
                    productArrayList.get(i).setProductQuant(product.getProductQuant() + 1);

                } else {
                    productArrayList.add(product);
                    Cookie cookie = new Cookie("product4", product.toString());

                    response.addCookie(cookie);
                }

            }
        }



        if(action.equals("checkout")){
            HttpSession mySession = request.getSession(true);
            Product product = new Product();
            mySession.setAttribute("productSession", product );


            Cookie[] cookies = request.getCookies();


            for (int i = 0; i < cookies.length; i++) {
                String prodCookie = CookieUtil.getCookieValue(cookies, "prod");
                Cookie productCookie = new Cookie("productCookie",prodCookie);
                productCookie.setMaxAge(60 * 60);
                productCookie.setPath("/");
                response.addCookie(productCookie);

            }


            url = "/page2.jsp";

        }


        getServletContext().getRequestDispatcher(url).forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
