find("1582660196528.png")
click("1582660196528.png")
wait(1)
i = 0
while ( i < 10):     
    type(Key.BACKSPACE)
    i+=1
type("cmd"+ Key.ENTER)
wait(1)
paste("cd C:\Users\lcannafarina\Documents\Estudios-Endava\calc-TDD")
type(Key.ENTER)
wait(1)
type("gradlew test"+ Key.ENTER)
wait(10)
#PathToChrome = "C:\\'Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe"
PathToReport = "C:\\Users\\lcannafarina\\Documents\\Estudios-Endava\\calc-TDD\\build\\reports\\tests\\test\\index.html"
App.open(PathToReport)