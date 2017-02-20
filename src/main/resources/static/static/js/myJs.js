var app = angular.module('myApp', []);
app.controller('myCtrl', ['$scope', '$location', function($scope,$location) {
    $scope.count = 0;
    $scope.go = function() {
        $scope.count = 'clicked';
        var stateObj = { foo: "bar" };
        history.pushState(stateObj, "page 2", "bar.html");
        $location.path("/thing/"+1,false).replace();
    }
}]);