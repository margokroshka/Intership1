<%@ page import="static java.util.Objects.toString" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        .text {
            font-size: ${fsize}pt;
        }
    </style>
    <title>Text output</title>
</head>
<body>
    <h3>Text output</h3>
    <p>Size: ${size}</p>
    <p>Lines: ${lines}</p>
    <p class="text">${text}</p>
    <a href="http://localhost:8081">Back</a>
</body>
</html>
