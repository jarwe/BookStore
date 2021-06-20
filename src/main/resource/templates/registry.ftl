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
<div>
    <form id="userregistry" method="post" target="_blank">
        <table class="registrytable" border="0px">
            <tr>
                <td>用户名</td>
                <td><input type="text" name="username"/></td>
            </tr>
            <tr>
                <td>密码</td>
                <td><input type="text" name="password"/></td>
            </tr>
            <tr>
                <td>姓名</td>
                <td><input type="text" name="name"/></td>
            </tr>
            <tr>
                <td>性别</td>
                <td><input type="radio" name="gender" value="0"/><input type="radio" name="gender" value="1"/></td>
            </tr>
            <tr>
                <td>出生日期</td>
                <td><input type="text" name="birthday"/></td>
            </tr>
            <tr>
                <td>邮箱</td>
                <td><input type="text" name="email"/></td>
            </tr>
            <tr>
                <td>地址</td>
                <td><input type="text" name="address"/></td>
            </tr>
            <tr>
                <td>手机</td>
                <td><input type="text" name="phone"/></td>
            </tr>
            <tr>
                <td>验证码</td>
                <td><td><input type="text" name="verifycode"/></td><td><img src="images/verifycode"></td></td>
            </tr>
            <tr>
                <td><input type="button" value="提交" onclick="submitRegistry()"/></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>