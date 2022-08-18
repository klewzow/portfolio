$(document).ready(function () {
    $("body").on("click", "#add_field", function () {
        $("#options").append(
            "<div class='field' > " +
            "<label for='files'>Name</label>" +
            "<input type='text'> " +
            "<label for='files'>Value</label>" +
            "<input type='text'> " +
            " <div   id='add_field'> <img src='../image/add_field.png' alt=''></div>" +
            "<div   id='del_field'>  <img src='../image/del_field.png' alt=''></div>" +
            "<div   id='add'> <img src='../image/add.png' alt='' onfocus='false'></div>"
            + "</div>"
        );
    });
    $("body").on("click", "#del_field", function () {
        $(this).parent().remove();
    });
    $("body").on('mousedown', "#add", function () {
        return false;
    });
});