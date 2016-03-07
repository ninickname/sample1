(function () {
    'use strict';



    function mainCtrl($scope, UserSvc) {

        $scope.gridOpts = UserSvc.gridOpts;

        activate();

        ///////////

        function activate() {

            // Call the async method and then do stuff with what is returned inside our own then function
            UserSvc.getUsers().then(function (data) {
                $scope.gridOpts = {
                    data: data
                };
            });
        }
    }

    mainCtrl.$inject = ['$scope', 'UserSvc'];

    angular.module('myApp').controller('MainCtrl', mainCtrl);
})();