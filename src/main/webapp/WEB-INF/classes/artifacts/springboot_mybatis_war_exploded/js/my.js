var insert = function() {
    $.ajax({
        url : "/login",
        dataType : "json",
        contentType: 'application/json',
        data:JSON.stringify({
            username : $("#username").val(),
            password : $('#password').val()
        }),
        type: "POST"
    });

};