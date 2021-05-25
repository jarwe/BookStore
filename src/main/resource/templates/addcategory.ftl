<html>

<head>
    <meta charset="utf-8" content="text/html"/>
    <title>用户注册</title>
    <script language="javascript" type="text/html">
        function submitRegistry() {
        registryForm = document.getElementById("userregistry")
        registryForm.submit()
        }
    </script>
</head>
<body>
    <div id="addcategory">
        <form id="addcategoryform" action="" method="post">
            <table id="addcategorytable">
                <tr>
                    <td>主类别：</td><td><input type="text" name="category" /></td>
                </tr>
                <tr>
                    <td>子类别：</td><td><input type="text" name="subcategory" /></td>
                </tr>
                <tr>
                    <td><input type="submit"></td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>