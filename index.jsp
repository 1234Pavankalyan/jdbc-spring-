
    <beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:context="http://www.springframework.org/schema/context"
    xmlns:tx="http://www.springframework.org/schema/tx"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
http://www.springframework.org/schema/beans/spring-beans.xsd
http://www.springframework.org/schema/context
http://www.springframework.org/schema/context/spring-context.xsd
http://www.springframework.org/schema/tx
http://www.springframework.org/schema/tx/spring-tx-3.0.xsd"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
    <context:component-scan
        base-package="springmvc" />
<tx:annotation-driven/>
    <bean
        class="org.springframework.web.servlet.view.InternalResourceViewResolver"
        name="viewResolver">
        <property name="prefix" value="/WEB-INF/views/" />
<property name="suffix" value=".jsp" />
    </bean>
    <bean name="dataSource" class="org.springframework.jdbc.datasource.DriverManagerDataSource">
<property name="driverClassName" value="com.mysql.jdbc.Driver" />
<property name="url" value="jdbc:mysql://localhost:3306/userdb" />
<property name="username" value="root" />
<property name="password" value="" />
</bean>
<bean name="sessionFactory"
        class="org.springframework.orm.hibernate5.LocalSessionFactoryBean">
<property name="dataSource" ref="dataSource" />
<property name="hibernateProperties">
<props>
<prop key="hibernate.dialect">org.hibernate.dialect.MySQL5Dialect</prop>
<prop key="hibernate.show_sql">true</prop>
<prop key="hibernate.format_sql">true</prop>
<prop key="hibernate.hbm2ddl.auto">update</prop>
</props>
</property>
<property name="annotatedClasses">
<list>
<value>springmvc.Model.User</value>
</list>
</property>
</bean>
    <bean name="transactionManager"
        class="org.springframework.orm.hibernate5.HibernateTransactionManager">
<property name="sessionFactory" ref="sessionFactory" />
</bean>
    <bean name="hibernateTemplate"
        class="org.springframework.orm.hibernate5.HibernateTemplate">
<property name="sessionFactory" ref="sessionFactory" />
</bean>

</beans>
​[12:23 PM] 
      Mallela Vinay Kumar (Guest) no longer has access to the chat.
    ​[12:23 PM] 
      
      Mallela Vinay Kumar (Guest) was invited to the meeting.
      
    ​[12:24 PM] Karunakar Eeede
    <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
    content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!-- Bootstrap CSS -->
<link rel="stylesheet"
    href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
    integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
    crossorigin="anonymous">
<title>Hello, world!</title>
</head>
<body>
    <div class="container mt-5">
        <h1 class="text-center">Below Is User List</h1>
        <table class="table">
            <thead class="thead-dark">
                <tr>
                    <th scope="col">id</th>
                    <th scope="col">Email</th>
                    <th scope="col">Username</th>
                    <th scope="col">Password</th>
                    <th scope="col">Action</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${​​list}​​" var="u">
                    <tr>
                        <th scope="row">${​​u.id}​​</th>
                        <td>${​​u.email}​​</td>
                        <td>${​​u.username}​​</td>
                        <td>${​​u.password}​​</td>
                        <td>
                        <a href="delete/${​​u.id}​​" class="btn btn-danger">delete</a>
                        <a href="update/${​​u.id}​​" class="btn btn-primary">update</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <div class="container text-center">
<a href="contact.jsp" class="btn btn-primary">Add user</a>
</div>
    </div>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
    <script
        src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
    <script
        src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>
</body>
</html>
