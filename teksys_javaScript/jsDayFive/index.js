console.log("INDEX.JS FOR HOMEPAGE.HTML");

//*****FOR LOOP START*****
let arr = [1,2,3];
for(let i = 0; i < arr.length; ++i){
    console.log(`index: ${i}`);
    console.log(`array index: ${arr[i]}`);
}
//*****FOR LOOP END*****

//*****FOR EACH LOOP START*****
// you can use the method forEach() instead of making a for each loop
arr.forEach(function(index){
    console.log(`array index using the forEach() method array helper: ${index}`)
})
//*****FOR EACH LOOP END*****

// ARROW FUNCTION FOR EACH W/ ARRAY HELPER START
arr.forEach((index)=>{
    console.log(`array index using the forEach() method array helper with an arrow function: ${index}`)
})
// ARROW FUNCTION FOR EACH W/ ARRAY HELPER END

// .MAP() METHOD START
// when you want to transform the elements of an array?
let newMap = arr.map(function(val){
    console.log(val*2)
})
console.log(`this is the original array: ${arr}`);
// why are the values missing???
console.log(`this is the .map() method array: ${newMap}`);
// .MAP() METHOD END

// .FILTER() METHOD START
// .filter can also be chained to further restrict your search
let cp0 = ['kaku', 'lucci', 'helmeppo','cody'];
let result = cp0.filter(function(word){
    return word.length >= 2;
}).filter(function(word){
    return word.length < 5;
})
console.log(`filter() method, need to review this one some more: ${result}`);
// .FILTER() METHOD END

// .REDUCE() METHOD START
// cp0.reduce(function(word, val){
//     return word.length 
// })
// .REDUCE() METHOD END