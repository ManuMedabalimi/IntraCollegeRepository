<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Login</title>
  <style media="screen">
    body{
      background-image: url(images/header3.jpg);
      width: 360px;
  padding: 8% ;
  margin: auto;
  background-attachment: fixed;
  background-repeat: no-repeat;
    background-size: 100% 100%;


    }
    #h1{
      background-color:#3D6EFF;
      padding:10px;
      color:white;
      border: 2px groove white;
      text-align: center;

    }

  </style>
</head>
<body align="center">

    <form  action="admin" method="get">
      <h1 id="h1">Admin Login</h1>
      <label for="">Admin ID :</label>
      <input type="text" name="userName" placeholder="admin id" />
      <br><br>
      <label for="">Password :</label>
      <input type="password" name="passWord" placeholder="admin password"/>
      <br><br>
      <button>login</button>

    </form>

  </body>
</html>