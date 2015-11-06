
require 'selenium-webdriver'

# Chrome_driver
chrome_driver = Selenium::WebDriver.for :chrome
chrome_driver.close()
chrome_driver.quit()

# FireFox driver
firefox_driver = Selenium::WebDriver.for :firefox
firefox_driver.close()
firefox_driver.quit()





