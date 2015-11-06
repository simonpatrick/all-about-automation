require "selenium-webdriver"

chrome_driver = Selenium::WebDriver.for :chrome

chrome_driver.maximize_window()

chrome_driver.quit()
