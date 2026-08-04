package org.example.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.model.User;
import org.example.service.UserService;

import java.io.IOException;
import java.util.List;

@WebServlet("/users")
public class UserServlet extends HttpServlet {

    private UserService userService = new UserService();

    @Override
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response) throws IOException {
        Integer id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");

        if( id==null || name==null || email==null || mobile==null){
            response.setStatus(400);
            response.setContentType("application/json");
            response.getWriter().write("{\"message\":\"Some Fields are missing\"}");
        }

        User user = new User(id, name, email, mobile);
        User createdUser = userService.createUser(user);

        response.setStatus(200);
        response.setContentType("application/json");
        response.getWriter().write("{\"message\":\"User Added SuccessFully\"}");

    }

    @Override
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws IOException {
        String idParam = request.getParameter("id");

        if(idParam==null){
            List<User> users = userService.getAllUsers();
            response.setStatus(200);
            response.setContentType("application/json");
            response.getWriter().write(userToJson(users));
            return;
        }


        Integer id = Integer.parseInt(idParam);
        User userResp = userService.getUserById(id);

        if(userResp == null){
            response.setStatus(404);
            response.setContentType("application/json");
        }
        response.setStatus(200);
        response.setContentType("application/json");
        response.getWriter().write(userToJson(userResp));
    }

    @Override
    public void doPut(HttpServletRequest request,
                      HttpServletResponse response){

    }

    @Override
    public void doDelete(HttpServletRequest request,
                         HttpServletResponse response){

    }

    private String userToJson(User user){
        return "{\n" +
                " \"id\" : " + user.getId() + ",\n" +
                " \"name\" : \"" + user.getName() + "\",\n" +
                " \"email\" : \"" + user.getEmail() + "\",\n" +
                " \"mobile\" : \"" + user.getMobile() + "\"\n" +
                "}";
    }

    private String userToJson(List<User> users){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");

        for(int i=0; i<users.size(); i++){
            stringBuilder.append(userToJson(users.get(i)));

            if(i < users.size() - 1) {
                stringBuilder.append(",");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }


}
