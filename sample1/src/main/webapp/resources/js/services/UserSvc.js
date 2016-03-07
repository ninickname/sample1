(function () {
    'use strict';

    function userSvc($http, uiGridConstants) {

        var myService = {
            getUsers: getUsers,
            gridOpts: {
                enableHorizontalScrollbar: uiGridConstants.scrollbars.NEVER,
                enableFiltering: true,
                data: null,
                columnDefs: [
                    {
                        name: 'Last Name',
                        field: 'lname'
                    }, {
                        name: 'First Name',
                        field: 'fname'
                    }, {
                        displayName: 'phone1',
                        field: 'phones[1].number'
                    }, {
                        field: 'id',
                        filters: [
                            {
                                condition: uiGridConstants.filter.GREATER_THAN,
                                placeholder: 'greater than'
                            },
                            {
                                condition: uiGridConstants.filter.LESS_THAN,
                                placeholder: 'less than'
                            }
                        ]
                    }, {
                        name: "Registered On",
                        /* cellFilter: 'date:"longDate"',*/
                        filterCellFiltered: true,
                        filters: [
                            {
                                condition: uiGridConstants.filter.LESS_THAN,
                                filterHeaderTemplate: '<div class="ui-grid-filter-container" ng-repeat="colFilter in col.filters"><div my-custom-dropdown></div></div>'
                            },
                            {
                                condition: uiGridConstants.filter.GREATER_THAN,
                                filterHeaderTemplate: ' <div class="input-group date" id="datepickerTo">     <input type="text" placeholder="Date TO" class="form-control"/>    <span class="input-group-addon">    <span class="glyphicon glyphicon-calendar"></span>    </span>    </div>'

                            }
                        ]
                    } ,
                ]
            }
        };

        return myService;

        ///////

        function getUsers() {
            return $http.get('http://localhost:8080/sample1/user')
                .then(function (response) {
                    return response.data;
                })
                .catch(function () {
                });
        }
    }

    userSvc.$inject = ['$http', 'uiGridConstants'];

    angular.module('myApp').factory('UserSvc', userSvc);
})();