/**
 *  to test whether this js is working --> alert("Hello...");
 */
const links = document.querySelectorAll(".smenu");
const themeToggler = document.querySelector(".theme-toggler");

const sideMenu = document.querySelector("aside");

// set to dark-theme by default
document.body.classList.toggle('dark-theme-variables');

themeToggler.querySelector('span:nth-child(1)').classList.toggle('active');
themeToggler.querySelector('span:nth-child(2)').classList.toggle('active');

links.forEach(btn => btn.addEventListener("click",(e)=>{
    e.preventDefault();
    document.querySelector(".smenu.active").classList.remove("active");
    btn.classList.add("active");
}));

// change theme
themeToggler.addEventListener('click', ()=>{
    document.body.classList.toggle('dark-theme-variables');

    themeToggler.querySelector('span:nth-child(1)').classList.toggle('active');
    themeToggler.querySelector('span:nth-child(2)').classList.toggle('active');
});

function closeMenuClick() {
	sideMenu.style.display = "none";
}

function openMenuClick() {
	sideMenu.style.display = "inline-block";
}

function disableSettingsMenu(disable) {
	console.log(disable);

	var settingsMenu = document.getElementById("adminSettingsMenu");
	
	if (disable=="true") {
		settingsMenu.style.display = "flex";	
	} else {
		settingsMenu.style.display = "none";		
	}
}

function dashboardMenuClick() {
	zAu.send(new zk.Event(zk.Widget.$(this), 'onClickDashboardMenu', 'Dashboard...'));
}

function plbnMenuClick() {
	zAu.send(new zk.Event(zk.Widget.$(this), 'onClickPLBNMenu', 'PLBN...'));
}

function plbnOperasionalMenuClick() {
	zAu.send(new zk.Event(zk.Widget.$(this), 'onClickPLBNOperasionalMenu', 'PLBN Operasional...'));
}

function plbnArchiveMenuClick() {
	zAu.send(new zk.Event(zk.Widget.$(this), 'onClickPLBNArchiveMenu', 'PLBN Archive...'));
}

function plbnCctvMenuClick() {
	zAu.send(new zk.Event(zk.Widget.$(this), 'onClickPLBNCctvMenu', 'PLBN CCTV...'));	
}

function pusatMenuClick() {
	zAu.send(new zk.Event(zk.Widget.$(this), 'onClickPusatMenu', 'PUSAT...'));
}

function pusatOperasionalMenuClick() {
	zAu.send(new zk.Event(zk.Widget.$(this), 'onClickPusatOperasionalMenu', 'PUSAT Operasional...'));	
}

function pusatCctvMenuClick() {
	zAu.send(new zk.Event(zk.Widget.$(this), 'onClickPusatCctvMenu', 'PUSAT CCTV...'));	
}

function pusatMessagingMenuClick() {
	zAu.send(new zk.Event(zk.Widget.$(this), 'onClickPusatMessaginMenu', 'PUSAT Messaging...'));
}

function logoutMenuClick() {
	zAu.send(new zk.Event(zk.Widget.$(this), 'onClickLogout', 'Logout...'));
}
