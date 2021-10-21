


$("#btnSaveProduct").click(function () {

    console.log("save");

    var proName = $("#proName").val();
    var code = $("#code").val();
    var proId= $("#proId").val();
    var price= $("#price").val();
    var specification= $("#specification").val();
    var description= $("#description").val();
    var dimensions= $("#dimensions").val();
    var warranty= $("#warranty").val();
    var category= "C001";
    var mainView= $("#mainView").val();
    var View1= $("#View1").val();
    var View2= $("#View2").val();
    var View3= $("#View3").val();
    var adminId= "A001";


    $.ajax({
        method: "POST",
        url: "http://localhost:8080/abc-store/V1/product",
        contentType: "application/json",
        async: true,
        data: JSON.stringify({
            proID:proId,
            code:code,
            name:proName,
            price:price,
            specification:specification,
            description:description,
            dimensions:dimensions,
            warranty:warranty,
            mainView:mainView,
            view1:View1,
            view2:View2,
            view3:View3,
            category:{
                categoryID:category,
            },
            admin:{
                adminID:adminId
            }
        }),
        success: function (data) {
            console.log(data.message);

            if (data.message == "done"){
                alert("successfully Added");
            }else{
                alert("Something went wrong!");
            }


        }

    });


});