require "selenium-webdriver"

ENV["SELENIUM_SERVER_JAR"] = "/path/to/selenium-server-standalone.jar"
driver = Selenium::WebDriver.for :opera

dirver.close()
