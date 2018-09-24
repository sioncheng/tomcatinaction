package com.github.sioncheng.tia.wap1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("hello doGet");
        resp.getWriter().write(System.lineSeparator());
        resp.getWriter().write(getOutputText());
        resp.getWriter().flush();
        resp.getWriter().close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("hello doPost");
        resp.getWriter().write(System.lineSeparator());
        resp.getWriter().write(getOutputText());
        resp.getWriter().flush();
        resp.getWriter().close();
    }

    private String getOutputText() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(MyClass.getMyClassLoader().toString());
        stringBuilder.append(System.lineSeparator());
        stringBuilder.append(MyClass.getLoadCounter());
        stringBuilder.append(System.lineSeparator());

        return stringBuilder.toString();
    }
}
