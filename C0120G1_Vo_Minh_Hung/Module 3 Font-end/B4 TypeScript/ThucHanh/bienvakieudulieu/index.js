// function main() {
// //     var x = 5;
// //     console.log(x);
// //     var x = 10;
// //     console.log(x);
// //
// //     var y = 55;
// //     console.log(y);
// //     var y = 100;
// //     console.log(y);
// // }
// function main() {
//   console.log("START");
//     let target
//   if (true) {
//     var lang = "vi";
//     target = "en-us";
//     console.log("inside block");
//     console.log(target);
//   }
//   console.log(lang);
//   console.log(target);
// }
// function main() {
//   let y;
//   console.log(x);
//   var x = 5;
//
//   console.log(y);
//   y = 10;
// }
function main() {
    var message;
    var total = 100;
    var isProduction = true;
    var prices = [120, 88, 60];
    var languages = ['vi', 'en-us'];
    var now = new Date();
    var unknown;
    var Direction;
    (function (Direction) {
        Direction[Direction["UP"] = 0] = "UP";
        Direction[Direction["DOWN"] = 1] = "DOWN";
        Direction[Direction["LEFT"] = 2] = "LEFT";
        Direction[Direction["RIGHT"] = 3] = "RIGHT";
    })(Direction || (Direction = {}));
    ;
    function log(msg) {
        console.log(msg);
    }
    isProduction = false;
    unknown = Direction.UP;
    unknown = 'changed';
    var post = {
        id: '12',
        title: '123123'
    };
    message = '50';
    function getPost(postId) {
        // do something to retrieve post
        return {
            id: postId,
            title: 'Post Title',
            body: 'Post Body',
            extra: 'data'
        };
    }
    console.log(post);
}
main();
