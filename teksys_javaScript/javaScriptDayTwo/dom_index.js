// header id DOM manipulation
let header = document.getElementById('header_title').innerHTML = "I am going to be the strongest swordsmen";
// container class DOM manipulation
let container = document.getElementsByClassName('container');
console.log(header);
// use singl quotes when calling classes an IDs
let items = document.getElementsByName('list-group-item');
// show list of items
for(item of items){
    console.log("item: ", item);
    console.log("items", items);
}
console.log(items);

// grabbing the tag name
let li = document.getElementsByTagName('li');
console.log(`this is the list tag using the getElementsByTagName method ${li}`);
console.log(li);

// prototype, slice, call
let arr = Array.prototype.slice.call(li,1,3);
for(item of arr){
    console.log(item);
}

// queryselector method
let selectId = document.querySelector('#header_title');
//
let tagName = document.querySelectorAll('font[color="blue"]');
// tried to change all of the colors of the list in the DOM
let colorChange = document.querySelector('li').querySelectorAll('font[color="blue"]');
console.log("tagName: ",tagName);

// click listener events
// function showChange(){
//     let change = "change the text";
//     document.getElementById("myChange").value = change;
// }

// variable for maniuplating the class name staring with menu(our UL)
let menu = document.getElementsByClassName('menu');

// creating a li element in the ul element
li = document.createElement('li');
li.textContent = "my new item 6";
menu[0].appendChild(li);
console.log(menu.innerHTML);

// creating an div element inside of the DOM
let divOne = document.createElement('div');
divOne.id = 'content';
divOne.className = 'notes';
divOne.innerHTML = '<p> created a new div and paragraph element </p>';
document.body.appendChild(divOne);

// can we add another div inside of the one we just created?
let hTwo = document.createElement('h2');
hTwo.textContent = "Added a h2 tag";
divOne.appendChild(hTwo);


//
// function menuItemCreate(name){
//     let li = document.createElement('li');
//     li.textContent = name;
//     return li;
// }

// menu = document.querySelector('#menu');
// menu.appendChild(menuItemCreate('Home'));
// menu.appendChild(menuItemCreate('About'));
// menu.appendChild(menuItemCreate('Blog'));

// class button click event
let btnOne = document.getElementsByClassName('btnOne');

function btnClick(){
    console.log('is clicked');
    const s = document.querySelector('span');
    s.textContent = "I have been changed";
    btnOne.textContent = "I was clicked";
}

btnOne[0].addEventListener('click', btnClick)


// checking for a keypress event
// document.addEventListener('keypress', function(e){
//     console.log('you pressed any key');
//     console.log('key'+ e.code);
//     console.log('key' + e.key);
// })