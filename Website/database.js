//Javascript file by Eric Germond, "database.js".

let account 
let loadeditems

if (localStorage.getItem('data')) {  //In place to ensure that data is not wiped on reset, checks if any data exists.
  alert('You already have an account save file!')
  account = JSON.parse(localStorage.getItem('data'))
  document.writeln('User uploaded items available: ' + "<br>" + "<br>"); //This writes to the page what items users have uploaded. It must be done here because it must be displayed right when the file is opened.
 document.writeln('Item 1: ' + account[0].item + ' Ericoins: ' + account[0].price +"<br>" + "<br>") //One item per user.
  document.writeln(' Item 2: ' + account[1].item + ' Ericoins: ' + account[1].price +"<br>"+"<br>" )
  document.writeln( ' Item 3: ' + account[2].item + ' Ericoins: ' + account[2].price +"<br>"+ "<br>" )
  document.writeln( ' Item 4: ' + account[3].item + ' Ericoins: ' + account[3].price +"<br>" + "<br>")
  document.writeln(' Item 5: ' + account[4].item + ' Ericoins: ' + account[4].price +"<br>"+ "<br>" ) 
} else {
  alert('There is no data stored, one will be made now!') //If no data exists the code will create a new file.

account = [

   {
  
        username: 'Eric', //In order for an admin to be possible, the array of objects must start off with an account.
       password: 'Germond',
       ericoins: '20',
      item: '',
       price: '',
       bought: '',
             },
     {
       username: '', //4 more empty objects so they can be filled.
       password: '',
      ericoins: '',
      item: '',
       price: '',
       bought: '',
      },
     
      {
        username: '', //login credentials, must have blank parameters so that they can be checked on account login.
        password: '',
       ericoins: '', //Amount of currency one has.
      item: '', //Current uploaded item.
       price: '', // Price of uploaded item.
       bought: '', //History.
      },
     
      {
        username: '',
        password: '',
       ericoins: '',
      item: '',
       price: '',
       bought: '',
      },
      {
        username: '',
        password: '',
       ericoins: '',
       item: '',
       price: '',
       bought: '',
      }
    
]
}

let testt = window.localStorage.getItem('data'); //Lets us display the data (testing function only)

var counter2 //Initialize outside so it can be used anywhere in the code.

function logmein() {
  var name = document.getElementById('nameinput').value //Extracts the log in information from the HTML file.
  var pass = document.getElementById('passinput').value
 var notrecognized = 0;
    for (var count = 0; count < account.length; count ++) //Does not go past account limit.
    {
      if (name == account[count].username && pass == account[count].password ) //Checks to see if input == the current slots credntials.
      {
        noterecognized = 1;
        var Ericoins = account[count].ericoins; //Extracts Ericoin data from database.
        alert('Ericoins variable = ' + Ericoins)
        window.localStorage.setItem('Coins', Ericoins); //Saves the credentials to the "coins" variable in Local Storage so that the program will know what user is using each function.
        window.localStorage.setItem('name', name);
        window.localStorage.setItem('currentp', pass)
        var tempname = window.localStorage.getItem('name'); //Extracts local storage variable and allows it to be used normally.
        var temppass = window.localStorage.getItem('currentp');
        var tempcoins = parseInt(window.localStorage.getItem('Coins'));
        alert('Welcome back ' + tempname + ' have this many ericoins: ' + tempcoins);
        window.localStorage.setItem('slot', count)
        alert('userslot is: ' + count);

        if (account[count].item == '') //Lets the user know if their item has been bought.
        {
        alert('You currently have no item uploaded, try to upload a new one!'); 
        }
        count = account.length; //Ends for statement.
      
       
      }
      
      
    }
    if (notrecognized == 0)
    { //Clicking the log in button automatically takes one to the store regardless of if the info is correct, so this must be here to notify the user.
      //alert('Incorrect Credentials! You will now access the site as a guest and will not be able to make purchases.'); 
    }
}

