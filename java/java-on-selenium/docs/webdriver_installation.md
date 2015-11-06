## Getting Start With WebDriver

Selenium supports automation of all the major browsers in the market through the use of WebDriver. 
WebDriver is an API and protocol that defines a language-neutral interface for controlling 
the behaviour of web browsers. Each browser is backed by a specific WebDriver implementation, 
called a *driver*. The driver is the component responsible for delegating down to the browser, 
and handles communication to and from Selenium and the browser.

This separation is part of a conscious effort to have browser vendors take responsibility 
for the implementation for their browser. Selenium makes use of these third party drivers 
where possible, but also provides its own drivers maintained by the project for the cases 
where this is not a reality.

The Selenium framework ties all of these pieces together through a user-facing interface 
that enables the different browser backends to be used transparently, 
enabling cross-browser and cross-platform automation.

## Consumer Browsers

|Browser|Maintainer|VersionSupport|
|-----  |-----     |--------      |
|Chromium|Chromium |All Version   |
|FireFox|Selenium|4 and newer     |
|IE|Selenium|6 and newer|
|Opera|Opera|10.5 and newer|
|Safari|Selenium|5.1 and newer|

## Specialized Browsers
- PhantomJSDriver  Headless PhantomJS Browser backed by QtWebKit - GhostDriver project
- HtmlUnitDriver Headless brower emulator backed by Rhino Selenium 

### Java Installation

- MAVEN

```xml
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>${selenium-version}</version>
        </dependency>
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-server</artifactId>
            <version>${selenium-version}</version>
        </dependency>
```

- Gradle:

```java
  compile ("org.seleniumhq.selenium:selenium-java:2.48.2")
  compile ("org.seleniumhq.selenium:selenium-server:2.48.2")
```

### Python installation

- python 3

```sh

pip install selenium
```

### Ruby Installation

  