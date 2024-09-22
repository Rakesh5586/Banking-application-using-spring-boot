<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
       body{
            background-image: radial-gradient(pink,gray);
       }
       div{
          border: 2px solid;
          width: 400px;
          margin: auto;
          padding: 10px;
          margin-top: 60px;
          text-align: center;
          height: 250px;
          background-color: rgb(243, 148, 164);
          font-size: large;
       }
       label{
        display: inline-block;
        width: 150px;
       }
    </style>
</head>
<body>
<div>
    <h1>View Balance Here</h1>
    <form action = "/getAccUrl" method = "POST">
      <label>Account Number:</label>
      <input type ="text" name = "accno"><p></p>
      <label>Name:</label>
      <input type ="text" name = "name"><p></p>
      <label>Password:</label>
      <input type ="password" name = "password"><p></p>
      <input type = "submit" value="GetBalance">&emsp;&emsp;&emsp;
      <input type = "reset" value="Clear">
    </form>
</div>
</body>
</html>