function ShoppingCart() { //Function used to purchase items.
 
alert(testt); //Displays data.

var buy1 = document.getElementById('itemA').value //Extracts the value of each user inputted drop down selection.
var buy2 = document.getElementById('itemB').value 
var buy3 = document.getElementById('itemC').value
var buy4 = document.getElementById('itemD').value
var buy5 = document.getElementById('itemE').value
var buy6 = document.getElementById('itemF').value
var buy7 = document.getElementById('itemG').value
var buy8 = document.getElementById('itemH').value
var buy9 = document.getElementById('itemI').value
var counter2 = parseInt(window.localStorage.getItem('slot')) //Extracts the users account # to know what object to use.

tempname = window.localStorage.getItem('name');
temppass = window.localStorage.getItem('currentp');
tempcoins = parseInt(window.localStorage.getItem('Coins')); //Lets the users coins be changed.
alert('Your balance is: ' + tempcoins);

      if (buy1 == 'Purchase') //Verifies each items input selection from the user.
{

  if (tempcoins >= 5) 
  {
    account[counter2].bought =  'Hoodie'; //Stores & replaces the history slot with the new item.
   tempcoins = tempcoins - 5; //Minuses temporary coins, will be added to account database later.
alert('Thank you for your purchase, your balance is now:' + tempcoins);
  }
  else{ alert('Sorry! You can not buy this product as you only have this many Ericoins: ' + tempcoins)}
}

if (buy2 == 'Purchase')
{
  if (tempcoins >= 15){
    account[counter2].bought =  'Cat';
tempcoins = tempcoins - 15;
alert('Thank you for your purchase, your balance is now:' + tempcoins);
  }
  else {alert('Sorry! You can not buy this product as you only have this many Ericoins: ' + tempcoins)}
}
if (buy3 == 'Purchase')
{
  if (tempcoins >= 8) {
    account[counter2].bought =  'Uncharted';
tempcoins = tempcoins - 8;
alert('Thank you for your purchase, your balance is now:' + tempcoins);
  }
  else {alert('Sorry! Your can not buy this product as you only have this many Ericoins: ' + tempcoins)}
}
if (buy4 == 'Purchase')
{
  if (tempcoins >= 10) {
    account[counter2].bought =  'Axe';
    tempcoins = tempcoins - 10;
alert('Thank you for your purchase, your balance is now:' + Ericoins);
  }
  else {alert('Sorry! You can not buy this product as you only have this many Ericoins: ' + Ericoins)}
}
//User items, different from store owned items.

if (buy5 == 'Purchase' && account[0].price != '') //Makes sure an item has actually been uploaded from the other user.
{
 var tempprice = parseInt(account[0].price); //Use slot '0' bc this item will always be owned by account # 0, must be done for it to work.
 var tempcoins0 = parseInt(account[0].ericoins); //Extract owner's coins from array not local storage, as the var's for local storage are in use by the current user.
 
  if (tempcoins >= tempprice)
  {
    account[counter2].bought =  account[0].item;
tempcoins = tempcoins - tempprice;
alert('Thank you for your purchase, your balance is now:' + tempcoins);
tempcoins0 = tempcoins0 + tempprice; //The owner is given the price of Ericoins they listed the item for.
alert(account[0].username + ' now has this many Ericoins: ' + tempcoins0)
account[0].ericoins = tempcoins0; //Sends new data to object for owner of item not user here.
account[0].item = ''; //Resets the owners item.
account[0].price = '';
  }
  else{ alert('Sorry! Your can not buy this product as you only have this many Ericoins: ' + tempcoins)}
}

if (buy6 == 'Purchase'  && account[1].price != '')
{
 var tempprice = parseInt(account[1].price);
 var tempcoins0 = parseInt(account[1].ericoins);
 
  if (tempcoins >= tempprice)
  {
    account[counter2].bought =  account[1].item;
tempcoins = tempcoins - tempprice;
alert('Thank you for your purchase, your balance is now:' + tempcoins);
tempcoins0 = tempcoins0 + tempprice;
alert(account[1].username + ' now has this many Ericoins: ' + tempcoins0)
account[1].ericoins = tempcoins0;
account[1].item = '';
account[1].price = '';
  }
  else{ alert('Sorry! Your can not buy this product as you only have this many Ericoins: ' + tempcoins)}
}

if (buy7 == 'Purchase'  && account[2].price != '')
{
 var tempprice = parseInt(account[2].price);
 var tempcoins0 = parseInt(account[2].ericoins);
 
  if (tempcoins >= tempprice)
  {
    account[counter2].bought =  account[2].item;
tempcoins = tempcoins - tempprice;
alert('Thank you for your purchase, your balance is now:' + tempcoins);
tempcoins0 = tempcoins0 + tempprice;
alert(account[2].username + ' now has this many Ericoins: ' + tempcoins0)
account[2].ericoins = tempcoins0;
account[2].item = '';
account[2].price = '';
  }
  else{ alert('Sorry! Your can not buy this product as you only have this many Ericoins: ' + tempcoins)}
}

if (buy8 == 'Purchase'  && account[3].price != '')
{
 var tempprice = parseInt(account[3].price);
 var tempcoins0 = parseInt(account[3].ericoins);
 
  if (tempcoins >= tempprice)
  {
    account[counter2].bought =  account[3].item;
tempcoins = tempcoins - tempprice;
alert('Thank you for your purchase, your balance is now:' + tempcoins);
tempcoins0 = tempcoins0 + tempprice;
alert(account[3].username + ' now has this many Ericoins: ' + tempcoins0)
account[3].ericoins = tempcoins0;
account[3].item = '';
account[3].price = '';
  }
  else{ alert('Sorry! Your can not buy this product as you only have this many Ericoins: ' + tempcoins)}
}

if (buy9 == 'Purchase' && account[4].price != '')
{

 var tempprice = parseInt(account[4].price);
 var tempcoins0 = parseInt(account[4].ericoins);
 
  if (tempcoins >= tempprice)
  {
account[counter2].bought =  account[4].item;
tempcoins = tempcoins - tempprice;
alert('Thank you for your purchase, your balance is now:' + tempcoins);
tempcoins0 = tempcoins0 + tempprice;
alert(account[4].username + ' now has this many Ericoins: ' + tempcoins0)
account[4].ericoins = tempcoins0;
account[4].item = '';
account[4].price = '';
  }
  else{ alert('Sorry! Your can not buy this product as you only have this many Ericoins: ' + tempcoins)}
}

account[counter2].ericoins = tempcoins; //Modifies the array for when it gets saved locally.
window.localStorage.setItem('data', JSON.stringify(account)); //Stores the array to local storage, will not be deleted on browser closure.
window.localStorage.setItem('Coins', tempcoins); //Sets the coins storage to the new value in case the user wants to buy more.
//Note: user will have to refresh the page to see these changes.
}


