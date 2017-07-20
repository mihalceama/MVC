package ro.teamnet.zth;

import ro.teamnet.zth.api.annotations.Table;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Alexandra.Mihalcea on 7/20/2017.
 */

public class MyDispatcherServlet extends HttpServlet {


    private void dispatchReply (HttpServletRequest request, HttpServletResponse response, String methodType){
        try{
            Object resultToDisplay = dispatch(request, methodType);
            reply(response,resultToDisplay);
        } catch (Exception e){
            sendExceptionError(e);
        }

    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        dispatchReply(req, resp, "GET");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        dispatchReply(req, resp, "POST");
    }


    private void sendExceptionError(Exception e) {

    }

    private void reply(HttpServletResponse response, Object object) throws IOException {
        response.getWriter().write("Hello " + object);
    }

    private Object dispatch(HttpServletRequest request, String methodType) {
return null;
    }

}
