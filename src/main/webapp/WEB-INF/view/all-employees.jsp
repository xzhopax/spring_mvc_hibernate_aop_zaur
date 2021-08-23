<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>

<body>

<h2>Show all Employees</h2>
<br>

<table>
    <tr><!-- строка таблицы -->
        <th>Name</th><!-- шапка таблицы -->
        <th>Surname</th><!-- шапка таблицы -->
        <th>Department</th><!-- шапка таблицы -->
        <th>Salary</th><!-- шапка таблицы -->
    </tr>

    <!--
        var - временная переменная, будет принимать каждое значение из allEmp.
        item - список всех работников (атрибут из контроллера model.addAttribute("allEmp", allEmployees);)
    -->
    <c:forEach var="emp" items="${allEmp}" > <!-- функционал jstl (The For-Each Loop) -->
        <tr><!-- строка таблицы -->
            <td>${emp.name}</td> <!-- ячейка таблицы -->
            <td>${emp.surname}</td> <!-- ячейка таблицы -->
            <td>${emp.department}</td> <!-- ячейка таблицы -->
            <td>${emp.salary}</td> <!-- ячейка таблицы -->
        </tr>
    </c:forEach>
</table>
<br>

<input type="button" value="ADD" onclick="window.location.href = 'addNewEmployee'">


</body>

</html>