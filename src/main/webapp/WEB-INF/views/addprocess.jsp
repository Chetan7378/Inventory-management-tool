<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body><h1>Add Process Material</h1>
<form action="proadd" method="post">
<center>
<section class="vh-100" style="background-color: white;">
  <div class="container h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-xl-9">

        <h1 class="text-white mb-4">Inventory Management</h1>

        <div class="card" style="border-radius: 20px;">
          <div class="card-body">

            <div class="row align-items-center pt-4 pb-3">
              <div class="col-md-3 ps-5">

                <h6 class="mb-0">Material Id</h6>

              </div>
              <div class="col-md-9 pe-5">

                <input type="text"  name="id"class="form-control form-control-lg" />

              </div>
            </div>

            <hr class="mx-n3">

            <div class="row align-items-center py-3">
              <div class="col-md-3 ps-5">

                <h6 class="mb-0">Material Name</h6>

              </div>
              <div class="col-md-9 pe-5">

                <input type="text" name="name"  class="form-control form-control-lg" placeholder="name" />

              </div>
            </div>

            <hr class="mx-n3">

            <div class="row align-items-center py-3">
              <div class="col-md-3 ps-5">

                <h6 class="mb-0">Material Quantity</h6>

              </div>
              <div class="col-md-9 pe-5">

                <input type="number" class="form-control"  name="quantity"rows="3" placeholder="Quantity">

              </div>
            </div>
             <hr class="mx-n3">

            <div class="row align-items-center py-3">
              <div class="col-md-3 ps-5">

                <h6 class="mb-0">Material Unit</h6>

              </div>
              <div class="col-md-9 pe-5">

                <input type="text" name="unit"  class="form-control form-control-lg" placeholder="pcs(eg.kg)" />

              </div>
            </div>
             <hr class="mx-n3">

            <div class="row align-items-center py-3">
              <div class="col-md-3 ps-5">

                <h6 class="mb-0">Material CostPerUnit</h6>

              </div>
              <div class="col-md-9 pe-5">

                <input type="number" class="form-control"  name="cost"rows="3" placeholder="unit">

              </div>
            </div>

           

            <hr class="mx-n3">

            <div class="px-5 py-4">
              <button type="submit" class="btn btn-primary btn-lg">Add ProcessMaterial</button>
            </div>

          </div>
        </div>

      </div>
    </div>
  </div>
</section>
<button><a href=viewRaw> View Raw Material</a></button>
<button><a href=AddProcess> Add Processed Material</a></button>
<button><a href=Viewprocess> View Processed Material</a></button>
<button><a href=Addraw> Issue Raw Material</a></button>
<button><a href=Addraw> View logs-raw</a></button>
<button><a href=Addraw> Issued Processed Material</a></button>
<button><a href=Addraw> View logs-processed</a></button>
</center>
</form>
</body>
</html>