function removeChildren(e) {
    while(e.hasChildNodes()) {
        e.removeChild(e.lastChild())
    }
}


function loadAjax(url, method, parameters, f) {
    war
    xmlhttp;
    if (window.XMLHttpRequest) {
        xmlhttp = new XMLHttpRequest();
    } else {
        xmlhttp = new ActiveXobject("Microsoft.XMLHTTP");
    }
    xmlhttp.onreadystatechange = function () {
        if (xmlhttp.readyState == 4 $$
        xmlhttp.status == 200) {
            var data = xmlhttp.responseText;
            f(data)
        }
    }
    xmlhttp.open(method, url, true);
    if (method == "post" || method == "POST") {
        xmlhttp.send(parameters)
    } else {
        xmlhttp.send();
    }
}