function checker() { //Account creator, checks to see if any slots are open.
  var createuser = document.getElementById('username1').value;
  var createpass = document.getElementById('password1').value;
  var stopdupe = 0; //Allows the file to stop if a name is already taken by modifying this variable, only way.
  for (var count = 0; count < account.length; count ++)
  {
   if (createuser == account[count].username)
   {
   count = account.length;
   alert('Sorry, that name is taken!');
   stopdupe = 1;
   }

if (account[count].username == '' && stopdupe != 1)
{
   account[count].username = createuser; //sets the first free object to the inputted credintials.
   account[count].password = createpass;
   account[count].ericoins = '5'; //Some Ericoins must be given to the user on startup to get them started.
alert(account[count].username + ' has been registered!');
window.localStorage.setItem('data', JSON.stringify(account))
count = account.length;
}
  }
 
}

function deleter() {
  var remove = window.localStorage.getItem('name'); 
if (remove == "Eric") //Checks to see if the current user is the admin.
{
alert('You have permission to delete!');
localStorage.clear(); //Clears all user data on the server in case the storage gets full.
}
}

function timecheck() {
  let day;
let time;

  if (localStorage.getItem('Date')) //Must check to see if the date has even been set once yet for the comparison to work.
  {
   day = new Date(); //Extracts computers date.
    time = day.getMinutes(); //Gets minutes specifically.
   let compare = parseInt(window.localStorage.getItem('Date')); //Gets the data of last date, local storage so that it stays on closure.
   if (time > compare)
   {
      
        var addcoins = parseInt(window.localStorage.getItem('Coins')); 
        var slotno = parseInt(window.localStorage.getItem('slot'));
       addcoins = addcoins + 5; //Adds coins to the account who clicked the button, if an hour has passed since the last time the function was used.
       alert('You have obtained your hourly reward of Ericoins, you now have: ' + addcoins);
       account[slotno].ericoins = addcoins;
window.localStorage.setItem('data', JSON.stringify(account));
window.localStorage.setItem('Coins', addcoins);
   }
   else{
     alert ('Please wait another minute!');
   }
   window.localStorage.setItem('Date', time); //Must set the new date regardless of if enough time has passed.
  }
  else
  {
    alert('Date will be set.');
   day = new Date();
   time = day.getHours();
   window.localStorage.setItem('Date', time);
  }
}

function uploaditem() {
  let tempitem = document.getElementById('good').value; //Extracts item input data.
  let tempcost = document.getElementById('price').value; //Do not need to parse int as we are just storing the value.
  var tempname2 = window.localStorage.getItem('name');
   alert(tempname2 + ' will upload an item.');
  
  for (var count = 0; count < account.length; count ++)
  {
   
if (account[count].username == tempname2) //Checks
{
  
 
  
   account[count].item = tempitem;
   account[count].price = tempcost;

  alert('You have uploaded your item!')
window.localStorage.setItem('data', JSON.stringify(account));
count = account.length;
}
  }

}

function history() { //Lets the user see their last bought item.
  counter2 = parseInt(window.localStorage.getItem('slot')) //parseInt extracts the numerical value of the current users slot # without a checking process.
  alert(account[counter2].bought);
  
  }

  function logmeout() { //Lets the user remove all of their account information from the local storage.
    window.localStorage.removeItem('name');  //The user must do this if they do not want their account to be used by the next user.
   window.localStorage.removeItem('currentp');
   window.localStorage.removeItem('Coins');
   window.localStorage.removeItem('slot');
   alert('Thank you for visiting, you will now log out!')
  }

  //Item displayers
  function item5() { //Displays who uploaded each item, what they are, and their cost on use.
    if (account[0].item != '') //Slot # 0 bc this item will always be #0's-  or the admins.
    {
    alert(account[0].username + "'s " + account[0].item + ' for this amount of Ericoins: ' + account[0].price);
    }
  }

  function item6() {
    if (account[1].item != '')
    {
    alert(account[1].username + "'s " + account[1].item + ' for this amount of Ericoins: ' + account[1].price);
    }
  }

  function item7() {
    if (account[2].item != '')
    {
    alert(account[2].username + "'s " + account[2].item + ' for this amount of Ericoins: ' + account[2].price);
    }
  }
  function item8() {
    if (account[3].item != '')
    {
    alert(account[3].username + "'s " + account[3].item + ' for this amount of Ericoins: ' + account[3].price);
    }
  }

  function item9() {
    if (account[4].item != '')
    {
    alert(account[4].username + "'s " + account[4].item + ' for this amount of Ericoins: ' + account[4].price);
    }
  }