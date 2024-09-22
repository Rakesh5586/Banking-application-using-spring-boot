<!DOCTYPE html>
<html lang="en">
<head>
 <title>NewAccountDocument</title>
 <style>
    h1{
        border: 2px solid;
        border-radius: 15px;
        width: 470px;
        margin: auto;
        padding: 5px;
        text-align: center;
        background-color: aqua;
        margin-top: 60px;
    }
    label
    {
       display: inline-block;
        width: 150px;
    }
    form{
        border: 2px solid;
        width: 450px;
        margin: auto;
        padding: 20px;
        text-align: center;
        background-color: aqua;
        margin-top: 50px;
        font-size: large;
    }
    body
    {
        background-image: radial-gradient(aqua,green);
    }
 </style>
</head>
<body>
    <h1>OPEN ACCOUNT FORM</h1>
    <form action="/newAccUrl" method="POST">
        <label>Account Number:</label>
        <input type  = "text" name = "accno" required><p></p>

        <label>Name:</label>
        <input type  = "text" name = "name"><p></p>

        <label>Password:</label>
        <input type  = "password" name = "password"><p></p>

        <label> Confirm Password:</label>
        <input type  = "password" name = "cnfpassword"><p></p>

        <label>Amount:</label>
        <input type  = "text" name = "amount"><p></p>

        <label>Address:</label>
        <input type  = "text" name = "address"><p></p>

        <label>Mobile Number:</label>
        <input type  = "text" name = "mobilenumber"><p></p>

        <input type ="submit" value="Submit">&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
        <input type="reset" value="Clear">
    </form>
</body>
</html>