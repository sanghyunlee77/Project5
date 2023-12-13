<%@ page language="java" contentType="text/html; charset=UTF-8"
         isELIgnored="false" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>

<h1>Add New Post</h1>
<form action="addok" method="post">
    <table id ="edit">
        <tr><td>Title:</td><td><input type="text" name="title"/></td></tr>
        <tr><td>Writer:</td><td><input type="text" name="writer"/></td></tr>
        <tr><td>Content:</td><td><textarea cols="50" rows="5" name="contents"></textarea></td></tr>
        <tr><td>mname:</td><td><input type="text" name="mname"/></td></tr>
        <tr><td>fname:</td><td><input type="text" name="fname"/></td></tr>
        <tr><td>picture:</td><td><input type="file" name="picture"/></td></tr>
        <tr><td>kind:</td><td><input type="text" name="kind"/></td></tr>
        <tr><td>pnumber:</td><td><input type="text" name="pnumber"/></td></tr>
        <tr><td>comeday:</td><td><input type="date" name="comeday"/></td></tr>
        <tr><td>byeday:</td><td><input type="date" name="byeday"/></td></tr>
    </table>
    <button type="button" onclick="location.href='list'">목록보기</button>
    <button type="submit">등록하기</button>
</form>

</body>
</html>