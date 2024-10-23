// console.log('base load');
let current_theme = gettheme();
 changetheam()

// console.log(current_theme);

// todo
function changetheam(){
//  set to web page
document.querySelector("html").classList.add(current_theme);
//set listner
const chengethemebutton = document.querySelector('#theme_change_button');
// chenge button conntent Light or dark
// chengethemebutton.querySelector('span').textContent = 
// current_theme == "light" ? "Dark" : "Light";  
console.log('theam',current_theme);
chengethemebutton.addEventListener('click', (event)=>{
    const oldtheam = current_theme;
    console.log("change them button click");
    document.querySelector("html").classList.remove(current_theme);
    if(current_theme == 'dark'){
        current_theme  = "light";
    }else{
        current_theme = "dark";
    }
    //update current theame to local storage
    settheme(current_theme);
    // remove current theam 
    document.querySelector("html").classList.remove(current_theme);
    //set current theam
    document.querySelector("html").classList.add(current_theme);

});
}

// set theme to localStorage 
function settheme(theme){
localStorage.setItem('theme', theme)
}

// get theme from localStorage

function gettheme(){
    let theme = localStorage.getItem("theme");
    if(theme)return theme 
    else return "light";

}