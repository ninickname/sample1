(function () {
    'use strict';

    angular.module('myApp', ['ui.grid']);

})();


(function () {
    $('#datepickerFrom').datetimepicker();
    $('#datepickerTo').datetimepicker({
        useCurrent: false //Important! See issue #1075
    });
    $("#datepickerFrom").on("dp.change", function (e) {
        $('#datepickerTo').data("DateTimePicker").minDate(e.date);
    });
    $("#datepickerTo").on("dp.change", function (e) {
        $('#datepickerFrom').data("DateTimePicker").maxDate(e.date);
    });
})();