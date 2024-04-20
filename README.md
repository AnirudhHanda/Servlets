# Learning Servlets

Welcome to my Servlet learning repository! Here, I document my journey of learning Servlets from scratch. Each commit represents a milestone in my learning process, covering various topics related to Servlet development.

![Servlet Logo](assets/images/javaBanner.png)

## Table of Contents

1. [Introduction to Servlet](#introduction-to-servlet)
2. [Eclipse Setup & Tour](#eclipse-setup--tour)
3. [Configure Tomcat in Eclipse](#configure-tomcat-in-eclipse)
4. [Eclipse & Tomcat Setup on Windows](#eclipse--tomcat-setup-on-windows)
5. [Creating Web Project in Eclipse](#creating-web-project-in-eclipse)
6. [Create Servlet & Web.xml](#create-servlet--webxml)
7. [GET & POST Method](#get--post-method)
8. [RequestDispatcher | Calling a Servlet from Servlet](#requestdispatcher--calling-a-servlet-from-servlet)
9. [HttpServletRequest & HttpServletResponse](#httpservletrequest--httpservletresponse)
10. [RequestDispatcher & sendRedirect Theory](#requestdispatcher--sendredirect-theory)
11. [sendRedirect | URL Rewriting](#sendredirect--url-rewriting)
12. [HttpSession | Cookie](#httpsession--cookie)
13. [ServletConfig & ServletContext](#servletconfig--servletcontext)
14. [Servlet Annotation Configuration](#servlet-annotation-configuration)

## Introduction to Servlet

I started with Learning about the basics of Java Development like .What is Java EE (now Jakarta EE) and What is Tomcat ?
Jakarta EE: It is a commercial-grade platform that offers a set of components and APIs for the development of Java Business Applications.
            Director of Eclipse Foundation - "Mike Milinkovich" says "Jakarta EE extends the popular java SE with specifications for                    developting and running scalable, reliable and secure enterprise applications.

            ### Basically: 
            "Jakarta EE is a collection of APIs and a framework for creating new ones"
            It helps old applications using deprecated tech to cope up with new modern tech stack
Apache Tomcat: It is an Open-Source Web-Server and Servlet container for java code.
               It is a Production-Redy Java Development tool used to implement many types of Jakarta EE specifications.
               Tomcat is widely used by many companies as it implements many of the Jakarta EE specifications like:
                 1. Java Servlet
                 2. Java Server Pages [JSP]
                 3. Java Expression Language.
                 4. Java WebSockets

Finally, What is a Servlet:
"Servlet is just an API (our created and java based) which helps us to create Web Applications"

## Eclipse Setup & Tour

I would have preferred Intellij, as I was already into using it, but as the Ultimate edition is paid, I shifted to Eclipse which infact is worth IDE for Java Web Developers. 
It offers a lot of specifications in itself with an inbuilt web browser as well.


## Configure Tomcat in Eclipse

To confifure Tomcat in Eclipse: 
  1. Downnload an appropriate version of Tomcat for your system from : https://tomcat.apache.org/download-90.cgi
  2. Also download the documentation file.
  3. Extract the Tomcat file and put into a suitable folder
  4. In your eclipse, in your Servers tab at the bottom, configure the Tomcat server version you downloaded just by following the steps.
  5. Carefully configure the port used by the Tomcat server (usually 8080)
  6. Wallah, You can check your Tomacat Server Up and Running at localhost:8080

## Eclipse & Tomcat Setup on Windows

I was on Ubuntu lmaooooo.....

## Creating Web Project in Eclipse

Okay, in here we created our first static page using tomcat and Eclipse only.
Created an index.html file by right clicking on the MyApp directory and following the steps:
  1. Created a normal index.html file with some text to display
  2. Right click on index.html and Choose Run As on Server
  3. Okay you are all set to see your static page at localhost:8080/MyApp, yes!!


## Create Servlet & Web.xml

Okay now we started with the main part of creating Servlets:

Basically, we want the dynamic pages, which can interact with the users(clients) and not only the client side programming, 
and for the purpose of server side programming and handle some Client side requests we use Servlets which i mentioned earliar as well is a an API created by you handle a request form the client.

First, we started by creating a to be dynamic page index.html with a form having action="add" and two inputs for num1 and num1 (names) and 
a  submit button to submit the request to the server (tomcat)

Second, we created a Servlet ###Addservlet (Nothing but a Java Class which extends HttpServlet) implemting the method service (for both get and post requests) taking two parameters (obviously the Request Object [HttpServletRequest object] and a Response Object [HttpServletResponse object] ) 

okay, then perform the logic inside the service method.

  ### now the main task:
      How does Tomcat knows that for the client request on /add I need to call the AddServlet
      For this you need to configure the Deployment Descriptor Web.xml 
      In Web.xml you need to give <servlet> and <servlet-mapping>
          ** important in <servlet> you have <servlet-name> and <servlet-class> [in servlet-class - you need to give a fully qualified class name]

After doing all this clients get request will go to the server Tomcat with data in the Query String and the result will be given.

## GET & POST Method

The HTTP protocol that we are using for Web Application has many different methods: 
  1. Get: To fetch data from the server.
  2. Post: To send data to the server.
  3. Put: To put or update data on the server
  4. Delete: To delete data on the server
  5. Options: to do some or the other thing..idk rn...
     
So, If you don't want your data to go to the server openly in query string, so we can use the post request, in your form action = "add" but method = "post"

The service method in AddServlet can handle both the Get and Post requests but there are some specific mehtods as well which we can use:
  1. doGet: To only handle the get request
  2. doPost: To only handle the post request

## RequestDispatcher | Calling a Servlet from Servlet

Okay, now if the logic to be implemented in your Servlet is too complex and you want to follow sort (kind of) of n-tier architecture:
  That is you want to send the request and some computed data form the one servlet to another, we can use:
    1. RequestDispatcher 
    2. Re-Direct [later]

  RequestDispatcher: allows you to send the data and request from one servlet to another.

## HttpServletRequest & HttpServletResponse

...

## RequestDispatcher & sendRedirect Theory

...

## sendRedirect | URL Rewriting

...

## HttpSession | Cookie

...

## ServletConfig & ServletContext

...

## Servlet Annotation Configuration

...

