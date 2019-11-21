package com.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployInsertController {
@RequestMapping("/emp")
public ModelAndView empIns(HttpServletRequest req,HttpServletResponse res){
	ApplicationContext ctx=new ClassPathXmlApplicationContext("com/spring/applicationContext.xml");
	DataSource dataSource=(DriverManagerDataSource)ctx.getBean("dataSource");
	JdbcTemplate jt=new JdbcTemplate(dataSource);
	String sql="insert into employ values(?,?,?,?,?)";
	int eno=Integer.parseInt(req.getParameter("empno"));
	String name=req.getParameter("name");
	String dept = req.getParameter("DEPT");
	String desig=req.getParameter("desig");
	int basic=Integer.parseInt(req.getParameter("basic"));
	jt.update(sql,new Object[]{eno,name,dept,desig,basic});
	return new ModelAndView("resultpage","message","Record Inserted....");
}
}
