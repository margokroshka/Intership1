<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lab 1</title>
</head>
<body>
<style>
    .outer {
        text-align: center;
    }
</style>
<div class="outer">
<h3>Welcome to Online Shop</h3>
<form action="welcome">
    <div id="input">
    <input type="text" name="name" dirname="name2" placeholder="Enter your name" required>
    </div>
    <input type="submit" formmethod="post" value="Enter"/>
</form>

</div>


<%--<h3>Search/replace</h3>
<form action="search-replace">
    <input type="text" name="key" placeholder="Key" required>
    <input type="text" name="newValue" placeholder="New value (not required)">
    <input type="submit" formmethod="post" value="Search/replace"/>
</form>
<h3>Text output</h3>
<form action="text-output">
    <input type="number" name="size" placeholder="Font size" required>
    <input type="number" name="lines" placeholder="Number of lines" required>
    <input type="submit" formmethod="post" value="Show"/>
</form>--%>
</body>
</html>
