var data = {
    "username": $("#username").val(),
    "sex": $("#sex").val(),
    "password": $("#password").val(),
    "email": $("#email").val()
}

function addUser() {
    $.ajax({
        type: "POST",
        url: "localhost:8080/addUser",
        dataType: "json",
        contentType : 'application/json',
        data: JSON.stringify(data),
        success : function (data) {
            alert("Register Successful!");
        }
    })
}