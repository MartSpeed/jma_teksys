// javascript shapes assignment
console.log("inside of the shapes assignment");

// creating a square
// first loop is the height
// second loop is the width
let height = 4; // this should determine the height of the box
let string = ""; // our separator
// the first loop is for the external box, this is what the HEIGHT of the shape will be
for(let i = 0; i < height; ++i){
    // the second loop is the internal box, this prints out the stars and determines the WIDTH
    for(let width = 0; width < 7; ++width){
        string += "*";
    }
    // new line for each row
    string += "\n";
}
console.log(string);