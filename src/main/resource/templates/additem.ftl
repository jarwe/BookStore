<html>
<meta>
    <title>创建商品</title>
    <meta content="text/html" charset="UTF-8">
    <script language="JavaScript">
        var categoryList = ["服装", "图书影像", "五金", "家具", "厨卫", "洗护", "食品", "其他"];
        var subcategoryList = [
            ["帽子", "上衣", "裤子", "鞋子", "内衣"],
            ["图书", "光盘", "电子书", "其他"],
            ["工具", "损耗品", "粘合剂", "管道", "包装", "其他"],
            ["床", "柜", "桌", "椅", "装饰", "收纳", "其他"],
            ["清洁除垢", "其他"],
            ["护理", "清洁", "毛巾", "牙刷", "化妆品", "其他" ],
            ["主食", "副食", "酒水", "肉蛋", "其他"],
            ["其他"]
        ];
        var subproperties = {
        {
            {},{},{},{},{}
        },
        {
            {},{},{},{}
        },
        {
            {},{},{},{},{},{}
        },
        {
            {},{},{},{},{},{},{}
        },
        {
            {},{}
        },
        {
            {},{},{},{},{},{}
        },
        {
            {},{},{},{},{}
        },
        {
            {}
        }
        }
        function refreshCategory() {
            var trNode = document.createElement("tr");
            var tdNode = document.createElement("td");
            var addItemTable = document.getElementById('itemtable')
            var selectNode = document.createElement("select")
            if(addItemTable == null) {
                console.log("Got empty node")
                divNode = document.getElementById("addItemDiv");
                addItemTable = document.createElement('table');
                addItemTable.setAttribute("id", "itemtable")
                divNode.appendChild(addItemTable);
            }
            console.log(addItemTable)
            selectNode.setAttribute("name", "");
            selectNode.setAttribute("onmouseup", "refreshSubcategory()")
            for(index = 0; index < categoryList.length; index++) {
                option = document.createElement("option")
                option.setAttribute("value", categoryList[index])
                selectNode.appendChild(option)
            }
            tdNode.appendChild(selectNode);
            trNode.appendChild(tdNode);
            addItemTable.appendChild(trNode);
        }
        function refreshSubcategory() {
            var category = document.getElementById("categorySelect")
            var addItemTable = document.getElementById("itemtable");
            var subcategory = document.createElement("select");
            var trNode = document.getElementById("newitem")
            if(trNode != null) {
                addItemTable.removeChild(trNode)
            }
            for(subIndex = 0; subIndex < subcategoryList[category.selectedIndex].length; subIndex++) {
                var option = document.createElement("option")
                option.setAttribute("value", subcategoryList[category.selectedIndex][subIndex])
                option.appendChild(document.createTextNode(subcategoryList[category.selectedIndex][subIndex]))
                console.log("Added item: " + subcategoryList[category.selectedIndex][subIndex])
                subcategory.appendChild(option)
            }
            var trNode = document.createElement("tr")
            trNode.setAttribute("id", "newitem")
            var tdName = document.createElement("td")
            var tdSelect = document.createElement("td")
            tdName.appendChild(document.createTextNode("商品子类别"))
            tdSelect.appendChild(subcategory)
            trNode.appendChild(tdName)
            trNode.appendChild(tdSelect)
            addItemTable.appendChild(trNode)
        }
        function refreshProperties() {
            
        }
    </script>
</head>
<body>
<div id="addItem">
    <form action="/items/addItem">
        <table id="additemstable">
            <tr>
                <td>
                    类别：
                </td>
                <td>
                    <select id="category" name="category" onmouseup="refreshSubcategory()">
                        <option value="服装"></option>
                        <option value="图书影像"></option>
                        <option value="五金"></option>
                        <option value="家具"></option>
                        <option value="厨卫"></option>
                        <option value="洗护"></option>
                        <option value="食品"></option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>
                    子类别：
                </td>
                <td>
                    <select id="subcategory" name="subCategory" onmouseup="refreshProperties()">

                    </select>
                </td>
            </tr>
            <tr id="commodityproperties">

            </tr>
            <tr>
                <td>
                    <input type="submit" value="提交">
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>