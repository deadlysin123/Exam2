<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Viral Infections</title>
    <style>
        table {
            font-family: "Times New Roman", sans-serif;
            border-collapse: collapse;
            width: 75%;
        }

        td, th {
            border: 5px solid black;
            text-align: left;
            padding: 8px;
            background: silver;
            text-decoration-color: red;
        }

    </style>
</head>
<body>

<h2>Five common human viral infection</h2>
<table>
    <tr>
        <th style="background: yellow">ID</th>
        <th style="background: yellow">Name</th>
        <th style="background: yellow">Description</th>
        <th style="background: yellow">Symptoms</th>
        <th style="background: yellow">Duration</th>
        <th style="background: yellow">Mortality Rate</th>

    </tr>
    <c:forEach var = "list" items = "${list}">
        <tr>
            <td>${list.id}</td>
            <td>${list.name}</td>
            <td>${list.description}</td>
            <td>${list.symptoms}</td>
            <td>${list.duration}</td>
            <td>${list.mortalityrate}</td>
        </tr>
    </c:forEach>
</table>

<hr/>

</body>
</html>

