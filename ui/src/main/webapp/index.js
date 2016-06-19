/**
 * Created by zengfeng on 16/6/18.
 */
var local = "http://localhost:8090/";
var home = "greet";
angular.module("index",[]);
function hello($scope,$http){
    $http.get(local+index).success(function(data){
        $scope.greeting = data;
    });
}