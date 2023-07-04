/**
 *  to test whether this js is working --> alert("Hello...");
 */
const links = document.querySelectorAll(".smenu");
const themeToggler = document.querySelector(".theme-toggler");

function updateMenuLabel(menuLabel,stringList) {
  // var addMenuVar = document.getElementById("addMenuLabel").innerHTML;
  // console.log(addMenuVar);
  
  // console.log(menuLabel);
  // document.getElementById("addMenuLabel").innerHTML = menuLabel;
  
  // console.log(stringList);
  // var objList = JSON.parse(stringList);
  // console.log(objList.length);
  // console.log(objList);
  // var obj0 = objList[0];
  // console.log(obj0);
  // objList.forEach(obj => console.log(obj.id+" "+obj.name));
}

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

function pencatatanMenuClick() {
	zAu.send(new zk.Event(zk.Widget.$(this), 'onClickPencatatanMenu', 'Pencatatan...'));
}

function daftarHitamMenuClick() {
	zAu.send(new zk.Event(zk.Widget.$(this), 'onClickDaftarHitamMenu', 'DaftarHitam...'));
}

function pengawasan01MenuClick() {
	zAu.send(new zk.Event(zk.Widget.$(this), 'onClickPengawasan01Menu', 'Pengawasan01...'));
}

function pengawasan02MenuClick() {
	zAu.send(new zk.Event(zk.Widget.$(this), 'onClickPengawasan02Menu', 'Pengawasan02...'));	
}

function eventAlarm01MenuClick() {
	zAu.send(new zk.Event(zk.Widget.$(this), 'onClickEventAlarm01Menu', 'Event/Alarm01...'));
}

function eventAlarm02MenuClick() {
	zAu.send(new zk.Event(zk.Widget.$(this), 'onClickEventAlarm02Menu', 'Event/Alarm02...'));
}

function jumlahOrang01MenuClick() {
	zAu.send(new zk.Event(zk.Widget.$(this), 'onClickJumlahOrang01Menu', 'JumlahOrang01...'));
}

function jumlahOrang02MenuClick() {
	zAu.send(new zk.Event(zk.Widget.$(this), 'onClickJumlahOrang02Menu', 'JumlahOrang02...'));
}

function pesanMenuClick() {
	zAu.send(new zk.Event(zk.Widget.$(this), 'onClickPesanMenu', 'Pesan...'));	
}

function pelaporanMenuClick() {
	zAu.send(new zk.Event(zk.Widget.$(this), 'onClickPelaporanMenu', 'Pelaporan...'));
}

function producerMenuClick() {
	zAu.send(new zk.Event(zk.Widget.$(this), 'onClickProducerMenu', 'Producer...'));
}

function settingsMenuClick() {
	zAu.send(new zk.Event(zk.Widget.$(this), 'onClickSettingsMenu', 'Settings...'));
}

function logoutMenuClick() {
	zAu.send(new zk.Event(zk.Widget.$(this), 'onClickLogout', 'Logout...'));
}