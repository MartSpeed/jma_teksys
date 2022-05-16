// print all the even number from 0 to 100
for(let i = 0; i <= 10; ++i){
    if(i % 2 == 0){
        console.log(`this is even number: ${i}`);
    }
}

// print all the odd number from 1- 100
for(let i = 0; i <= 11; ++i){
    if(i % 2 !== 0){
        console.log(`this is odd number: ${i}`);
    }
}

// do while loop example
i = 1;
do{
    let value = i * 2;
    ++i;
    console.log(`this is the value output: ${value}`);
}while (i <= 5);

// function with params
function customerMessage(custom, times){
for(let i = 0; i < times; ++i){
    console.log(`the customerMessage function call ${i}, ${custom}`);
    }
}
customerMessage("Useful message n.n/", 10);



try{
// function return
function subtract(a,b){
    let c = a - b;
    return c;
}
let result = subtract(2022,1987)
console.log(`i am ${result} years young`);
}catch(e){
    console.log("Logging custom error for math");
    console.log(`this is catch e ${e}`);
}