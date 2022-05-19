// click event for the HTML btn element
let input = document.querySelector('#email');

// declaring the HTML btn element
let btn = document.querySelector('#btn');

//
let message = document.querySelector('#successMsg');

//
let tag = document.querySelector('#text');

console.log(`input: ${input}`);
console.log(`button: ${btn}`);

// push information to this list and display the list
let arrList = [];

// adding click event
btn.addEventListener('click', function (event) {
  // VERY IMPORTANT, ALWAYS INCLUDE IN CLICK EVENTS
  // REFRESHES THE INFORMATION ON THE PAGE AT PRESET TIME
  event.preventDefault();

  let li = document.createElement('li');

  let inputValue = document.querySelector('#email').value;

  //
  let text = document.createTextNode(inputValue);

  //
  //let text = input.textContent;

  // pushing data into the array
  li.appendChild(text);

  if (inputValue === '') {
    alert('Must enter an email');
  } else {
    document.querySelector('#text').appendChild(li);

    input.value = '';

    message.innerHTML = 'success';
  }

  console.log(event.type);

  arrList.push(inputValue);
});

console.log('Array List', arrList);
