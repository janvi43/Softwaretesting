<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Join A Person</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
    href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
    src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
    src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script
    src="https://cdnjs.cloudflare.com/ajax/libs/1000hz-bootstrap-validator/0.11.9/validator.min.js"></script>
<script
    src="https://cdn.rawgit.com/PascaleBeier/bootstrap-validate/v2.1.3/dist/bootstrap-validate.js"></script>
<script
    src="https://cdnjs.cloudflare.com/ajax/libs/1000hz-bootstrap-validator/0.11.9/validator.js"></script>
<style>
#success_message {
    display: none;
}
</style>
<!-- 
<script>
$(document).ready(function() {
    $('#contact_form').bootstrapValidator({
        // To use feedback icons, ensure that you use Bootstrap v3.1.0 or later
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
            first_name: {
                validators: {
                        stringLength: {
                        min: 2,
                    },
                        notEmpty: {
                        message: 'Please enter your First Name'
                    }
                }
            },
             last_name: {
                validators: {
                     stringLength: {
                        min: 2,
                    },
                    notEmpty: {
                        message: 'Please enter your Last Name'
                    }
                }
            },
             user_name: {
                validators: {
                     stringLength: {
                        min: 8,
                    },
                    notEmpty: {
                        message: 'Please enter your Username'
                    }
                }
            },
             user_password: {
                validators: {
                     stringLength: {
                        min: 8,
                    },
                    notEmpty: {
                        message: 'Please enter your Password'
                    }
                }
            },
            confirm_password: {
                validators: {
                     stringLength: {
                        min: 8,
                    },
                    notEmpty: {
                        message: 'Please confirm your Password'
                    }
                }
            },
            email: {
                validators: {
                    notEmpty: {
                        message: 'Please enter your Email Address'
                    },
                    emailAddress: {
                        message: 'Please enter a valid Email Address'
                    }
                }
            },
            contact_no: {
                validators: {
                  stringLength: {
                        min: 12, 
                        max: 12,
                    notEmpty: {
                        message: 'Please enter your Contact No.'
                     }
                }
            },
             department: {
                validators: {
                    notEmpty: {
                        message: 'Please select your Department/Office'
                    }
                }
            },
                }
            }
        })
        .on('success.form.bv', function(e) {
            $('#success_message').slideDown({ opacity: "show" }, "slow") // Do something ...
                $('#contact_form').data('bootstrapValidator').resetForm();

            // Prevent form submission
            e.preventDefault();

            // Get the form instance
            var $form = $(e.target);

            // Get the BootstrapValidator instance
            var bv = $form.data('bootstrapValidator');

            // Use Ajax to submit form data
            $.post($form.attr('action'), $form.serialize(), function(result) {
                console.log(result);
            }, 'json');
        });
});
</script>
 -->
</head>
<body>
    <div class="container">

        <form class="well form-horizontal" action="signIN " method="POST"
            id="contact_form" ModelAttribute="softtesting">
            <fieldset>

                <!-- Form Name -->
                <legend>
                    <div style="text-align:center">
                        <h2>
                            <b>Registration Form</b>
                        </h2>
                    </div>
                </legend>
                <br>

                <!-- Text input-->

                <div class="form-group">
                    <label class="col-md-4 control-label">Full Name</label>
                    <div class="col-md-4 inputGroupContainer">
                        <div class="input-group">
                            <span class="input-group-addon"><i
                                class="glyphicon glyphicon-user"></i></span> <input name="fullname"
                                placeholder="Full Name" class="form-control" type="text">
                        </div>
                    </div>
                </div>

                <!-- Text input-->

                <div class="form-group">
                    <label class="col-md-4 control-label">E Mail</label>
                    <div class="col-md-4 inputGroupContainer">
                        <div class="input-group">
                            <span class="input-group-addon"><i
                                class="glyphicon glyphicon-user"></i></span> <input name="email"
                                placeholder="Email" class="form-control" type="email">
                        </div>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-md-4 control-label">Password</label>
                    <div class="col-md-4 inputGroupContainer">
                        <div class="input-group">
                            <span class="input-group-addon"><i
                                class="glyphicon glyphicon-user"></i></span> <input name="pwd"
                                placeholder="Password" class="form-control" type="password">
                        </div>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-md-4 control-label">Confirm Password</label>
                    <div class="col-md-4 inputGroupContainer">
                        <div class="input-group">
                            <span class="input-group-addon"><i
                                class="glyphicon glyphicon-user"></i></span> <input name="cpwd"
                                placeholder="Confirm Password" class="form-control"
                                type="password">
                        </div>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-md-4 control-label">Upload Photo</label>
                    <div class="col-md-4 inputGroupContainer">
                        <div class="input-group">
                            <span class="input-group-addon"><i
                                class="glyphicon glyphicon-user"></i></span> <input name="photo"
                                class="form-control" type="file"
                                accept="image/gif, image/jpeg, image/png">
                        </div>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-md-4 control-label">&nbsp;&nbsp;&nbsp;&nbsp;Gender</label>
                    <label class="radio-inline"> <input type="radio"
                        name="gender" value="Male">Male
                    </label> <label class="radio-inline"> <input type="radio"
                        name="gender" value="Female">Female
                    </label> <label class="radio-inline"> <input type="radio"
                        name="gender" value="Transgender">Transgender
                    </label>
                </div>

                <div class="form-group">
                    <label class="col-md-4 control-label">Type of User</label>
                    <div class="col-md-4 selectContainer">
                        <div class="input-group">
                            <span class="input-group-addon"><i
                                class="glyphicon glyphicon-list"></i></span> <select
                                name="specialization" class="form-ontrol selectpicker">
                                <option value="">Select User</option>
                                <option>Administrator</option>
                                <option>Receptionist</option>
                                <option>LAB</option>
                                </select>
                        </div>
                    </div>
                </div>

                <!-- Text input-->

                <!-- Select Basic -->

                <!-- Success message -->
                <div class="alert alert-success" role="alert" id="success_message">
                    Success <i class="glyphicon glyphicon-thumbs-up"></i> Success!.
                </div>

                <!-- Button -->
                <div class="form-group">
                    <label class="col-md-4 control-label"></label>
                    <div class="col-md-4">
                        <br>
                        <button type="submit" class="btn btn-success">
                            &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspSUBMIT <span
                                class="glyphicon glyphicon-send"></span>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                        </button>
                    </div>
                </div>

            </fieldset>
        </form>
    </div>
</body>
    </html>