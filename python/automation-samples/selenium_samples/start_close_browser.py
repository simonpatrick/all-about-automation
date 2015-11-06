from selenium import webdriver

__author__ = 'patrick'

chrome_driver = webdriver.Chrome()
firefox_driver = webdriver.Firefox()

# maximize_window
chrome_driver.maximize_window()

# close web driver
chrome_driver.close()
firefox_driver.close()

# quick web driver
chrome_driver.quit()
firefox_driver.quit()

