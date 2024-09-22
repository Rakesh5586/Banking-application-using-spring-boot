<%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "form" %>
<%@ taglib uri  = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<head>
    <style>
        table{
            border-collapse: collapse;
            font-size: x-large;
            color: red;
        }
        div{
            border: 2px solid;
            width: 500px;
            background-color: rgb(209, 181, 235);
            margin: auto;
            padding: 25px;
            margin-top: 60px;
        }
        body{
            background-image: radial-gradient(rgb(230, 120, 230),rgb(240, 83, 83),rgb(198, 233, 141));
        }
    </style>
</head>
<body>
    <div>
        <h4>Welcome, ${depoamt.name}</h4>
<h1>Your Amount is deposited successfully:</h1>
<!-- <table border="1";>
<tr>
<th>ACCOUNT NUMBER</th>
    <th>NAME</th>
    <th>PASSWORD</th>
    <th>CONFIRM PASSWORD</th>
    -->
     <th colspan="2">AMOUNT</th>
    <!--
    <th>ADDRESS</th>
    <th>MOBILE NUMBER</th>
    -->
    
    <!-- <th colspan="2">ACTION</th> -->
<!-- </tr>
    <tr> -->
        <!--
        <td>${balance.accno}</td>
        <td>${balance.name}</td>
        <td>${balance.password}</td>
        <td>${balance.cnfpassword}</td>
        -->
         <td colspan="2">${depoamt.amount}</td> 
        <!--
        <td>${balance.address}</td>
        <td>${balance.mobilenumber}</td>
        -->
        <!-- <td><a href="/editUrl/${student.sid}">Edit</a></td>
        <td><a href="/deleteUrl/${student.sid}">Delete</a></td> -->
    <!-- </tr>
</table>
</div> -->
</body>