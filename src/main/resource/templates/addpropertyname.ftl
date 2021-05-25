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
    <div id="addpropertyname">
        <form id="addpropertynameform">
            <table id="addpropertynametable" onload="">
                <tr>
                    <td>商品类别：</td>
                    <td>
                        <select id="category">

                        </select>
                    </td>
                </tr>
                <tr>
                    <td>商品子类别：</td>
                    <td>
                        <select id="subcategory">

                        </select>
                    </td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>