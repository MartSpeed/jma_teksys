// SETUP - select the elements
// click event for the HTML btn element
let input = document.querySelector('#email');

// declaring the HTML btn element
let btn = document.querySelector('#btn');

//
let message = document.querySelector('#successMsg');

//
let tag = document.querySelector('#text');

// let remove
let remove = document.getElementsByClassName('remove');

console.log(`input: ${input}`);
console.log(`button: ${btn}`);

// push information to this list and display the list
let arrList = [];

// DELETE???
// appending a close button to each element
let myList = document.querySelectorAll('li');
console.log(myList);

// for loop for my list list items
for (let i = 0; i < myList.length; ++i) {
  if ((myList[i] = null)) {
    let sp = document.createElement('SPAN');
    let txt = document.createTextNode('X');
    sp.className = 'remove';
    sp.appendChild(txt);
    myList[i].appendChild(txt);
  }
}
// adding click event
btn.addEventListener('click', function (event) {
  // VERY IMPORTANT, ALWAYS INCLUDE IN CLICK EVENTS
  // REFRESHES THE INFORMATION ON THE PAGE AT PRESET TIME
  event.preventDefault();

  let li = document.createElement('li');

  let inputValue = document.getElementById('email').value;

  //
  let text = document.createTextNode(inputValue);

  //
  //let text = input.textContent;

  // pushing data into the array
  li.appendChild(text);

  if (inputValue === '') {
    alert('Must enter an email');
  } else {
    document.getElementById('text').appendChild(li);

    input.value = '';

    message.innerHTML = 'success';
  }

  // list removal steps
  let sp = document.createElement('SPAN');
  let txt = document.createTextNode('X');
  sp.className = 'remove';
  sp.appendChild(txt);
  li.appendChild(sp);
  for (let i = 0; i < remove.length; ++i) {
    remove[i].onclick = function () {
      let div = this.parentElement;
      div.style.display = 'none';
    };
  }

  console.log(event.type);

  arrList.push(inputValue);
});

console.log('Array List', arrList);
