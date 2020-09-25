function isFirstLetterUpperCase(str){
    regexp = /^[A-Z]/;
    if (regexp.test(str)) {
        console.log("String's first character is uppercase " + str);
    } else {
        console.log("String's first character is not uppercase " + str );
    }
}