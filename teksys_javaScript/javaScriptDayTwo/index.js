// setup
let name = "Zoro";
let hasJob = true;
let age = 22;

// construction
let person = {
    first_name:"Luffy",
    last_name:"Monkey D. ",
    isWorking: false,
    hasJob: true,
    jobTitle: "Yonko Pirate King Select",
    fullName: function(){
        return this.last_name + " " + this.first_name;
    }
}

console.log(`${person.fullName()} is the ${person.jobTitle}`);

let names = ["Lucci","Kaku","Kuro","Don Kreig", age, hasJob, 88.8];
console.log(names);

var varx = 10;
let letx = 10;
console.log(`this is var ${varx}, this is let ${letx}`);