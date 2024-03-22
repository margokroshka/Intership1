<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello</title>
</head>
<body>
<style>
    .outer {
        text-align: center;
    }
</style>
<div class="outer">
    <h3>Hello <%=request.getParameter("name") %> !</h3>
    <br><br>
    Make you order:
    <br><br>
    <select multiple name="product">
    <option>Book</option>
    <option>Iphone</option>
    <option>Laptop</option>
    <option>Shirt</option>
    <option>Shoes</option>
</select>
    <br><br>
    <form action="basket">
        <input type="submit"  formmethod="post" value="Submit" />

    </form>
</div>
</body>
</html>
