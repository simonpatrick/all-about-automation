# WebDriver Locating Element

## By Id 

## By Name

## By CSS Class

## By cssSelector

## By LinkText

## By Text

## SearchContext
- role-based interface

Consequently, the By interface used above also supports a number of additional locator strategies.
A nested lookup might not be the most effective cheese location strategy 
since it requires two separate commands to be issued to the browser; 
first searching the DOM for an element with ID “cheese”, 
then a search for “cheddar” in a narrowed context.

To improve the performance slightly we should try to use a more specific locator: 
WebDriver supports looking up elements by CSS locators, 
allowing us to combine the two previous locators into one search:

```java
    driver.findElement(By.cssSelector("#cheese #cheddar"));
```

## Strategies

Locator	Description
class name	Locates elements whose class name contains the search value (compound class names are not permitted)
css selector	Locates elements matching a CSS selector
id	Locates elements whose ID attribute matches the search value
name	Locates elements whose NAME attribute matches the search value
link text	Locates anchor elements whose visible text matches the search value
partial link text	Locates anchor elements whose visible text partially matches the search value
tag name	Locates elements whos etag name matches the search value
xpath	Locates elements matching an XPath expression

## Tips on using Selectors

- ID - css selector
- css selector
- XPATH
- link text -> xpath

## Reality

different front-end framework, different implementation, MVVM framework

- Angular
- React
- Vue

