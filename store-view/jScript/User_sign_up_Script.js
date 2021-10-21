

$("#sign-up-page-close-btn").click(function () {
    hideBodyContent();
    hideAllContents();
    $("#homePage,#home_page").css('display', 'block');
});



$("#sign-up-btn").click(function () {

    var iD = 'U1023456';
    var username = $("#sign-up-username").val();
    var email= $("#sign-up-email").val();
    var password= $("#sign-up-password").val();


        $.ajax({
            method: "POST",
            url: "http://localhost:8080/abc-store/V1/user",
            contentType: "application/json",
            async: true,
            data: JSON.stringify({
                userID: iD,
                email: email,
                userName: username,
                password: password
            }),
            success: function (data) {
                console.log(data.message);

                if (data.message == "done"){
                    alert("Registration successful");
                    hideBodyContent();
                    hideAllContents();
                    $("#homePage,#home_page").css('display', 'block');
                }else{
                    alert("Something went wrong!");
                }


            }

        });


});

