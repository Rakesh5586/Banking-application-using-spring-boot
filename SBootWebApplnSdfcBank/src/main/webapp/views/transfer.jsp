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
        background-color: rgb(209, 127, 51);
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
        background-color: rgb(209, 127, 51);
        margin-top: 50px;
        font-size: large;
    }
    body
    {
        background-image: radial-gradient(rgb(230, 199, 66),rgb(243, 159, 50));
    }
 </style>
</head>
<body>
    <h1>TRANSFER FORM</h1>
    <form action="/transferUrl" method="POST">
        <label>Account Number:</label>
        <input type  = "text" name = "accno" required><p></p>

        <label>Name:</label>
        <input type  = "text" name = "name"><p></p>

        <label>Password:</label>
        <input type  = "password" name = "password"><p></p>

        <label>Target A/C No:</label>
        <input type  = "text" name = "tracc"><p></p>

        <label>Amount:</label>
        <input type  = "text" name = "amount"><p></p>

        <input type ="submit" value="Submit">&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
        <input type="reset" value="Clear">
    </form>
</body>
</html>