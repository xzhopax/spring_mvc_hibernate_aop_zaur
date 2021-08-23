<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<body>

<h2>employee info</h2>
<br>

<!-- modelAttribute прописываем из public String addNewEmployee -> model.addAttribute("employee" -->
<!-- action берем из @RequestMapping("/saveEmployee") public String saveEmployee() -->
<form:form action="saveEmployee" modelAttribute="employee" >
    Name <form:input path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <br><br>
    Salary <form:input path="salary"/>
    <br><br>
    Department <form:input path="department"/>
    <br><br>
    <input type="submit" value="OK">
</form:form>

   




</body>