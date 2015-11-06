from selenium import webdriver
from selenium.webdriver.common.by import By

__author__ = 'patrick'


class ElementLocator(object):
    def __init__(self):
        self.driver = webdriver.Firefox()

    def find_by_id(self,id):
        self.driver.find_element_by_id(id)

    def find_by_css_selector(self,css_selector):
        self.driver.find_element_by_css_selector(css_selector)