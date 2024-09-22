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
        background-color: rgb(0, 255, 136);
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
        background-color: rgb(26, 197, 146);
        margin-top: 50px;
        font-size: large;
    }
    body
    {
        background-image: radial-gradient(rgb(10, 131, 81),rgb(92, 200, 219));
    }
 </style>
</head>
<body>
    <h1>DEPOSITE FORM</h1>
    <form action="/depositeUrl" method="POST">
        <label>Account Number:</label>
        <input type  = "text" name = "accno" required><p></p>

        <label>Name:</label>
        <input type  = "text" name = "name"><p></p>

        <label>Password:</label>
        <input type  = "password" name = "password"><p></p>

        <label>Amount:</label>
        <input type  = "number" name = "amount"><p></p>

        <input type ="submit" value="Submit">&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
        <input type="reset" value="Clear">
    </form>
</body>
</html>