var date = new Date();
document.write("Todays Date is:");
document.querySelector(".main1").innerHTML = date;
window.addEventListener("keyup", (e) =>
  console.log(e.getModifierState("capsLock"))
);
