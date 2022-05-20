console.log("INDEX.JS FOR HOMEPAGE.HTML");

//*****FOR LOOP START*****
let array1 = [1,2,3];
for(let i = 0; i < array1
.length; ++i){
    console.log(`index: ${i}`);
    console.log(`array2 index: ${array1
    [i]}`);
}
//*****FOR LOOP END*****

//*****FOR EACH LOOP START*****
// you can use the method forEach() instead of making a for each loop
array1.forEach(function(index){
    console.log(`array2 index using the forEach() method array2 helper: ${index}`);
})
//*****FOR EACH LOOP END*****

// ARROW FUNCTION FOR EACH W/ ARRAY HELPER START
array1.forEach((index)=>{
    console.log(`array2 index using the forEach() method array2 helper with an arrow function: ${index}`);
})
// ARROW FUNCTION FOR EACH W/ ARRAY HELPER END

// .MAP() METHOD START
// when you want to transform the elements of an array2?
let newMap = array1.map(function(val){
    console.log(val*2);
})
console.log(`this is the original array2: ${array1}`);
// why are the values missing???
console.log(`this is the .map() method array2: ${newMap}`);
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

// ARROW FUNCTION SPRINTS START
const add = (a,b) => {
    return a + b;
}
console.log(`add arrow function expression: ${add(1991,31)}`); 
// ARROW FUNCTION SPRINTS END

// SLICE() METHOD START
let array2 = [1,2,3,4,5,6,7,8,9,0,3];
console.log(`array2 slice method ${array2.slice(5)}`);
// SLICE() METHOD END

// SPLICE() METHOD START
// splice() method modifies the original array
array2 = [1,2,3,4,5,6,7,8,9,0,3];
console.log(`array2 splice method ${array2.splice(3)}`);
console.log(`this is the original array2 ${array2}`);
// SPLICE() METHOD END

// adding the elements in an array with number START
let sum = 0;
for(i = 0; i < array2.length; ++i){
    try{
        sum += array2[i];
        console.log(`this is the for loop sum of elements ${sum}`);
    }catch(e){
        console.log(`Error on line 73 ${sum !== '3'}`);
        console.log(`this is the error ${e}`);
    }
   
}
// adding the elements in an array with number END