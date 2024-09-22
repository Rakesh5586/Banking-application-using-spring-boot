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
        background-color: rgb(235, 119, 219);
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
        background-color: rgb(143, 208, 216);
        margin-top: 50px;
        font-size: large;
    }
    body
    {
        background-image: radial-gradient(rgb(223, 47, 199),rgb(131, 202, 214));
    }
 </style>
</head>
<body>
    <h1>WITHDRAW FORM</h1>
    <form action="/withdrawUrl" method="POST">
        <label>Account Number:</label>
        <input type  = "text" name = "accno" required><p></p>

        <label>Name:</label>
        <input type  = "text" name = "name"><p></p>

        <label>Password:</label>
        <input type  = "password" name = "password"><p></p>

        <label>Amount:</label>
        <input type  = "text" name = "amount"><p></p>

        <input type ="submit" value="Submit">&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
        <input type="reset" value="Clear">
    </form>
</body>
</html>