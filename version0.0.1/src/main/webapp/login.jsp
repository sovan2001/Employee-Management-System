<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<link rel="stylesheet" href="css/loginstyle.css">
</head>
<body>
<h1>${message}</h1>
<div>
  <div class="form-container">
    <h1>Login</h1>
    <form method="post" action="loginserv">
      <div class="form-group">
        <label for="username">Username:</label>
        <input type="text" class="form-control" id="username" name="username">
      </div>
      <div class="form-group">
        <label for="password">Password:</label>
        <input type="password" class="form-control" id="password" name="password">
      </div>
      <div class="form-group">
        <label for="user-type">User Type:</label>
        <select class="form-control" id="user-type" name="user-type">
          <option value="developer">Developer</option>
          <option value="manager">Manager</option>
          <option value="hr">HR</option>
        </select>
      </div>
      <button type="submit" class="btn btn-primary">Submit</button>
    </form>
  </div>
</div>
</body>
</html>