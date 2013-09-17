<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Calculator</title>
</head>
<body>
<form name="Form1" method="post" action="Main">
    <table>
        <tr>
            <td><B>First value</B></td>
            <td><p><input title="enter the number" type=textbox name="firstValue" pattern="[-+]?[0-9]*[.,]?[0-9]+" size="12" value="${textFirstValue}"
                          required></p></td>
        </tr>
        <tr>
            <td><B>Operation type</B></td>
            <td><select name="operator" title="select operation type" size="1" required>
                <option value="ADDITION"> +</option>
                <option value="SUBSTRACTION"> -</option>
                <option value="MULTIPLICATION"> *</option>
                <option value="DIVISION"> /</option>
                <option value="SQUARE_ROOT"> Square root</option>
            </select></td>
        </tr>
        <tr>
            <td><B>Second value</B></td>
            <td><p><input title="enter the number" type=textbox name="secondValue" pattern="[-+]?[0-9]*[.,]?[0-9]+" size="12" ></p></td>
        </tr>
    </table>
    <input type=submit value="Calculate">
    <br>
    <br>
    <table>
        <tr>
            <td><B>Result</B></td>
            <td><p>${textResult}</p></td>
        </tr>
    </table>


</body>
</html>