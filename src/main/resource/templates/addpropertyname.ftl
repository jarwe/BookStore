<html>

<head>
    <meta charset="utf-8" content="text/html"/>
    <title>用户注册</title>
    <script src="/js/doc.js" language="JavaScript" type="text/javascript"></script>
    <script language="javascript" type="text/javascript">
        function categorytableload() {
            categorytable = document.getElementById("addcategorytable")
            removeChildren(categorytable)
            categoryTr = document.createNode("tr")
            nameTd = document.createNode("td")
            nameTd.innerHTML = "商品类别："
            selectTd = document.createNode("td")
            selectNode = document.createNode("select")
            loadAjax("", "", "", function f(data) {
                obj = JSON.parse(data)
            })
        }
        function subcategoryupdate() {
            subcategorytable = document.getElementById("subcategory")
            categoryTr = document.createNode("tr")
            nameTd = document.createNode("td")
            nameTd.innerHTML = "商品子类别："
            selectTd = document.createNode("td")
            selectNode = document.createNode("select")
            loadAjax("", "", "", function f(data) {
                obj = JSON.parse(data)
            })
        }
        function propertynameupdate() {
        }
    </script>
</head>
<body>
    <div id="addpropertyname">
        <form id="addpropertynameform">
            <table id="addcategorytable" onload="categorytableload()">
                <tr>
                    <td>商品类别：</td>
                    <td>
                        <select id="category" onchange="subcategoryupdate()">

                        </select>
                    </td>
                </tr>
                <tr>
                    <td>商品子类别：</td>
                    <td>
                        <select id="subcategory" onchange="propertynameupdate()">

                        </select>
                    </td>
                </tr>
            </table>
            <table id="addpropertyname">

            </table>
        </form>
    </div>
</body>
</html>